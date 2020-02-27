package com.vidvaan.hibernate.dao;

import java.util.List;

import com.vidvaan.hibernate.model.Student;

public interface StudentDAO {

	public Integer save(Student student);

	public void update(Student student);

	public void delete(Integer sid);

	public Student findById(Integer sid);

	public List<Student> findAll();

}
