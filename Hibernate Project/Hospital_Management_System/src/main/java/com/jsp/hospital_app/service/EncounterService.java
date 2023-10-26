package com.jsp.hospital_app.service;

import java.util.List;


import com.jsp.hospital_app.dao.imp.EncounterDaoImp;
import com.jsp.hospital_app.dto.Encounter;

public class EncounterService {
	public void saveBranch(Encounter encounter,int hid)
	{
		EncounterDaoImp encounterdaoImp=new EncounterDaoImp();
		Encounter encounter1=encounterdaoImp.saveEncounter(encounter, hid);
		if(encounter1!=null)
		{
			System.out.println("Encounter Saved");
		}
		else
		{
			System.out.println("Encounter not saved");
		}
	}
	public Encounter getEncounterById(int eid)
	{
		EncounterDaoImp encounterdaoImp=new EncounterDaoImp();
		Encounter encounter1=encounterdaoImp.getEncounterId(eid);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	public void deleteEncounter(int hid)
	{
		EncounterDaoImp encounterdaoImp=new EncounterDaoImp();
		boolean flag=encounterdaoImp.deleteEncounterId(hid);
		if(flag)
		{
			System.out.println("Encounter deleted");
		}
		else
		{
			System.out.println("Encounter not found");
		}
	}
	public Encounter updateEncounter(Encounter encounter,int hid)
	{
		EncounterDaoImp encounterdaoImp=new EncounterDaoImp();
		Encounter encounter1=encounterdaoImp.updateEncounterId(hid, encounter);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	public List<Encounter> getAllBranch()
	{
		EncounterDaoImp encounterdaoImp=new EncounterDaoImp();
		List<Encounter> encounter= encounterdaoImp.getAllEncounter();
		return encounter;
	}
}
