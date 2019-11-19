
abstract public class Student {
	public String FirstName;
	public String LastName;


// get methods
public abstract String getFirstName();

public abstract String getLastName();
  

// set methods
public abstract void setFirstName();

public  abstract  void setLastName();
}

public class student extends Student{

	@Override
	public String getFirstName() {
		return this.FirstName;
	}

	@Override
	public String getLastName() {
		return this.LastName;
	}

	@Override
	public void setFirstName() {
		
	}

	@Override
	public void setLastName() {
		
	}  
}


//System.out.println(" Please enter your first name: "); // ask user to input first name 
//FirstName = input.nextString();// take in the information from user
//System.out.println(FirstName);// Print first name of student 

//System.out.println( " Please enter your last name: ");// ask user to input last name
//FirstName = input.nextString();// take in information from user 
//System.out.println(LastName);// print last name of student


