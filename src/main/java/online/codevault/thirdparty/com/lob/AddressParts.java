package online.codevault.thirdparty.com.lob;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddressParts {

    @JsonProperty("primary_number")
    private String primaryNumber;

    @JsonProperty("street_predirection")
    private String streetPredirection;

    @JsonProperty("street_name")
    private String streetName;

    @JsonProperty("street_suffix")
    private String streetSuffix;

    @JsonProperty("secondary_designator")
    private String secondaryDesignator;

    @JsonProperty("secondary_number")
    private String secondaryNumber;

    @JsonProperty("pmb_designator")
    private String pmbDesignator;

    @JsonProperty("pmb_number")
    private String pmbNumber;

    @JsonProperty("extra_secondary_designator")
    private String extraSecondaryDesignator;

    @JsonProperty("extra_secondary_number")
    private String extraSecondaryNumber;

    private String city;

    private String state;

    @JsonProperty("zip_code")
    private String zipCode;

    @JsonProperty("zip_code_plus_4")
    private String zipCodePlus4;

    @JsonProperty("zip_code_type")
    private String zipCodeType;

    @JsonProperty("delivery_point_barcode")
    private String deliveryPointBarcode;

    @JsonProperty("address_type")
    private String addressType;

    @JsonProperty("record_type")
    private String recordType;

    @JsonProperty("default_building_address")
    private Boolean defaultBuildingAddress;

    @JsonProperty("county")
    private String county;

    @JsonProperty("county_fips")
    private String countyFipsCode;

    @JsonProperty("carrier_route")
    private String carrierRoute;

    @JsonProperty("carrier_route_type")
    private String carrierRouteType;

    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public void setPrimaryNumber(String primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public String getStreetPredirection() {
        return streetPredirection;
    }

    public void setStreetPredirection(String streetPredirection) {
        this.streetPredirection = streetPredirection;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetSuffix() {
        return streetSuffix;
    }

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public String getSecondaryDesignator() {
        return secondaryDesignator;
    }

    public void setSecondaryDesignator(String secondaryDesignator) {
        this.secondaryDesignator = secondaryDesignator;
    }

    public String getSecondaryNumber() {
        return secondaryNumber;
    }

    public void setSecondaryNumber(String secondaryNumber) {
        this.secondaryNumber = secondaryNumber;
    }

    public String getPmbDesignator() {
        return pmbDesignator;
    }

    public void setPmbDesignator(String pmbDesignator) {
        this.pmbDesignator = pmbDesignator;
    }

    public String getExtraSecondaryDesignator() {
        return extraSecondaryDesignator;
    }

    public void setExtraSecondaryDesignator(String extraSecondaryDesignator) {
        this.extraSecondaryDesignator = extraSecondaryDesignator;
    }

    public String getExtraSecondaryNumber() {
        return extraSecondaryNumber;
    }

    public void setExtraSecondaryNumber(String extraSecondaryNumber) {
        this.extraSecondaryNumber = extraSecondaryNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCodePlus4() {
        return zipCodePlus4;
    }

    public void setZipCodePlus4(String zipCodePlus4) {
        this.zipCodePlus4 = zipCodePlus4;
    }

    public String getZipCodeType() {
        return zipCodeType;
    }

    public void setZipCodeType(String zipCodeType) {
        this.zipCodeType = zipCodeType;
    }

    public String getDeliveryPointBarcode() {
        return deliveryPointBarcode;
    }

    public void setDeliveryPointBarcode(String deliveryPointBarcode) {
        this.deliveryPointBarcode = deliveryPointBarcode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public Boolean getDefaultBuildingAddress() {
        return defaultBuildingAddress;
    }

    public void setDefaultBuildingAddress(Boolean defaultBuildingAddress) {
        this.defaultBuildingAddress = defaultBuildingAddress;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountyFipsCode() {
        return countyFipsCode;
    }

    public void setCountyFipsCode(String countyFipsCode) {
        this.countyFipsCode = countyFipsCode;
    }

    public String getCarrierRoute() {
        return carrierRoute;
    }

    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public String getCarrierRouteType() {
        return carrierRouteType;
    }

    public void setCarrierRouteType(String carrierRouteType) {
        this.carrierRouteType = carrierRouteType;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
