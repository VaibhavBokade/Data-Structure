package com.list;

//import DL.Employee;

public class Tester {

	public static void main(String[] args) {
		DCL<Employee> d = new DCL<>();
		Employee e = new Employee(123, "VVVV","dac","ttt");
		Employee e1 = new Employee(124, "ccc","dac","sss");
		Employee e2 = new Employee(125, "ddd","dac","eee");
		Employee e3 = new Employee(126, "lll","dac","rrr");
		Employee e4 = new Employee(127, "ccc","dac","uuu");
		d.addFrist(e);
		d.addFrist(e1);
//		d.addFrist(e2);
//		d.addFrist(e3);
		//d.addFrist(e4);
		d.deleteFirst();
		d.deleteFirst();
//		d.print();
//		System.out.println("---------");
//		//d.reverse();
//		d.addLast(e4);
//		d.print();
//		System.out.println("---------");
//		d.deleteFirst();
//		d.print();
//		System.out.println("---------");
//		d.deleteLast();
		d.print();
	//	d.reverse();
			//	int empid,String name,String department,String title
	}

}
