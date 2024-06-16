
package www.educacion.com.company.staff;


public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus, String name, int age, double salary) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + " Nombre: " + super.getName() +" Edad: "+super.getAge()+" Salario: $"+calculateSalary()+ '}';
    }
    
    

    
    
}
