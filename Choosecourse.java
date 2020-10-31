package studentcours;

public class Choosecourse {
	public static void main(String[] args) {
		  Student stu0 = new Student(1001,"马");
		  Student stu1 = new Student(1002,"赵");
		  Student stu2 = new Student(1003,"刘");
		  Student stu3 = new Student(1004,"魏");
		  Course cour0 = new Course("001","高数");
		  Course cour1 = new Course("002","离散");
		  Course cour2 = new Course("003","计算机网络");
		  Course cour3 = new Course("004","计算机原理");
		  stu0.addCourse(cour0);
		  stu1.addCourse(cour1);
		  stu2.addCourse(cour2);
		  stu3.addCourse(cour3);
		  stu0.displayCourse();
		  stu1.displayCourse();
		  stu2.displayCourse();
		  stu3.displayCourse();
		 }
}
