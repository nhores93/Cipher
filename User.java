/**
* A subclass of Account that represents a User. A user contains
* strings representing the username, full name, and the 
* department code of the User.
*
* @author  Nathania Hores
* @version 1.0
* @since   2019-02-08
*/
package cipher;
public class User extends Account {

	private String userName;
	private String fullName;
	private int deptCode;
	
	/*
	 * Parameterized constructor. Takes in the password and salt value, the username,
	 * the full name, and the department code.
	 * Sets the instance fields equal to the value for the parameter.
	 * @param The password
	 * @param The salt
	 * @return Nothing
	 * */
	public User(String plainTextPassword, int salt, String userName, String fullName, int deptCode) {
		super(plainTextPassword, salt);
		this.userName = userName;
		this.fullName = fullName;
		this.deptCode = deptCode;
	}	
	
	//Accessor methods
	
	/*
	 * Returns the user's username.
	 * @param None
	 * @return Nothing
	 * */
	public String getUserName() {
		return this.userName;
	}

	/*
	 * Returns the user's full name.
	 * @param None
	 * @return Nothing
	 * */
	public String getFullName() {
		return this.fullName;
	}
	
	/*
	 * Returns the user's department code.
	 * @param None
	 * @return The department code
	 * */
	public int getdeptCode() {
		return this.deptCode;
	}
	
	//Mutator methods 
	
	/*
	 * Sets the user's username.
	 * @param The username.
	 * @return Nothing
	 * */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/*
	 * Sets the user's full name.
	 * @param The full name.
	 * @return Nothing
	 * */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/*
	 * Sets the users deptCode.
	 * @param The department code.
	 * @return Nothing
	 * */
	public void setdeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	//toString method
	
	/*
	 * To string method to nicely format the instance variables.
	 * @param None
	 * @return A nicely formatted string representing the class attributes.
	 * */
	 public String toString(){  
		  return  getFullName() + " (username: " + getUserName() + ")" + " works in department " + getdeptCode() + ".";  
	} 

}
