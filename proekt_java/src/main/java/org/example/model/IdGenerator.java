package org.example.model;

public class IdGenerator {
    private final int id = 1;
    private int contactId = 1;
    private int logId = 1;
    private int userId = 1;

    private IdGenerator(int contactId, int logId, int userId) {
        this.contactId = contactId;
        this.logId = logId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public IdGenerator() {
    }

    public int getContactId() {
        return contactId;
    }

    public void incrementContactId() {
        contactId++;
    }

    public int getLogId() {
        return logId;
    }

    public void incrementLogId() {
        logId++;
    }

    public int getUserId() {
        return userId;
    }

    public void incrementUserId() {
        userId++;
    }

    @Override
    public String toString() {
        return contactId + "," + logId + "," + userId;
    }

    public static IdGenerator fromString(String line) {
        String[] parts = line.split(",");
        return new IdGenerator(
                Integer.parseInt(parts[0]),
                Integer.parseInt(parts[1]),
                Integer.parseInt(parts[2])
        );
    }
}

