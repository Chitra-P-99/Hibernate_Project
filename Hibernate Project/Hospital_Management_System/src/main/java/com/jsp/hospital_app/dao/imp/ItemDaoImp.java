package com.jsp.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hospital_app.dao.ItemDao;
import com.jsp.hospital_app.dto.Encounter;
import com.jsp.hospital_app.dto.Item;
import com.jsp.hospital_app.dto.MedOrder;

public class ItemDaoImp implements ItemDao{

	public Item saveItem(Item item, int mid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder=entityManager.find(MedOrder.class, mid);
		if(medorder!=null)
		{
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		}
		else
		{
			return null;
		}
	}
	public Item getItemId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class, iid);
		
		return item;
	}
	public boolean deleteItemId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class, iid);
		if(item!=null)
		{
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public Item updateItemId(Item item, int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=entityManager.find(Item.class, iid);
		if(item1!=null)
		{
			item1.setCost(item.getCost());
			item1.setName(item.getName());
			item1.setQuantity(item.getQuantity());
			entityTransaction.begin();
			entityManager.merge(item1);
			entityTransaction.commit();
			return item1;
		}
		else
		{
			return null;
		}
	}
	public List<Item> getAllItem() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkysir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Item e");
		List<Item>item=query.getResultList();
		return item;
	}
}
