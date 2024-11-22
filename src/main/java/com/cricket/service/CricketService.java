package com.cricket.service;

import com.cricket.model.Cricket;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CricketService  {

    boolean savePlayer(Cricket player);

    boolean isPlayerAvailable(int playerNumber);

    List<Cricket> findAll();

    boolean updatePlayer(int playerNumber, Cricket player);

    String deletePlayer(int playerNumber);
}
