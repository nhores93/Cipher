/**
* A subclass of Account that represents a bot. A bot contains
* strings representing the user agent, bot category, and the 
* handle or creator name.
*
* @author  Nathania Hores
* @version 1.0
* @since   2019-02-08
*/
package cipher;
public class Bot extends Account {

	private String userAgent;
	private String category;
	private String createdBy;
	
	/*
	 * Parameterized constructor. Takes in the password and salt value, the user agent,
	 * the category, and the createdBy.
	 * Sets the instance fields equal to the value for the parameter.
	 * @param The password
	 * @param The salt
	 * @return Nothing
	 * */
	public Bot(String plainTextPassword, int salt, String userAgent, String category, String createdBy) {
		super(plainTextPassword, salt);
		this.userAgent = userAgent;
		this.category = category;
		this.createdBy = createdBy;
	}

	//Accessor methods
	
	/*
	 * Returns the user agent string for the bot.
	 * @param None
	 * @return The user agent
	 * */
	public String getUserAgent() {
		return this.userAgent;
	}

	/*
	 * Returns the bot category which is either searchEngine, sysAdmin, or malicious .
	 * @param None
	 * @return The bot category 
	 * */
	public String getCategory() {
		return this.category;
	}
	
	/*
	 * Returns the creator name or user handle.
	 * @param None
	 * @return The user name or handle
	 * */
	public String getCreatedBy() {
		return this.createdBy;
	}
	
	//Mutator methods
	
	
	/*
	 * Sets the user agent string for the bot.
	 * @param The user agent
	 * @return Nothing
	 * */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/*
	 * Sets the user category for the bot.
	 * @param The bot category
	 * @return Nothing
	 * */
	public void setCategory(String category) {
		this.category = category;
	}

	/*
	 * Sets the user string representing the user creator name or user handle.
	 * @param The object reference variable representing the creator name or user handle.
	 * @return Nothing
	 * */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	//toString method
	
	/*
	 * To string method to nicely format the instance variables.
	 * @param None
	 * @return A nicely formatted string representing the class attributes.
	 * */
	 public String toString(){  
		  return getCategory() + " bot," + " User-Agent string="+ getUserAgent() + " was created by " + getCreatedBy() + ".";  
	} 

}
