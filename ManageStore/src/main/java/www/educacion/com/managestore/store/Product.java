package www.educacion.com.managestore.store;
public class Product{
    private String name;
    private double price;
    private int cant;
    //private ArrayList<GenerateCode> generateCode;

    public Product(String name, double price, int cant) {
        this.name = name;
        this.price = price;
        this.cant = cant;
    }

    //GETERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCant() {
        return cant;
    }
    
    //SETTERS para dejar modificar el precio y la cantidad
    public void setPrice(double price) {
        this.price = price;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    //Metodo precio
    public double calculatePrice(){
        return price;
    }
    
    //Metodo cantidad
    public int calculateCant(){
        return cant;
    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", cant=" + cant + '}';
    }
}
