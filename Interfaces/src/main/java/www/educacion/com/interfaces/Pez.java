
package www.educacion.com.interfaces;


public class Pez extends AnimalBase implements Nadar{

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void nadar() {
        System.out.println(nombre+ " esta nadando");
    }
    
    
}
