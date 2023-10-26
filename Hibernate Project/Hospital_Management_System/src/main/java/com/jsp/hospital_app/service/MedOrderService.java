package com.jsp.hospital_app.service;

import java.util.List;
import com.jsp.hospital_app.dao.imp.MedOrderDaoImp;
import com.jsp.hospital_app.dto.MedOrder;

public class MedOrderService {
	public void saveMedOrder(MedOrder medorder,int eid)
	{
		MedOrderDaoImp medorderDaoImp=new MedOrderDaoImp();
		MedOrder medorder1=medorderDaoImp.saveMedOrder(medorder, eid);
		if(medorder1!=null)
		{
			System.out.println("MedOrder Saved");
		}
		else
		{
			System.out.println("MedOrder not saved");
		}
	}
	public MedOrder getMedorderById(int mid)
	{
		MedOrderDaoImp medorderDaoImp=new MedOrderDaoImp();
		MedOrder medorder1=medorderDaoImp.getMedOrderId(mid);
	
		if(medorder1!=null)
		{
			return medorder1;

		}
		else
		{
			return null;
		}
	}
	public void deleteMedorder(int mid)
	{
		MedOrderDaoImp medorderDaoImp=new MedOrderDaoImp();
		boolean flag= medorderDaoImp.deleteMedOrderId(mid);
		if(flag)
		{
			System.out.println("Medorder deleted");
		}
		else
		{
			System.out.println("Medorder not found");
		}
	}
	public MedOrder updateAddress(MedOrder medorder,int mid)
	{
		MedOrderDaoImp medorderDaoImp=new MedOrderDaoImp();
		MedOrder medorder1=medorderDaoImp.updateMedOrderId(mid, medorder);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	public List<MedOrder> getAllMedOrder()
	{
		MedOrderDaoImp medorderDaoImp=new MedOrderDaoImp();
		List<MedOrder> medorder= medorderDaoImp.getAllMedOrder();
		return medorder;
	}
	
	public List<MedOrder> getMedOrderBYName(String name)
	{
		MedOrderDaoImp medorderDaoImp=new MedOrderDaoImp();
		List<MedOrder> medorder= medorderDaoImp.getMedOrderByDoctorName(name);
		return medorder;
	}
}
