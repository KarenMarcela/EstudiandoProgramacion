package www.educacion.com.managestore;

import www.educacion.com.managestore.store.Product;

public interface StoreAction {
    void listProduct();
    void addProduct(Product product);
    void deleteProduct(String nameProduct);
    void saveProduct(String file);
    void readProduct(String file);
    void listCantProduct();
    void listCategory(Class<?> productType);
    void cantProductCategory(Class <?> cantCategory);
    Product foundProduct(String name);
    boolean updatePrice(String name, double newPrice);
}
