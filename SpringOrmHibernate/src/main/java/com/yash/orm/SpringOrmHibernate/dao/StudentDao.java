package com.yash.orm.SpringOrmHibernate.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yash.orm.SpringOrmHibernate.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernaTetemplate;
	
	// save student
	@Transactional
	public int insert(Student student) {
		// insert
		Integer i= (Integer) this.hibernaTetemplate.save(student);
		return i;
		
	}
	public HibernateTemplate getHibernaTetemplate() {
		return hibernaTetemplate;
	}
	public void setHibernaTetemplate(HibernateTemplate hibernaTetemplate) {
		this.hibernaTetemplate = hibernaTetemplate;
	}
	

}
