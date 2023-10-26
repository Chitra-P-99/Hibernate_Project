package com.jsp.hospital_app.service;

import java.util.List;
import com.jsp.hospital_app.dao.imp.UserDaoImp;
import com.jsp.hospital_app.dto.User;

public class UserService {
	
	public void saveUser(User user)
	{
		UserDaoImp userdaoImp=new UserDaoImp();
		userdaoImp.saveUser(user);
		if(user!=null)
		{
			System.out.println("User Saved");
			
		}
		else
		{
			System.out.println("Unfortunatly User not saved");
		}
	}
	
	public User getUserById(int uid)
	{
		UserDaoImp userdaoImp=new UserDaoImp();
		User user=userdaoImp.getUserId(uid);
		if(user!=null)
		{
			return user;
			
		}
		else
		{
			return null;
		}
	}
	
	public void deleteUser(int uid)
	{
		UserDaoImp userdaoImp=new UserDaoImp();
		boolean flag=userdaoImp.deleteUserId(uid);
		if(flag)
		{
			System.out.println("User Deleted");
			
		}
		else
		{
			System.out.println("User not found");
		}
	}
	
	public User updateUser(User user,int uid)
	{
		UserDaoImp userdaoImp=new UserDaoImp();
		User user1=userdaoImp.updateUserId(user, uid);
		if(user1!=null)
		{
			return user1;
			
		}
		else
		{
			return null;
		}
	}
	
	public List<User> getUserByRole(String role)
	{
		UserDaoImp userdaoImp=new UserDaoImp();
		List<User> user1=userdaoImp.getUserByRole(role);
		return user1;
	}
	public List<User> getAllUser()
	{
		UserDaoImp userdaoImp=new UserDaoImp();
		List<User> user1=userdaoImp.getAllUser();
		return user1;
	}

}
