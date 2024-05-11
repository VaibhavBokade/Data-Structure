package DL;

//import com.list.Employee;

public class Tester {

	public static void main(String[] args) {
		DLL<Employee> list = new DLL<>();
//		list.addFrist(10);
//		list.addFrist(20);
//		list.addFrist(30);
//		list.addFrist(40);
//		list.addFrist(50);
//		list.print();
		Employee e = new Employee(123, "VVVV","dac","ttt");
		Employee e1 = new Employee(124, "ccc","dac","sss");
		Employee e2 = new Employee(125, "ddd","dac","eee");
		Employee e3 = new Employee(126, "lll","dac","rrr");
		Employee e4 = new Employee(127, "ccc","dac","uuu");
//		list.addFrist(e);
//		list.print();
		list.addLast(e1);
		list.addLast(e2);
//		list.addLast(e3);
//		list.addLast(e4);
//		list.print();
		list.deleteFirst();
		list.deleteFirst();
//		list.print();
//		list.deleteLast();
//		list.deleteLast();
		list.print();
		//int empid,String name,String department,String title

	}

}
