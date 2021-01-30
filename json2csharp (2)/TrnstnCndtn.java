public class TrnstnCndtn{
    public String abc;
    @JsonProperty("FileRegistrationStatus") 
    public List<String> fileRegistrationStatus;
    @JsonProperty("FileCheckCode") 
    public List<String> fileCheckCode;
    @JsonProperty("EncryptStatus") 
    public List<String> encryptStatus;
    @JsonProperty("EncryptFileURL") 
    public List<String> encryptFileURL;
    @JsonProperty("Status") 
    public List<String> status;
    @JsonProperty("CpmrsdFileURL") 
    public List<String> cpmrsdFileURL;
}
