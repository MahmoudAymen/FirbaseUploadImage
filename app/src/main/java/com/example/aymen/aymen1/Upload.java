package com.example.aymen.aymen1;

/**
 * Created by aymen on 30/01/2018.
 */
public class Upload {
    private String name;
    private String urlImage;
    public Upload()
    {

    }

    public Upload(String name, String urlImage) {
        if(name.trim().equals(""))
        {
            name="No Name";
        }
        this.name = name;
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
