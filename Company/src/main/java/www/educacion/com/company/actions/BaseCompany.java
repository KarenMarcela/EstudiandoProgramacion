
package www.educacion.com.company.actions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import www.educacion.com.company.staff.Employee;


public class BaseCompany implements Actions1{
    private List<Employee> listEmployee ;

    public BaseCompany() {
        this.listEmployee = new ArrayList<>();
    }
    
    //METODO PARA AÑADIR EMPLEADOS
    @Override
    public void addEmployee(Employee employee) {
        listEmployee.add(employee);
    }

    //METODO PARA MOSTRAR LA LISTA DE EMPLEADOS
    @Override
    public void listEmployee() {
        for(Employee employee: listEmployee){
            System.out.println(employee);
        }
    }
    
    @Override
    //METODO PARA ELIMINAR EMPLEADOS
    public void deleteEmployee(String name) {
        listEmployee.removeIf(e -> e.getName().equals(name)); //e seria el empleado correspondiente a la lista.get name porque solo necesito el nombre
    }

    //METODO PARA BUSCAR EMPLEADOS 
    public Employee searchEmployee(String name) {
        for(Employee employee : listEmployee){
            if(employee.getName().equals(name)){ //se esta comparando el nombre del objeto empleado con el nombre del parametro
                return employee;
            }
        }
        return null; //Si no se encuentra el empleado, retornaremos null
    }
    

    //DEVUELVE LA LISTA DE EMPLEADOS
//        @Override
//    public List<Employee> listEmployee() {
//        for(Employee employee : listEmployee){
//            System.out.println(employee);
//        }
//        return listEmployee;
//    }
    
    
    //METODO PARA GUARDAR LOS EMPLEADOS EN UN ARCHIVO
    
    public void writerEmployee(String file) {
        PrintWriter writer= null; //se debe inicializar como null para despues hacer la comparacion en el finally 
        try{
            writer = new PrintWriter(new FileWriter(file));
            for(Employee employee : listEmployee){
                writer.println(employee.toString()); // se escribe toString para que escriba cada empleado en una linea
            }
            System.out.println("Datos de los empleados cargados desde: "+ file);
        }catch(IOException e1){
            System.out.println("Error al escribir en el archivo"+e1.getMessage());
        }finally{
            if(writer != null){
                writer.close();
            }
        }
    }

    //METODO PARA LEER LOS EMPLEADOS DEL ARCHIVO
    
    public void readEmployee(String file) {
        BufferedReader read = null;
        try{
            read = new BufferedReader(new FileReader(file));
            String line;
            while((line = read.readLine()) != null){
                System.out.println("Línea leída: "+line);
            }
            System.out.println("Datos de empleados cargados desde: "+file);
        }catch(IOException e2){
            System.out.println("Error al leer el archivo"+e2.getMessage());
        }finally{
            if(read != null){
                try {
                    read.close();
                } catch (IOException e3) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
    
    
    
}

