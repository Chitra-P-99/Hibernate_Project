package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Person;

public interface PersonDao {
	public Person savePerson(Person person,int eid);
	public Person getPersonId(int pid);
	public boolean deletePersonId(int pid);
	public Person updatePersonId(Person person,int pid);
	public List<Person> getAllPerson();
	public List<Person> getPersonByGender(String gender);
	public List<Person> getPersonByAge(int age);
	public List<Person> getPersonByPhone(long phone);

}
