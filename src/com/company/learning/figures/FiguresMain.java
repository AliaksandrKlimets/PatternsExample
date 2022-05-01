package com.company.learning.figures;

import java.util.Scanner;

public class FiguresMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        Figure[] figures = new Figure[scanner.nextInt()];

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Which figure you'd like to create? 1 - Square, 2 - Circle: ");
            figures[i] = createFigure(scanner.nextInt());
        }

        for (Figure figure : figures) {
            System.out.println("Perimetr of " + figure.getClass() + " " + figure.perimetr());
            System.out.println("Square of " + figure.getClass() + " " + figure.square());
        }

    }

    private static Figure createFigure(int i) {
        Scanner scanner = new Scanner(System.in);
        switch (i) {
            case 1:  {
                System.out.println("Enter side: ");
                return new Square(scanner.nextDouble());
            }
            case 2: {
                System.out.println("Enter radius");
                return new Circle(scanner.nextDouble());
            }
            default: return new Circle(0);
        }
    }
}
