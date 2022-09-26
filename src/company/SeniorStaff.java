
package company;

public class SeniorStaff extends Staff{
    
     double basic_s;
    double profitshare;
    
    public SeniorStaff(String name,String destination,String department){
    super(name, destination, department);
   
    
    }
    public void display(){
       System.out.println("Name : "+name);
        System.out.println("Destination : "+destination);
        System.out.println("Department : "+department);
        
    
    }
    public double calAdvance(double slryAd){
        double adv=slryAd*0.5;
    return adv;
    }

   

    @Override
    public double  calSalary() {
       
        
       double salary=basic_s+profitshare;
       return salary;
       
       
    }

    
    
   
    
}
