

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Insider and institutional owners of securities covered by Intrinio
 */
@ApiModel(description = "Insider and institutional owners of securities covered by Intrinio")

public class Owner {
  @SerializedName("id")
  private String id = null;

  @SerializedName("company_id")
  private String companyId = null;

  @SerializedName("owner_cik")
  private String ownerCik = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("state_inc")
  private String stateInc = null;

  @SerializedName("country_inc")
  private String countryInc = null;

  @SerializedName("business_address")
  private String businessAddress = null;

  @SerializedName("business_phone_no")
  private String businessPhoneNo = null;

  @SerializedName("mailing_address")
  private String mailingAddress = null;

  @SerializedName("institutional")
  private Boolean institutional = null;

  @SerializedName("updated_on")
  private OffsetDateTime updatedOn = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  public Owner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the Owner
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Owner")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Owner companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The Intrinio ID for the company for which the Security is issued
   * @return companyId
  **/
  @ApiModelProperty(value = "The Intrinio ID for the company for which the Security is issued")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Owner ownerCik(String ownerCik) {
    this.ownerCik = ownerCik;
    return this;
  }

   /**
   * The Central Index Key issued by the SEC, which is the unique identifier all owner filings
   * @return ownerCik
  **/
  @ApiModelProperty(value = "The Central Index Key issued by the SEC, which is the unique identifier all owner filings")
  public String getOwnerCik() {
    return ownerCik;
  }

  public void setOwnerCik(String ownerCik) {
    this.ownerCik = ownerCik;
  }

  public Owner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the owner
   * @return name
  **/
  @ApiModelProperty(value = "The name of the owner")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Owner state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state in which the owner is located
   * @return state
  **/
  @ApiModelProperty(value = "The state in which the owner is located")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Owner stateInc(String stateInc) {
    this.stateInc = stateInc;
    return this;
  }

   /**
   * The state in which the owner is incorporated
   * @return stateInc
  **/
  @ApiModelProperty(value = "The state in which the owner is incorporated")
  public String getStateInc() {
    return stateInc;
  }

  public void setStateInc(String stateInc) {
    this.stateInc = stateInc;
  }

  public Owner countryInc(String countryInc) {
    this.countryInc = countryInc;
    return this;
  }

   /**
   * The country in which the owner is incorporated
   * @return countryInc
  **/
  @ApiModelProperty(value = "The country in which the owner is incorporated")
  public String getCountryInc() {
    return countryInc;
  }

  public void setCountryInc(String countryInc) {
    this.countryInc = countryInc;
  }

  public Owner businessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * The owner&#39;s business address
   * @return businessAddress
  **/
  @ApiModelProperty(value = "The owner's business address")
  public String getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
  }

  public Owner businessPhoneNo(String businessPhoneNo) {
    this.businessPhoneNo = businessPhoneNo;
    return this;
  }

   /**
   * The owner&#39;s business phone number
   * @return businessPhoneNo
  **/
  @ApiModelProperty(value = "The owner's business phone number")
  public String getBusinessPhoneNo() {
    return businessPhoneNo;
  }

  public void setBusinessPhoneNo(String businessPhoneNo) {
    this.businessPhoneNo = businessPhoneNo;
  }

  public Owner mailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

   /**
   * The owner&#39;s mailing address
   * @return mailingAddress
  **/
  @ApiModelProperty(value = "The owner's mailing address")
  public String getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
  }

  public Owner institutional(Boolean institutional) {
    this.institutional = institutional;
    return this;
  }

   /**
   * A boolean to include only insider owners who have filed forms 3, 4, or 5 with the SEC
   * @return institutional
  **/
  @ApiModelProperty(value = "A boolean to include only insider owners who have filed forms 3, 4, or 5 with the SEC")
  public Boolean isInstitutional() {
    return institutional;
  }

  public void setInstitutional(Boolean institutional) {
    this.institutional = institutional;
  }

  public Owner updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * The date and time when the data was last updated.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The date and time when the data was last updated.")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Owner createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The date and time when the data was created
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the data was created")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(this.id, owner.id) &&
        Objects.equals(this.companyId, owner.companyId) &&
        Objects.equals(this.ownerCik, owner.ownerCik) &&
        Objects.equals(this.name, owner.name) &&
        Objects.equals(this.state, owner.state) &&
        Objects.equals(this.stateInc, owner.stateInc) &&
        Objects.equals(this.countryInc, owner.countryInc) &&
        Objects.equals(this.businessAddress, owner.businessAddress) &&
        Objects.equals(this.businessPhoneNo, owner.businessPhoneNo) &&
        Objects.equals(this.mailingAddress, owner.mailingAddress) &&
        Objects.equals(this.institutional, owner.institutional) &&
        Objects.equals(this.updatedOn, owner.updatedOn) &&
        Objects.equals(this.createdOn, owner.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, ownerCik, name, state, stateInc, countryInc, businessAddress, businessPhoneNo, mailingAddress, institutional, updatedOn, createdOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Owner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    ownerCik: ").append(toIndentedString(ownerCik)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateInc: ").append(toIndentedString(stateInc)).append("\n");
    sb.append("    countryInc: ").append(toIndentedString(countryInc)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessPhoneNo: ").append(toIndentedString(businessPhoneNo)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    institutional: ").append(toIndentedString(institutional)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

