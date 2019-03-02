package com.jpn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jpn.entity.EmpEntity;

import common.JdbcTemplate;

//데이터베이스와 연동해서 CRUD를 처리
public class EmpDao {
	public int insertEmp(EmpEntity entity) {
		Connection conn=JdbcTemplate.getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		
		try {
			String sql="INSERT INTO EMP(ENO,ENAME,PHONE,DEPT) VALUES(SEQ_ENO.NEXTVAL,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getEname());
			pstmt.setString(2, entity.getPhone());
			pstmt.setString(3, entity.getDept());
			n=pstmt.executeUpdate();
			if(n > 0) {
				JdbcTemplate.commit(conn);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
		return n;
	}
//------------------------------------------------------------------------------
	public ArrayList<EmpEntity> listEmp() {
		Connection conn=JdbcTemplate.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		EmpEntity entity=null;
		ArrayList<EmpEntity> list=new ArrayList<>();
		
		try {
			String sql="SELECT * FROM EMP ORDER BY ENO DESC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				entity=new EmpEntity();
				entity.setEno(rs.getInt("ENO")); //ENO는 컬럼명
				entity.setEname(rs.getString("ENAME"));
				entity.setPhone(rs.getString("PHONE"));
				entity.setDept(rs.getString("DEPT"));
				
				list.add(entity);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
		return list;
		
	}
	
	
	//-----------------------------------------------------------
	
	public int updateEmp(EmpEntity entity) {
	      Connection conn=JdbcTemplate.getConnection();
	      PreparedStatement pstmt=null;
	      int n=0;
	      
	      try{
	         String sql="UPDATE EMP SET PHONE=?,DEPT=? WHERE ENO=?";
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, entity.getPhone());
	         pstmt.setString(2, entity.getDept());
	         pstmt.setInt(3, entity.getEno());
	         n=pstmt.executeUpdate();
	         
	         if(n>0)
	        	 JdbcTemplate.commit(conn);
	      }catch(SQLException e){
	         e.printStackTrace();
	         JdbcTemplate.rollback(conn);
	      }finally{
	    	  JdbcTemplate.close(pstmt);
	    	  JdbcTemplate.close(conn);
	      }
	      return n;
	   }
	
	//------------------------------------------------------------------
	public int deleteEmp(EmpEntity entity) {
		Connection conn=JdbcTemplate.getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		
		try{
			String sql="DELETE FROM EMP WHERE ENO=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, entity.getEno());
			n=pstmt.executeUpdate();
			
			if(n>0)
				JdbcTemplate.commit(conn);
		}catch(SQLException e){
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally{
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
		return n;
	}
}
