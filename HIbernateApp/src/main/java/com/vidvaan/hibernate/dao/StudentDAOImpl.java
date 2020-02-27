package com.vidvaan.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vidvaan.hibernate.model.Student;
import com.vidvaan.hibernate.util.SessionUtil;

public class StudentDAOImpl implements StudentDAO {

	public Integer save(Student student) {
		Session session = SessionUtil.getSession();
		Integer sid = (Integer) session.save(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
		return sid;
	}

	public void update(Student student) {
		Session session = SessionUtil.getSession();
		session.update(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);

	}

	public void delete(Integer sid) {
		Session session = SessionUtil.getSession();
		Student student = (Student) session.get(Student.class, sid);
		session.delete(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);

	}

	public Student findById(Integer sid) {
		Session session = SessionUtil.getSession();
		Student student = (Student) session.get(Student.class, sid);
		return student;
	}

	public List<Student> findAll() {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Student");
		return query.list();
	}

}
