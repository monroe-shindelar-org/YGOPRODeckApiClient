package com.YGOPRODeck.YGOPRODeckApiClient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class YGOPRODeckCardDto implements Serializable {
    private int id;
    private String name;
    private String type;
    private String humanReadableCardType;
    private String frameType;
    @JsonProperty("desc")
    private String description;
    @JsonProperty("atk")
    private int attack;
    @JsonProperty("def")
    private int defense;
    private int level;
    private String race;
    private String archetype;
    private Attribute attribute;
    private int scale;
    @JsonProperty("linkval")
    private int linkValue;
    @JsonProperty("card_sets")
    private List<YGOPRODeckCardSetDto> cardSets;
    @JsonProperty("card_images")
    private List<CardImageDto> cardImages;
    @JsonProperty("misc_info")
    private List<MiscCardInfoDto> miscInfo;
}
