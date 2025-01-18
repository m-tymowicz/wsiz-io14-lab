package pl.edu.wsiz.io14.part2;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileLogger {

    private PrintWriter writer;

    public FileLogger(String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName, true);
            this.writer = new PrintWriter(fileStream, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void info(String message) {
        this.writer.printf("INFO : %s\n", message);
    }

    public void error(String message) {
        this.writer.printf("ERROR: %s\n", message);
    }
}
