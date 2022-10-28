import java.util.Scanner;

/**
   This class holds data for a computer science student.
*/

public class CompSciStudent extends student
{
   // Required hours
   private final int MATH_HOURS = 20;   // Math hours
   private final int CS_HOURS = 40;     // Comp sci hours
   private final int GEN_ED_HOURS = 60; // Gen ed hours
   private final int MAX_MATH_HOURS = 30;
   private final int MAX_CS_HOURS = 50;
   private final int MAX_GENed_HOURS = 80; 



   // Hours taken
   private int mathHours;  // Math hours taken
   private int csHours;    // Comp sci hours taken
   private int genEdHours; // General ed hours taken
   
   boolean math = true;
   boolean cs = true; 
   boolean genED = true;
   
	Scanner scan = new Scanner(System.in);


   /**
      The Constructor sets the student's name, 
      ID number, and the year admitted.
      @param n The student's name.
      @param id The student's ID number.
      @param year The year the student was admitted.
   */

   public CompSciStudent(String n, String id, int year)
   {
      super(n, id, year);
   }
   
   public void setMathHours()
   {
	   while(math)
	   {
		   System.out.println("How many hours of math credits do you have?");
		   //this.mathHours = scan.nextInt();
		   try 
		   {
			   mathHours = Integer.parseInt(scan.next());
			   math = false;
		   }
		   catch(NumberFormatException e)
		   {
			   System.out.println("Inncorect data type input!");
			   math = true;
		   }
		   if(mathHours < 0 || mathHours > MAX_MATH_HOURS)
		   {
			   System.out.println("Invalid range of hours. Input must be greater than 0 and less than 100!");
			   math = true;
		   }
	   }
	 
   }
   
   public void setCSHours()
   {
	   while(cs)
	   {
		   System.out.println("How many hours of computer science credits do you have?");
		   try 
		   {
			   csHours = Integer.parseInt(scan.next());
			   cs = false;
		   }
		   catch(NumberFormatException e)
		   {
			   System.out.println("Inncorect data type input!");
			   cs = true;
		   }
		   if(csHours < 0 || csHours > MAX_CS_HOURS)
		   {
			   System.out.println("Invalid range of hours. Input must be greater than 0 and less than 100!");
			   cs = true;
		   }
	   }
	 
   }
   
   public void setGenEDHours()
   {
	   while(genED)
	   {
		   System.out.println("How many hours of general education credits do you have?");
		   try 
		   {
			   genEdHours = Integer.parseInt(scan.next());
			   genED = false;
		   }
		   catch(NumberFormatException e)
		   {
			   System.out.println("Inncorect data type input!");
			   genED = true;
		   }
		   if(genEdHours < 0 || genEdHours > MAX_GENed_HOURS)
		   {
			   System.out.println("Invalid range of hours. Input must be greater than 0 and less than 100!");
			   genED = true;
		   }
		  
	   }
	 
   }

   /**
      The setMathHours method sets the number of 
      math hours taken.
      @param math The math hours taken.
   */
   public int getMathHours()
   {
      return mathHours;
   }

   /**
      The setCsHours method sets the number of 
      computer science hours taken.
      @param cs The computer science hours taken.
   */

   public int getCsHours()
   {
      return csHours;
   }

   /**
      The setGenEdHours method sets the number of 
      general ed hours taken.
      @param genEd The general ed hours taken.
   */

   public int getGenEdHours()
   {
      return genEdHours;
   }

   /**
      The getRemainingHours method returns the
      the number of hours remaining to be taken.
      @return The hours remaining for the student.
   */

   @Override
   public int getRemainingHours()
   {
	  // I think I fixed this method by putting a maximum on each of the hour inputs so that all of the hours are not one subject \
	  // and then the program still says they have all of their hours.
	   
      int reqHours,        // Total required hours
      remainingHours;  // Remaining hours

	 
      // Calculate the required hours.
      reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
      
      // Calculate the remaining hours.
      remainingHours = reqHours - (mathHours + csHours
                         + genEdHours);
  
                         
      return remainingHours;
  
   }

   /**
      The toString method returns a string containing
      the student's data.
      @return A reference to a String.
   */
   
   @Override
   public String toString()
   {
      String str;

      str = super.toString() +
         "\nMajor: Computer Science" +
         "\nMath Hours Taken: " + mathHours +
         "\nComputer Science Hours Taken: " + csHours +
         "\nGeneral Ed Hours Taken: " + genEdHours;

      return str;
   }
}