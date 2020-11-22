package com.codecool.scc.format;

import com.codecool.scc.filereader.FileReader;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class OutputFormatter {

    FileReader fileReader;

    @Autowired
    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    abstract void addWordsToStringBuilder(StringBuilder stringBuilder, String[] words);

    public void printToConsole() {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while((line = fileReader.nextLine()) != null) {
            String[] words = line.split(",");
            addWordsToStringBuilder(stringBuilder, words);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
