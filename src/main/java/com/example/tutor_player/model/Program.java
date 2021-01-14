package com.example.tutor_player.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Getter
@Setter
@NodeEntity
public class Program {

    @Id
    @GeneratedValue
    private Long id;
    private String identificator;
    private String title;
    private Double dragDelta;
    private Integer imageHeight;
    private Integer imageWidth;

    @Relationship(type="STARTS_WITH", direction=Relationship.Direction.OUTGOING)
    private Frame firstFrame;
}
