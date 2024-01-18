package com.demo.service;

import java.util.List;

import com.demo.dao.Studentdao;
import com.demo.dao.Studentdaoimpl;
import com.demo.model.Student;

public class Studentserviceimpl implements Studentservice {
		Studentdao sdao;
		public Studentserviceimpl()
		{
			super();
			this.sdao=new Studentdaoimpl();
		}
		
	@Override
	public List<Student> findallStudent() {
		
		return sdao.getallstudent();
	}

}
