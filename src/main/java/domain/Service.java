package domain;

import java.util.List;
import java.math.BigDecimal;

public class Service {
    private String id;
    private String name;
    private String description;
    private double price;
    private List<Company> companies;

    public Service(String id, String name, String description, double price, List<Company> companies) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.companies = companies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}


