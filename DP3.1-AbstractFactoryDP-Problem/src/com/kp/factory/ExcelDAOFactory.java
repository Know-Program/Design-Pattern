package com.kp.factory;

import com.kp.dao.DAO;
import com.kp.dao.ExcelCourseDAO;
import com.kp.dao.ExcelStudentDAO;

public class ExcelDAOFactory implements DAOFactory {
	// factory pattern
	public DAO createDAO(String type) {
		if(type.equalsIgnoreCase("student")) 
			return new ExcelStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			return new ExcelCourseDAO();
		else 
			throw new IllegalArgumentException("Invalid DAO type");
	}

}
