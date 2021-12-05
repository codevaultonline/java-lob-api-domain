package online.codevault.thirdparty.com.lob;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class USAddressValidationResponse {

    private String id;
    private String recipient;

    @JsonProperty("primary_line")
    private String primaryLine;

    @JsonProperty("secondary_line")
    private String secondaryLine;

    private String urbanization;

    @JsonProperty("last_line")
    private String lastLine;

    private String deliverability;
    private AddressParts components;

    @JsonProperty("deliverability_analysis")
    private DeliveryAnalysis deliveryAnalysis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPrimaryLine() {
        return primaryLine;
    }

    public void setPrimaryLine(String primaryLine) {
        this.primaryLine = primaryLine;
    }

    public String getSecondaryLine() {
        return secondaryLine;
    }

    public void setSecondaryLine(String secondaryLine) {
        this.secondaryLine = secondaryLine;
    }

    public String getUrbanization() {
        return urbanization;
    }

    public void setUrbanization(String urbanization) {
        this.urbanization = urbanization;
    }

    public String getLastLine() {
        return lastLine;
    }

    public void setLastLine(String lastLine) {
        this.lastLine = lastLine;
    }

    public String getDeliverability() {
        return deliverability;
    }

    public void setDeliverability(String deliverability) {
        this.deliverability = deliverability;
    }

    public AddressParts getComponents() {
        return components;
    }

    public void setComponents(AddressParts components) {
        this.components = components;
    }

    public DeliveryAnalysis getDeliveryAnalysis() {
        return deliveryAnalysis;
    }

    public void setDeliveryAnalysis(DeliveryAnalysis deliveryAnalysis) {
        this.deliveryAnalysis = deliveryAnalysis;
    }
}
