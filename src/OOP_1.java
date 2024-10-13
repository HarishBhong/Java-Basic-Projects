import java.util.*;
public class OOP_1 {

    public static void main(String[] args) {
        emp emp1 = new emp();
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter name of the emp:");
        String b = a.nextLine();
        
        Scanner c = new Scanner(System.in);
        System.out.print("Enter Salary of emp:");
        int j = c.nextInt();

       
        emp1.setname(b);
        System.out.println(emp1.getname());     
        emp1.getsalary(j);
    }

}
class emp{

    int salary;
    String name;

    public String getname(){
        
        return name;
    }

    public  int getsalary(int d){
        d = salary;
        return salary;
    }

    public void setname(String n){
        name = n;
    }
}