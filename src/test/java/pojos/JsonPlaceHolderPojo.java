package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JsonPlaceHolderPojo {
    /*
            "userId": 55,
            "title": "Tidy your room",
            "completed": false,
            "id": 201

    1) Create private variables for all keys
    2) Create constructors with all parameters and without any parameter.
    3) Create public getter and setter methods
    4) Create toString() method
     */
    private Integer userId;
    private String title;
    private Boolean completed;

    public JsonPlaceHolderPojo(Integer userId, String title, Boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }


    public JsonPlaceHolderPojo() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "JsonPlaceHolderPojo{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    /*
    How do we handle different key-values in response?
    We use @JsonIgnoreProperties(ignoreUnknown = true) annotation at the top of the Pojo class.
    It comes from "org.codehaus.jackson.annotate.JsonIgnoreProperties"
     */
}