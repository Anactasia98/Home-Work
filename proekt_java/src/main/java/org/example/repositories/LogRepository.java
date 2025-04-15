package org.example.repositories;

import org.example.model.Log;
import org.example.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogRepository {
    private static final String filePath = "main/resources/log.txt";

    public LogRepository() {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void create(Log log) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(log.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Log> getAll() {
        List<Log> logs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logs.add(Log.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logs;
    }
}
