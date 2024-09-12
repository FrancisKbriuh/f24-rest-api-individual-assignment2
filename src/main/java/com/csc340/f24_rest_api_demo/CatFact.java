package com.csc340.f24_rest_api_demo;

public class CatFact {
    public String type;
    public String text;
    public String updatedAt;

    public CatFact(String type, String text, String updatedAt){
        this.type = type;
        this.text = text;
        this.updatedAt = updatedAt;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getText(){
        return text;
    }

    public void setText(){
        this.text = text;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }

}
