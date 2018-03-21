/*
 * Intrinio API
 * Welcome to the Intrinio API! Through our Marketplace, we offer a wide selection of financial data feeds sourced by our own proprietary processes as well as from many data vendors. The primary application of the Intrinio API is for use in third-party applications and integrations or for end-users utilizing the Excel add-in and Google Sheets add-on. The Intrinio API uses HTTPS verbs and a RESTful endpoint structure, which makes it easy to request data from Intrinio. Responses are delivered in JSON format. If you need additional help in using the API, go to our home page (https://intrinio.com) and click on the chat icon in the lower right corner.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


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
 * An XBRL tag as-reported by the company on the as-reported financial statement
 */
@ApiModel(description = "An XBRL tag as-reported by the company on the as-reported financial statement")

public class ReportedTag {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("abstract")
  private Boolean _abstract = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("depth")
  private Integer depth = null;

  public ReportedTag tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The tag code
   * @return tag
  **/
  @ApiModelProperty(value = "The tag code")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ReportedTag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tag name
   * @return name
  **/
  @ApiModelProperty(value = "The tag name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportedTag balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Whether the tag represents a credit or debit
   * @return balance
  **/
  @ApiModelProperty(value = "Whether the tag represents a credit or debit")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public ReportedTag unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the tag
   * @return unit
  **/
  @ApiModelProperty(value = "The unit of the tag")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ReportedTag _abstract(Boolean _abstract) {
    this._abstract = _abstract;
    return this;
  }

   /**
   * If true, the tag is an abstract and does not represent a nominal value
   * @return _abstract
  **/
  @ApiModelProperty(value = "If true, the tag is an abstract and does not represent a nominal value")
  public Boolean isisAbstract() {
    return _abstract;
  }

  public void setAbstract(Boolean _abstract) {
    this._abstract = _abstract;
  }

  public ReportedTag sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * The vertical sequence of the tag when displayed in the financial statement
   * @return sequence
  **/
  @ApiModelProperty(value = "The vertical sequence of the tag when displayed in the financial statement")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public ReportedTag depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * The horizontal depth of the tag when displayed in the financial statement
   * @return depth
  **/
  @ApiModelProperty(value = "The horizontal depth of the tag when displayed in the financial statement")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportedTag reportedTag = (ReportedTag) o;
    return Objects.equals(this.tag, reportedTag.tag) &&
        Objects.equals(this.name, reportedTag.name) &&
        Objects.equals(this.balance, reportedTag.balance) &&
        Objects.equals(this.unit, reportedTag.unit) &&
        Objects.equals(this._abstract, reportedTag._abstract) &&
        Objects.equals(this.sequence, reportedTag.sequence) &&
        Objects.equals(this.depth, reportedTag.depth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, name, balance, unit, _abstract, sequence, depth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportedTag {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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

