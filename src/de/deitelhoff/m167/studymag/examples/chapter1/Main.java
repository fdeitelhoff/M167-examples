package de.deitelhoff.m167.studymag.examples.chapter1;

public class Main {

    public static void main(String[] args) {
	    Rectangle rectangle = new Rectangle(100, 150);
        Circle circle = new Circle(5);

        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());

        Transportable table = new Table();

        System.out.println(table.weight());
        System.out.println(table.isWeightExceeded());

        Transportable anonymous = new Transportable() {
            @Override
            public float weight() {
                return 123;
            }

            @Override
            public float length() {
                return 0;
            }

            @Override
            public float width() {
                return 0;
            }

            @Override
            public float height() {
                return 0;
            }
        };

        System.out.println(anonymous.weight());
    }
}
