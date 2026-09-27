/**
 * A simulation of a simple grocery store. Contains parallel arrays of the
 * store's item names, item prices, and item stocks. Also contains methods to
 * display the store's inventory, restock the store, and provide a menu to the user
 * for easier access.
 *
 * @author Roland Price
 * @author Ryan Stedman
 * @author James Webb
 * @author Zachary Contreras
 * @version 1.0
 */
public class GroceryStoreProgram {

}

  public static void printInventory(String[] names,
                                    double[] prices,
                                    int[] stocks){                            

  }

  /**
   * Searches the names[] array for a specific item (target);
   * if found, adds amount to the parallel array stocks[] for
   * the item, and prints out
   * "[target] has been restocked with [amount] new items."
   * If the item is not found, prints out "Item not found."
   *
   * @param names List of item names in the grocery store
   * @param stocks List of how much of each item there is
   * @param target Target item to restock
   * @param amount Amount to restock for target
   */
  public static void restockItem(String[] names,
                                 int[] stocks,
                                 String target,
                                 int amount){
    boolean itemFound = false;

    for(int i = 0; i < names.length; i++){
      if(names[i].equals(target)){
        itemFound = true;
        stocks[i] += amount;
        break;
      }
    }

    if(itemFound){
      System.out.println(target +
          " has been restocked with " +
          amount +
          " new items.");
    }else{
      System.out.println("Item not found.");
    }
  }


  /**
   * Main method for the GroceryStoreProgram. Houses the data for the parallel array architecture,
   * and provides a menu for the user to display incventory, restock items, or exit the program.
   * @param args
   */
  public static void main(String[] args){

    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

    java.util.Scanner input = new java.util.Scanner(System.in);

    while(true){
    System.out.println("Please select a menu option: "
        + "\n1. Display Inventory"
        + "\n2. Restock Item"
        + "\n3. Exit");
        
    int choice = input.nextInt();

    if (choice == 1){
      printInventory(itemNames, itemPrices, itemStocks);
     } 
      else if (choice == 2) {
      System.out.println("Enter the name of the item to restock: ");
      input.nextLine(); 
      String target = input.nextLine();
      System.out.println("Enter the amount to restock: ");
      int amount = input.nextInt();
      restockItem(itemNames, itemStocks, target, amount);
     } 
    else if (choice == 3) {
      input.close();
      break;
     } 
    else {
      System.out.println("Invalid choice. Please try again.");
    }
   }
  }

