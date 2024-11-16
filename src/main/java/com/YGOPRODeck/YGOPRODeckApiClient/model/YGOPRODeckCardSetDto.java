package com.YGOPRODeck.YGOPRODeckApiClient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class YGOPRODeckCardSetDto implements Serializable {
    @JsonProperty("set_name")
    private String setName;
    @JsonProperty("set_code")
    private String setCode;
    @JsonProperty("set_rarity")
    private String setRarity;
    @JsonProperty("set_rarity_code")
    private String setRarityCode;
}
