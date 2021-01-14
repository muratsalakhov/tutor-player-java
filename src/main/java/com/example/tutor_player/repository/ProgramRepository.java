package com.example.tutor_player.repository;

import com.example.tutor_player.model.Program;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface ProgramRepository extends Neo4jRepository<Program, Long> {

    @Query("MATCH (p:Program)-[a]-(f) RETURN p,a,f")
    Collection<Program> getAllPrograms();
}