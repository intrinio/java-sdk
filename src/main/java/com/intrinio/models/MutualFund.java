

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
 * An investment program funded by shareholders that trades in diversified holdings and is professionally managed
 */
@ApiModel(description = "An investment program funded by shareholders that trades in diversified holdings and is professionally managed")

public class MutualFund {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("cusip")
  private String cusip = null;

  @SerializedName("vendor_id")
  private String vendorId = null;

  public MutualFund id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the mutual fund
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the mutual fund")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MutualFund name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The mutual fund&#39;s common name
   * @return name
  **/
  @ApiModelProperty(value = "The mutual fund's common name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MutualFund cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * The nine-character CUSIP identifier
   * @return cusip
  **/
  @ApiModelProperty(value = "The nine-character CUSIP identifier")
  public String getCusip() {
    return cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  public MutualFund vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The vendor-provided id of the mutual fund
   * @return vendorId
  **/
  @ApiModelProperty(value = "The vendor-provided id of the mutual fund")
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutualFund mutualFund = (MutualFund) o;
    return Objects.equals(this.id, mutualFund.id) &&
        Objects.equals(this.name, mutualFund.name) &&
        Objects.equals(this.cusip, mutualFund.cusip) &&
        Objects.equals(this.vendorId, mutualFund.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cusip, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutualFund {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

