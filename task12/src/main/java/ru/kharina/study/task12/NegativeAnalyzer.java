package ru.kharina.study.task12;

public class NegativeAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private final String[] keywords = {":(", "=(", ":|"};

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }
}
