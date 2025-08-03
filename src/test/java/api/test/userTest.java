package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.paylod.User;
import io.restassured.response.Response;

public class userTest {
	Faker faker;
	User userPayload;
	Logger logger; 

	@BeforeClass
	public void setUp() {
		 faker = new Faker();
		 userPayload = new User();
		 
		 userPayload.setId(faker.idNumber().hashCode());
		 userPayload.setUsername(faker.name().username());
		 userPayload.setFirstName(faker.name().firstName());
		 userPayload.setLastName(faker.name().lastName());
		 userPayload.setEmail(faker.internet().safeEmailAddress());
		 userPayload.setPassword(faker.internet().password(5, 10));
		 userPayload.setPhone(faker.phoneNumber().cellPhone());
			
		 
		 //LOGS
		 logger=LogManager.getLogger(this.getClass()); 
	}
	
	@Test(priority=1)
	public void testPostUser() {
		logger.info("********** Creating user  ***************");
		Response response=UserEndPoints.createUser(userPayload);
		response.then().log().all();
		
	   Assert.assertEquals(response.getStatusCode(), 200); 
		
		
	   logger.info("**********User is created  ***************");
	}
	
	
	@Test(priority=2, dependsOnMethods = {"testPostUser"})
	public void testGetUserByName() {
		
		logger.info("********** Reading User Info ***************");
		Response response = UserEndPoints.readuser(this.userPayload.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
			
		logger.info("**********User info  is displayed ***************");
	}
	
	@Test(priority=3, dependsOnMethods = {"testGetUserByName"})
	public void testUpdateUserByName() {
		
		//Update data using payload
		logger.info("********** Updating User ***************");
		
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		
		Response response=UserEndPoints.updateUser( this.userPayload.getUsername(), userPayload);
		response.then().log().all();
		
	   Assert.assertEquals(response.getStatusCode(), 200); 
		
	   
		logger.info("********** User updated ***************");
	   
	   //Checking Data after updation	
	
		Response responseAfterUpdate = UserEndPoints.readuser(this.userPayload.getUsername());
		response.then().log();		
		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200); 
		
	}
	
	@Test(priority=4, dependsOnMethods = {"testUpdateUserByName"})
	public void testDeleteUserByName() {
		
		
		logger.info("**********   Deleting User  ***************");
		Response response=UserEndPoints.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(),200);
		logger.info("********** User deleted ***************");
		
	}
	
}

















