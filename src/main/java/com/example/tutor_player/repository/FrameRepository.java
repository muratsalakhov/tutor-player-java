package com.example.tutor_player.repository;

import com.example.tutor_player.model.Frame;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Set;

public interface FrameRepository extends Neo4jRepository<Frame, Long> {

    //@Query("MATCH (f:Frame)-[a:ACTION]->(g:Frame) RETURN f,a,g")
    @Query("MATCH (f:Frame) RETURN f")
    Collection<Frame> getAllFrames();

    @Query("MATCH(f:Frame)-[a:ACTION]->(d:Frame) WHERE f.uuid = $uuid RETURN f, collect(a), collect(d)")
    Set<Frame> findFramesByAction(String uuid);

    Frame findByUuid(String uuid);
}
