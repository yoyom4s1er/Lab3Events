package ru.miit.lab3events;

import ru.miit.lab3events.annotation.RadiusChanged;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;

@Singleton
public class CircleSquare {

    private double square;

    private void onRadiusChanged(@Observes @RadiusChanged Float radius){
        square = Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "CircleSquare{" +
                "square=" + square +
                '}';
    }
}
