package com.example.tutor_player.model;

import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Set;

@Data
@RequiredArgsConstructor
@Node("Program")
public class Program {

    @Id @GeneratedValue private Long id;
    @Property private String uuid;
    private String firstFrameId;
    private String name;
    private Double dragDelta;
    private Integer pictureHeight;
    private Integer pictureWidth;

    @Relationship(type = "CONTAINS")
    public Set<Frame> frames;

}
