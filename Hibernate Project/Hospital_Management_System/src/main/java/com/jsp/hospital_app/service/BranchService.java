package com.jsp.hospital_app.service;

import java.util.List;

import com.jsp.hospital_app.dao.imp.BranchDaoImp;
import com.jsp.hospital_app.dto.Branch;

public class BranchService {
	public void saveBranch(Branch branch,int hid)
	{
		BranchDaoImp branchdaoImp=new BranchDaoImp();
		Branch branch1=branchdaoImp.saveBranch(hid, branch);
		if(branch1!=null)
		{
			System.out.println("Branch Saved");
		}
		else
		{
			System.out.println("Branch not saved");
		}
	}
	public Branch getBranchById(int bid)
	{
		BranchDaoImp branchdaoImp=new BranchDaoImp();
		Branch branch=branchdaoImp.getBranchId(bid);
		if(branch!=null)
		{
			return branch;
		}
		else
		{
			return null;
		}
	}
	public void deleteBranch(int bid)
	{
		BranchDaoImp branchdaoImp=new BranchDaoImp();
		boolean flag=branchdaoImp.deleteBranchId(bid);
		if(flag)
		{
			System.out.println("Branch deleted");
		}
		else
		{
			System.out.println("Branch not found");
		}
	}
	public Branch updateBranch(Branch branch,int bid)
	{
		BranchDaoImp branchdaoImp=new BranchDaoImp();
		Branch branch1=branchdaoImp.updateBranchId(bid, branch);
		if(branch1!=null)
		{
			return branch;
		}
		else
		{
			return null;
		}
	}
	public List<Branch> getAllBranch()
	{
		BranchDaoImp branchdaoImp=new BranchDaoImp();
		List<Branch> branch= branchdaoImp.getAllBranch();
		return branch;
	}
}
