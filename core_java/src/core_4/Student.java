package core_4;

public class Student {
int eid;
String ename;
double esalary;

// default constructor
public Student() {
      this.eid=100;
      this.ename="tej";
      this.esalary=3748343;
      System.out.println("Default constructor");
	// TODO Auto-generated constructor st
}

public Student(int eid, String ename, double esalary) {
	// use this() invoke the default constructor
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
	System.out.println("parameterised constructor");
}

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Student [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}

}
