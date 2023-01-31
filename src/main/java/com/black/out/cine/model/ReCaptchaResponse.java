package com.black.out.cine.model;

//clase creada para funcionar con captcha
public class ReCaptchaResponse {
    private Boolean success;
    private String challengeTs;
    private String hostName;

    public Boolean getSuccess() {
        return success;
    }

    public String getChallengeTs() {
        return challengeTs;
    }

    public String getHostName() {
        return hostName;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setChallengeTs(String challengeTs) {
        this.challengeTs = challengeTs;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
