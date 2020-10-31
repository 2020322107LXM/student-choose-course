package studentcours;

public class Teacher {
		 private int teacherid;
		 private String teacherName;

		 
		 public Teacher() {
		  super();

		 }
		 public Teacher(int id,String teacherName){
		  this.teacherid=id;
		  this.teacherName=teacherName;
		 }
		 public String getTeacherName() {
		  return teacherName;
		 }
		 public void setTeacherName(String teacherName) {
		  this.teacherName = teacherName;
		 }
		 
		 
	}

