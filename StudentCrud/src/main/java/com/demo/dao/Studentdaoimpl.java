package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Student;

public class Studentdaoimpl implements Studentdao {
	static Connection conn;
	static PreparedStatement selstudent;
	static {
		conn=DbUtil.getMyConnection();
		try {
			selstudent=conn.prepareStatement("select ID,namefirst,namelast from student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Student> getallstudent() {
		List<Student> lst=new ArrayList<>();
		try {
			
			ResultSet rs=selstudent.executeQuery();
			while(rs.next()) {
				Student e=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
				lst.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;			
	}

}
