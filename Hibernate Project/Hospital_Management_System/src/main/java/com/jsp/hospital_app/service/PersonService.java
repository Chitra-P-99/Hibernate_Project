package com.jsp.hospital_app.service;

import java.util.List;

import com.jsp.hospital_app.dao.imp.PersonDaoImp;
import com.jsp.hospital_app.dto.Person;

public class PersonService {
	public void savePerson(Person person,int eid)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		Person person1=personDaoImp.savePerson(person, eid);
		if(person1!=null)
		{
			System.out.println("Person Saved");
		}
		else
		{
			System.out.println("Person not saved");
		}
	}
	public Person getPersonById(int pid)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		Person person1=personDaoImp.getPersonId(pid);
		if(person1!=null)
		{
			return person1;

		}
		else
		{
			return null;
		}
	}
	public void deletePerson(int pid)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		boolean flag=personDaoImp.deletePersonId(pid);
		if(flag)
		{
			System.out.println("Person deleted");
		}
		else
		{
			System.out.println("Person not found");
		}
	}
	public Person updatePerson(Person person,int pid)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		Person person1=personDaoImp.updatePersonId(person, pid);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getAllPerson()
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		List<Person> person= personDaoImp.getAllPerson();
		return person;
	}
	public List<Person> getPersonByGender(String gender)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		List<Person> person= personDaoImp.getPersonByGender(gender);
		return person;
	}
	public List<Person> getPersonByAge(int age)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		List<Person> person= personDaoImp.getPersonByAge(age);
		return person;
	}
	public List<Person> getPersonByPhone(long phone)
	{
		PersonDaoImp personDaoImp=new PersonDaoImp();
		List<Person> person= personDaoImp.getPersonByPhone(phone);
		return person;
	}
}
