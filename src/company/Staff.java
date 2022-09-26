
package company;


abstract public class Staff {
   static public String name;
   static public String destination;
   static public String department;
    abstract public double calSalary();

    public Staff(String name, String destination, String department) {
        this.name = name;
        this.destination = destination;
        this.department = department;
    }
    
    
   
}