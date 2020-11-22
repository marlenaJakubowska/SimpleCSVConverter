package com.codecool.scc.format;

public class XmlOutputFormatter extends OutputFormatter{

    @Override
    void addWordsToStringBuilder(StringBuilder stringBuilder, String[] words) {

        stringBuilder.append("<");
        for (int i= 0; i < words.length; i++) {
            if (words[i].equals("")) {
                continue;
            }
            stringBuilder.append(i + 1);
            stringBuilder.append("=");
            stringBuilder.append('"');
            stringBuilder.append(words[i].replace(" ", ""));
            stringBuilder.append('"');
            if (i != words.length - 1) {
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append("/>");

    }
}
