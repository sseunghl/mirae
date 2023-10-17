package com.emp.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;

//연결 객체
import com.dbcp.DbcpBean;
public class EmpDAO {
   public static Connection getConnection() {
      Connection con = null;
      con = new DbcpBean().getConn();
      return con;
   }
   public static ArrayList<EmpDTO> getRecords(int start,int total){
      ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
      try {
         Connection con = getConnection();
         PreparedStatement ps = con.prepareStatement(//db를 틀을 읽어 들여 번역?
         "select EMPNO, ENAME, SAL from emp limit "+(start-1)+","+total
         );
         ResultSet rs = ps.executeQuery();//Query 값이 변환
         while (rs.next()) {
            EmpDTO e = new EmpDTO();
            e.setId(rs.getInt(1));
            System.out.println(rs.getInt(1));
            e.setName(rs.getString(2));
            e.setSalary(rs.getFloat(3));
            list.add(e);
         }
         rs.close();
         con.close();
      } catch (Exception e) {
         System.out.println(e);
      }
      return list;
   }
   public boolean registerEmp(EmpDTO dto) throws ServletException{
	   Connection conn = getConnection();
	   String query = "INSERT INTO EMP(EMPNO,ENAME,SAL)VALUES(?,?,?)"; 
	   System.out.println(dto.getId());
	   boolean success=false;
	   try { //exception 처리를 요하는 명령어
		   PreparedStatement pstmt = conn.prepareStatement(query);//PreparedStatement db 틀을 해석해주는 것
		   pstmt.setInt(1, dto.getId());
		   pstmt.setString(2, dto.getName());
		   pstmt.setFloat(3, dto.getSalary());
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

   public boolean updateEmp(EmpDTO dto) throws ServletException{
	   Connection conn = getConnection();
	   String query = "UPDATE emp SET ename=?, sal=? WHERE EMPNO=?"; 
	   System.out.println(dto.getId());
	   boolean success=false;
	   try { //exception 처리를 요하는 명령어
		   PreparedStatement pstmt = conn.prepareStatement(query);  
		   pstmt.setString(1, dto.getName());
		   pstmt.setFloat(2, dto.getSalary());
		   pstmt.setInt(3, dto.getId());
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
   public boolean deleteEmp(EmpDTO dto) throws ServletException{
	   Connection conn = getConnection();
	   String query = "DELETE FROM emp WHERE ENAME=?";
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