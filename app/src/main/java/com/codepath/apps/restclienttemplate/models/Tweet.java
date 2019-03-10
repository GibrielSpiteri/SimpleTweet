package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import static com.codepath.apps.restclienttemplate.TimeFormatter.getTimeDifference;

public class Tweet {

    public String body;
    public long uid;
    public String createdAt;
    public User user;
    public String timestamp;

    public static Tweet fromJson(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.uid = jsonObject.getLong("id");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.user = User.fromJson(jsonObject.getJSONObject("user"));
        tweet.timestamp = getTimeDifference(jsonObject.getString("created_at")) ;
        return tweet;
    }

}
