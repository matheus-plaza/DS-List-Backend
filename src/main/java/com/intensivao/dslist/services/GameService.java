package com.intensivao.dslist.services;

import com.intensivao.dslist.entities.Game;
import com.intensivao.dslist.entities.dto.GameMinDTO;
import com.intensivao.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
