package Core_2;

public class EmployeeDemo {
     public static void main(String [] args) {
    	 Employee e=new Employee();
    	 e.setEid(101);
    	 e.setEname("Ram");
    	 e.setEsalary(2000000.434d);
    	 e.setEcity("Chennai");
    	 
    	 // object printing : calls to string 
    	 System.out.println(e);
    	 
    	 Employee e1=new Employee();
    	 e1.setEid(102);
    	 e1.setEname("Ramjith");
    	 e1.setEsalary(2004500.434d);
    	 e1.setEcity("Bangalor");
    	 System.out.println(e1);
    	 
    	 
    	 
    	 
     }
}
