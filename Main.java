import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el cálculo que deseas realizar:");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Calcular área y perímetro");
            System.out.println("4. Salir del programa");
            int calculationChoice = scanner.nextInt();

            if (calculationChoice == 4) {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.println("Selecciona la figura que desees:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            int shapeChoice = scanner.nextInt();

            switch (shapeChoice) {
                case 1:
                    System.out.println("Favor de ingresar el radio del círculo:");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    if (calculationChoice == 1 || calculationChoice == 3) {
                        System.out.println("Área del círculo: " + circle.getArea());
                    }
                    if (calculationChoice == 2 || calculationChoice == 3) {
                        System.out.println("Perímetro del círculo: " + circle.getPerimeter());
                    }
                    break;
                case 2:
                    System.out.println("Favor de ingresar la longitud de los tres lados del triángulo:");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    if (calculationChoice == 1 || calculationChoice == 3) {
                        System.out.println("Área del triángulo: " + triangle.getArea());
                    }
                    if (calculationChoice == 2 || calculationChoice == 3) {
                        System.out.println("Perímetro del triángulo: " + triangle.getPerimeter());
                    }
                    break;
                case 3:
                    System.out.println("Favor de ingresar la longitud del lado del cuadrado:");
                    double squareSide = scanner.nextDouble();
                    Square square = new Square(squareSide);
                    if (calculationChoice == 1 || calculationChoice == 3) {
                        System.out.println("Área del cuadrado: " + square.getArea());
                    }
                    if (calculationChoice == 2 || calculationChoice == 3) {
                        System.out.println("Perímetro del cuadrado: " + square.getPerimeter());
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}