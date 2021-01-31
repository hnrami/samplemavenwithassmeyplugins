package com.example.jpa.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class ReqBodyKeysVldtnRule{
    public List<String> password;
    @JsonProperty("RequestID") 
    public List<String> requestID;
    public List<String> logintype;
    public List<String> emailAddress;
    public List<String> clientInternalIPAddress;
    public List<String> sessionID;
    public List<String> userFileName;
    public List<String> userFileMd5Sum;
    public List<String> userFileTargetId;
}
