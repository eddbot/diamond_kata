package com.murismo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DiamondCreator {
    private final char letter;
    private final int lineLength;

    public DiamondCreator(char letter) {
        if(!Character.isAlphabetic(letter)){
            throw new RuntimeException("not a letter!");
        }
        this.letter = Character.toUpperCase(letter);
        this.lineLength = calculateInitialPadding() * 2 + 1;
    }

    public String create() {
        return String.join("\n", build());
    }

    private List<String> build(){
        int currentLetter = 'A';
        int padding = calculateInitialPadding();
        List<String> answer = new ArrayList<>();
        Stack<String> bottomOfDiamond = new Stack<>();

        while(currentLetter <= letter){

            String line = lineBuilder((char) currentLetter, padding);
            answer.add(line);
            if(currentLetter != letter){
                bottomOfDiamond.push(line);
            }
            currentLetter++;
            padding--;
        }

        while(!bottomOfDiamond.isEmpty()){
            answer.add(bottomOfDiamond.pop());
        }
        return answer;
    }

    private int calculateInitialPadding(){
        return letter - 65;
    }

    private String lineBuilder(char letter, int padding){
        char[] line = new char[lineLength];

        Arrays.fill(line, ' ');

        line[padding] = letter;
        line[(lineLength-1) - padding] = letter;

        return new String(line);
    }
}
