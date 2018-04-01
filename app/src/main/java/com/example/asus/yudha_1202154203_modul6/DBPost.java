package com.example.asus.yudha_1202154203_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

//Enkapsulasi data post
@IgnoreExtraProperties
public class DBPost {
    public String image, title, caption, user, key;

    //Dibutuhkan kosong untuk membaca data
    public DBPost() {
    }

    //Constructor dari class ini
    public DBPost(String caption, String image, String title, String user) {
        this.image = image;
        this.title = title;
        this.caption = caption;
        this.user = user;
    }

    //Mendapatkan key dari Firebase
    public String getKey() {
        return key;
    }

    //Menentukan key dari Firebase
    public void setKey(String key) {
        this.key = key;
    }

    //Sisanya getter variabel dari class ini
    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getCaption() {
        return caption;
    }

    public String getUser() {
        return user;
    }

}
