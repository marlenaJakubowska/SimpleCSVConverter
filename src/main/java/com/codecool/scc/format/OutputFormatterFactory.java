package com.codecool.scc.format;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(FormatType format) {

        switch(format){
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            default:
                return new TableOutputFormatter();
        }
    }
}
