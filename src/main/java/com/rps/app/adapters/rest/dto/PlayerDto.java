package com.rps.app.adapters.rest.dto;

import com.rps.app.core.model.Player;
import lombok.Value;

@Value
public class PlayerDto {

  String name;
  Long gamesPlayed;

  public Player toDomain() {
    return Player
        .builder()
        .name(name)
        .gamesPlayed(gamesPlayed)
        .build();
  }
}