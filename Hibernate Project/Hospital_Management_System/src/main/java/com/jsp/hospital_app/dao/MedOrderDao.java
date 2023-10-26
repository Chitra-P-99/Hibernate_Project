package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.MedOrder;

public interface MedOrderDao {
	public MedOrder saveMedOrder(MedOrder medorder,int eid);
	public MedOrder getMedOrderId(int mid);
	public boolean deleteMedOrderId(int mid);
	public MedOrder updateMedOrderId(int mid,MedOrder medorder);
	public List<MedOrder> getAllMedOrder();
	public List<MedOrder> getMedOrderByDoctorName(String name);

}
