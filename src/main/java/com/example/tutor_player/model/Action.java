package com.example.tutor_player.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;

@Data
@RequiredArgsConstructor
@Node("Action")
public class Action {
    @Id @GeneratedValue private Long id;
    @Property private String uuid;
    @Property private String prevFrameId;
    @Property private String nextFrameId;
    @Property private String actionType;
    @Property private List<String> pictures;
    @Property private Double xLeft;
    @Property private Double yLeft;
    @Property private Double xRight;
    @Property private Double yRight;
    @Property private Integer key;
    @Property private Double xLeftStart;
    @Property private Double yLeftStart;
    @Property private Double xRightStart;
    @Property private Double yRightStart;
    @Property private Double xLeftEnd;
    @Property private Double yLeftEnd;
    @Property private Double xRightEnd;
    @Property private Double yRightEnd;
    @Property private Integer ticks;
    @Property private List<Double> dragX;
    @Property private List<Double> dragY;
}
