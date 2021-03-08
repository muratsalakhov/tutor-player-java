package com.example.tutor_player.service;

import com.example.tutor_player.model.Frame;
import com.example.tutor_player.model.Program;
import com.example.tutor_player.repository.FrameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class FrameService {

    @Autowired
    FrameRepository frameRepository;

    public Collection<Frame> getAll() {
        return frameRepository.getAllFrames();
    }

    public Set<Frame> getFramesByAction(String uuid) { return frameRepository.findFramesByAction(uuid); }

    public Frame getByUuid(String uuid) {
        return frameRepository.findByUuid(uuid);
    }
}
