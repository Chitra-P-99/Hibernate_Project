package com;

public class HetArray {
	int r;
	public HetArray(int f)
	{
		r=f;
	}
	
	public HetArray(int f,int s)
	{
		r=f*s;
	}
	
	public HetArray(int f,int s,int t)
	{
		r=f*s*t;
	}
	
	public static void main(String[] args) {
	HetArray h;
	h=new HetArray(2);
	System.out.println(h.r);
	h=new HetArray(2,3);
	System.out.println(h.r);
		
		
	}

}
