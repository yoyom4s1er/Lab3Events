package ru.miit.lab3events;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Lab3Start {
    protected static Weld weld;
    protected static WeldContainer container;

    public static void main(String args[]) throws Exception {
        weld = new Weld();
        container = weld.initialize();

        try {
            Circle circle = container.instance().select(Circle.class).get();
            CirclePerimeter circlePerimeter = container.instance().select(CirclePerimeter.class).get();
            CircleSquare circleSquare = container.instance().select(CircleSquare.class).get();

            circle.setRadius(1);
            circle.setRadius(2);

            System.out.println(circle);
            System.out.println(circlePerimeter);
            System.out.println(circleSquare);
        } finally {
            weld.shutdown();
        }
    }
}
