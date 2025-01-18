package pl.edu.wsiz.io14.part2;

public class MultiLogger implements Logger {
    private final Logger[] loggers;

    public MultiLogger(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void info(String message) {
        for (Logger logger : loggers) {
            logger.info(message);
        }
    }

    public void error(String message) {
        for (Logger logger : loggers) {
            logger.error(message);
        }
    }
}
