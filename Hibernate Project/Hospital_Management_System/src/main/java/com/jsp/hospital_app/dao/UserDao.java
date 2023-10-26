package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.User;

public interface UserDao {
	public User saveUser(User user);
	public User getUserId(int uid);
	public boolean deleteUserId(int uid);
	public User updateUserId(User user,int uid);
	public List<User> getAllUser();
	public List<User> getUserByRole(String role);

}
