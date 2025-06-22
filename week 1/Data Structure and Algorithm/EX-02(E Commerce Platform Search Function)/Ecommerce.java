import java.util.*;

class SearchProduct {
    int productId;
    String productName;
    String category;

    public SearchProduct(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " | " + productName + " | " + category;
    }
}

public class Ecommerce {

    static SearchProduct linearSearch(SearchProduct[] products, String name) {
        for (SearchProduct p : products) {
            if (p.productName.equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    static SearchProduct binarySearch(SearchProduct[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SearchProduct[] items = {
                new SearchProduct(11, "Notebook", "Stationery"),
                new SearchProduct(7, "Earbuds", "Electronics"),
                new SearchProduct(19, "Charger", "Accessories"),
                new SearchProduct(3, "Desk Lamp", "Home"),
                new SearchProduct(25, "Backpack", "Travel")
        };

        Arrays.sort(items, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.print("Enter product name to search: ");
        String query = sc.nextLine();

        System.out.println("\nLinear Search Result:");
        SearchProduct result1 = linearSearch(items, query);
        System.out.println(result1 != null ? result1 : "Product not found.");

        System.out.println("\nBinary Search Result:");
        SearchProduct result2 = binarySearch(items, query);
        System.out.println(result2 != null ? result2 : "Product not found.");

        sc.close();
    }
}
