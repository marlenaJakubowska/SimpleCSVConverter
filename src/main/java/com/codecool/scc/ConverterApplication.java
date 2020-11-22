package com.codecool.scc;

import com.codecool.scc.converter.SimpleCsvConverter;
import com.codecool.scc.filereader.FileReader;
import com.codecool.scc.format.FormatType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.File;

public class ConverterApplication {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("File name needed");
            return;
        }

        Config.setPath(args[0]);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        File file = (File) ctx.getBean("file");
        FileReader fileReader = (FileReader) ctx.getBean("fileReader");
        fileReader.setFile(file);
        SimpleCsvConverter simpleCsvConverter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter", fileReader);
        if (args.length == 1) {
            simpleCsvConverter.convert(FormatType.TABLE);
            return;
        }

        simpleCsvConverter.convert(FormatType.valueOf(args[1].toUpperCase()));

    }

}
