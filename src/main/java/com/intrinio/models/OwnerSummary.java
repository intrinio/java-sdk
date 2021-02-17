

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
 * The summary of an insider and institutional owner of securities covered by Intrinio
 */
@ApiModel(description = "The summary of an insider and institutional owner of securities covered by Intrinio")

public class OwnerSummary {
  @SerializedName("owner_cik")
  private String ownerCik = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  public OwnerSummary ownerCik(String ownerCik) {
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

  public OwnerSummary ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the owner
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name of the owner")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerSummary ownerSummary = (OwnerSummary) o;
    return Objects.equals(this.ownerCik, ownerSummary.ownerCik) &&
        Objects.equals(this.ownerName, ownerSummary.ownerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerCik, ownerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerSummary {\n");
    
    sb.append("    ownerCik: ").append(toIndentedString(ownerCik)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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

