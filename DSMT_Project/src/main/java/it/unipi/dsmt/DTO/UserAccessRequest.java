package it.unipi.dsmt.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccessRequest {
    private String username;
    private String password;
    private Boolean isAdmin;

    public UserAccessRequest(String username, String password, Boolean isAdmin) {
        this.username = username;
        this.isAdmin = isAdmin;
        this.password = password;
    }
    public UserAccessRequest(){}

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }


}
