package pl.edu.wsiz.io14.part2;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
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
        this.writer.printf("[%s] INFO : %s\n", getCurrentDateTimeString(), message);
    }

    public void error(String message) {
        this.writer.printf("[%s] ERROR: %s\n", getCurrentDateTimeString(), message);
    }

    private String getCurrentDateTimeString() {
        return simpleDateFormat.format(new Date());
    }
}
