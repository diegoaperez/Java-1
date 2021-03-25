public class Person{
  //instance data
  public String name;
	public int age = 21;
	public static int drivingAge = 16;
	public static int num = 0;

  //constructors
	public Person(String name){
		this.name = name;
		num++;
  }
  public String getName(){
		return name;
	}
  public void setName(String name){
	  this.name = name;
	}
  public int getAge(){
		return age;
	}
  public void setAge(int age){
		this.age = age;
	}
  /* static accessor methods
		The this reference does not 
		exist in static methods
	*/
  public static int getDrivingAge(){
		return drivingAge;
	}
	public static int getNum(){
		return num;
	}
  //overridden methods inherited from Object
  //Including the toString method which returns the full name using StringBuffer
	public String toString(String first, String last){
    StringBuffer full = new StringBuffer(last);
    full.append(", ");
    full.append(first);
  	return full.toString();
	}
	public boolean equals(Object o){
		if( o == null)
			return false;
		if( getClass() != o.getClass())
			return false;
		Person p = (Person)o;
		return this.age == p.age;
	}
}
