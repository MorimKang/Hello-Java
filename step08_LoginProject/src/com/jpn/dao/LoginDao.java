package com.jpn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jpn.entity.LoginEntity;

import common.JdbcTemplate;
//DB�� ����(CRUD ó��)
public class LoginDao {
	public LoginEntity getLoginUser(String sid, String spwd) {
		Connection conn=JdbcTemplate.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		LoginEntity entity=null;
		
		try {
			String sql="SELECT * FROM USERS WHERE ID=? AND PWD=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sid);
			pstmt.setString(2, spwd);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				entity=new LoginEntity();
				entity.setId(rs.getString("ID")); //ID�� �÷���
				entity.setPwd(rs.getString("PWD"));
				entity.setName(rs.getString("NAME"));
				entity.setPoint(rs.getDouble("POINT"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(conn);
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return entity;
	}
}
