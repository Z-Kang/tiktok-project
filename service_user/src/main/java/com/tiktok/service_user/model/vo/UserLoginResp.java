package com.tiktok.service_user.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserLoginResp {
    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("status_msg")
    private String statusMsg;

    @JsonProperty("user_id")
    private Long userId;

    private String token;

    public UserLoginResp() {
    }

    public UserLoginResp(String statusCode, String statusMsg, Long userId, String token) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
        this.userId = userId;
        this.token = token;
    }
}
