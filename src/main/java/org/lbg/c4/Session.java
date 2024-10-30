package org.lbg.c4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Session {

    // Simulate the idea of data being loaded from persistent storage
    private IDataStore dataStore;

    public Session( IDataStore dataStore )
    {
        this.dataStore = dataStore;
    }

    public String   getItems()
    {
        ObjectMapper objectMapper = new ObjectMapper();
        Basket basket = dataStore.getItemsInDB();
        String result = "";
        try
        {
            result = objectMapper.writeValueAsString(basket);
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return result;
    }


}
