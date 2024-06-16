
package www.educacion.com.company.staff;

public class RegularEmployee extends Employee{
    private double bond;

    public RegularEmployee(double bond, String name, int age, double salary) {
        super(name, age, salary);
        this.bond = bond;
    }

    @Override
    public double calculateSalary() {
        return super.getSalary() + bond;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" + "Nombre : " + super.getName() + ", Edad : "+ super.getAge()+", Salary: $"+calculateSalary()+'}';
    }

    
    
    

    
    
    
    
    
}
