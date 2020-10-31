package studentcours;

public class Teacher extends person {
		 int teacherid;
		 String teacherName;

		 
		 public Teacher() {
		  super();

		 }
		 public Teacher(int Id,String teacherName){
		  this.teacherid=id;
		  this.teacherName=name;
		 }
		 public String getTeacherName() {
		  return teacherName;
		 }
		 public void setTeacherName(String teacherName) {
		  this.teacherName = teacherName;
		 }
		 
		 
	}

