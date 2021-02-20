package com.example.tutor_player.model;

import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Set;

@Data
@Getter
@Setter
@Node("Program")
public class Program {

    @Id @GeneratedValue private Long id;
    private String uuid;
    private String name;
    private Double dragDelta;
    private Integer pictureHeight;
    private Integer pictureWidth;

    @Relationship(type = "CONTAINS")
    public Set<Frame> frames;

    public Program() {}

    public Program(Long id, String uuid, String name, Double dragDelta, Integer pictureWidth, Integer pictureHeight) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.dragDelta = dragDelta;
        this.pictureHeight = pictureHeight;
        this.pictureWidth = pictureWidth;
    }
}
