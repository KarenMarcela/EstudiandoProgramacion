
package www.educacion.com.managestore.store;

public class BasicConsumerProduct extends Product{
    private int cantReserve; //como es de consumo basico, se agota con mas facilidad
    private double subsidy; //productos de supervivencia basica no pagan impuesto

    public BasicConsumerProduct(int cantReserve, String name, double price, int cant,double subsidy) {
        super(name, price, cant);
        this.cantReserve = cantReserve;
        this.subsidy = subsidy;
    }
    
    public double calculatePrice(Product price){
        return super.getPrice() - subsidy;
    }
    
    public int calculateCant(){
        return super.getCant()+cantReserve;
    }
    @Override
    public String toString() {
        return "BasicConsumerProduct'{'" + " Name: " + super.getName() +" Precio: $"+calculatePrice()+" Cantidad:  "+super.getCant()+ '}';
    }
}
