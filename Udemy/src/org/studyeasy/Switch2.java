package org.studyeasy;

public class Switch2 {

	public static void main(String[] args) {
		String name="edItoR";
		switch(name.toLowerCase()) {
		case "author":
			System.out.println("Afiffa");
			break;
		case "team":
			System.out.println("IBM");
			break;
		case "editor":
			System.out.println("krishna & Ganumamu");
			break;
			default:
				System.out.println("other names");
				break;			
		}

	}

}
