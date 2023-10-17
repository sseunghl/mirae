package com.student.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import com.dbcp.DbcpBean;
import com.dbcp.DbcpBean2;

public class StudentDAO {
	public static Connection getConnection() {
	      Connection con = null;
	      con = new DbcpBean2().getConn();
	      return con;
	   }
	   public static ArrayList<StudentDTO> getRecords(int start,int total){
		      ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		      try {
		         Connection con = getConnection();
		         PreparedStatement ps = con.prepareStatement(
		         "select bunho,name,kor,mat,eng,schoolcode from Student limit "+(start-1)+","+total
		         );
		         ResultSet rs = ps.executeQuery();
		         while (rs.next()) {
		        	 StudentDTO s = new StudentDTO();
		            s.setBunho(rs.getInt(1));
		            s.setName(rs.getString(2));
		            s.setKor(rs.getInt(3));
		            s.setMat(rs.getInt(4));
		            s.setEng(rs.getInt(5));
		            s.setSchoolcode(rs.getString(6));
		            list.add(s);
		         }
		         rs.close();
		         con.close();
		      } catch (Exception e) { 
		         System.out.println(e);
		      }
		      return list;
		   }
	   public boolean registerStu(StudentDTO dto) throws ServletException{//입력
		   Connection conn = getConnection();
		   String query = "INSERT INTO student(name,kor,mat,eng,schoolcode)values(?,?,?,?,?)"; 
		   boolean success=false;
		   try { //exception 처리를 요하는 명령어
			   PreparedStatement pstmt = conn.prepareStatement(query);//PreparedStatement db 틀을 해석해주는 것
			   
			   pstmt.setString(1, dto.getName());
			   pstmt.setInt(2, dto.getKor());
			   pstmt.setInt(3,dto.getMat());
			   pstmt.setInt(4,dto.getEng());
			   pstmt.setString(5,dto.getSchoolcode());
			   int result = pstmt.executeUpdate();
			   pstmt.close();
			   conn.close();
			   if(result>0) {success=true;}
			   else success=false;
		   }catch(SQLException ex) {
			   success=false;
			   //throw new ServletException("등록 실패!");
		   }
		   if(success=true) return true;
		   else return false;
	   }
	   public boolean updateStu(StudentDTO dto) throws ServletException{
		   Connection conn = getConnection();
		   String query = "UPDATE STUDENT SET NAME=?, KOR=?,MAT=?,ENG=? WHERE NAME=?"; 
		   System.out.println(dto.getBunho());
		   boolean success=false;
		   try { //exception 처리를 요하는 명령어
			   PreparedStatement pstmt = conn.prepareStatement(query);  
			   pstmt.setString(1, dto.getName());
			   pstmt.setInt(2, dto.getKor());
			   pstmt.setInt(3, dto.getMat());
			   pstmt.setInt(4,dto.getEng());//getrecord에서 부여한 번호랑 상관없는지?
			   
			   int result=pstmt.executeUpdate();
			   pstmt.close();
			   conn.close();
			   if(result>0) {
				   success=true;
			   }
			   else {success=false;}
			   
		   }catch(SQLException ex) {
			   success=false;
			   //throw new ServletException("수정 실패!");
		   }
		   if(success=true) return true;
		   else return false;
	   }
	   public boolean deleteStu(StudentDTO dto) throws ServletException{
		   Connection conn = getConnection();
		   String query = "DELETE FROM Student WHERE name=?";
		   System.out.println(dto.getName());
		   
		   boolean success=false;
		   try { //exception 처리를 요하는 명령어
			   PreparedStatement pstmt = conn.prepareStatement(query);  
			   pstmt.setString(1, dto.getName());
			  int result= pstmt.executeUpdate();
			   pstmt.close();
			   conn.close();
			   if(result>0) {success=true;}
			   else {success=false;}
		   }catch(SQLException ex) {
			   success=false;
			   //throw new ServletException("등록 실패!");
		   }
		   if(success=true) return true;
		   else return false;
	   }
	   
}
