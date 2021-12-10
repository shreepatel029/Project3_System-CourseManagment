package Project2_ITSS3312_ShreePatel;



import java.util.Random;
import java.util.Scanner;

public class Project3_ITSS3312_ShreePatel {

	public static void main(String[] args) {
		
		// This is a code that shows the student management system
		
		// Declare variables
		
		int count;
		int studentPick; // client
		int studentAdd;
		int displayStudents;
		int studentDeactivate;
		int find;
		int studentNext = 0;
	    int i = 0;	
	    boolean discover;
	    int assignjob;
	    int displaystudentjobs;
	    int addjob;
	    int y;
	    int x;
	    int newcourse;
	    int assignnewcourse;
	    int allstudents;
	    int newcode;
	    
	     
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// Print welcome message
		
		System.out.println("Welcome to the student Managment System!");
		System.out.println("Let's start with the number of students this system will have: 5");
		
		count = input.nextInt();
		System.out.println();
		System.out.println("1.SMS 2. CMS 3. Exit");
		newcourse=input.nextInt();
		if (newcourse==1) {
		System.out.println(" ***Welcome to Student Management System***\r\n"
				+ "\r\n"
				+ "Press ‘1’ to add a student\r\n"
				+ "\r\n"
				+ "Press ‘2’ to deactivate a student\r\n"
				+ "\r\n"
				+ "Press ‘3’ to display all students\r\n"
				+ "\r\n"
				+ "Press ‘4’ to search for a student by ID\r\n"
				+ "\r\n"
				+ " Press ‘5’ to assign on-campus job\r\n"
				+ "\r\n"
				
				+ "Press ‘6’ to display all students with on-campus jobs"
				
				+ "Press ‘0’ to exit the system");
		
	// Create the student array
		
	    Student[] studentobjects = new Student[count];
		
		 studentPick = input.nextInt();

	

	// Print Array elements for loop
		
		
		
	while(studentPick !=0)	 {
			
			input.nextLine();
		if (studentPick == 1) {
			studentobjects[studentNext] = new Student();
			System.out.println("Enter first name: ");
			   studentobjects[studentNext].first = input.nextLine();
			System.out.println("Enter last name: ");
			 studentobjects[studentNext].last = input.nextLine();
			 System.out.println("Enter level: ");
			 studentobjects[studentNext].level = input.nextLine();
			 studentobjects[studentNext].idnumber = random.nextInt(100);
			 studentobjects[studentNext].printStudentAdded();
			 studentNext++;
		}
		
	    
		if (studentPick==2) {
			System.out.println("Enter the ID for the student you want to deactivate:");
			 studentDeactivate = input.nextInt();
        for(i=0; i<studentobjects.length;i++){
        	if(studentobjects[i] != null&& studentobjects[i].idnumber==studentDeactivate) {
        		studentobjects[i].active=false;
        		System.out.println(studentobjects[i].getFirst()+studentobjects[i].getLast()+"has been deactivated");
       }
       
  }    
		    
		 
}		 
		 
		
        if(studentPick==3) {
        	System.out.println("Display all students:");
        for(i=0; i<studentobjects.length;i++) {
        	if(studentobjects[i]!=null) {
        		studentobjects[i].printstudentobject();
        	studentobjects[i].first=input.nextLine();
        	studentobjects[i].last = input.nextLine();
        	}
        }
   }
        
        
        
        if(studentPick==4) {
        	System.out.println("Enter ID to find student:");
        	find = input.nextInt();
        	discover = false;
        	for(i=0; i<studentobjects.length;i++) {
        		if(studentobjects[i] !=null) 
        			if(studentobjects[i].idnumber==find) {
        				studentobjects[i].printstudentobject();
        				discover= true;
        				
        if(studentPick==5) {
        	System.out.println("Assign a on-campus job:");
            assignjob = input.nextInt();
            for(i=0; i<studentobjects.length;i++) {
            	if(studentobjects[i] !=null)
            	 if(studentobjects[i].jobfind==assignjob) {
            		 studentobjects[i].printstudentobject();
            	 }
            }
        
        	
        	
        if(studentPick==6) {
        	System.out.println("Display students with on campus jobs:");
           displaystudentjobs=input.nextInt();
           for(i=0; i<studentobjects.length;i++) {
        		   if(studentobjects[i] !=null) {
        			   
        		   }
    
        		   
      		   
        		   
        			  

           }
        
        
        }
        
        }
     }
    }
   }
  }
 }
	
	Student[] studentobjects = new Student[count];
		
	if(newcourse==2) {
		System.out.println(" Press ‘1’ to add a new course\r\n"
				+ "Press ‘2’ to assign student a new course\r\n"
				+ "Press ‘3’ to display student with assigned courses\r\n"
				+ "Press ‘0’ to exit CMS\r\n"
				+ " ");
		
		
		if(newcourse==1) {//add new course code}
			System.out.println(" Add a new course:");
		assignnewcourse=input.nextInt();
		 for(i=0; i<studentobjects.length;i++) {
  		   if(studentobjects[i] !=null) {
  			   
  		   }
			
		
		if(newcourse==2) {//assign student code}
			System.out.println(" Assign student code:");
		newcode=input.nextInt();
		for(i=0; i<studentobjects.length;i++) {
			if(studentobjects[i] !=null) {
		}
		
		if(newcourse==3) {//display students with assigned courses}
			System.out.println(" Display all students with new courses:");
		allstudents=input.nextInt();
		for(i=0; i<studentobjects.length;i++) {
			if(studentobjects[i] !=null) {
				
			}
		}
		
		if(newcourse==4) {//exit }
			System.out.println(" Exit the system:");
		
		if(newcourse<1 || newcourse>4) System.out.println("Invalid code");
		}
		}
		}
		}
	}
	if(newcourse==3) {
		System.exit(0);
	}
	if(newcourse<1 || newcourse>3)
		System.out.println("Invalid input");
}	
 }	           
	          // End of main method/// 
	}
}