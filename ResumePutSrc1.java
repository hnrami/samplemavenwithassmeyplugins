package com.example.jpa.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class ResumePutSrc1{
    @JsonProperty("CallType") 
    public String callType;
    @JsonProperty("FileTarget") 
    public List<String> fileTarget;
    @JsonProperty("RequestType") 
    public String requestType;
    @JsonProperty("RequestChain") 
    public String requestChain;
    @JsonProperty("RequestMethod") 
    public String requestMethod;
    @JsonProperty("RequestTarget") 
    public List<String> requestTarget;
    @JsonProperty("TransitionCondition") 
    public TransitionCondition transitionCondition;
    @JsonProperty("ResponseAwaitMaxTimeinMS") 
    public int responseAwaitMaxTimeinMS;
    @JsonProperty("SourceAuthenticationTarget") 
    public List<String> sourceAuthenticationTarget;
    @JsonProperty("RequestBodyKeyValidationRules") 
    public RequestBodyKeyValidationRules requestBodyKeyValidationRules;
    @JsonProperty("RequestSourceAuthenticationKey") 
    public String requestSourceAuthenticationKey;
}
