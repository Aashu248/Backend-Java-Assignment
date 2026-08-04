package com.example.productcrud;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {
    ArrayList<Product> products=new ArrayList<>();
    @PostMapping("/add")
    public String addProduct(@RequestBody Product product)  {
        products.add(product);
        return "Product added successfully";
    }
    @GetMapping("/list")
    public ArrayList<Product> getProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        for(Product p : products) {
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        products.removeIf(p -> p.getId() == id);
        return "Product deleted";
    }
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {

        for(Product p : products) {

            if(p.getId() == id) {

                p.setName(updatedProduct.getName());
                p.setPrice(updatedProduct.getPrice());
                p.setQty(updatedProduct.getQty());

                return "Product updated successfully";
            }
        }

        return "Product not found";
    }

}


