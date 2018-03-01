package com.example.michaelchheang.mathfortoys;

import java.util.Random;
import java.util.ArrayList;

public class QuestionLibrary {

    private int sign;
    private int answer;
    private Random random = new Random();
    private ArrayList<Integer> num = new ArrayList<>();

    public String getKQuestion() {
        num.clear();
        int x = random.nextInt(6);
        int y = random.nextInt(6);
        int z = random.nextInt(2);
        sign = z;
        answer = (z == 0) ? x + y : x - y;
        int n;
        num.add(answer);
        while (num.size() < 4){
            n = ((answer + random.nextInt(200)) % 11);
            if (!num.contains(n)) {
                num.add(n);
            }
        }
        return (z == 0) ? x + " + " + y : x + " - " + y;
    }

    public int getChoice(int k) {
        return (num.get(k));
    }
    public int getAnswer(){
        return answer;
    }
}
