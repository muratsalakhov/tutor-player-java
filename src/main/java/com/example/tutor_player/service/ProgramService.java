package com.example.tutor_player.service;

import com.example.tutor_player.model.Program;
import com.example.tutor_player.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProgramService {

    @Autowired
    ProgramRepository programRepository;

    public Collection<Program> getAll() {
        return programRepository.getAllPrograms();
    }

    public Program getByUuid(String uuid) {
        return programRepository.findByUuid(uuid);
    }
}