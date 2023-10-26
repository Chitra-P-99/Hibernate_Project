package com.jsp.hospital_app.service;

import java.util.List;

import com.jsp.hospital_app.dao.imp.ObservationDaoImp;
import com.jsp.hospital_app.dto.Observation;

public class ObservationService {
	
	public void saveObservation(Observation observation,int oid)
	{
		ObservationDaoImp observationDaoImp=new ObservationDaoImp();
		Observation observation1=observationDaoImp.saveObservation(observation, oid);
		if(observation1!=null)
		{
			System.out.println("Observation Saved");
		}
		else
		{
			System.out.println("Observation not saved");
		}
	}
	public Observation getObservationById(int oid)
	{
		ObservationDaoImp observationDaoImp=new ObservationDaoImp();
		Observation observation1=observationDaoImp.getObservationId(oid);
		if(observation1!=null)
		{
			return observation1;

		}
		else
		{
			return null;
		}
	}
	public void deleteObservation(int oid)
	{

		ObservationDaoImp observationDaoImp=new ObservationDaoImp();
		boolean flag=observationDaoImp.deleteObservationId(oid);
		if(flag)
		{
			System.out.println("Observation deleted");
		}
		else
		{
			System.out.println("Observation not found");
		}
	}
	public Observation updateObservation(Observation observation,int oid)
	{

		ObservationDaoImp observationDaoImp=new ObservationDaoImp();
		Observation observation1=observationDaoImp.updateObservation(observation, oid);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	public List<Observation> getAllObservation()
	{
		ObservationDaoImp observationDaoImp=new ObservationDaoImp();
		List<Observation> observation= observationDaoImp.getAllObservation();
		return observation;
	}
	
	public List<Observation> getObservationByDoctorName(String name)
	{
		ObservationDaoImp observationDaoImp=new ObservationDaoImp();
		List<Observation> observation= observationDaoImp.getObservationByDoctorName(name);
		return observation;
	}
}
