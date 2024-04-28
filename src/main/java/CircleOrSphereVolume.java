import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CircleOrSphereVolume{

  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("input.txt"));
    PrintWriter writer = new PrintWriter("Resutl.txt");

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] parts = line.split(" ");
      if (parts.length == 2) {
        String shape = parts[0];
        double radius = Double.parseDouble(parts[1]);
        double volume = 0;

        if (shape.equalsIgnoreCase("circle")) {
          volume = circleVolume(radius);
        } else if (shape.equalsIgnoreCase("sphere")) {
          volume = sphereVolume(radius);
        }

        writer.printf("The volume of a %s with radius %.2f is %.2f.\n", shape, radius, volume);

      }
    }

    scanner.close();
    writer.close();
  }

  public static double circleVolume(double radius) {
    return Math.PI * radius * radius;
  }

  public static double sphereVolume(double radius) {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}
