package com.example.tutor_player.model;

import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;
import java.util.Set;

@Data
@Getter
@Setter
@Node("Frame")
public class Frame {

    @Id @GeneratedValue private Long id;
    private String uuid;
    private String taskText;
    private String hintText;
    private String pictureLink;

    @Relationship(type="ACTION")
    private Set<Action> actions;

    public Frame() {}

    public Frame(Long id, String uuid, String taskText, String hintText, String pictureLink) {
        this.id = id;
        this.uuid = uuid;
        this.taskText = taskText;
        this.hintText = hintText;
        this.pictureLink = pictureLink;
    }
}
