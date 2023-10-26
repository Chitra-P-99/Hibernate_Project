package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.BranchDao;
import com.jsp.hospital_app.dto.Branch;
import com.jsp.hospital_app.dto.Hospital;

public class BranchDaoImp implements BranchDao {

	public Branch saveBranch(int hid, Branch branch) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			return null;
		}
	}
	public Branch getBranchId(int bid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Branch branch=entityManager.find(Branch.class, bid);
		
			return branch;
	}
	public boolean deleteBranchId(int bid) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public Branch updateBranchId(int bid, Branch branch) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch1=entityManager.find(Branch.class, bid);
		if(branch1!=null)
		{
			branch1.setEmail(branch.getEmail());
			branch1.setAddress(branch.getAddress());
			entityTransaction.begin();
			entityManager.merge(branch1);
			entityTransaction.commit();
			return branch1;
		}
		return null;
	}
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select b from Branch b");
		List<Branch>branch=query.getResultList();
		return branch;
	}
}
