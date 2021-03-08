package com.example.tutor_player.controller;

import com.example.tutor_player.model.Action;
import com.example.tutor_player.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/neo4j/action")
public class ActionController {

    @Autowired
    ActionService actionService;

    @GetMapping("/{uuid}")
    public Action getByUuid(@PathVariable String uuid) {
        return actionService.getByUuid(uuid);
    }
}
