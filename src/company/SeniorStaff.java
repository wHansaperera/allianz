
package company;

public class SeniorStaff extends Staff{
    
    
    
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("");
    
    }
    public double calAdvance(double slryAd){
    return (50/100)*slryAd;
    }

    public SeniorStaff(String name,String destination,String department){
    super(name, destination, department);
    }

    @Override
    public double  calSalary() {
       
        
        
        double basic = 0;
       double profitshare=0;
       double salary=basic+profitshare;
       return salary;
       
       
    }

    
    
   
    
}
