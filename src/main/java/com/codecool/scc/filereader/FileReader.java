package com.codecool.scc.filereader;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Component("fileReader")
public class FileReader {

    BufferedReader bufferedReader;
    File file;

    public void setFile(File file) {
        this.file = file;

        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String nextLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "an error occurred";
        }
    }
}
