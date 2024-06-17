/*Ejercicio
Inventario de Productos en una Tienda
Desarrolla un sistema para gestionar el inventario de productos en una tienda.
1.El sistema debe permitir lo siguiente:
Registro de Productos: Se deben registrar los datos de los productos, incluyendo su nombre,
categoría, precio y cantidad en stock. Si un producto ya está registrado, debe actualizarse su cantidad en stock.
Generación de un Código Único de Producto: A cada producto se le debe generar un código único
basado en su nombre y categoría, finalizando con un número aleatorio. Por ejemplo, para un producto "Laptop"
en la categoría "Electrónica", el código de producto podría ser elelap123. Si un código coincide con el de
otro producto, se debe generar una excepción y crear un nuevo número aleatorio para resolver el conflicto.
2.Actualizar el Precio del Producto: Se debe permitir actualizar el precio de un producto registrado
en el inventario.
3.Listar Productos por Categoría: Se debe permitir listar los nombres de los productos y la cantidad de
productos por categoría, así como la cantidad total de productos en el inventario.
4.Almacenamiento y Consulta: La información de los productos debe ser almacenada y consultada desde
archivos de texto.*/

package www.educacion.com.managestore;

import www.educacion.com.managestore.store.BasicConsumerProduct;
import www.educacion.com.managestore.store.ImpulseProduct;
import www.educacion.com.managestore.store.Product;

public class ManageStore {

    public static void main(String[] args) {
        Store store = new Store("Tienda la bichota");

        //Productos por impulso
        ImpulseProduct impulseProduct1 = new ImpulseProduct("Blusas", 50000, 5, 1000);
        ImpulseProduct impulseProduct2 = new ImpulseProduct("Celular", 1000000, 3, 10000);
        
        //Productos del consumo basico
        BasicConsumerProduct bcp1 =new BasicConsumerProduct(10, "Arroz", 3000, 7, 1000);
        BasicConsumerProduct bcp2 =new BasicConsumerProduct(50, "Huevo", 600, 20, 300);
        
        store.addProduct(bcp2);
        store.addProduct(bcp1);
        store.addProduct(impulseProduct1);
        store.addProduct(impulseProduct2);
        
        //Listar todos los productos
        System.out.println("Lista de Productos");
        store.listProduct();
        
        //Listar solo la cantidad de los productos
        System.out.println("Cantidad de productos");
        store.listCantProduct();
        
//        //Listar productos por categoria
//        System.out.println("Lista de productos por categoría");
//        store.listCategory(ImpulseProduct.class);
        
        //Listar cantidad de productos por categoria
        System.out.println("Cantidad por categoria");
        store.cantProductCategory(BasicConsumerProduct.class);
        
        store.saveProduct("Productos.txt");
        
        //Actualización de precio
        store.updatePrice("Blusas", 2000);
        
        //Otra vez listo los productos para ver el cambio
        store.listProduct();
        
        

    }
    
    
}
