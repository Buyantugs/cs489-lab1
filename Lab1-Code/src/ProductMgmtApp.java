import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

public class ProductMgmtApp {
    public static void main(String[] args) {

        Product [] productArray =new Product[3];

        Product product1=new Product("3128874119", "Banana", new Date(2023 - 1900, 0, 24),124,0.55);
        Product product2=new Product("2927458265", "Apple", new Date(2023 - 1900, 0, 24),18,1.09);
        Product product3=new Product("9189927460", "Carrot", new Date(2023 - 1900, 0, 24),89,2.99);
        productArray[0]=product1;
        productArray[1]=product2;
        productArray[2]=product3;

        printProducts(productArray);
    }

    public static void printProducts(Product[] list){

        // Sorting the array by product name
        Arrays.sort(list, Comparator.comparing(Product::getProductName));

        // Print JSON-formatted list of all Products
        printJsonProducts(list);

        // Print XML-formatted list of all Products
        printXmlProducts(list);

        // Print Comma-Separated Values (CSV)-formatted list of all Products
        printCsvProducts(list);
    }

    private static void printJsonProducts(Product[] products) {
        System.out.println("JSON-formatted list of all Products:");
        System.out.println("[");
        for (Product product : products) {
            System.out.println("  " + productToJson(product) + ",");
        }
        System.out.println("]");
    }

    private static String productToJson(Product product) {
        return "{\"productID\": \"" + product.getProductId() + "\", \"productName\": \"" + product.getProductName() + "\", \"dateSupplied\": \"" + product.getDateSupplied() + "\", \"qtyInStock\": " + product.getQtyInStock() + ", \"unitPrice\": " + product.getUnitPrice() + "}";
    }

    private static void printXmlProducts(Product[] products) {
        System.out.println("\nXML-formatted list of all Products:");
        System.out.println("<products>");
        for (Product product : products) {
            System.out.println("  <product>"+"<productId>" + product.getProductId() + "</productID>"+"<productName>" + product.getProductName() + "</productName>"+"<dateSupplied>" + product.getDateSupplied() + "</dateSupplied>"+"<qtyInStock>" + product.getQtyInStock() + "</qtyInStock>"+"<unitPrice>" + product.getUnitPrice() + "</unitPrice>"+"</product>");
        }
        System.out.println("</products>");
    }

    private static void printCsvProducts(Product[] products) {
        System.out.println("\nComma-Separated Values (CSV)-formatted list of all Products:");
        System.out.println("productID,productName,dateSupplied,qtyInStock,unitPrice");
        for (Product product : products) {
            System.out.println(product.getProductId() + "," + product.getProductName() + "," + product.getDateSupplied() + "," + product.getQtyInStock() + "," + product.getUnitPrice());
        }
    }
}