package com.cricket.service.impl;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.cricket.model.Cricket;
import com.cricket.repo.CricketRepository;
import com.cricket.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class CricketServiceImpl implements CricketService {

    @Autowired
    CricketRepository cricketRepository;

    @Override
    public boolean savePlayer(Cricket player) {
        try {
            cricketRepository.save(player);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean isPlayerAvailable(int playerNumber) {
        Optional<Cricket> player = cricketRepository.findById(playerNumber);
        return player.isPresent();
    }

    @Override
    public List<Cricket> findAll() {
        return cricketRepository.findAll();
    }

    @Override
    public boolean updatePlayer(int playerNumber, Cricket updatePlayer) {
        try {
            updatePlayer.setPlayerNumber(playerNumber);
            cricketRepository.save(updatePlayer);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String deletePlayer(int playerNumber) {
        if(isPlayerAvailable(playerNumber)){
            Cricket deletePlayer = cricketRepository.findById(playerNumber).get();
            cricketRepository.delete(deletePlayer);
            return "Player Deleted";
        }
        else{
            return "Player is not available in database to delete or it is deleted already";
        }
    }
}
