/**
* The super class that represents accounts. An account contains
* a string representing the password, salt (number to shift password by), 
* account ID, and account ID number. This class encrypts the password by shifting it
* however many characters the value of salt is set to in the tester class. It uses a 
* regular expression to check that a password is strong given the following criteria:
* password contains an uppercase letter, lowercase letter, digit, and symbol. If it 
* does not contain all of these characters then (@@@ UNSAFE @@@) is returned. If it does 
* contain all of the criteria then an empty string is returned.
*
* @author  Nathania Hores
* @version 1.0
* @since   2019-02-08
*/
package cipher;
public class Account {
	
	private String plainTextPassword;
	private int salt;
	private int accountID = 0;
	private int nextIDNum = 1000;

	
	/*
	 * Parameterized constructor. Takes in the password and salt value.
	 * Sets the instance fields equal to the value of the parameter.
	 * @param The password
	 * @param The salt
	 * @return Nothing
	 * */
	public Account(String plainTextPassword, int salt) {
		this.plainTextPassword = plainTextPassword;
		this.salt = salt;
	}
	
	/*
	 * Takes in the password and the value of the salt to shift the password by.
	 * Turns the password into a character array, loops through the array and 
	 * shifts each character by the salt value. The character array is then converted
	 * back into a string and returned.
	 * @param The password
	 * @param The salt
	 * @return Encrypted password
	 * */
	public static String encryptPassword(String plainTextPassword, int salt) {
		char[] encrypt = new char[plainTextPassword.length()];
		for (int i = 0; i < encrypt.length; i++) {
			encrypt[i] = (char) (plainTextPassword.charAt(i) + salt);
		}
		String encryptedPassword = new String(encrypt);
		return encryptedPassword; 
	}
	
	/*
	 * This method sets the password and uses a regular expression to check
	 * that it meets the following criteria: password is 8 characters long,
	 * contains an uppercase character, contains a lower case character,
	 * contains a digit.
	 * @param The password
	 * @return (@@@ UNSAFE @@@) is the password does not meet the criteria
	 * @return Empty string if the password meets the criteria
	 * */
	public static String setPassword(String password) {
		if(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
			return "(@@@ UNSAFE @@@)";
		}//End if statement
		return "";
	}
	
	//Accessor methods 
	
	/*
	 * Returns the password.
	 * @param None
	 * @return The password
	 * */
	public String getPassword() {
		return this.plainTextPassword;
	}
	
	/*
	 * Returns the salt.
	 * @param None
	 * @return The salt
	 * */
	public int getSalt() {
		return this.salt;
	}
	
	/*
	 * Returns the account ID.
	 * @param None
	 * @return The account ID
	 * */
	public int getAccountID() {
		return this.accountID;
	}
	
	
	//Mutator methods
	
	/*
	 * This method sets the salt.
	 * @param The salt
	 * @return Nothing
	 * */
	public void setSalt(int salt){
		this.salt = salt;
	}
	
	/*
	 * This method sets the unique account ID which will always be itself
	 * incremented by one. 
	 * @param The account ID
	 * @return Nothing
	 * */
	public void setAccountID(int accountID){
		accountID = nextIDNum++;
	}
	
	//toString method
	
	/*
	 * To string method to nicely format the instance variables.
	 * @param None
	 * @return A nicely formatted string representing the class attributes.
	 * */
	 public String toString(){  
		  return "Account info: (@@@ UNSAFE @@@) PWD: " + getPassword() + "shifted " + getSalt() + " digits has an encrypted PWD of: " + encryptPassword(plainTextPassword, salt);  
	}  

}
