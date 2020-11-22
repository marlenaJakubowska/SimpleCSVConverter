package com.codecool.scc.format;

public class TableOutputFormatter extends OutputFormatter{

    @Override
    void addWordsToStringBuilder(StringBuilder stringBuilder, String[] words) {
        int rowSize = 20;
        for (String word : words) {
            stringBuilder.append(" ");
            int blanks = rowSize - word.length();
            stringBuilder.append(word);
            stringBuilder.append(" ".repeat(Math.max(0, blanks)));
            stringBuilder.append("||");
        }
    }
}
