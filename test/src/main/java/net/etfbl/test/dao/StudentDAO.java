package net.etfbl.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.etfbl.test.dto.Student;

public class StudentDAO {
	
	private static ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
	
	private static final String SQL_INSERT_NEW_USER = "INSERT INTO user (firstName, lastName, eMail, username, password, dateOfBirth, roleId, pending, active) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String SQL_SELECT_USER_BY_USERNAME_AND_PASSWORD = "SELECT * FROM student WHERE id=?";

	public static Student read(int id) {
		Student student = null;
		
		Connection conn = null;
		ResultSet rs = null;
		Object[] values = {Integer.valueOf(3)};
		
		try {
			conn = connectionPool.checkOut();
			PreparedStatement preparedStatement = DAOUtil.prepareStatement(conn, SQL_SELECT_USER_BY_USERNAME_AND_PASSWORD, false, values);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {
				student = new Student(rs.getInt("id"), rs.getString("ime"), rs.getString("prezime"), rs.getString("indeks"));
			}
			preparedStatement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			connectionPool.checkIn(conn);
		}
		
		return student;
	}
	
}
