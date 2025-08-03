package api.endpoints;

//Only maintain all URL 

/*
 Swagger URI : https://petstore.swagger.io/v2
 
 
 create user (POST) --> https://petstore.swagger.io/v2/user
 get user (GET) --> https://petstore.swagger.io/v2/user/{UserByName}

 update user (PUT) --> https://petstore.swagger.io/v2/user/{UserByName}
 delete User (DELETE) --> https://petstore.swagger.io/v2/user/{UserByName}
 */
public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2";
	
	//User Module 
	
	public static String post_url =  base_url+"/user";
	public static String get_url =  base_url+"/user/{username} ";
	public static String update_url =  base_url+"/user/{username}";
	public static String delete_url =  base_url+"/user/{username}";
	
	
	//Store module
	
	//Pet module
}
