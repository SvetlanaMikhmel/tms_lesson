package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.config.Benchmark;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Service
public class MainService {
    private final UserService userService;
    private final RacingService racingService;

    @Benchmark
    public void processRace() {
        racingService.getInfo();
        userService.choosePair();
        racingService.startRace();
    }
}
