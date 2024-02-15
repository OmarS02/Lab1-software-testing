package tests;

import model.Account;
import utils.TestUtils;

import java.util.Date;

public class AccountTest {

    //1-Setup
    static String test_account_number = "123456789";
    static String test_username_of_account_holder = "omar_salem";
    static String test_account_type = "Standard";
    static Date test_account_opening_date = new Date(); // Current date for testing purposes

    //2-Exercise, run the object under test (constructor)
    static Account testAccount = new Account(test_account_number, test_username_of_account_holder,
            test_account_type, test_account_opening_date);

    //3- Verify (Assert)
    public static void main(String[] args) {
        testConstructor();
        testSetters();
    }

    public static void testConstructor() {
        System.out.println("Starting the assertions of the test method: testConstructor");

        // Assert account number
        if (testAccount.getAccount_number() == (test_account_number)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getAccountNumber-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getAccountNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // Assert username of account holder
        if (testAccount.getUsername_of_account_holder() == (test_username_of_account_holder)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getUsernameOfAccountHolder-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getUsernameOfAccountHolder-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // Assert account type
        if (testAccount.getAccount_type() == (test_account_type)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getAccountType-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getAccountType-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // Assert account opening date
        if (testAccount.getAccount_opening_date() == (test_account_opening_date)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getAccountOpeningDate-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getAccountOpeningDate-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // using asserts's
        assert testAccount.getAccount_number() == (test_account_number);
        assert testAccount.getUsername_of_account_holder() == (test_username_of_account_holder);
        assert testAccount.getAccount_type() == (test_account_type);
        assert testAccount.getAccount_opening_date() == (test_account_opening_date);

        System.out.println("All java assertions in the test suite passed (none failed).");
    }

    public static void testSetters() {
        // Set new values
        String new_account_number = "987654321";
        String new_username_of_account_holder = "khalid_salem";
        String new_account_type = "Saving";
        Date new_account_opening_date = new Date(); // Current date for testing purposes

        // Use setter methods to set values
        testAccount.setAccount_number(new_account_number);
        testAccount.setUsername_of_account_holder(new_username_of_account_holder);
        testAccount.setAccount_type(new_account_type);
        testAccount.setAccount_opening_date(new_account_opening_date);

        System.out.println("Starting the assertions of the test method: testSetters");

        // Assert account number
        if (testAccount.getAccount_number() == (new_account_number)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-setAccountNumber-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-setAccountNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // Assert username of account holder
        if (testAccount.getUsername_of_account_holder() == (new_username_of_account_holder)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-setUsernameOfAccountHolder-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-setUsernameOfAccountHolder-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // Assert account type
        if (testAccount.getAccount_type() == (new_account_type)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-setAccountType-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-setAccountType-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // Assert account opening date
        if (testAccount.getAccount_opening_date() == (new_account_opening_date)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-setAccountOpeningDate-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-setAccountOpeningDate-FAILED" + TestUtils.TEXT_COLOR_RESET);
        }

        // using asserts's
        assert testAccount.getAccount_number() == (new_account_number);
        assert testAccount.getUsername_of_account_holder() == (new_username_of_account_holder);
        assert testAccount.getAccount_type() == (new_account_type);
        assert testAccount.getAccount_opening_date() == (new_account_opening_date);

        System.out.println("All java assertions in the test suite passed (none failed).");
    }
}
