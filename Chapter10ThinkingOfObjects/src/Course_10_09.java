import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Course_10_09 
{
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course_10_09(String courseName) 
  {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) 
  {
	  if(numberOfStudents >= students.length)
	  {
		  String[] temp = new String[students.length * 2];
		  System.arraycopy(students, 0, temp, 0, students.length);
		  students = temp;
		  
	  }
    students[numberOfStudents++] = student;
//    numberOfStudents++;
  }
  
  public String getStudents()
  {
	  for(int i=0; i<students.length; i++)
	  {
		  if(students[i] != null)
		  {
			  System.out.print(students[i] + " ");
		  }
		
	  }
	  return "";
  }

  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }  

  public String getCourseName()
  {
    return courseName;
  }  
  
  public String[] dropStudent(String student) 
  {
	  LinkedList result = new LinkedList();
	  //iterate the array
	  for(String item: students)
	  {
		  //add all the elements from the array to the linkedList but the element the be deleted
		  if(!student.equals(item))
		  {
			  result.add(item);
		  }
		 
		 
	  }
	  students[numberOfStudents--] = student;
	  return (String[]) result.toArray(students);
  }
  
  public void clear()
  {
	  Arrays.fill(students, null );
  }
  
  
  public static void main(String[] args)
  {
	  Course_10_09 cr = new Course_10_09("Prank");
	  String s = "Mite";
	  cr.addStudent("Kire");
	  cr.addStudent("Lube");
	  cr.addStudent(s);
	  cr.dropStudent(s);
	  	
	  System.out.println(cr.getNumberOfStudents() + "  " + cr.getStudents() + " " + cr.getCourseName() );
	  
	  
  }
}



