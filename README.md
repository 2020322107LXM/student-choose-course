# G202 2020322107 李雪明 
## 学生选课系统
## 实验目的：做一个简易的学生选课系统，从中了解定义类中的属性及方法；学会使用super()，用于实例化子类；学会使用类的继承；掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验内容：用Students、Course、Teacher、person和主类students choose course构建选课系统
## 实验方法：


## 实验过程：
person中定义id、name、course[]等
public class person {
	
	int id;
	String name;
	Course[] course;
person类为teacher的父类	
讲父类的ID、name等重写teacher中的teacherID、teachername等
public class Teacher extends person{
	
	this.teacherid=id;
	this.teacherName=teacherName;
	
在Students中添加选课方法
	
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
	}
打印结果的方法
	
	public void displayCourse(){
	 System.out.println("学生"+stuId+this.stuName+"所选课程有：");
		  for(Course c:courses){
		   if(c!=null){
		    System.out.print(c.getId()+c.getName());
		   }
		  }
		  System.out.println();
		 }
Course中用构造方法将课程id、name实例化
Students类和Students choose course是实验的主要内容，并且Students choose course为主类，在Students choose course中添加学生和选课信息；Students中打印结果，并有增加学生选课和判断学生是否有选课信息等方法，在实验中我一共添加了4个学生和4门课程 并有对应的编号ID。
## 实验结果
	学生1001马所选课程有：
	001高数
	学生1002赵所选课程有：
	002离散
	学生1003刘所选课程有：
	003计算机网络
	学生1004魏所选课程有：
	004计算机原理







