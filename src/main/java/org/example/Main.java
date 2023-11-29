package org.example;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //Create an ArrayList
    ArrayList<String> shoppingList = new ArrayList<String>();

    System.out.println("Your list contains:");
    System.out.println(shoppingList);

    int[] array = {1,2,3,4};
    System.out.println(array);

    //Add ingredients missing for Chile Verde
    shoppingList.add("1.5 lbs tomatillos");
    shoppingList.add("2 poblano peppers");
    shoppingList.add("1 bunch cilantro");
    shoppingList.add("8 garlic cloves");
    shoppingList.add("2 jalapenos");
    shoppingList.add("3 pounds pork tenderloin");
    shoppingList.add("2 yellow onions");
    shoppingList.add("2 1/2 cups chicken stock");

    System.out.println("Your list contains:");
    System.out.println(shoppingList);
  }
}