/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetprogrammeren.gameprojectrestapi.controller;

import domain.Game;
import domain.ServiceFacade;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tim
 */
@CrossOrigin
@RestController
@RequestMapping("/gameapi")
public class GameProjectRestController{
    @Autowired
    public ServiceFacade service;
    
   @CrossOrigin
   @RequestMapping(method=RequestMethod.POST,  consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addGameRest(@RequestBody Game game){
        service.addGame(game);
    }
    
    @CrossOrigin
    @RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public Collection<Game> getGamesRest(){
        return service.getAllGames();
    }
    
    @CrossOrigin
    @RequestMapping(value="/delete/{id}",method=RequestMethod.POST)
    public void deleteGame(@PathVariable int id){
        service.removeGame(service.getGame(id));
    }
    
    @CrossOrigin
    @RequestMapping(value="/update", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
    public void updateGame(@RequestBody Game game){
        service.updateGame(game);
    }
}
