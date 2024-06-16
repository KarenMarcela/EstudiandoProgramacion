
package www.educacion.com.interfaces;

public class AnimalBase implements Animal{
    public String nombre;
    private int edad;
    

    public AnimalBase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public void comer() {
        System.out.println(nombre+" esta comiendo");
    }
    
    @Override
    public void dormir() {
        System.out.println(nombre+" esta durmiendo");
    }
    
    
    
    
}
