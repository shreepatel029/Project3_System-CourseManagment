# Project3_System-CourseManagment
Course project implements how to create code with variables and arrays 
Using arrays and "student objects" will help answer questions created in the "System.out.println" 
example: "System.out.println("Deactivate student");
These types of code will work in the long run because just simply typing 1, 2, 3, 4, for each menu type will tell the user about what the code needs to do
Running this code at a high level is important for especially java, because its important for readers to understand what the code means 
Same coding example with the course manangement system, creating an array using if-while statements as well
Another example: For coding a specific person's name you would have to add the array and then type the statement:input.nextLine();
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
This is one example of the input the user will put and the output would be returning the user to enter the first, last name as well as the level; "Shree Patel, 9;
using random.nextInt basically represents picking a number for a student id from 1-100 and this is automatic
