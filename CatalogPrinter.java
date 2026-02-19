import java.util.List;

public class CatalogPrinter {

    public static void printCatalog(List<Content> catalog) {
        System.out.println("========== EduLearn Catalog ==========\n");

        for (int i = 0; i < catalog.size(); i++) {
            Content item = catalog.get(i);

            System.out.println((i + 1) + ". " + item.getName());
            item.showDetails("   ");  // indent for hierarchy
            System.out.println();
        }

        System.out.println("=====================================");
    }
}