package com.jsp.hospital_app.service;

import java.util.List;

import com.jsp.hospital_app.dao.imp.ItemDaoImp;
import com.jsp.hospital_app.dto.Item;


public class ItemService {
	
	public void saveItem(Item item,int mid)
	{
		ItemDaoImp itemDaoimp=new ItemDaoImp();
		Item item1=itemDaoimp.saveItem(item, mid);
		if(item1!=null)
		{
			System.out.println("Item Saved");
		}
		else
		{
			System.out.println("Item not saved");
		}
	}

	public Item getItemById(int iid)
	{
		ItemDaoImp itemDaoimp=new ItemDaoImp();
		Item item1=itemDaoimp.getItemId(iid);
		if(item1!=null)
		{
			return item1;

		}
		else
		{
			return null;
		}
	}
    public void deleteItem(int iid)
	{

		ItemDaoImp itemDaoimp=new ItemDaoImp();
		boolean flag=itemDaoimp.deleteItemId(iid);
		if(flag)
		{
			System.out.println("Item deleted");
		}
		else
		{
			System.out.println("Item not found");
		}
	}
	public Item updateItem(Item item,int iid)
	{

		ItemDaoImp itemDaoimp=new ItemDaoImp();
		Item item1=itemDaoimp.updateItemId(item, iid);
		if(item1!=null)
		{
			return item1;
		}
		else
		{
			return null;
		}
	}
	public List<Item> getAllItem()
	{
		ItemDaoImp itemDaoimp=new ItemDaoImp();
		List<Item> item= itemDaoimp.getAllItem();
		return item;
	}
}
