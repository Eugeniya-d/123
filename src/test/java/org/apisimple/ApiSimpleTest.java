package org.apisimple;

import io.restassured.response.Response;
import org.apisimple.api.PetShopApi;
import org.apisimple.payloads.NewPet;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ApiSimpleTest {

    @Test
    public void postPetReturns200(){

        NewPet payload = new NewPet.Builder()
                .setId(777055512)
                .setName("White speck")
                .setStatus("available")
                .build();

        Response response = PetShopApi.postPet(payload);

        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void getBookingIdShouldReturn200(){
        Response response = PetShopApi.getPet(777055512);

        Assert.assertEquals(response.statusCode(),200);

        Assert.assertTrue(response.body().asString().contains("White speck"));
    }
}
