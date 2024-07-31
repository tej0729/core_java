package core_4;

import java.io.*;
public class UserNameInputs {
     public static void main (String [] args) throws IOException{
    	// Scanner sc=new Scanner(System.in);
    	 
    	// String name=sc.next();
    	 int eid;
    	 String ename;
    	 double esalary;
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    	 eid = Integer.parseInt(br.readLine());// parseint is used to convert the input string into int type during runtime.it is done by using the integer class  
    	 ename = br.readLine();// readLine is used to read the input
    	 esalary= Double.parseDouble(br.readLine());
    	
    	 System.out.println(eid);
    	 System.out.println("Hello : " + ename);
    	System.out.println(esalary);
     }
}
