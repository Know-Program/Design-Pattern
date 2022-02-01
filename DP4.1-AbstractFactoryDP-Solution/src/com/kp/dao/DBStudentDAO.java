package com.kp.dao;

public class DBStudentDAO implements DAO {

	@Override
	public void insert() {
		// Persistence logic
		System.out.println("DBStudentDAO: Inserting Student Info to Database table");
	}

}
