import java.util.ArrayList;

public class University {

  private String name;
  private String address;
  private ArrayList<Faculty> faculties;

  public University(String name, String address) {
    this.name = name;
    this.address = address;
    faculties = new ArrayList<Faculty>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  // add faculty from Faculty.java to the university
  public void addFaculty(Faculty faculty) {
    faculties.add(faculty);
  }

  // remove faculty from Faculty.java from the university
  public void removeFaculty(Faculty faculty) {
    faculties.remove(faculty);
  }

  // return the university and its faculties from Faculty.java
  public String toString() {
    String result = "University: " + name + " " + address + "\n";
    for (Faculty faculty : faculties) {
      result += faculty.toString() + "\n";
    }
    return result;

  }

  public String getBriefInfo() {
    String result = "University: " + name + " " + address + "\n";
    return result;
  }

  public String getFacultyInfo(String facultyName) {
    String result = "";
    for (Faculty faculty : faculties) {
      if (faculty.getName().equals(facultyName)) {
        result += faculty.toString() + "\n";
      }
    }
    if (result.equals("")) {
      result = "Faculty not found";
    }
    return result;
  }

  // create a method to get all the groups from all the specializations in the faculty
  public String getAllGroups(String facultyName) {
    String result = "";
    for (Faculty faculty : faculties) {
      if (faculty.getName().equals(facultyName)) {
        for (Specialization specialization : faculty.getSpecialization()) {
          for (Group group : specialization.getGroups()) {
            result += group.getName() + "\n";
          }
        }
      }
    }
    if (result.equals("")) {
      result = "Faculty not found";
    }
    return result;
  }

  

}