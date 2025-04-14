package org.example.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    private int id;
    private String message;
    private String date;

    public Log(int id, String message) {
        this.id = id;
        this.message = message;
        this.date = dateFormat.format(new Date());
    }

    private Log(int id,
                String message,
                String date) {
        this.id = id;
        this.message = message;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + "," + message + "," + date;
    }

    public static Log fromString(String line) {
        String[] parts = line.split(",");
        return new Log(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2]
        );
    }
}