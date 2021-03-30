package demo;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudentDemo {
	public static void main(String[] args) {
		// ArrayList<Student> array = new ArrayList<Student>();
		// Student s1 = new Student("张三", 20);
		// Student s2 = new Student("李四", 23);
		// Student s3 = new Student("王五", 24);
		// array.add(s1);
		// array.add(s2);
		// array.add(s3);
		// for(int i=0; i<array.size(); i++) {
		// 	Student s = array.get(i);
		// 	System.out.println("姓名:" + s.getName());
		// 	System.out.println("年龄:" + s.getAge());
		// }

		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		addStudent(array);
		addStudent(array);
		showStudentArray(array);
	}

	public static void addStudent(ArrayList<Student> array){
		//键盘录入信息
		Scanner sc = new Scanner(System.in);
		System.out.println("输入名字：");
		String name = sc.nextLine();
		System.out.println("输入年龄：");
		String age = sc.nextLine();
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		array.add(s);
	}
	
	public static void showStudentArray(ArrayList<Student> array) {
		int i;
		for(i=0; i<array.size(); i++) {
			Student s = array.get(i);
			System.out.println("姓名：" + s.getName());
			System.out.println("年龄：" + s.getAge());
		}
	}

}
