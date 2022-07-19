public class Student{
  // It is necessary to store the following information about students at the university:
// • Student name and last name
// • Contact telephone number
// • Group name
// • Student ID
  private String name;
  private String lastName;
  private String telephone;
  private String groupName;
  
  // Constructor
  public Student(String name, String lastName, String telephone, Group group){
    this.name = name;
    this.lastName = lastName;
    this.telephone = telephone;
    this.groupName = group.getName();
  }
  // Getters and setters
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getLastName(){
    return lastName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public String getTelephone(){
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  // toString method
  public String toString(){
    return "Student: " + name + " " + lastName + " " + telephone + "\n";
  }



}