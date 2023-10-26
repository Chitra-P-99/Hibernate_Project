package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Item;

public interface ItemDao {
	public Item saveItem(Item item,int mid);
	public Item getItemId(int iid);
	public boolean deleteItemId(int iid);
	public Item updateItemId(Item item,int iid);
	public List<Item> getAllItem();

}
