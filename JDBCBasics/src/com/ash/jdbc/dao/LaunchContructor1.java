package com.ash.jdbc.dao;

class Telusko
{
	private String name;
	private double cost;
	
	Telusko()
	{
//		super();
//		this();
	     System.out.println("Zero param constructor");	
	}
	
	 Telusko(String name, double cost)
	 {
	    	//
	    	System.out.println("param constructor 2");
	    	this.name=name;
	    	this.cost=cost;
	 }
	 
	Telusko(String name)
	{
	    	//
	    	System.out.println("param constructor 1");
	    	this.name=name;
	    	cost=6500.0;
	    	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
public class LaunchContructor1
{
	public static void main(String[] args)
	{
		Telusko t1=new Telusko("System Design", 5000);
		
		Telusko t2=new Telusko();
		
		Telusko t3=new Telusko("DevOps with AWS");
		
	//	t1.disp();
//		
//		System.out.println(t1.getName());
//		System.out.println(t1.getCost());
//		t1.setName("DevOps with AWS");
//		t1.setCost(4555.5);
	}
}
