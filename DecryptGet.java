package com.example.jpa.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class DecryptGet{
    @JsonProperty("CallType") 
    public String callType;
    @JsonProperty("FileTarget") 
    public List<Object> fileTarget;
    @JsonProperty("RequestType") 
    public String requestType;
    @JsonProperty("RequestChain") 
    public String requestChain;
    @JsonProperty("RequestMethod") 
    public String requestMethod;
    @JsonProperty("RequestTarget") 
    public List<Object> requestTarget;
    @JsonProperty("TransitionCondition") 
    public TransitionCondition transitionCondition;
    @JsonProperty("ResponseAwaitMaxTimeinMS") 
    public String responseAwaitMaxTimeinMS;
    @JsonProperty("SourceAuthenticationTarget") 
    public List<Object> sourceAuthenticationTarget;
    @JsonProperty("RequestBodyKeyValidationRules") 
    public RequestBodyKeyValidationRules requestBodyKeyValidationRules;
    @JsonProperty("RequestSourceAuthenticationKey") 
    public String requestSourceAuthenticationKey;
}
