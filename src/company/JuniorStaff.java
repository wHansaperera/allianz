
package company;


public class JuniorStaff extends Staff{
   protected int noOfHours;
    public void display(){
    
    
    }

    public JuniorStaff(String name,String destination,String department) {
        super(name, destination, department);
    }
     @Override
    public double  calSalary() {
       
        
        
        double basic = 0;
       double ot_per_hours=0;
       double salary=basic+(ot_per_hours*noOfHours);
       return salary;
    }
    
}
