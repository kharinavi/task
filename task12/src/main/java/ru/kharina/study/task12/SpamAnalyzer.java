package ru.kharina.study.task12;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }
}
