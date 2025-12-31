package RCOE;
import java.util.*;


public class Form_creation {

	public static void main(String[] args) {

		Scanner SC=new Scanner(System.in);
		
		System.out.print("Enter Your Name ====>");
		String name=SC.next();
		
		System.out.println("Hello, "+name+" What is Your Qualification? ====>>>>");
		
		System.out.println("Choice 1:Graduation Completed\nChoice 2:Graduation Pursuing\nChoice 3:Other");
		System.out.print("Enter Your Choice:");
		int Qua=SC.nextInt();
		
		int Intern = 0;
		if(Qua==1)
		{
			System.out.println("Which Branch you Had in Graducation===>");
			System.out.println("If Computer Related any Branch then Type 'COMP' else Type 'OTHER' ");
			String Branch=SC.next();
			
			if(Branch=="COMP") 
			{
				System.out.print("Was Your CGPA Was Greater than 8.00? '(Y/N)' ===>>");
				String CGPA=SC.next();
				
				if(CGPA=="Y")
				{
					System.out.print("You can Apply For the Job:Software Development");
					
				}
				else
				{
					System.out.println("Have You Done Any Internship Earlier (0/1)");
					 Intern=SC.nextInt();
					
					
				}if(Intern==0)
				{
					System.out.println("You Are Selected For Next Round");
					
				}
				else
				{
					System.out.println("Sorry, You Are Not Eligible for the Job Interview");
					
				}
			}
			else
			{
				System.out.println("Do you have Any Work Experience Earlier?==>");
				System.out.println("Choice 0:YES /nChoice 1:NO");
				int Exp=SC.nextInt();				
				if(Exp==0)
				{
					System.out.println("Is Your Experience is More Than 1 Year (0/1)==>");
					int ExpYrs=SC.nextInt();
					if(ExpYrs==0) {
						System.out.println("You Can Apply for the Job");
					}else {
						System.out.println("You Are Not Eligible");
						
					}
	
				}
				else
				{
					System.out.println("You Are Not Eligible");
					
				}
			}
		}else if(Qua==2) {
			System.out.println("Your BRANCH is Computer:===>>(0-YES,1-NO)");
			int BB=SC.nextInt();
			
			if(BB==0) {
				System.out.println("Are you in LAST Semester===>>>(0-YES,1-NO)");
				int sem=SC.nextInt();
				if(sem==0) {
					System.out.println("DO you had Any Backlog of Any Semesters===>>>(0-YES,1-NO)");
					int sembcklg=SC.nextInt();
					
					if(sembcklg==0) {
						System.out.println("You Are not Eligible!");
					}else {
						System.out.println("You Are Eligible");
					}
					
				}else {
					System.out.println("YOU ARE NOT ELIGIBLE!!!");
				}
				
			}else {
				System.out.println("Only Computer Branch is Required For Selection");
			}
			
		}else if(Qua==3) {
			System.out.println("You Are not Eligible!!!!");
		}

	}

}