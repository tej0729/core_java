package Core_2;

public class Employee {
private int eid;
private String ename;
private double esalary;
private String ecity;
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
public String getEcity() {
	return ecity;
}
public void setEcity(String ecity) {
	this.ecity = ecity;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", ecity=" + ecity + "]";
}


}
