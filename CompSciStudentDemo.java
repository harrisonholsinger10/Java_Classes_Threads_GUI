import java.util.Scanner;

/**
   This program demonstrates the CompSciStudent class.
*/

public class CompSciStudentDemo
{
   public static void main(String[] args)
   {
	  Scanner scan = new Scanner(System.in);
	  String choice = "";
	  do
	  {
	      // Create a CompSciStudent object.
	      CompSciStudent csStudent = 
	             new CompSciStudent("Jennifer Haynes",
	                                "167W98337", 2015);

      
      
	      // Store values for math, CS, and gen ed hours.
	      // Try catches should go here.
	      
	      /*
	       * try
	       * {
	       * 	csStudent.setMathHours();
	       * }
	       * catch(NumberFormatException e)
	       * {
	       *    System.out.println("Inncorect data type input!");
	       *     math = true;
	       * }
	       */
	      csStudent.setMathHours();
	      csStudent.setCSHours();
	      csStudent.setGenEDHours();
	
	      // Display the student's data.
	      System.out.println(csStudent);
	
	      // Display the number of remaining hours.
	      System.out.println("Hours remaining: " +
	                   csStudent.getRemainingHours());  
	      
	      System.out.println("Would like to enter another? Enter end to terminate.");
	      choice = scan.next();

      }while(!choice.toLowerCase().equals("end"));
      scan.close();
	      
   }
}