/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package befitequipmentsorted;

/**
 *
 * @author admin
 */
public class BeFitEquipmentSorted {

    /**
     * @param args the command line arguments
     */
  
 public static void main(String[] args) {
 BeFit[] inventory = {
 new BeFit("Cardio", "Treadmill X100", "1200"),
 new BeFit("Strength", "Adjustable Bench", "450"),
 new BeFit("Flexibility", "Yoga Mat Pro", "85"),
 new BeFit("Recovery", "Foam Roller", "35")
 };
 bubbleSortByPrice(inventory);
 System.out.println("=== beFit Inventory (Sorted by Price) ===");
 for (BeFit item : inventory) {
 System.out.printf("Category: %-12s | Name: %-18s | Price: R%s%n",
 item.getCategory(), item.getName(), item.getPrice());
 }
 
 }
  public static void bubbleSortByPrice(BeFit[] arr) {
 int n = arr.length;
 boolean swapped;
 for (int i = 0; i < n - 1; i++) {
 swapped = false;
 for (int j = 0; j < n - 1 - i; j++) {
 if (arr[j].getPriceAsInt() > arr[j + 1].getPriceAsInt()) {
 BeFit temp = arr[j];
 arr[j] = arr[j + 1];
 arr[j + 1] = temp;
 swapped = true;
 }
 }
 if (!swapped) break;
 }
 }
}
