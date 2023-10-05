package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.domain.User;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@AllArgsConstructor
@Data
@Service
public class UserService {
    private User user;

    public int choosePair() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер пары  от 1 до 3 для совершения ставки");
        int numberPair = scanner.nextInt();
        return numberPair;
    }


}
