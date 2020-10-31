package studentcours;

public class Student{
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
