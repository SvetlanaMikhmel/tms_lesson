package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.domain.Pair;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
@Service
public class RacingService {
    private List<Pair> pairs;


    public void getInfo() {
        int number = 0;
        while (number < pairs.size()) {
            System.out.println("Номер пары: " + pairs.get(number));
            number++;
        }
    }


    public void startRace() {
        for (int lap = 0; lap < 5; lap++) {
            System.out.println("Круг: " + (lap + 1));
            for (Pair pair : pairs) {
                int speed = pair.getSpeed();
                if (lap % 2 == 0) {
                    speed += (int) (Math.random() * 3) + 1;
                }
                System.out.println(pair.getRider().getName() + " и " + pair.getHorse().getName() + " - " + speed);
            }
        }
        Pair winner = getWinner();
        System.out.println("Гонка окончена! Победитель - " + winner.getRider().getName() + " и " + winner.getHorse().getName());
    }

    private Pair getWinner() {
        Pair winner = pairs.get(0);
        for (Pair pair : pairs) {
            if (pair.getSpeed() > winner.getSpeed()) {
                winner = pair;
            }
        }
        return winner;
    }
}
