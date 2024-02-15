package tests;

import model.User;
import utils.TestUtils;
public class UserTest {

	//1-Setup	
	static String test_username = "mike";
	static String test_password = "mypasswd";
	static String test_first_name = "Mike";
	static String test_last_name = "Smith";
	static String test_mobile_number = "07771234567";
	
	//2-Exercise, run the object under test (constructor)
	static User testUser = new User(test_username, test_password, test_first_name, 
			test_last_name, test_mobile_number);
	
	//3- Verify (Assert)
	public static void main(String[] args) {
        testUserConstructor();
    }

    public static void testUserConstructor() {
	System.out.println("Starting the assertions of the test method: testUserConstructor");

    // Assert username
    if (testUser.getUsername() == (test_username)) {
        System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUsername-Passed" + TestUtils.TEXT_COLOR_RESET);
    } else {
        System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername-FAILED" + TestUtils.TEXT_COLOR_RESET);
    }

    // Assert password
    if (testUser.getPassword() == (test_password)) {
        System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getPassword-Passed" + TestUtils.TEXT_COLOR_RESET);
    } else {
        System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getPassword-FAILED" + TestUtils.TEXT_COLOR_RESET);
    }

    // Assert first name
    if (testUser.getFirst_name() == (test_first_name)) {
        System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getFirstName-Passed" + TestUtils.TEXT_COLOR_RESET);
    } else {
        System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getFirstName-FAILED" + TestUtils.TEXT_COLOR_RESET);
    }

    // Assert last name
    if (testUser.getLast_name() == (test_last_name)) {
        System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getLastName-Passed" + TestUtils.TEXT_COLOR_RESET);
    } else {
        System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getLastName-FAILED" + TestUtils.TEXT_COLOR_RESET);
    }

    // Assert mobile number
    if (testUser.getMobile_number() == (test_mobile_number)) {
        System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC5-getMobileNumber-Passed" + TestUtils.TEXT_COLOR_RESET);
    } else {
        System.out.println(TestUtils.TEXT_COLOR_RED + "TC5-getMobileNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);
    }
    
    //using asserts's
    
    assert testUser.getUsername() == test_username;
    assert testUser.getPassword() == test_password;
    assert testUser.getFirst_name() == test_first_name;
    assert testUser.getLast_name() == test_last_name;
    assert testUser.getMobile_number() == test_mobile_number;
    
    //Updated assertion
    int one = 1;
    int anotherOne = 1;
    assert one == anotherOne : "This assertion will always pass";
    
    System.out.println("All java assertions in the test suite passed (none failed).");

	}
	
}
