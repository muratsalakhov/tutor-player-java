package com.example.tutor_player.service;

import com.example.tutor_player.model.Frame;
import com.example.tutor_player.repository.FrameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FrameService {

    @Autowired
    FrameRepository frameRepository;

    public Collection<Frame> getAll() {
        return frameRepository.getAllFrames();
    }
}
