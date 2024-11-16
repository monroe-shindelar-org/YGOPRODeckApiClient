package com.YGOPRODeck.YGOPRODeckApiClient;

import com.YGOPRODeck.YGOPRODeckApiClient.model.YGOPRODeckCardDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class YGOPRODeckApiClient {
    private static final String BASE_URL = "https://db.ygoprodeck.com/api/v7/cardinfo.php?misc=yes";

    public YGOPRODeckApiClient(HttpClient httpClient, ObjectMapper objectMapper) {
        this.client = httpClient;
        this.objectMapper = objectMapper;
    }
    private HttpClient client;
    private ObjectMapper objectMapper;

    public List<YGOPRODeckCardDto> getCards() throws IOException {
        HttpGet request = new HttpGet(BASE_URL);
        HttpResponse response = client.execute(request);
        String json = EntityUtils.toString(response.getEntity());
        JsonNode node = objectMapper.readTree(json);
        json = node.get("data").toString();

        return objectMapper.readValue(json, new TypeReference<List<YGOPRODeckCardDto>>() {});
    }
}
