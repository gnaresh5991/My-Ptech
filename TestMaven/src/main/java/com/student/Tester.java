package com.student;
import org.hibernate.cfg.Configuration;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Tester {
	static Student student=new Student();
	static Scanner s=new Scanner(System.in);
	static String sn;
	static int sid;
	
	public void createmeth() {
		Configuration configuration=new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.openSession();
		session.beginTransaction();
		Student student=new Student();
		System.out.println("enter id");sid=s.nextInt();
		System.out.println("enter student name");sn=s.next();
		student.setId(sid);
		student.setName(sn);
		session.save(student);
		session.getTransaction().commit();
		System.out.println("completed..!");
		session.close();
		}
	public void updatemeth() {
		Configuration configuration=new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.openSession();
		session.beginTransaction();
		
		System.out.println("enter id");sid=s.nextInt();
		System.out.println("enter student name");sn=s.next();
		student.setId(sid);
		student.setName(sn);
		session.update(student);
		session.getTransaction().commit();
		System.out.println("completed..!");	
		session.close();
	}
	public void deletemeth() {
		Configuration configuration=new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.openSession();
		session.beginTransaction();
		
		System.out.println("enter id");sid=s.nextInt();
		student.setId(sid);
		session.delete(student);
		session.getTransaction().commit();
		System.out.println("completed..!");
		session.close();
	}
	public void display()
	{
		Configuration configuration=new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.openSession();
		
		System.out.println("enter id");sid=s.nextInt();
		student.setId(sid);
		Student student2=(Student)session.get(Student.class,sid);
		System.out.println("id\tname\n--------------");
		System.out.println(student2.getId()+"\t"+student2.getName());
		session.beginTransaction().commit();
		System.out.println("completed..!");
		session.close();	
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("==chose your Option==");
		Tester t=new Tester();
		System.out.println("1.Insert\n2.Display\n3.Update\n4.Delete");int ch=s1.nextInt();
		switch(ch)
		{
		case 1: t.createmeth();break;
		case 2: t.display();break;
		case 3: t.updatemeth();break;
		case 4: t.deletemeth();break;
		
		default : System.out.println("Invalid input..!");
		}	
	}
}

