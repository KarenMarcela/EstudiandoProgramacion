
package www.educacion.com.managestore.store;

public class ImpulseProduct extends Product{
    private double interests;

    public ImpulseProduct( String name, double price, int cant,double interests) {
        super(name, price, cant);
        this.interests = interests;
    }
    
    public double calculatePrice(){
        return super.getPrice()+interests;
    }

    @Override
    public String toString() {
        return "ImpulseProduct{" + " Name: " + super.getName() +" Precio: $"+calculatePrice()+" Cantidad:  "+super.getCant()+ '}';
    }
}
