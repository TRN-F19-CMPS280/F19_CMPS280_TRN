package CMPS280;
import java.util.Scanner;
import java.util.ArrayList;

/*SOME COMMENTS WILL BE DELETED PRIOR TO SUBMISSION  
 */

public class PRJ_280 {
	public static void main (String [] args) {
	

	int num = 0; 
	
//call the scanner object 
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
		
//ask the user for the class name and section number
	section courseInfo = new section(); 

	System.out.print("Please enter the name of your course: " + " " );
		courseInfo.name = (input.nextLine());
		
	System.out.print("Please enter your section number: " + " ");
		courseInfo.secNum = (input.nextInt());
		

//use the exception handling for counting the students 	
try {
		System.out.print("How many students are in " + courseInfo.name + "?");
		num = input.nextInt(); 
		
		{
			throw new StudentNumberException ("Incorrect Input. Please re enter the number of students ");
		}
	
	}catch (StudentNumberException ex) {
		for (int x = 0; x < 2; x++) {
			if (num < 0) {
				System.out.print(ex.getMessage());	
				num = input.nextInt();
			
			}

		}
	
}//end the exception handling   

Scanner input2 = new Scanner (System.in); //second scanner 

//Use an ArrayList to get the names of 3 students 

studentExtended students1 = new studentExtended(); //student objects
studentExtended students2 = new studentExtended();
studentExtended students3 = new studentExtended();

ArrayList<studentExtended> names = new ArrayList<>(); //student ArrayList 

System.out.print("Whose grades would you like to see? Please enter a first and last name of three students" + "\n");
			
		students1.setFullName(input2.next());
		students2.setFullName(input2.next());
		students3.setFullName(input2.next());

			names.add(students1);
			names.add(students2);
			names.add(students3);
			
		System.out.print (names.get(0).getFullName() + "\n");
		System.out.print(names.get(1).getFullName() + "\n");
		System.out.print(names.get(2).getFullName() + "\n");
		
			
		
//Get the grades for the students 			
	Grades grade1 = new Grades();
	Grades grade2 = new Grades();
	Grades grade3 = new Grades();
	
	System.out.println("What are the students grade? Please enter 3 integers. " );
		int studentGrade1 = input2.nextInt();
		int studentGrade2 = input2.nextInt();
		int studentGrade3 = input2.nextInt();
	
	

		grade1.getstudentGrade(studentGrade1);
		grade2.getstudentGrade(studentGrade2);
		grade3.getstudentGrade(studentGrade3);
	
	
	System.out.println(grade1.courseGrade);
	System.out.println(grade2.courseGrade );
	System.out.println(grade3.courseGrade );


	//show the output.
	System.out.println(courseInfo.name + " | " + "SECTION " + courseInfo.secNum + " GRADES " + "\n");
	System.out.println(names.get(0).getFullName() + "   " + grade1.courseGrade );
	System.out.println(names.get(1).getFullName() + "   " + grade2.courseGrade);
	System.out.println(names.get(2).getFullName() + "   " + grade3.courseGrade); 
	
	}//end the program

}//end the class

