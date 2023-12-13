package ru.miit.lab3events;

import ru.miit.lab3events.annotation.RadiusChanged;
import javax.inject.Inject;
import javax.enterprise.event.Event;

public class Circle {
    private float radius;

    @Inject @RadiusChanged
    private Event<Float> radiusChangedEvent;

    public void setRadius(float radius) {
        this.radius = radius;
        radiusChangedEvent.fire(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
