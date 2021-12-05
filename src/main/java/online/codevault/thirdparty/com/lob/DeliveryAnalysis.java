package online.codevault.thirdparty.com.lob;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DeliveryAnalysis {

    @JsonProperty("dpv_confirmation")
    private String dpvConfirmation;

    @JsonProperty("dpv_cmra")
    private String dpvCmra;

    @JsonProperty("dpv_vacant")
    private String dpvVacant;

    @JsonProperty("dpv_active")
    private String dpvActive;

    @JsonProperty("dpv_footnotes")
    private Set<String> dpvFootnotes;

    @JsonProperty("ews_match")
    private Boolean ewsMatch;

    @JsonProperty("lacs_indicator")
    private String lacsIndicator;

    @JsonProperty("lacs_return_code")
    private String lacsReturnCode;

    @JsonProperty("suite_return_code")
    private String suiteReturnCode;

    public String getDpvConfirmation() {
        return dpvConfirmation;
    }

    public void setDpvConfirmation(String dpvConfirmation) {
        this.dpvConfirmation = dpvConfirmation;
    }

    public String getDpvCmra() {
        return dpvCmra;
    }

    public void setDpvCmra(String dpvCmra) {
        this.dpvCmra = dpvCmra;
    }

    public String getDpvVacant() {
        return dpvVacant;
    }

    public void setDpvVacant(String dpvVacant) {
        this.dpvVacant = dpvVacant;
    }

    public String getDpvActive() {
        return dpvActive;
    }

    public void setDpvActive(String dpvActive) {
        this.dpvActive = dpvActive;
    }

    public Set<String> getDpvFootnotes() {
        return dpvFootnotes;
    }

    public void setDpvFootnotes(Set<String> dpvFootnotes) {
        this.dpvFootnotes = dpvFootnotes;
    }

    public Boolean getEwsMatch() {
        return ewsMatch;
    }

    public void setEwsMatch(Boolean ewsMatch) {
        this.ewsMatch = ewsMatch;
    }

    public String getLacsIndicator() {
        return lacsIndicator;
    }

    public void setLacsIndicator(String lacsIndicator) {
        this.lacsIndicator = lacsIndicator;
    }

    public String getLacsReturnCode() {
        return lacsReturnCode;
    }

    public void setLacsReturnCode(String lacsReturnCode) {
        this.lacsReturnCode = lacsReturnCode;
    }

    public String getSuiteReturnCode() {
        return suiteReturnCode;
    }

    public void setSuiteReturnCode(String suiteReturnCode) {
        this.suiteReturnCode = suiteReturnCode;
    }
}
