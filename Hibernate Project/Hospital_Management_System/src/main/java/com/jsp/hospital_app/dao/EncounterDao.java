package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Encounter;

public interface EncounterDao {
	public Encounter saveEncounter(Encounter encounter,int bid);
	public Encounter getEncounterId(int eid);
	public boolean deleteEncounterId(int eid);
	public Encounter updateEncounterId(int eid,Encounter encounter);
	public List<Encounter> getAllEncounter();
	

}
