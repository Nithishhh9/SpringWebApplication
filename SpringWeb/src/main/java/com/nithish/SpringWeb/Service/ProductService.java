package com.nithish.SpringWeb.Service;

import com.nithish.SpringWeb.Model.Product;
import com.nithish.SpringWeb.Repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ProductService {

    @Autowired
    Productrepo repo;

//     Adding data to the product by MVC
//    List<Product> products =  new ArrayList<>(Arrays.asList(new Product(101,"nithish",60000),
//            new Product(102,"mintu",50000),
//            new Product(103,"Sree",51000)));


    public List<Product> getProducts() {
//        return products;
        return repo.findAll();
    }


    public Product getProductById(int id) {
//        for (Product product : products) {
//            if (product.getId() == id) {
//                return product;
//            }
//        }
//        return null;

        return repo.findById(id).orElse(new Product());
    }


    public void addProduct(Product prod)
    {
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index=0;
//        for (int i=0;i<products.size();i++) {
//            if (products.get(i).getId() == prod.getId()) {
//                index = i;
//            }
//        }
//        products.set(index, prod);
        repo.save(prod);
    }

    public void deleteProduct(int id) {
//        int index=-1;
//        for (int i=0;i<products.size();i++) {
//            if (products.get(i).getId() == id) {
//                index = i;
//            }
//        }
//        if(index==-1){
//            return;
//        }
//        products.remove(index);
        repo.deleteById(id);
    }
}
