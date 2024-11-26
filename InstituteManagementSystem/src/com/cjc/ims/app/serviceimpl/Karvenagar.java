package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc {

	
	List<Course>cList=new ArrayList<>();
	List<Faculty>fList =new ArrayList<>();
	
	Course c;
	Faculty f;
	
	public void addCourse()
	{
		Scanner sc=new Scanner(System.in);
		c = new Course();
		System.out.println("Enter Course id");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course Name");
		c.setCname(sc.next());
		cList.add(c);
	
	}
	public void viewCourse()
	{
		Iterator<Course> itr= cList.iterator();
		while(itr.hasNext())
		{
			Course c=itr.next();
			System.out.println(c.getCid());
			System.out.println(c.getCname());
		}
	}
		
	
		
	public void addFaculty()
	{
		Scanner sc=new Scanner(System.in);
        f=new Faculty();
		System.out.println("Enter Faculty id");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty Name");
		f.setFname(sc.next());
		
		viewCourse();
		System.out.println("Enter Course ID : ");
		int crid = sc.nextInt();
		for(Course cr : cList)
		{
			if(cr.getCid() == crid)
			{
				f.setCourse(cr);
				fList.add(f);
			}
		}		
	}
	
	
	public void viewFaculty()
	{
		Iterator<Faculty> itr= fList.iterator();
		while(itr.hasNext())
		{
			Faculty f=itr.next();
			System.out.println(f.getFid());
			System.out.println(f.getFname());
			System.out.println(f.getCourse().getCid());
			System.out.println(f.getCourse().getCname());
			
		}
	}
	
	
  List<Batch>blist=new ArrayList<>();
  Batch b;
  
	public void addBatch()
	{
		Scanner sc=new Scanner(System.in);
	    b=new Batch();
		System.out.println("Enter Batch id");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch Name");
		b.setBname(sc.next());
		
		viewFaculty();
		System.out.println("Enter Faculty id");
		int fid = sc.nextInt();
		for(Faculty fc : fList)
		{
			if(fc.getFid()==fid)
			{
				b.setFaculty(fc);
				blist.add(b);
			}
		}
		
		
	}
	public void viewBatch()
	{
		Iterator<Batch> itr= blist.iterator();
		while(itr.hasNext())
		{
			Batch b=itr.next();
			System.out.println(b.getBid());
			System.out.println(b.getBname());
			System.out.println(b.getFaculty().getFid());
			System.out.println(b.getFaculty().getFname());
			System.out.println(b.getFaculty().getCourse().getCid());
			System.out.println(b.getFaculty().getCourse().getCname());
		}
		}
	
  List<Student>slist=new ArrayList<>();
  Student st;
		
	public void addStudent()
	{
		Scanner sc=new Scanner(System.in);
	    st=new Student();
		System.out.println("Enter Student id");
		st.setSid(sc.nextInt());
		System.out.println("Enter Student Name");
		st.setSname(sc.next());
		//System.out.println("Enter Batch batch");
		
		viewBatch();
		System.out.println("Enter batch id");
		int bid=sc.nextInt();
		
		for(Batch ba : blist)
		{
			if(ba.getBid()== bid)
		   {	
			st.setBatch(ba);
			slist.add(st);
		   }
		
		}
		
		
		
	//	st.setBatch(b);
	//	slist.add(st);
	}
	public void viewStudent()
	{
		Iterator<Student> itr= slist.iterator();
		while(itr.hasNext())
		{
			Student st=itr.next();
			System.out.println(st.getSid());
			System.out.println(st.getSname());
			System.out.println(st.getBatch().getBid());
			System.out.println(st.getBatch().getBname());
			System.out.println(st.getBatch().getFaculty().getFid());
			System.out.println(st.getBatch().getFaculty().getFname());
			System.out.println(st.getBatch().getFaculty().getCourse().getCid());
			System.out.println(st.getBatch().getFaculty().getCourse().getCname());
			
			
		}
		}
		
		
	}
	
	

		
		
		
		
	
	
		
		
		
	
		
		
		
	
	
	
		
		
		
	
			
	
	
	
	
	

