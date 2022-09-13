package org.apisimple.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewPet {

    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String status;

    public int getId() {
        return id;
    }

    public String getLastname() {
        return name;
    }

    public String status() {
        return status;
    }


    // default constructor required by Jackson
    private NewPet() {
    }

    private NewPet(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public static class Builder {

        private int id;
        private String name;
        private String status;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public NewPet build() {
            return new NewPet(id, name, status);
        }
    }
}