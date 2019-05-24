

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
import java.math.BigDecimal;

/**
 * DataTagSummary
 */

public class DataTagSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("sequence")
  private BigDecimal sequence = null;

  @SerializedName("factor")
  private String factor = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("unit")
  private String unit = null;

  public DataTagSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the Data Tag
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Data Tag")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataTagSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The readable name of the Data Tag
   * @return name
  **/
  @ApiModelProperty(value = "The readable name of the Data Tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataTagSummary tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The code-name of the Data Tag
   * @return tag
  **/
  @ApiModelProperty(value = "The code-name of the Data Tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public DataTagSummary parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The parent Data Tag forming the statement relationship with the factor
   * @return parent
  **/
  @ApiModelProperty(value = "The parent Data Tag forming the statement relationship with the factor")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public DataTagSummary sequence(BigDecimal sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * The order in which the Data Tag appears in its logical group (such as a financial statement)
   * @return sequence
  **/
  @ApiModelProperty(value = "The order in which the Data Tag appears in its logical group (such as a financial statement)")
  public BigDecimal getSequence() {
    return sequence;
  }

  public void setSequence(BigDecimal sequence) {
    this.sequence = sequence;
  }

  public DataTagSummary factor(String factor) {
    this.factor = factor;
    return this;
  }

   /**
   * The operator forming the statement relationship between the child Data Tag (or Data Tags) and the parent Data Tag
   * @return factor
  **/
  @ApiModelProperty(value = "The operator forming the statement relationship between the child Data Tag (or Data Tags) and the parent Data Tag")
  public String getFactor() {
    return factor;
  }

  public void setFactor(String factor) {
    this.factor = factor;
  }

  public DataTagSummary balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Whether the Data Tag represents a credit or debit
   * @return balance
  **/
  @ApiModelProperty(value = "Whether the Data Tag represents a credit or debit")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public DataTagSummary unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the Data Tag
   * @return unit
  **/
  @ApiModelProperty(value = "The unit of the Data Tag")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataTagSummary dataTagSummary = (DataTagSummary) o;
    return Objects.equals(this.id, dataTagSummary.id) &&
        Objects.equals(this.name, dataTagSummary.name) &&
        Objects.equals(this.tag, dataTagSummary.tag) &&
        Objects.equals(this.parent, dataTagSummary.parent) &&
        Objects.equals(this.sequence, dataTagSummary.sequence) &&
        Objects.equals(this.factor, dataTagSummary.factor) &&
        Objects.equals(this.balance, dataTagSummary.balance) &&
        Objects.equals(this.unit, dataTagSummary.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tag, parent, sequence, factor, balance, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTagSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

