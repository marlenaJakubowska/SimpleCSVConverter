package com.codecool.scc.format;

public class JsonOutputFormatter extends OutputFormatter{

    @Override
    void addWordsToStringBuilder(StringBuilder stringBuilder, String[] words) {

        stringBuilder.append("{");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                continue;
            }
            stringBuilder.append('"');
            stringBuilder.append(words[i]);
            stringBuilder.append('"');
            if (i != words.length - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("}");

    }
}
