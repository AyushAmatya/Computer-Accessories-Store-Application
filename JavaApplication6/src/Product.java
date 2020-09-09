/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Product{
    public String product_id, company, price, description, warranty, category;
    public Product(String product_id, String company, String price, String description, String warranty, String category){
        this.product_id = product_id;
        this.company = company;
        this.price = price;
        this.description = description;
        this.warranty = warranty;
        this.category = category;
    }
}
