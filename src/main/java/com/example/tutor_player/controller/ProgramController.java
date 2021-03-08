package com.example.tutor_player.controller;

import com.example.tutor_player.model.Program;
import com.example.tutor_player.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/neo4j/program")
public class ProgramController {

    @Autowired
    ProgramService programService;

    @GetMapping
    public Collection<Program> getAll() {
        return programService.getAll();
    }

    @GetMapping("/{uuid}")
    public Program getByUuid(@PathVariable String uuid) {
        return programService.getByUuid(uuid);
    }
}