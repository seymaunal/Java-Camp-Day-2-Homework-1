package day2homework1;

public class Main {
	
	public static void main (String[] args) {
		
		Course course1 = new Course (1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", 3, "Engin Demirog" );
		Course course2 = new Course (2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT", 32, "Engin Demirog" );
		
		courseManager courseManager = new courseManager();
		courseManager.openToCourse(course1);
		courseManager.openToCourse(course2);
		
	}

}
