import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RegisterStudent {
  public static void main(String[] args) {
    // create a student object with user input
    Scanner input = new Scanner(System.in);
    // create a university
    University university1 = new University("University of Sofia", "Sofia, Bulgaria");
    // create a faculty
    Faculty faculty1 = new Faculty("Faculty of Mathematics and Informatics", university1);
    // create a specialty for faculty1
    Specialization specialty1 = new Specialization("Mathematics", faculty1);
    // create a group for specialty1
    Group group1 = new Group("Group 1", specialty1, faculty1);
    // create a student for group1
    Student student1 = new Student("Ivan", "Ivanov", "0888888888", group1);
    // add student to group1
    group1.addStudent(student1);
    // create a second group for specialty1
    Group group2 = new Group("Group 2", specialty1, faculty1);
    // create a second student for group2
    Student student2 = new Student("Petar", "Petrov", "0899999999", group2);
    // add student2 to group2
    group2.addStudent(student2);
    // add group2 to specialty1
    specialty1.addGroup(group2);
    // add group1 to specialty1
    specialty1.addGroup(group1);
    // add specialty1 to faculty1
    faculty1.addSpecialization(specialty1);
    // add faculty1 to university1
    university1.addFaculty(faculty1);
    // print university1
    System.out.println(university1);

    try {
      PrintWriter out = new PrintWriter("university.txt");
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();
    }

    System.out.println("Please enter a choice: (Ex: 1- Display brief informations about the University) ");
    int choice = input.nextInt();
    input.nextLine();
    switch (choice) {
      case 1:
        System.out.println(university1.getBriefInfo());
        break;
      case 2:
        System.out.println(university1);
        break;
      case 3:
         // take input from user for faculty name
         System.out.println("Enter faculty name: ");
         String facultyName = input.nextLine();
         // print all specialties of facultyName
           System.out.println(university1.getFacultyInfo(facultyName));
        break;
      case 4:
        // take input from user for faculty name
        System.out.println("Enter faculty name: ");
        facultyName = input.nextLine();
        // print all groups of facultyName
        System.out.println(university1.getAllGroups(facultyName));
        break;
      case 5:
        // take input for group name
        System.out.println("Enter group name: ");
        String groupName = input.nextLine();
        // print all students of groupName
        System.out.println(groupName);
        break;
      default:
        System.out.println("Invalid choice");
    }

    input.close();
  }



}