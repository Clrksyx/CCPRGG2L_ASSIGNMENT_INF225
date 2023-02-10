public class App {
    public static void main(String[] args) throws Exception {

       GroceryItem item1 = new GroceryItem();

       item1.name = "Tissue";

       item1.showItemName();

       GroceryItem item2 = new Toothbrush();
       item2.name = "Colgate";
       item2.price = 95;
       item2.showItemName();


       GroceryItem item3 = new Toothpaste();
       item3.name = "Pepsodent";
       item3.price = 105;
       item3.showItemName();

       Cashier c1 = new Cashier();
       c1.checkOut(item2);
       c1.checkOut(item3);

       c1.showprice(item2);
       c1.showprice(item3);

       GroceryItem[] itemArray = new GroceryItem[2];
       itemArray[0] = item2;
       itemArray[1] = item3;

       for (int i = 0; i < itemArray.length; i++) {
        itemArray[i].showItemName();
       }

       Dog myDog = new Dog();
       myDog.eat();
       myDog.sleeping();

       Lion myLion = new Lion();
       myLion.walk();
       myLion.run();
       myLion.fly();

    









    }

}
