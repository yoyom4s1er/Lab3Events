package ru.miit.lab3events;

import ru.miit.lab3events.annotation.RadiusChanged;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;

@Singleton
public class CirclePerimeter {

    private double perimeter;

    private void onRadiusChanged(@Observes @RadiusChanged Float radius) {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CirclePerimeter{" +
                "perimeter=" + perimeter +
                '}';
    }
}
