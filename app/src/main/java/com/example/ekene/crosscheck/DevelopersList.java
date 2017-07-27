package com.example.ekene.crosscheck;

/**
 * Created by EKENE on 7/23/2017.
 */

public class DevelopersList {



    private String login;
    private String avatar_url;
    private String html_url;


    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }


    public DevelopersList(String login, String gitUrl, String avatar_url) {
        this.login = login;
        this.avatar_url = avatar_url;
        this.html_url = gitUrl;

    }

}
