package com.example.michaelchheang.mathfortoys;
import java.util.Random;

// Created by Nicholas Tran

public class QuestionLibrary {

    private int sign;
    private int answer;
    private int choice1;
    private int choice2;
    private int choice3;
    private int choice4;
    Random random = new Random();

    public String getKQuestion() {
        int x = random.nextInt(6);
        int y = random.nextInt(6);
        int z = random.nextInt(2);
        sign = z;
        answer = (z == 0) ? x + y : x - y;
        return (z == 0) ? x + " + " + y : x + " - " + y;
    }

    public int getChoice1() {
        choice1 = answer;
        return (choice1);
    }

    public int getChoice2() {
        choice2 = getChoice1() + random.nextInt(3);
        while (choice2 == choice1)
            choice2 = getChoice1() + random.nextInt(3);
        return (choice2);
    }

    public int getChoice3() {
        choice3 = getChoice2() + random.nextInt(3);
        while ((choice3 == choice2) || (choice3 == choice1))
            choice3 = getChoice2() + random.nextInt(3);
        return (choice3);
    }

    public int getChoice4() {
        choice4 = getChoice3() + random.nextInt(3);
        while ((choice4 == choice3) || (choice4 == choice2) || (choice4 == choice1))
            choice4 = getChoice2() + random.nextInt(3);
        return (choice4);
    }

    public int getAnswer(){
        return answer;
    }
}

