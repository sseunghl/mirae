package com.sungjuk;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dbcp.DbcpBean2;

public class SysloginDao {
	private Connection conn;
	public SysloginDao() {
		conn= new DbcpBean2().getConn();
	}
	public int registerUser(SysloginDto lt) {
		CallableStatement ltmt=null;
		int result=0;
		try {
			String sql="{call user_insert(?,?,?,?)}";
			ltmt=conn.prepareCall(sql);
			ltmt.setString(1, lt.getUserID());
			ltmt.setString(2, lt.getPassword());
			ltmt.setString(3, lt.getName());
			
			ltmt.registerOutParameter(4, java.sql.Types.INTEGER);
			ltmt.execute();
			result=ltmt.getInt(4);
			ltmt.close();
		}catch(Exception e){
			
		}finally {
			try {
				this.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				this.close();
			}
		}
		return result;
	}
	//select 선택
	public ArrayList<SysloginDto> selectUser(){
		CallableStatement ltmt=null;
		ArrayList<SysloginDto> list=new ArrayList<SysloginDto>();
		try {
			ltmt=conn.prepareCall("{call user_select()}");
			ResultSet rs=ltmt.executeQuery();
			
			while(rs.next()) {
				String userID=rs.getString("userID");
				String name=rs.getString("name");
				
				SysloginDto login=new SysloginDto();
				login.setUserID(userID);
				login.setName(name);
				
				list.add(login);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			this.close();
		}
		return list;
	}
	//update
	public int updateUser(SysloginDto lt) {
		CallableStatement ltmt=null;
		int result=0;
		try {
			String sql="{call user_update(?,?,?)}";
			ltmt=conn.prepareCall(sql);
			ltmt.setString(1,lt.getPassword());
			ltmt.setString(2, lt.getName());
			ltmt.registerOutParameter(3, java.sql.Types.INTEGER);
			
			int affectedrowcount1 = ltmt.executeUpdate();
			System.out.println("변화된 행 수: "+affectedrowcount1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			this.close();
		}
		return result;
	}
	public int deleteUser(SysloginDto lt) {
		CallableStatement ltmt =null;
		int result=0;
		try {
			ltmt=conn.prepareCall("{call user_delete(?,?,?)}");
			ltmt.setString(1,lt.getUserID());
			ltmt.setString(2, lt.getPassword());
			ltmt.registerOutParameter(3, java.sql.Types.INTEGER);
			boolean success = ltmt.execute();
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
