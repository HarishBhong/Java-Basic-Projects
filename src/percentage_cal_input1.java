import java.util.*;

public class percentage_cal_input1{

    public static void main(String[] args) {
        
        System.out.print("Enter marks of maths: ");
        Scanner mk_maths = new Scanner(System.in);
        float maths = mk_maths.nextFloat();

        System.out.print("Enter marks of eng: ");
        Scanner mk_eng = new Scanner(System.in);
        float eng = mk_eng.nextFloat();

        System.out.print("Enter marks of physics: ");
        Scanner mk_physics = new Scanner(System.in);
        float physics = mk_physics.nextFloat();

        System.out.print("Enter marks of chem: ");
        Scanner mk_chem = new Scanner(System.in);
        float chem = mk_chem.nextFloat();

        System.out.print("Enter marks of geo: ");
        Scanner mk_geo = new Scanner(System.in);
        float geo = mk_geo.nextFloat();

        float percentage = (maths + eng + physics + chem + geo)/500 * 100;
        System.out.println("Percentage:" + percentage);
    }
}
