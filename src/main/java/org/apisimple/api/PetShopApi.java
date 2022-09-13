package org.apisimple.api;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apisimple.api.BaseApi;
import org.apisimple.payloads.NewPet;

import static io.restassured.RestAssured.given;


    public class PetShopApi extends BaseApi {

        private static final String apiUrl = baseUrl + "pet";


        public static Response postPet(NewPet payload) {
            return given()
                    .contentType(ContentType.JSON)
                    .body(payload)
                    .when()
                    .post(apiUrl);
        }

        public static Response getPet(int id) {
            return  given()
                    .get(apiUrl + "/" +Integer.toString(id));
        }

    }
