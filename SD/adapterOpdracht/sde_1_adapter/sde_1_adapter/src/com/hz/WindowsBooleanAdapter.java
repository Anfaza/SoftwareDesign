package com.hz;

public class WindowsBooleanAdapter implements BooleandAdapter {
    private ConsoleReader adaptee;
    private String[] goodAnswers;

    public WindowsBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;
        this.goodAnswers = new String[]{"true", "yes",
                "oh yeah", "great",
                "sure", "love to",
                "of course", "always",
                "never done otherwise"
        };

    }

    @Override
    public Boolean readLineBoolean() {
        String line = this.adaptee.readLine();
        for (String goodAnswer : this.goodAnswers) {

            if (line.equals(goodAnswer)) {
                return true;
            }


        }
        return false;
    }
}
