package com.nomizo.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 128, nullable = false, unique = true)
    private String name;

    private float price;

    @Column(name = "enabled", columnDefinition = "tinyint default 1")
    private boolean enabled;

    @Column(length = 256, nullable = true)
    private String description;

    public Product() { super(); }

    public Product(Integer id, String name, float price, boolean enabled, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.enabled = enabled;
        this.description = description;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
