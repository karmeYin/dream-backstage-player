package com.orginaldream.backstage.player.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {
  @PostMapping("/{name}")
  public Map<String,String> createPlayer(@PathVariable String name){
    HashMap<String, String> stringStringHashMap = new HashMap<>();
    stringStringHashMap.put("createPlayer","success");
    return stringStringHashMap;
  }
}
