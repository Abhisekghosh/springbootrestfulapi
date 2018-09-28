package hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private final long id;
    private final String username;
    
	private final String password;
	
	
	@JsonCreator
	public User(@JsonProperty(value = "id", required = true) long id,@JsonProperty(value = "username", required = true) String username,@JsonProperty(value = "password", required = true) String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public long getId() {
		return id;
	}
    public String getUsername() {
		return username;
	}
    public String getPassword() {
		return password;
	}
    
    
    
}
