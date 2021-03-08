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
@Node("Frame")
public class Frame {

    @Id @GeneratedValue private Long id;
    @Property private String uuid;
    private String taskText;
    private String hintText;
    private String pictureLink;

    @Relationship(type="PREV_FRAME")
    private Set<Action> switchData;

    //@Relationship(type="SWITCH_TO")
    //private Set<Frame> nextFrames;
}
