import java.util.ArrayList;

public class Faculty {
  //   Please store the following information about faculties:
  // • Faculty name (unique)
  // • Name of specialties (unique)

  private String name;
  private String universityName;
  private ArrayList<Specialization> specializations;

  public Faculty(String name, University university) {
    this.name = name;
    this.universityName = university.getName();
    specializations = new ArrayList<Specialization>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // add specialization from Specialization.java to the faculty
  public void addSpecialization(Specialization specialization) {
    specializations.add(specialization);
  }

  // remove specialization from Specialization.java from the faculty
  public void removeSpecialization(Specialization specialization) {
    specializations.remove(specialization);
  }
  // return the faculty and its specializations from Specialization.java
  public String toString() {
    String result = "Faculty: " + name + "\n";
    for (Specialization specialization : specializations) {
      result += specialization.toString() + "\n";
    }
    return result;
  }

  
  public ArrayList<Specialization> getSpecialization() {
    ArrayList <Specialization> specializationNames = new ArrayList<Specialization>();
    for (Specialization specialization : specializations) {
      specializationNames.add(specialization);
    }
    return specializationNames;
  }



}



  
  


