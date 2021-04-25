package day2homework1;

public class Course {
	
	public Course() {
		
		System.out.println("Kurslar");
	}
	
	public Course(int id, String name, int progress, String instructorName) {
		this();
		this.id = id;
		this.name = name;
		this.progress = progress;
		this.instructorName = instructorName;
		
		
	}
	
	int id;
	String name;
	int progress;
	String instructorName;
	

}
