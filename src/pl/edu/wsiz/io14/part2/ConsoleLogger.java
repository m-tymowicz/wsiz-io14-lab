package pl.edu.wsiz.io14.part2;

public class ConsoleLogger implements Logger {

    public void info(String message){
        System.out.printf("INFO : %s\n", message);
    }

    public void error(String message){
        System.out.printf("ERROR: %s\n", message);
    }
}
