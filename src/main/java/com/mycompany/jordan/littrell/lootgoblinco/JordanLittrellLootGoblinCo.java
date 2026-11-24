/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jordan.littrell.lootgoblinco;
import java.util.ArrayList;
/**
 *
 * @author Jojo0
 */
public class JordanLittrellLootGoblinCo 
{

    public static void main(String[] args) {
System.out.println("Welcome to Loot Goblin Co.!");
        System.out.println();

        // ARRAY EXAMPLE

        // An array has a fixed size once it is created.
        String[] featuredProducts = {
            "Dragon Dice Set",
            "Goblin Plush",
            "Mystery Loot Box"
        };

        System.out.println("Featured Products (Array):");

        // Arrays use length to determine the number of elements.
        for (int i = 0; i < featuredProducts.length; i++) {
            System.out.println(featuredProducts[i]);
        }

        // An existing element can be replaced using its index.
        featuredProducts[1] = "Goblin Figurine";

        System.out.println();
        System.out.println("Updated Featured Products:");

        for (int i = 0; i < featuredProducts.length; i++) {
            System.out.println(featuredProducts[i]);
        }

        System.out.println("Array size: " + featuredProducts.length);

        // ARRAYLIST EXAMPLE

        // An ArrayList can grow or shrink as elements are added
        // or removed.
        ArrayList<String> inventory = new ArrayList<>();

        // The add() method adds elements to an ArrayList.
        inventory.add("Enchanted Keychain");
        inventory.add("Potion Bottle");
        inventory.add("Treasure Chest");

        System.out.println();
        System.out.println("Current Inventory (ArrayList):");

        // ArrayLists use size() and get() to access elements.
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }

        System.out.println("Original inventory size: " + inventory.size());

        // Unlike an array, an ArrayList can increase in size.
        inventory.add("Dungeon Map");
        inventory.add("Magic Scroll");

        System.out.println();
        System.out.println("Inventory size after adding products: "
                + inventory.size());

        // The remove() method removes an existing element.
        inventory.remove("Potion Bottle");

        // The set() method replaces an existing element.
        inventory.set(0, "Enchanted Necklace");

        System.out.println();
        System.out.println("Updated Inventory:");

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }

        System.out.println("Final inventory size: " + inventory.size());
    }
}
