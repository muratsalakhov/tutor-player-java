package com.example.tutor_player.repository;

import com.example.tutor_player.model.Action;
import com.example.tutor_player.model.Frame;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Set;

public interface ActionRepository extends Neo4jRepository<Action, Long> {

    //@Query("MATCH (f:Frame)-[a:ACTION]->(d:Frame) WHERE a.uuid =~ $uuid RETURN f, collect(a), collect(d)")
    //Set<Action> findActionByFrame(String uuid);

    @Query("MATCH (a:Action) RETURN a")
    Collection<Action> getAllActions();

    Action findByUuid(String uuid);
}
