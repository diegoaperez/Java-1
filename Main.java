//Name: Diego Pérez Morales
//Person Individual Project (Exceptions)

//We import the libraries needed
import java.util.Scanner;
import java.lang.StringBuffer;

//We define the class main where out program is going to run
class Main {
  public static void main(String args[]){

  //We establish the input scanner object 
  //We ask the amount of people and check that it's a number using exceptions
  Scanner input = new Scanner(System.in);
  System.out.print("How many people do you want to enter?: ");
  int size = 0;
  while(size <= 0){
  try{
      size = input.nextInt();
      if(size <= 0){
      System.out.println("You have an invalid size. Please try again.");
      System.out.print("How many people do you want to enter?: ");
      }
    }
    catch(Exception e){
      System.out.println("You have an invalid size. Please try again.");
      System.out.print("How many people do you want to enter?: ");
    }
    finally{
      input.nextLine();
    }
  }

  //We make the array holding the objects with the size
  //and initialize all the elements to default empty values
  Student[] arr = new Student[size];
  for(int i = 0; i < size; i++){
    arr[i] = new Student("Empty");
    arr[i].setfirst_name("Empty");
    arr[i].setlast_name("Empty");
    arr[i].setAge(0);
  }

  //We initialize a flag to control the do while and a 
  //counter to know how many people we have so far
  boolean boolean_flag = true;
  int people_counter = 0;

  //We establish the do while to repeat the program per person
  do {

    //We ask the person their first name and check that its a string using exceptions
    Student s = new Student("Empty");
    System.out.print("Enter the first name of the person: ");
    String name = "";
    while(!name.matches("^[a-zA-Z]+$")){
    try{
      name = input.nextLine();
      for(int i = 0; i < name.length(); i++){
        if(!(Character.isLetter(name.charAt(i)))){
          int blowUp = 1/0;
        }
      }
    }
    catch(Exception e){
      System.out.println("You have an invalid first name.");
      System.out.print("Enter the first name of the person: ");
      }
    }

    //We set the first name of the object once we have it
    s.setfirst_name(name);
    
    //We ask the person their last name and check that its a string using exceptions
    System.out.print("Enter the last name of the person: ");
    String last = "";
    while(!last.matches("^[a-zA-Z]+$")){
    try{
      last = input.nextLine();
      for(int i = 0; i < last.length(); i++){
        if(!(Character.isLetter(last.charAt(i)))){
          int blowUp = 1/0;
        }
      }
    }
    catch(Exception e){
      System.out.println("You have an invalid last name.");
      System.out.print("Enter the last name of the person: ");
      }
    }

    //We set the last name of the object
    s.setlast_name(last);

    //We ask the person their age and check that its a number using exceptions
    System.out.print("Enter the age of the person: ");
    int age = 0;
    while(age <= 0){
    try{
      age = input.nextInt();
      if(age <= 0){
      System.out.println("You have an invalid age. Please try again.");
      System.out.print("Enter the age of the person: ");
        }
      }
    catch(Exception e){
      System.out.println("You have an invalid age. Please try again.");
      System.out.print("Enter the age of the person: ");
      }
    finally{
      input.nextLine();
      }
    }

    //We set the age on the Person object and add the person to the array
    s.setAge(age);
    arr[people_counter] = s;

    //We ask the user to type yes or no depending if they want to see the list of people
    System.out.println("Do you wish to see the people in the array?(type yes or no for a valid answer): ");
    String cont1 = "";
    while(!cont1.matches("yes") && !cont1.matches("no")){
    try{
        cont1 = input.nextLine();
        if(cont1.matches("yes")){
          int notblowUp = 1/1;
        }
        else if(cont1.matches("no")){
          int notblowUp = 1/1;
        }
        else{
          int blowUp = 1/0;
        }
    }
    catch(Exception e){
      System.out.println("You have an invalid answer. Please try again.");
      System.out.println("Do you wish to see the people in the array?(type yes or no for a valid answer): ");
    }
  }
    if (cont1.matches("yes")){
      System.out.println("*****************List*****************");
      Student.printList(arr);
      System.out.println("\n**************************************");
    }
    
    //We ask the user if they want to repeat the program again in the do while to add another person
    //and we also switch the value of the variable controling the do while depending of their decision
    System.out.println("\nDo you wish to add another person?(type yes or no for a valid answer): ");
    String cont2 = "";
    while(!cont2.matches("yes") && !cont2.matches("no")){
    try{
        cont2 = input.nextLine();
        if(cont2.matches("yes")){
          int notblowUp = 1/1;
        }
        else if(cont2.matches("no")){
          int notblowUp = 1/1;
        }
        else{
          int blowUp = 1/0;
        }
    }
    catch(Exception e){
      System.out.println("You have an invalid answer. Please try again.");
      System.out.println("Do you wish to add another person?(type yes or no for a valid answer): ");
    }
  }
    if (cont2.matches("yes")){
      boolean_flag = true;
      people_counter = people_counter + 1;
    } else {
      boolean_flag = false;
    }
    //We check that we have more space to add people to the array
    if (people_counter >= size){
      System.out.println("You have no more spaces for people.");
      System.exit(1);
    }
  }while(boolean_flag);

  //We close the input scanner object once we are done adding all the people
  input.close();
  }
}