package com.yash.orm.SpringOrmHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.orm.SpringOrmHibernate.dao.StudentDao;
import com.yash.orm.SpringOrmHibernate.entity.Student;

/**
 * 
 * @author om.gadewar
 *
 */
 
 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao studentdao =context.getBean("StudentDao",StudentDao.class);
    	
    	Student student = new Student(123,"om gadewar","pune");
    	
    	int r =studentdao.insert(student);
    	System.out.println("done..  "+r);
    	
    	
    	
    	
    }
}
