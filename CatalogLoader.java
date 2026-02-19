import java.io.*;
import java.util.*;

public class CatalogLoader {

    public static List<Content> loadFromFile(String filename) {

        List<Content> catalog = new ArrayList<>();
        Map<String, Course> courseMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            Course currentCourse = null;
            Module currentModule = null;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.isEmpty() || line.startsWith("#"))
                    continue;

                // ----------- COURSE START -----------
                if (line.startsWith("COURSE:")) {

                    String data = line.substring(7);
                    String[] parts = data.split(",");

                    String name = parts[0];

                    currentCourse = new Course(name);
                }

                // ----------- LESSON -----------
                else if (line.startsWith("LESSON:")) {

                    String data = line.substring(7);
                    String[] parts = data.split(",");

                    String name = parts[0];
                    double duration = Double.parseDouble(parts[1]);
                    double price= Double.parseDouble(parts[2]);
                    Lesson lesson = new Lesson(name, duration,price);
                    currentCourse.addlesson(lesson);
                }

                // ----------- COURSE END -----------
                else if (line.equals("ENDCOURSE")) {

                    courseMap.put(currentCourse.getName(), currentCourse);
                    catalog.add(currentCourse); // standalone course
                    currentCourse = null;
                }

                // ----------- MODULE START -----------
                else if (line.startsWith("MODULE:")) {

                    String name = line.substring(7);
                    currentModule = new Module(name);
                }

                // ----------- ADD COURSE TO MODULE -----------
                else if (line.startsWith("ADDCOURSE:")) {

                    String courseName = line.substring(10);

                    Course course = courseMap.get(courseName);

                    if (course != null) {
                        currentModule.addCourse(course);
                    } else {
                        System.out.println("Course not found: " + courseName);
                    }
                }

                // ----------- MODULE END -----------
                else if (line.equals("ENDMODULE")) {

                    catalog.add(currentModule);
                    currentModule = null;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return catalog;
    }

    public static void main(String[] args) {

        // Load catalog from file
        List<Content> catalog = CatalogLoader.loadFromFile("catalog.txt");

        // Print catalog
        CatalogPrinter.printCatalog(catalog);
    }

}




