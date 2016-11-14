// example of program that detects suspicious transactions
// fraud detection algorithm
package paymowalletsecurity;

/**
 *
 * @author Strauch
 *  Import Historical Data to create a database allowing past transactions to be compared.
 */
import java.io.*;
public class ReadinDataHistory {
      
        public static void main(String[] args){

        String string = "";
      
        String file = "batchpayment.txt";

        // Reading
        try{
            InputStream ips = new FileInputStream(file);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                string += line + "\n";
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        // Writing
        try {
            FileWriter fw = new FileWriter (file);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter fileOut = new PrintWriter (bw);
                fileOut.println (string+"\n test of read and write !!");
            fileOut.close();
            System.out.println("the file " + file + " is created!");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

  
  
  
}
