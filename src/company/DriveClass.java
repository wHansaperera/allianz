
package company;
import java.util.Scanner;

public  class DriveClass {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice or enter 0 to Exit");
        System.out.println("_______________________________________");
        System.out.println("_______________________________");
            System.out.println("1:Project Manager ");
            System.out.println("2:Software Engineer ");
            System.out.println("3:HR Manager");
            System.out.println("4:Designer");
            System.out.println("0:To Exit");
            System.out.println("_________________________________");
        int in =sc.nextInt();
          
            
        switch(in){
            case 1:
               
                SeniorStaff s1=new SeniorStaff("Smith Brown","Project manager","Software Management");
               s1.basic_s=200000.0;
               s1.profitshare=50000.0;
                s1.display();
                System.out.println("Salary : "+s1.calSalary());
                
                double ad1=s1.calAdvance(s1.calSalary());
                
                System.out.println("Advance : "+ad1);
                
               
              
             break;
             
            case 2:SeniorStaff s2=new SeniorStaff("Lisa Emmy","Software Engineer","Software Management");
               s2.basic_s=100000.0;
               s2.profitshare=25000.0;
                s2.display();
                System.out.println("Salary : "+s2.calSalary());
                
                double ad2=s2.calAdvance(s2.calSalary());
                
                System.out.println("Advance : "+ad2);
            break;
             case 3:JuniorStaff j1=new JuniorStaff("John Cooper","HR Manager","Software Management");
               j1.noOfHours=50;
               j1.basic_j=62000.0;
               j1.ot_per_hour=200.0;
               j1.display();
                System.out.println("Salary : "+j1.calSalary());
                
               
                
               
            break;
             case 4:JuniorStaff j2=new JuniorStaff("lucas Patrick","Designer","Designing");
               j2.noOfHours=60;
               j2.basic_j=50000.0;
               j2.ot_per_hour=100.0;
               j2.display();
                System.out.println("Salary : "+j2.calSalary());
                
               
                
               
            break;
             case 0:System.exit(0);
             break;
             default:System.out.println("Re Enter your choise");
             break;
        
        }
        }  
    }
}
