package ru.kharina.study.task12;

public abstract class KeywordAnalyzer {
    protected abstract Label getLabel();

    protected abstract String[] getKeywords();

    public Label processText(String text) {
        Label result = Label.OK;
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                result = getLabel();
            }
        }
        return result;
    }
}
