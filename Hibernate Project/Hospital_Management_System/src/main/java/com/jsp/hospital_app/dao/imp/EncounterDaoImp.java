package com.jsp.hospital_app.dao.imp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.hospital_app.dao.EncounterDao;
import com.jsp.hospital_app.dto.Address;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Encounter;
public class EncounterDaoImp implements EncounterDao{
	public Encounter saveEncounter(Encounter encounter, int bid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		}
		else
		{
			return null;
		}
	}
	public Encounter getEncounterId(int eid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		
		return encounter;
	}
	public boolean deleteEncounterId(int eid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public Encounter updateEncounterId(int eid, Encounter encounter) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter1=entityManager.find(Encounter.class, eid);
		if(encounter1!=null)
		{
			encounter1.setDodischarge(encounter.getDodischarge());
			encounter1.setDojoin(encounter.getDojoin());
			entityTransaction.begin();
			entityManager.merge(encounter1);
			entityTransaction.commit();
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	public List<Encounter> getAllEncounter() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Encounter e");
		List<Encounter>encounter=query.getResultList();
		return encounter;
	}
}
