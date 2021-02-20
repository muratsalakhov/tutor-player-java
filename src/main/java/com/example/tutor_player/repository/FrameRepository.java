package com.example.tutor_player.repository;

import com.example.tutor_player.model.Frame;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface FrameRepository extends Neo4jRepository<Frame, Long> {

    //@Query("MATCH (f:Frame)-[a:ACTION]->(g:Frame) RETURN f,a,g")
    @Query("MATCH (f:Frame) RETURN f")
    Collection<Frame> getAllFrames();

    Frame findByUuid(String uuid);
}
