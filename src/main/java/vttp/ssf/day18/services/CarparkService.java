package vttp.ssf.day18.services;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.ssf.day18.models.Carpark;

@Service
public class CarparkService {
    
    RestTemplate restTemplate = new RestTemplate();
    private String CARPARK_URL = "https://data.gov.sg/api/action/datastore_search?resource_id=d_9f6056bdb6b1dfba57f063593e4f34ae";


    public List<Carpark> getCarparks(){

        String carparkData = restTemplate.getForObject(CARPARK_URL, String.class);

        List<Carpark> carParkList = new LinkedList<>();

        try {
            JsonReader reader = Json.createReader(new StringReader(carparkData));
            JsonObject result = reader.readObject().getJsonObject("result");
            JsonArray records = result.getJsonArray("records");
            for(int i = 0; i < records.size(); i++){
                JsonObject obj = records.getJsonObject(i);
                Carpark carpark = new Carpark(obj.getInt("_id"),
                                             obj.getString("carpark"),
                                             obj.getString("category"),
                                             obj.getString("weekdays_rate_1"),
                                             obj.getString("weekdays_rate_2"),
                                             obj.getString("saturday_rate"),
                                             obj.getString("sunday_publicholiday_rate"));
                carParkList.add(carpark);
    

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return carParkList;
        
    }
}
