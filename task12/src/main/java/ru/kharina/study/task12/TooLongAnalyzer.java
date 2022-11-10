package ru.kharina.study.task12;

class TooLongAnalyzer implements TextAnalyzer {
    private int max;

    public TooLongAnalyzer(int max) {
        this.max = max;
    }

    @Override
    public Label processText(String text) {
        Label result = Label.OK;
        if (text.length() > max)
            result =  Label.TOO_LONG;
        return result;
    }
}
