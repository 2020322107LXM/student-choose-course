# G202 2020322107 李雪明 
## 学生选课系统
## 实验目的：做一个简易的学生选课系统，从中了解定义类中的属性及方法；学会使用super()，用于实例化子类；学会使用类的继承；掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验内容：用Students、Course、Teacher、person和主类students choose course构建选课系统
# 实验方法：


# 实验过程：person类为Students的父类
public class Student extends person{
	 String stuName;
	 int stuId;
	 Course[] courses;

	 public Student() {
	  super();
	  courses = new Course[4];
	 }

	 public Student(int stuId,String stuName) {
	  super();
	  this.stuId=stuId;
	  this.stuName=stuName;
	  courses = new Course[4];
	 }

	 public String getStuName() {
	  return stuName;
	 }
	 
	 public void setStuName(String stuName) {
	  this.stuName = stuName;
	 }
	 public int getStuId() {
	  return stuId;
	 }
	 public void setStuId(int stuId) {
	  this.stuId = stuId;
	 }

	 public boolean addCourse(Course course){
		  boolean flag=false;
		  if(!isSelectedCourse(course)&&isNullCourse(course)){
		   for(int i=0;i<this.courses.length;i++){
		    if(courses[i]==null){
		     courses[i]=course;
		     course.addStudent(this);
		     flag=true;
		     break;
		    }
		   }
		  }
		  return flag;
		 }
	 public void displayCourse(){
		  System.out.println("学生"+stuId+this.stuName+"所选课程有：");
		  for(Course c:courses){
		   if(c!=null){
		    System.out.print(c.getId()+c.getName());
		   }
		  }
		  System.out.println();
		 }
	 public boolean isSelectedCourse(Course course){
		  boolean flag=false;
		  for(Course c:courses){
		   if(c==course){
		    flag=true;
		    break;
		   }
		  }
		  return flag;
		 }
		 //子方法2：学生是否还有选修课位置
		 public boolean isNullCourse(Course course){
		  boolean flag=false;
		  for(Course c:courses){
		   if(c==null){
		    flag=true;
		    break;
		   }
		  }
		  return flag;
		 }

	
}
