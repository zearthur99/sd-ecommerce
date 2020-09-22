package services;

import model.Product;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ProductService extends BaseService<Product>{
    public ProductService() {
        System.out.println("consturo");
    }
}
