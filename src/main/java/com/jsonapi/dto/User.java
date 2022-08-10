package com.jsonapi.dto;

public class User {

    private long userId;

    private String userName;

    private transient String salutation;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
/*
User{
    userId{
        type: "id"
        object: "long"
        required: "true"
        comments: ""
    }
    username{

    }
}


API Development
--------------------
    1. Generate schema from existing POJO
            a. JSON schema using some utility   -   some JSON schema version(preference is to be in openapi 3.1 specification but not limited to)
            b. Include/Exclude fields   -   How to??

    2. Design First Approach (API only)
            a. OpenAPI 3.1 specifictaion
                i.  Free Tool??
                ii. Create it using swagger API or some other tool that gives a sample 3.0 specification.
                iii. Make changes for it to adhere to openapi 3.1 specification
            b. In the schema section, instead of creating the new schema, reference from Step 1
*/