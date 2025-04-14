package org.example.repositories;

import org.example.model.IdGenerator;
import org.example.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IdGeneratorRepository {
    private static final String path = "main/resources/id_generator.txt";

    public IdGeneratorRepository() {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void initDefault() {
        IdGenerator idGenerator = new IdGenerator();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(idGenerator.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNextContactId() {
        File file = new File(path);
        if (file.length() == 0) {
            initDefault();
        }
        IdGenerator last = getAll().getLast();
        int contactId = last.getContactId();
        last.incrementContactId();
        update(last);
        return contactId;
    }

    public int getNextUserId() {
        File file = new File(path);
        if (file.length() == 0) {
            initDefault();
        }
        IdGenerator last = getAll().getLast();
        int userId = last.getUserId();
        last.incrementUserId();
        update(last);
        return userId;
    }

    public int getNextLogId() {
        File file = new File(path);
        if (file.length() == 0) {
            initDefault();
        }
        IdGenerator last = getAll().getLast();
        int logId = last.getLogId();
        last.incrementLogId();
        update(last);
        return logId;
    }

    private List<IdGenerator> getAll() {
        List<IdGenerator> idGenerators = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                idGenerators.add(IdGenerator.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return idGenerators;
    }

    public void update(IdGenerator updatedIdGenerator) {
        List<IdGenerator> idGenerators = getAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (IdGenerator idGenerator : idGenerators) {
                if (idGenerator.getId() == updatedIdGenerator.getId()) {
                    writer.write(updatedIdGenerator.toString());
                } else {
                    writer.write(idGenerator.toString());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
