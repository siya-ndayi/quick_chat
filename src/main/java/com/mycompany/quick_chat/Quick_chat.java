/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quick_chat;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author siyan
 */
public class Quick_chat {
    public String messageID;
    public String recipientNumber;
    public String message;
    public String messageHash;
    
    public static int totalMessages = 0;

    // Method 1
    public boolean checkMessageID() {
        if (messageID.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
       
         // Method 2
    public String CheckrecipientCell() {
        if (recipientNumber.startsWith("+") && recipientNumber.length() <= 14) {
            return "Cell phone number successfully captured.";
        } else {
            return "Cell phone number is incorrectly formatted or does not contain an international code.";
        }
    }      
           
           // Method 3
    public String createMessageHash() {
        String[] words = message.split(" ");

        String firstWord = words[0].toUpperCase();
        String lastWord = words[words.length - 1].toUpperCase();

        messageHash = messageID.substring(0, 2) + ":" + totalMessages + ":" + firstWord + lastWord;

        return messageHash;
    }
           
        public String SentMessage() {
        if (this.message == null || this.message.isEmpty()) {
            return "Please enter a message of less than 250 characters.";
        }
        
        if (this.message.length() <= 250) {
            return "Message successfully sent";
        } else {
            int excessCharacters = this.message.length() - 250;
            return "Message exceeds 250 characters by " + excessCharacters + " characters; please reduce the size.";
        }
    }
        public String printMessages() {
         
        
            System.out.println("No messages have been sent yet.");
               
        return null;
            
        }
             
          public int returnTotalMessages() {
              return totalMessages;
          }      
                 
             
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String messageID = JOptionPane.showInputDialog("Enter message ID:");
        String recipient = JOptionPane.showInputDialog("Enter recipient number:");
        String messageText = JOptionPane.showInputDialog("Enter message:");

        if (messageText.length() > 250) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a message of less than 250 characters.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Message ready to send.");
        }
            
           
       // Task Constraints: Simulating a baseline authentication gate context
        boolean loggedIn = true; 
        
        if (!loggedIn) {
            System.out.println("Access Denied. You must log in successfully first.");
            return;
        }
           System.out.println("Welcome to QuickChat!");
           
            System.out.print("Enter the number of messages you want to send: ");
        
          System.out.print("Please enter a valid round number integer: ");
            input.next();
            
            System.out.println("Cell phone number is incorrectly formatted or does not contain an internationalcode ");
            System.out.println("please enter a message of less than 250 characters");
            System.out.println("Message exceeds limit by extra characters");
            
            System.out.println("Re enter message");
            
            
            
      
            System.out.println("QuickChat Menu");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");
            System.out.print("Select an option: ");
              
              // switch (choice)
              // case 1
              // run logic track for choice 1 : processing a message object entery
              
               // collect recipient number & validate using class methods rules
                System.out.print("Enter Recipient Cell Number (e.g., +27718693002): ");
               
                // input messsage description contents
               System.out.print("Enter Message text: ");
               
               
               // Present post-creation decision layout menu block options
                        System.out.println("Message Finished. Choose a tracking action option:");
                        System.out.println("1): Send Message");
                        System.out.println("2): Disregard Message");
                        System.out.println("3): Store Message to send later");
                        System.out.print("Selection choice: ");
                        String actionChoice = input.nextLine().trim();
               
                      System.out.println("Message successfully sent");
                        
                            System.out.println("--> Message Disregarded. (Press 0 to delete if needed)");
                       
                     // case 2
                     // Display option 2 message details matching presentation layout guideline
                        System.out.println("RECNTLY SENT MESSAGES REPORT");
                        
                        boolean recordsExist = false;
                        System.out.println("printmessages");
                         System.out.println("Message successfully disregarded");
                         
                        System.out.println("No messages currently found inside system memory queues.");
                    
                        // Output final counter accumulation total summaries
                        System.out.println("Total accumulated valid messages on run: " );
                        
                        System.out.println("FINAL REPORT");
                        System.out.println("Total messages sent and returntotalmessages");
                        System.out.println("Total messages stored and storedmessages size");
                        System.out.println("Total messages disregarded and disregardedmessages.size");
                        
                        System.out.println("hi Mike can you join us for dinner tonight?");
                        System.out.println("Hi Keegan did you recevie the payment");
                        
                        input.close();
                         
                    }
                    
                      
                      
    
                    
                    
                       
                            
                            
    }
                    
                  
                     
                 
    

