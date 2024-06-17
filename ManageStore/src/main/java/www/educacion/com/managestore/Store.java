package www.educacion.com.managestore;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import www.educacion.com.managestore.store.Product;


public class Store implements StoreAction {
    private String name;
    private List<Product> listProducts;

    public Store(String name) {
        this.name = name;
        this.listProducts = new ArrayList<>();
    }

    //Metodo para añadir producto
    @Override
    public void addProduct(Product product) {
        listProducts.add(product);
    }

    //Metodo para eliminar producto
    @Override
    public void deleteProduct(String nameProduct) {
        listProducts.removeIf(e -> e.getName().equals(nameProduct));
    }
    
    //metodo para mostrar los productos registrados
    @Override
    public void listProduct() {
        for(Product product: listProducts){
            System.out.println(product);
        }
    }
    
    //metodo para mostrar la cantidad de los producto
    @Override
    public void listCantProduct(){
        for(Product product: listProducts){
            System.out.println(product.getCant()); //para que imprima solo la cantidad
        }
    }
    
    //Metodo para mostrar los productos por categorias
    @Override
    public void listCategory(Class<?> productType){
        for(Product product : listProducts){
            if(product.getClass() == productType){
                System.out.println(product.getCant());
            }
        }
    }
    
    //Metodo para mostrar cantidad de productos por categoria
    @Override
    public void cantProductCategory(Class <?> cantCategory){
        int cantTotal=0;
        for(Product cantProduct : listProducts){
            if(cantProduct.getClass() == cantCategory){
                cantTotal += cantProduct.getCant();
                
            }
        }
        System.out.println(cantTotal);
    }
    
    //Metodo para encontrar el producto que se desea modificar(precio)
    @Override
    public Product foundProduct(String name){
        for(Product product: listProducts){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    
    //Actualización de precio
    @Override
    public boolean updatePrice(String name, double newPrice){
        Product product = foundProduct(name);
        if(product != null){
            product.setPrice(newPrice);
            return true; //Actualizacion exitosa
        }
        return false; //Producto no encontrado
    }
    
    //Metodo para guardar los productos en un archivo
    @Override
    public void saveProduct(String file){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            for(Product product : listProducts){
                pw.println(product.toString()); //Imprimir linea por linea 
            }
            System.out.println("Datos cargados desde: "+file);
        } catch (IOException e1) {
            System.out.println("Error al escribir en el archivo"+e1.getMessage());
        }finally{
            if(pw != null){
                pw.close();
            }
        }        
    }
    
    //Metodo para leer el archivo
    @Override
    public void readProduct(String file) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line="";
            while((line = br.readLine()) != null){
                System.out.println("Linea leída : "+line);
            }
            System.out.println("Datos cargados desde : "+file);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer la linea");
        } catch (IOException e2) {
            System.out.println("Error al leer el archivo");
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e3) {
                    System.out.println("Errror al cerrar el archivo, asegurece de no tener el archivo abierto");
                }
            }
        }
    }
}   
    
   
