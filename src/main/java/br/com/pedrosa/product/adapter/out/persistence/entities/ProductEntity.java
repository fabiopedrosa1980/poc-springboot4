package br.com.pedrosa.product.adapter.out.persistence.entities;


import br.com.pedrosa.product.model.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product toProduct(){
        return new Product(id,name);
    }
}
