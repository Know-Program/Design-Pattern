package com.kp.factory;

import com.kp.dao.DAO;

public interface DAOFactory {
	public DAO createDAO(String type);
}
