package com.example.tutor_player.repository;

import com.example.tutor_player.model.Program;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface ProgramRepository extends Neo4jRepository<Program, Long> {

    @Query("MATCH (p:Program)-[s:CONTAIN]->(f:Frame) RETURN p,s,f")
    List<Program> getAllPrograms();

    Program findByUuid(String uuid);
}