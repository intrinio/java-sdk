

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

/**
 * The summary of a institutional owner
 */
@ApiModel(description = "The summary of a institutional owner")

public class ZacksInstitutionalHoldingOwnerSummary {
  @SerializedName("name")
  private String name = null;

  @SerializedName("cik")
  private String cik = null;

  public ZacksInstitutionalHoldingOwnerSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The owner&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "The owner's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZacksInstitutionalHoldingOwnerSummary cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * The Central Index Key (CIK) assigned to the company by the SEC as a unique identifier, used in SEC filings
   * @return cik
  **/
  @ApiModelProperty(value = "The Central Index Key (CIK) assigned to the company by the SEC as a unique identifier, used in SEC filings")
  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksInstitutionalHoldingOwnerSummary zacksInstitutionalHoldingOwnerSummary = (ZacksInstitutionalHoldingOwnerSummary) o;
    return Objects.equals(this.name, zacksInstitutionalHoldingOwnerSummary.name) &&
        Objects.equals(this.cik, zacksInstitutionalHoldingOwnerSummary.cik);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cik);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksInstitutionalHoldingOwnerSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
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

