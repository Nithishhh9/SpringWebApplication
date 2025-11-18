package com.nithish.SpringWeb.Repository;

import com.nithish.SpringWeb.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Productrepo extends JpaRepository<Product,Integer> {

}
