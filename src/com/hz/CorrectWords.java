package com.hz;

import java.util.Arrays;
import java.util.List;

public class CorrectWords {
    private List<String> rightWords;
    private ConsoleReader reader;
    CorrectWords(ConsoleReader reader) {
        this.reader = reader;
        this.rightWords = Arrays.asList("true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise");
    }

    public boolean isWordCorrect() {
        String input = this.reader.readLine();

        return rightWords.contains(input);
    }
}
