package com.example.demo.service;

import com.example.demo.dto.SkypicerDTO;
import com.example.demo.dto.UserDataDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class SkypicerService {
    private UserDataDTO userData = new UserDataDTO();
//    private String skypicerAPI = "https://api.skypicker.com/flights?fly_from="+userData.getCountryFrom()+"&v=3&date_from="+userData.getStartDate()+"&date_to="+userData.getEndDate()+"&partner=picky&fly_to="+userData.getCountryTo();

    public SkypicerService(UserDataDTO data){
        this.userData = data;
    }

    public SkypicerDTO sendRequest(){
        String skypicerAPI = "https://api.skypicker.com/flights?fly_from="+userData.getCountryFrom()+"&v=3&date_from="+userData.getStartDate()+"&date_to="+userData.getEndDate()+"&partner=picky&fly_to="+userData.getCountryTo();
        SkypicerDTO dto = new SkypicerDTO();
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(skypicerAPI);
        String json = restTemplate.getForObject(skypicerAPI, String.class);

        System.out.println(json);
        ObjectMapper mapper = new ObjectMapper();
        try {
            dto = mapper.readValue(json, SkypicerDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }
}
