package beans;

import java.io.Serializable;

public class NameBean implements Serializable
   {
	public static final long serialVersionUID= 1;

      private String firstName = "Missing first name";
      private String lastName = "Missing last name";

	public NameBean(String firstName, String lastName){
	  setFirstName("");
      setLastName("");  
     }
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(!isMissing(firstName))
		{
		this.firstName = firstName;
	    }
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(!isMissing(lastName))
		{
		this.lastName = lastName;
	    }
     }
  
      private boolean isMissing(String value)
       {
	     return((value == null) || (value.trim().equals("")));
       }
}
