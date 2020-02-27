package com.vidvaan.hibernate.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vidvaan.hibernate.dao.StudentDAO;
import com.vidvaan.hibernate.dao.StudentDAOImpl;
import com.vidvaan.hibernate.model.Student;
import com.vidvaan.hibernate.util.SessionUtil;

public class StudentTest {

	public static void main(String[] args) {
	
	    StudentDAO studentDAO = new StudentDAOImpl();
	    List<Student> findAll = studentDAO.findAll();
	    for (Student student : findAll) {
			System.out.println(student);
		}
	}

}
