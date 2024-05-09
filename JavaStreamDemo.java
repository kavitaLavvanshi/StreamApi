package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A{
	int sid;
	String Name;
	String rollNo;
	String address;
	public A(int sid, String name, String rollNo, String address) {
		super();
		this.sid = sid;
		Name = name;
		this.rollNo = rollNo;
		
		this.address = address;
	}

	
}

public class JavaStreamDemo {

	public static void main(String[] args) {
		List<A>studentList=new ArrayList<A>();
		studentList.add(new A(1,"ashish","RWI140","Rewa"));
		studentList.add(new A(2,"kavita","RWI141","khandwa"));
		studentList.add(new A(3,"kanak","RWI142","betul"));
		studentList.add(new A(4,"sanak","RWI143","indore"));
		studentList.add(new A(5,"palak","RWI144","khargone"));
		
		List<Integer>statelist=studentList.stream()
                .filter(p->p.sid>2)//Filtering
                .map(m->m.sid).//fetching
                collect(Collectors.toList());
         System.out.println(statelist);
		

	}

}
