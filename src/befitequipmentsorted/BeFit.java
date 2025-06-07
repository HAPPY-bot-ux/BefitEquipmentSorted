/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package befitequipmentsorted;

/**
 *
 * @author admin
 */
public class BeFit {
    
 private String category;
 private String name;
 private String price;
 public BeFit(String category, String name, String price) {
 this.category = category;
 this.name = name;
 this.price = price;
 }
 public String getCategory() { return category; }
 public String getName() { return name; }
 public String getPrice() { return price; }
 public int getPriceAsInt() {
 return Integer.parseInt(price);
 }
}
