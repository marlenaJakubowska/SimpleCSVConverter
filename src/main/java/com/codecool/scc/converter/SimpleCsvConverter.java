package com.codecool.scc.converter;

import com.codecool.scc.filereader.FileReader;
import com.codecool.scc.format.FormatType;
import com.codecool.scc.format.OutputFormatter;
import com.codecool.scc.format.OutputFormatterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleCsvConverter {

    private final FileReader fileReader;

    @Autowired
    public SimpleCsvConverter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void convert(FormatType format) {
        OutputFormatter outputFormatter = new OutputFormatterFactory().createByFormat(format);
        outputFormatter.setFileReader(fileReader);
        outputFormatter.printToConsole();
    }
}
