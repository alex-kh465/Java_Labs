
public class Prg1{    
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getDetails(1,"Mary","Teacher");

        }    
}

class Employee{
    int empID;
    String empName;
    String Designation;
   
    public void getDetails(int empID, String empName, String Designation){
        this.empID = empID;
        this.empName = empName;
        this.Designation = Designation;
        System.out.println(empID);
    }
}
class HourlyEmployee extends Employee{
    double hour_rate;
    int hours_worked;    
}

