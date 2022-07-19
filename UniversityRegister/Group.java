import java.util.ArrayList;

public class Group {
//   Please store the following information about groups at the university:
// • Group name (unique)
// • Specialty
// • Faculty name
// • Group ID

  private String name;
  private String specialty;
  private String faculty;
  private int numberOfStudents;
  private ArrayList<Student> students;
  
  public Group(String name, Specialization specialization, Faculty faculty) {
    this.name = name;
    this.specialty = specialization.getName();
    this.faculty = faculty.getName();
    students = new ArrayList<Student>();
   
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getSpecialty(){
    return specialty;
  }
  public void setSpecialty(String specialty){
    this.specialty = specialty;
  }
  public String getFaculty(){
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }
  public int getNumberOfStudents() {
 return numberOfStudents;
 }
 
  // method for adding students from Student.java to the group
  public void addStudent(Student student) {
    students.add(student);
    numberOfStudents++;

  }
  // method for removing students from Student.java from the group
  public void removeStudent(Student student) {
    students.remove(student);
    numberOfStudents--;
  
  }

  // return the group and its students
  public String toString() {
    String result = "Group: " + name + " Number of students: " + students.size() + "\n";
    for (Student student : students) {
      result += student.toString() + "\n";
    }
    return result;
  }
  
}
