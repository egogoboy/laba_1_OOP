import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static Figure getFigure(Scanner in) {
        Figure result = new Square(0, 0, 0);
        Boolean exit = false;
        while (!exit) {

            System.out.print("Enter type of figure:\n"
                           + "1 - square\n"
                           + "2 - circle\n"
                           + "3 - triangle\n> ");
            int choise = in.nextInt();
            System.out.print("Enter coordinates of center: ");
            double x = in.nextDouble();
            double y = in.nextDouble();

            switch (choise) {
                case 1, 3: {
                    System.out.print("Enter size of side: ");
                    double side_size = in.nextDouble();
                    if (choise == 1)
                        result =(new Square(x, y, side_size));
                    else 
                        result = new Triangle(x, y, side_size);
                    exit = true;
                    break;
                }
                case 2: {
                    System.out.print("Enter radius: ");
                    double radius = in.nextDouble();
                    result = (new Square(x, y, radius));
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Unknow figure type");
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number of figures: ");
            int n = in.nextInt();
            
            LinkedList<Figure> figures = new LinkedList<>();
            for (int i = 0; i < n; ++i) {
                System.out.print("Enter type of figure:\n"
                               + "1 - square\n"
                               + "2 - circle\n"
                               + "3 - triangle\n> ");
                int choise = in.nextInt();
                System.out.print("Enter coordinates of center: ");
                double x = in.nextDouble();
                double y = in.nextDouble();

                switch (choise) {
                    case 1, 3: {
                        System.out.print("Enter size of side: ");
                        double side_size = in.nextDouble();
                        figures.add(new Square(x, y, side_size));
                        break;
                    }
                    case 2: {
                        System.out.print("Enter radius: ");
                        double radius = in.nextDouble();
                        figures.add(new Square(x, y, radius));
                        break;
                    }
                    default: {
                        System.out.println("Unknow figure type");
                        --i;
                    }
                }
            }

            Boolean exit = false;
            while (!exit) {
                System.out.print("Enter option:\n"
                               + "1 - print all squares\n"
                               + "2 - print all data\n"
                               + "3 - print all distances to origin\n"
                               + "4 - print distance between two figures\n"
                               + "5 - exit\n> ");
                int choise = in.nextInt();

                switch (choise) {
                    case 1: {
                        for (Figure figure : figures) {
                            System.out.println("Square: " + figure.countSquare());
                        }  
                    }
                    case 2: {
                        for (Figure figure : figures) {
                            if (figure instanceof Square) {
                                System.out.println("Figure type: square");
                            } else if (figure instanceof Circle) {
                                System.out.println("Figure type: circle");
                            } else if (figure instanceof Triangle) {
                                System.out.println("Figure type: triangle");
                            }

                            System.out.println("Coordinates: " + figure.getX() + " " + figure.getY());
                        }
                    }
                    case 3: {
                        for (Figure figure : figures) {
                            System.out.println(figure.distanceToOrigin());
                        }
                    }
                    case 4: {
                        Figure first = getFigure(in);
                        Figure second = getFigure(in);
                        
                        System.out.println("Distance: " + Figure.getDistanceFromTo(first, second));
                    }
                    case 5: {
                        exit = true;
                    }
                }
            }
        }
    }
}
