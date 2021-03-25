//We establish an inherited class from Person
public class Student extends Person{

  //We esyablish the private data members for student
  private String last_name;
  private String first_name;

  //We estanlish a contructor for the Student class
  public Student(String name) {
    super(name);
    this.name = name;
    num++;
  }

  //We establish the getters for both data members
  public String getlast_name(){
    return last_name;
  }

  public String getfirst_name(){
    return first_name;
  }

  //We establish the setters for both data members
  public void setlast_name(String age){
    this.last_name = age;
  }

  public void setfirst_name(String age){
    this.first_name = age;
  }

  //Prints the list of objects at a given time using the overwritten toString method from Person
  public static void printList(Student[] arr){
    for(Student s : arr){
     System.out.println("");
     System.out.println("Student " + " " + s.toString(s.first_name, s.last_name) + " " + s.age);
    }
  }
}