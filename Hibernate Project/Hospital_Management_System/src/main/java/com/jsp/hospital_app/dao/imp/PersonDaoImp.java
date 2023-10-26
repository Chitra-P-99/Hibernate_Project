package com.jsp.hospital_app.dao.imp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.PersonDao;
import com.jsp.hospital_app.dto.Encounter;
import com.jsp.hospital_app.dto.MedOrder;
import com.jsp.hospital_app.dto.Observation;
import com.jsp.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao{

	public Person savePerson(Person person, int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}
	}
	public Person getPersonId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, pid);
		
		return person;
	}
	public boolean deletePersonId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, pid);
		if(person!=null)
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public Person updatePersonId(Person person, int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1=entityManager.find(Person.class, pid);
		if(person1!=null)
		{
			person1.setAge(person.getAge());
			person1.setDob(person.getDob());
			person1.setGender(person.getGender());
			person1.setName(person.getName());
			person1.setPhno(person.getPhno());
			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person1;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getAllPerson() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Person e");
		List<Person>person=query.getResultList();
		return person;
	}
	public List<Person> getPersonByGender(String gender) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where s.gender like ?1");
		query.setParameter(1, gender);
		List<Person> person=query.getResultList();
		return person;
	}
	public List<Person> getPersonByAge(int age) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where s.age like ?1");
		query.setParameter(1, age);
		List<Person> person=query.getResultList();
		return person;
	}
	public List<Person> getPersonByPhone(long phone) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where s.phno like ?1");
		query.setParameter(1, phone);
		List<Person> person=query.getResultList();
		return person;
	}
}
