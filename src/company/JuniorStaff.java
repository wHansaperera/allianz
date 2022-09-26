
package company;


public class JuniorStaff extends Staff{
   protected int noOfHours;
    double basic_j;
    double ot_per_hour;
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Destination : "+destination);
        System.out.println("Department : "+department);
    
    }

    public JuniorStaff(String name,String destination,String department) {
        super(name, destination, department);
    }
     @Override
    public double  calSalary() {
    
       double salary=basic_j+(ot_per_hour*noOfHours);
       return salary;
       
       
    }
    
}
