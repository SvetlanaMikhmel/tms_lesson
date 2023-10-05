package org.example.domain;

import lombok.Data;

@Data
public class Pair {
    private Horse horse;
    private Rider rider;
    private Integer speed;

    public Pair(Horse horse, Rider rider) {
        this.horse = horse;
        this.rider = rider;
        this.speed = (int) (Math.random() * 50) + 50;
    }

}
