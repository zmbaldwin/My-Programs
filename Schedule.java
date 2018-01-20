import java.util.Scanner;

public class Schedule 
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String name;
      System.out.println("Enter your name: ");
      name = scan.nextLine();
      int numCourses = 0;
      System.out.println("Enter the number of courses you are enrolled in: ");
      numCourses = scan.nextInt();
      scan.nextLine();
      String course;
      boolean CSCI = false;
      for (int i  = 0; i < numCourses; i++)
      {
         System.out.println("Enter a course: ");
         course = scan.nextLine();
         if (course.equalsIgnoreCase("CSCI 1302"))
         {
            CSCI = true;
         }
      }
      if (CSCI = true)
      {
         System.out.println("Good Luck!");
      }
      else if (CSCI = false)
      {
         System.out.println("You are missing out!");
      }
   }
}          