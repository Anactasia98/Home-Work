package org.example.services;

import org.example.model.Contact;
import org.example.model.Log;
import org.example.repositories.IdGeneratorRepository;
import org.example.repositories.LogRepository;

import java.util.List;

public class Logger {
    private final LogRepository logRepository;

    private final IdGeneratorRepository idGeneratorRepository;

    public Logger() {
        this.idGeneratorRepository = new IdGeneratorRepository();
        this.logRepository = new LogRepository();
    }

    public void create(String message) {
        Log log = new Log(idGeneratorRepository.getNextLogId(), message);
        logRepository.create(log);
    }

    public List<Log> getAll() {
        return logRepository.getAll();
    }

}
