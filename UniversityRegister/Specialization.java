import java.util.ArrayList;

public class Specialization {
  private String name;
  private String faculty;
  private ArrayList<Group> groups;
  private int numberOfGroups;

  public Specialization(String name, Faculty faculty) {
    this.name = name;
    this.faculty = faculty.getName();
    groups = new ArrayList<Group>();

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  // method for adding groups from Group.java to the specialization
  public void addGroup(Group group) {
    groups.add(group);
    numberOfGroups++;
  }

  // method for removing groups from Group.java from the specialization
  public void removeGroup(Group group) {
    groups.remove(group);
    numberOfGroups--;
  }

  // return the specialization and its groups
  public String toString() {
    String result = "Specialization: " + name + " " + faculty + " " + numberOfGroups + "\n";
    for (Group group : groups) {
      result += group.toString() + "\n";
    }
    return result;
  }

  public ArrayList<Group> getGroups() {
    ArrayList <Group> groupNames = new ArrayList<Group>();
    for (Group group : groups) {
      groupNames.add(group);
    }
    return groupNames;
  }


  public int getNumberOfGroups() {
    return numberOfGroups;
  }

}