/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;

/**
 *
 * @author siyan
 */
public class messagetestNGTest {
    
    public messagetestNGTest() {
        
        Message msg = new Message(1, "+27718693002",
                "Hi Mike, can you join us for dinner tonight?");
        assertTrue(msg.checkMessageID());
    }

    @org.testng.annotations.BeforeClass
    public static void testmesssageIDCreated() throws Exception {
        System.out.println("Testing: checkMessageID");
        
        
    }

    @org.testng.annotations.AfterClass
    public static void testCheckRecipientcell() throws Exception {
        System.out.println("Testing: checkRecipientCell");
        String expectedSuccess = "Cell phone number successfully captured.";
        String expectedFailure = "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";

        
    }

    @org.testng.annotations.BeforeMethod
    public void testSentMessage() throws Exception {
       System.out.println("Testing: SentMessage character limits"); 
       String = "please enter a message of less than 250 characters";
       
    }

    @org.testng.annotations.AfterMethod
    public void testCreateMessageHash() throws Exception {
        System.out.println("Testing: createMessageHash");
        System.out.println("Welcome to quickchat network");
    }
        
    /**
     * Test of main method, of class messageNGtest.
     */
    @org.testng.annotations.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        messagetest.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        
    }
}
    
 
    
                       
        
    
    

