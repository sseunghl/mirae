package com.sungjuk;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dbcp.DbcpBean2;
//dao와 dto를 나눠 놓은 이유 :재사용하기 위해, 알아보기 쉽게 하기 위해
//dao를 설정할 땐 DBtable 중심으로
public class SungjukDao {
	private Connection conn;
	public SungjukDao() {
		conn = new DbcpBean2().getConn();
	}
	public int registerMember(SungjukDto st) {
		CallableStatement stmt = null;
		int result=0;
		try {
			String sql = "{call student_insert(?,?,?,?,?,?)}"; //call로 저장되있는 프로시저 사용 가능
			stmt=conn.prepareCall(sql);//
			stmt.setString(1, st.getName());
			stmt.setInt(2, st.getKor());
			stmt.setInt(3, st.getMat());
			stmt.setInt(4, st.getEng());
			stmt.setString(5, st.getSchoolcode());
			
			stmt.registerOutParameter(6, java.sql.Types.INTEGER); //out변수는 데이터 타입을 지정
			stmt.execute(); //execute를 썼지만 return 값을 받지 않음
			result=stmt.getInt(6); //select에서 값을 가져오는 형태(out변수를 가져옴)
			stmt.close();
		}
		catch(Exception e) {
			
		}
		finally {
			try {
				this.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally {
				this.close();
			}
		}
		return result;
	}
	//select 선택 배열
	public ArrayList<SungjukDto> selectMember(){
		CallableStatement stmt = null;
		ArrayList<SungjukDto> list = new ArrayList<SungjukDto>();
		try {
			stmt=conn.prepareCall("{call student_select()}");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int mat = rs.getInt("mat");
				int eng = rs.getInt("eng");
				
				SungjukDto Sungjuk = new SungjukDto();
				Sungjuk.setName(name);
				Sungjuk.setKor(kor);
				Sungjuk.setMat(mat);
				Sungjuk.setEng(eng);
				list.add(Sungjuk);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			this.close();
		}
		return list;
	}
	//update
	public int updateMember(SungjukDto st) {
		CallableStatement stmt = null;
		int result = 0;
		try {
			String sql = "{call student_update(?,?,?,?,?,?)}";
			stmt = conn.prepareCall(sql);
			stmt.setInt(1, st.getBunho());
			stmt.setString(2, st.getName());
			stmt.setInt(3, st.getKor());
			stmt.setInt(4, st.getMat());
			stmt.setInt(5, st.getEng());
			stmt.registerOutParameter(6, java.sql.Types.INTEGER);
			
			int affectedrowcount = stmt.executeUpdate(); //변화된 행 수
			System.out.println("변화된 행 수 : "+affectedrowcount);
			result = stmt.getInt(6);
			stmt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			this.close();
		}
		return result;
	}
	public int deleteMember(SungjukDto st) {
		CallableStatement stmt = null;
		int result=0;
		try {
			stmt = conn.prepareCall("{call student_delete(?,?)}");
			stmt.setString(1, st.getName());
			stmt.registerOutParameter(2, java.sql.Types.INTEGER);
			boolean success = stmt.execute(); //ResultSet이 있으면 true
			//execute : ResultSet 유무, executeQuery : ResultSet, executeUpdate : 변화된 행 수
			//execute의 return값 boolean
			//execute는 select, insert into, update set, delete from 모두 사용 가능
			System.out.println(success);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			this.close();
		}
		return result;
	}
	private void close() {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		}
		catch(SQLException e) {
			conn = null;
		}
	}
}