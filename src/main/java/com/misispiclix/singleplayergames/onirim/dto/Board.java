package com.misispiclix.singleplayergames.onirim.dto;

import com.misispiclix.singleplayergames.onirim.dto.card.Card;
import com.misispiclix.singleplayergames.onirim.dto.card.DoorCard;
import com.misispiclix.singleplayergames.onirim.dto.card.LabyrinthCard;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board {

    private List<Card> cardDeck;
    private List<Card> limboStack;
    private List<LabyrinthCard> playedCards;
    private List<Card> playerHand;
    private List<DoorCard> discoveredDoors;
    private List<Card> discardedCards;

    public Board() {
        this.cardDeck = new ArrayList<>();
        this.limboStack = new ArrayList<>();
        this.playedCards = new ArrayList<>();
        this.playerHand = new ArrayList<>();
        this.discoveredDoors = new ArrayList<>();
        this.discardedCards = new ArrayList<>();
    }

}
