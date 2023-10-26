package com.jsp.hospital_app.service;

import java.util.List;
import com.jsp.hospital_app.dao.imp.AddressDaoImp;
import com.jsp.hospital_app.dto.Address;
public class AddressService {

	public void saveAddress(Address address,int bid)
	{
		AddressDaoImp addressDaoImp=new AddressDaoImp();
		Address address1=addressDaoImp.saveAddress(bid, address);
		if(address1!=null)
		{
			System.out.println("Address Saved");
		}
		else
		{
			System.out.println("Address not saved");
		}
	}
	public Address getAddressById(int aid)
	{

		AddressDaoImp addressDaoImp=new AddressDaoImp();
		Address address1=addressDaoImp.getAddressId(aid);
		if(address1!=null)
		{
			return address1;

		}
		else
		{
			return null;
		}
	}
	public void deleteAddress(int aid)
	{
		AddressDaoImp addressDaoImp=new AddressDaoImp();
		boolean flag=addressDaoImp.deleteAddress(aid);
		if(flag)
		{
			System.out.println("Address deleted");
		}
		else
		{
			System.out.println("Address not found");
		}
	}
	public Address updateAddress(Address address,int aid)
	{
		AddressDaoImp addressDaoImp=new AddressDaoImp();
		Address address1=addressDaoImp.updateAddress(aid, address);
		if(address1!=null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
	public List<Address> getAllAddress()
	{
		AddressDaoImp addressDaoImp=new AddressDaoImp();
		List<Address> address= addressDaoImp.getAllAddress();
		return address;
	}
}
