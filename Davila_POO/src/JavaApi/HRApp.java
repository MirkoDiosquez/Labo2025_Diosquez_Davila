package JavaApi;

import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("Poli App Empleados");

        Employe e1 = new Employe(1001010, "Carlos",3131);
        Employe e2 = new Employe(1091919,"ColoradoSprings",13144);



        Department dept = new Department("Education",new ArrayList<>());
        dept.addEmp(e1);
        dept.addEmp(e2);


        ArrayList<Employe>emps=dept.getEmploye();

        for (Employe e: emps){
            System.out.println("Emp"+e);
        }
        System.out.println("Total"+dept.getTotalSalary());
        System.out.println("Promedio"+dept.getAverageSalary());
        System.out.println("Emp"+dept.getEmployeeById(1001010));
    }
}
