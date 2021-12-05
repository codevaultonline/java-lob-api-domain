package online.codevault.thirdparty.com.lob;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LobApiErrorMessage {

    private String message;

    @JsonProperty("status_code")
    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
