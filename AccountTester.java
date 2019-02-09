/**
* The tester class that implicitly and explicitly tests all methods. It 
*reads in data from the 'data.csv' file and creates an account based off 
*of the first character of each line. If the character is 'b' for Bot then 
*a new bot account is created and initialized with the succeeding values on its line.
*If the character is 'u' for user then a user account is initialized with the succeeding 
*values on its line. The toString method is called and proper encapsulation is demonstrated 
*by printing private class variables via public accessor methods. The password is 
*shifted by the salt value given in the file and all account info is displayed neatly as per 
*the example provided by the professor. 
*
* @author  Nathania Hores
* @version 1.0
* @since   2019-02-08
*/
package cipher;
import java.util.*;
import java.io.*;
public class AccountTester {

	
	
	public static void main(String[] args) {
	
		String fileName = "data.csv"; //Providing the file name
		File file = new File(fileName); //Creating a file object
		int salt; //Declaring the salt variable once 
		
		try {
			Scanner inputStream = new Scanner(file); //Using a scanner object to read the file
			
			/*
			 * While the file has content continue reading line by line. After consuming a line
			 * Place the values in a string array using the comma as a the delimiter. We know ahead 
			 * of time that the file is comma delimited. If the line starts with 'u' parse the the 
			 * department code and salt integer values and create a new User initialized with the array values. 
			 * Print all values via toString method for Account and User classes. If the line starts with a 'b'
			 * parse the salt value and initialize a new Bot with the array values. Print all values via toString
			 * for Account and Bot classes. If the line starts with 'q' exit the program. 
			 * */
			while(inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				
				if(values[0].equals("u")) {
					int deptCode = Integer.parseInt(values[3]);
					salt = Integer.parseInt(values[5]);
					
					User usr = new User(values[4], salt, values[1], values[2], deptCode);
					
					System.out.println(usr.toString());
					System.out.println("\t Account info: " + Account.setPassword(values[4]) + " PWD: " + values[4] + " shifted " + salt + " digits has an encrypted password of "
									+ Account.encryptPassword(values[4], salt));
				}
				if(values[0].equals("b")) {
					salt = Integer.parseInt(values[5]);
					
					Bot bot = new Bot(values[4], salt, values[1], values[2], values[3]);
					
					System.out.println(bot.toString());
					System.out.println("\t Account info: " + Account.setPassword(values[4]) + " PWD: " + values[4] + " shifted " + salt + " digits has an encrypted password of "
									+ Account.encryptPassword(values[4], salt));
				}
				if(values[0].equals("q")) {
					break;
				}
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
