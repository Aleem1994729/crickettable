package com.cricket.controller;

import com.cricket.model.Cricket;
import com.cricket.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Cricket/")
public class CricketController {

    private CricketService cricketService;

    @Autowired
    private void setCricketService(CricketService cricketService) {
        this.cricketService = cricketService;
    }

    @GetMapping ("/AllPlayers")
    @ResponseBody
    public List<Cricket> findAll() {
       return cricketService.findAll();
   }

    @PostMapping (value = "/SavePlayers", produces = "plain/text")
    public String savePlayer(@RequestBody Cricket player) {
        return String.valueOf(cricketService.savePlayer(player));
    }

    @PostMapping (value="/IsPlayerAvailable" ,produces = "plain/text")
    public String isPlayerAvailable(@RequestParam(value = "number") int playerNumber) {
        return String.valueOf(cricketService.isPlayerAvailable(playerNumber));
    }

    @PostMapping (value="/updatePlayers" ,produces = "plain/text")
    public String updatePlayer(@RequestParam(value = "number") int playerNumber, @RequestBody Cricket player) {
        return String.valueOf(cricketService.updatePlayer(playerNumber,player));
    }

    @PostMapping (value="/deletePlayer" ,produces = "plain/text")
    public String updatePlayer(@RequestParam(value = "number") int playerNumber) {
        return cricketService.deletePlayer(playerNumber);
    }

}