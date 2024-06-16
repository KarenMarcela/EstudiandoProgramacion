
/*Vamos a crear un sistema de gestión de empleados en una empresa.
El sistema debe permitir leer y escribir información de empleados desde un fichero,
utilizando interfaces para definir las operaciones básicas, excepciones personalizadas para manejar errores,
y listas para manejar las colecciones de empleados. También vamos a implementar herencia para
diferenciar entre empleados regulares y gerentes.*/

package www.educacion.com.company;

import www.educacion.com.company.actions.BaseCompany;
import www.educacion.com.company.staff.Employee;
import www.educacion.com.company.staff.Manager;
import www.educacion.com.company.staff.RegularEmployee;



public class Company {

    public static void main(String[] args) {
        BaseCompany baseCompany = new BaseCompany();
        
        
        
        //Agregar empleados Gerentes
        Manager manager1 = new Manager(30000, "Karen", 28, 200000000);
        Manager manager2 = new Manager(70000, "Daniel", 34, 500000000);
        Manager manager3 = new Manager(30000, "Vanessa", 32, 100000000);
        //Agregar empleados regulares
        RegularEmployee regularEmployee1 = new RegularEmployee(3000000, "Juan", 40, 23000000);
        RegularEmployee regularEmployee2 = new RegularEmployee(5000000, "Danilo", 30, 45000000);
        RegularEmployee regularEmployee3 = new RegularEmployee(4000000, "Karol", 38, 66000000);
        
        //Agregar empleados a la empresa
        baseCompany.addEmployee(manager3);
        //baseCompany.addEmployee(manager2);
        baseCompany.addEmployee(manager1);
        baseCompany.addEmployee(regularEmployee1);
        baseCompany.addEmployee(regularEmployee2);
        baseCompany.addEmployee(regularEmployee3);
        
        //Eliminar empleados
        baseCompany.deleteEmployee("Daniel");
        
        //Listar empleados
        baseCompany.listEmployee();
        
        //Buscar empleado
        System.out.println("\n Buscar empleado");
        Employee found = baseCompany.searchEmployee("Daniel");
        if(found != null){
            System.out.println("Empleado encontrado: "+found);
        }else{
            System.out.println("Empleado NO encontrado");
        }
        
        //Escribir y leer empleados desde el archivo
        baseCompany.writerEmployee("Empleados.txt"); //el nombre del archivo en el cual se guardaran
        //la informacion de los empleados
        baseCompany.readEmployee("Empleados.txt");
    }
}
