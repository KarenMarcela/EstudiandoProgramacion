
package www.educacion.com.interfaces;

public class Pajaro extends AnimalBase implements Volar{

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println( nombre+" esta volando");
    }
  
}
