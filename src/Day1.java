public class Day1 {

    // A record is a short way to write a data class
    record MenuItem(String name, double price,String category){}



     public static void main(String[] args) {

// var lets Java work out the type for you
        var item = new MenuItem("Grilled Steak",24.50,"Main Course");
        var item2 = new MenuItem("Milk Shake",5.50,"Beverage");
        var table = "Table 7";

         // A text block lets you write several lines of text easily
        var message = """
                Order for %s:
                Category: %s
                Item: %s
                Price: $%.2f
                Category: %s
                Item: %s
                Price: $%.2f
                """.formatted(table,item.category,item.name,item.price,item2.category,item2.name,item2.price);


        System.out.println(message);
        System.out.println(item); // a record prints itself neatly
        System.out.println(item2); // a record prints itself neatly

     }

}
