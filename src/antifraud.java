
/*
 * 1. READ IN BATCH PAYMENT
 * 2. SET FRIENDS
 * 3. READ STREAM PAYMENTS
 * 4. CHECK SECURITY
 * 5. PRINT OUTPUT MESSAGES
 */
package paymowalletsecurity;



/**
 *
 * @author Tobey Strauch
 * Digital Wallet
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.*;
    

public class PayMOWalletSecurity {



public class FirstDegreeFriends{}
public class SecondDegreeFriends{}
public class ThirdDegreeFriends{}
public class FourthDegreeFriends{}
public int ID1, ID2;
public String Time;
public int Amount;
public int AmountinAccount;
public  String Message;


public class CategorizeFriends{
private FirstDegreeFriends firstdegreeFriends;
private SecondDegreeFriends seconddegreeFriends;
private ThirdDegreeFriends thirddegreeFriends;
private FourthDegreeFriends fourthdegreeFriends;
}

    /**
     *
     */
    

public class ReadinBatchPayment {
         private Scanner input;
         
         public void openFile() throws FileNotFoundException
         {
             //end catch
             
             input =new Scanner(new File ( "batchpayment.txt"));
    }//end open method

 //read record
         public void readRecords()
         {WalletRecord record = new WalletRecord();
         System.out.printf("%-10s%-12s%-12s%10s\n", "Time", "ID1", "ID2",
                 "Amount", "Message");
   
        try//read from file using scanner object
        {
            while(input.hasNext())
            {record.setTime(input.next()); //Read Time
             record.setID1(input.nextInt());//Read ID1
             record.setID2(input.nextInt());//Read ID2
             record.setAmount(input.nextDouble());//Read Amount
             record.setMessage(input.next());//Read character message
             
             //display record content
             System.out.printf("%-10s%-12s%-12s%10s\n", record.getTime(Time),
                     record.getID1(ID1), 
                     record.getID2(ID2), record.getAmount(Amount), 
                     record.getMessage(Message));
            }//end while
        }//end try
        catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
            
        } //end catch
}//end read records

public void closeFile()
{
    if (input != null)
        input.close();
}//end close file method
}//end read in batch


  
  
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymowalletsecurity;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;

/**
 *
 * @author blair_000
 */
class WalletRecord {
    
    private String Time;
    private int ID1;
    private int ID2;
    private double Amount;
    private String Message;
    private String timeoftrans;
    private int accountID1;
    private int accountID2;
    private double AmountTransfer;
    private String TransactionMessage;
    
    public WalletRecord()
    { this("",0,0,0.0,"");
    
    }
//initialize
    public WalletRecord(String Time, int ID1, int ID2,double Amount, String Message)
    { setTime(Time);
      setID1(ID1);
      setID2(ID2);
      setAmount(Amount);
      setMessage(Message);
    }//end construct

    public void setTime(String Time) {
        timeoftrans = Time;
        throw new UnsupportedOperationException("Not supported yet.");
    }//end method time

    public void setID1(int ID1) {
        accountID1 = ID1;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setID2(int ID2) {
        accountID2 = ID2;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAmount(double Amount) {
        AmountTransfer = Amount;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMessage(String Message) {
         TransactionMessage = Message;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getTime(String Time){
        return timeoftrans;
    }
    public int getID1(int ID1){
        return accountID1;
    }
    public int getID2(int ID2){
        return accountID2;
    }
    
    public double getAmount(double Amount){
        return AmountTransfer;
    }
    
    public String getMessage(String Message){
        return TransactionMessage;
    }
            }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
    
