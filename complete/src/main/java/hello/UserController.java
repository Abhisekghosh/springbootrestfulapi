package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class UserController {
	@Autowired
	private ObjectMapper mapper;
	String username = "";
	long id=0;
	String password = "";
	@PostMapping("/postdata")
	public ObjectNode   newUser(@RequestBody User newUser) {
		id = newUser.getId();
		username = newUser.getUsername();
		password = newUser.getPassword();
		ObjectNode objectNode = mapper.createObjectNode();
	    objectNode.put("id", id);
	    objectNode.put("username", username);
	    objectNode.put("password", password);
		return objectNode;
	}
}
