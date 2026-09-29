GroceryStoreJavaProgram is a small program that simulates a very basic grocery store using Java. It has a method for displaying the inventory, a method for restocking an existing item by a certain amount, and main method that displays a user-friendly menu.

The program begins by displaying the user-friendly menu (shown in runtimeimages/1menu.png), displaying options for Displaying the Store Inventory, Restocking an item, and exiting. If an invalid option is chosen, then the message "Invalid choice. Please try again." will be printed, and the user will be prompted to input another choice. Choosing to display the inventory (shown in runtimeimages/2inventorydisplay.png) prints out every item to the console in the format of "Item: [name] Price: $[price] Amount in Stock: [stock]." Choosing to restock an item (shown in runtimeimages/3restockitem.png) prompts the user to input a valid item name, then how much to restock by. If the item exists, it will print out the message "[target] has been restocked with [amount] new items." and return to the menu. If the option is invalid, it will print out the message "Item not found." and return to the menu (shown in runtimeimages/4incorrectrestock.png.) Finally, if the user chooses to exit, the program will safely close.

Roland Price - Created class skeleton + its javadoc, and implemented restockItem + its javadoc.
Ryan Stedman - Implemented main method + its javadoc.
James Webb - Implemented printInventory + its javadoc.
(I don't know why James' account [ocu19] isn't showing up as part of the collaborators, possibly because I [Roland Price] deleted the individual branches after merging with main? Either way, he most definitely contributed, I can attest to that.)

The best way to compile the program is to use an online Java compiler, though I would recommend https://www.onlinegdb.com/online_java_compiler. In order to run the program, simply replace the contents of Main.java with the contents of src/GroceryStoreProgram.java, then rename Main.java to GroceryStoreProgram.java in the online compiler. After that, all you have to do is click the run button.

The UML class diagram can be found in GSPUMLClassDiagram.png
