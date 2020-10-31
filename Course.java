package studentcours;

public class Course {

		 private String courseName;
		 private String courseId;
		 private Teacher teacher;
		 private float credit;


		 public Course(String courseId,String courseName,float credit,Teacher teacher) {
		  super();
		  this.courseId=courseId;
		  this.courseName=courseName;
		  this.credit=credit;
		  this.setTeacher(teacher);

		 }
		 
		 public Course(String courseId,String courseName) {
		  super();
		  this.courseId=courseId;
		  this.courseName=courseName;

		 }
		 
		 public Course() {
		  super();

		 }
		 
		 public void setId(String id){
		  this.courseId=id;
		 }
		 
		 public String getId(){
		  return this.courseId;
		 }
		 
		 public void setName(String name){
		  this.courseName=name;
		 }
		 
		 public String getName(){
		  return this.courseName;
		 }
		 
		 public void setCredit(float credit ){
		  this.credit=credit;
		 }
		 
		 public float getCredit(){
		  return this.credit;
		 }
		 
		 public Teacher getTeacher() {
		  return teacher;
		 }
		 
		 public void setTeacher(Teacher teacher) {
		  this.teacher = teacher;
		 }
		 
		public void addStudent(Student student) {
			
		}
		 
 }

