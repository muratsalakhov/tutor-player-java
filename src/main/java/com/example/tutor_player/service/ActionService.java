package com.example.tutor_player.service;

import com.example.tutor_player.model.Action;
import com.example.tutor_player.model.Frame;
import com.example.tutor_player.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class ActionService {

    @Autowired
    ActionRepository actionRepository;

    public Collection<Action> getAll() {
        return actionRepository.getAllActions();
    }

    public Action getByUuid(String uuid) {
        return actionRepository.findByUuid(uuid);
    }
}