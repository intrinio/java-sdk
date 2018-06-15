

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
 * StandardizedTag
 */

public class StandardizedTag {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("statement_code")
  private String statementCode = null;

  /**
   * The format of the financial statment to which this tag belongs
   */
  @JsonAdapter(StatementTypeEnum.Adapter.class)
  public enum StatementTypeEnum {
    FINANCIAL("financial"),
    
    INDUSTRIAL("industrial");

    private String value;

    StatementTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatementTypeEnum fromValue(String text) {
      for (StatementTypeEnum b : StatementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatementTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("statement_type")
  private StatementTypeEnum statementType = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("factor")
  private String factor = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("unit")
  private String unit = null;

  public StandardizedTag id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the Standardized Tag
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Standardized Tag")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StandardizedTag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The readable name of tag
   * @return name
  **/
  @ApiModelProperty(value = "The readable name of tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StandardizedTag tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The Intrinio standardized tag
   * @return tag
  **/
  @ApiModelProperty(value = "The Intrinio standardized tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public StandardizedTag statementCode(String statementCode) {
    this.statementCode = statementCode;
    return this;
  }

   /**
   * The code of the financial statement to which this tag belongs
   * @return statementCode
  **/
  @ApiModelProperty(value = "The code of the financial statement to which this tag belongs")
  public String getStatementCode() {
    return statementCode;
  }

  public void setStatementCode(String statementCode) {
    this.statementCode = statementCode;
  }

  public StandardizedTag statementType(StatementTypeEnum statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   * The format of the financial statment to which this tag belongs
   * @return statementType
  **/
  @ApiModelProperty(value = "The format of the financial statment to which this tag belongs")
  public StatementTypeEnum getStatementType() {
    return statementType;
  }

  public void setStatementType(StatementTypeEnum statementType) {
    this.statementType = statementType;
  }

  public StandardizedTag parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The parent Standardized Tag forming the statement relationship with the factor
   * @return parent
  **/
  @ApiModelProperty(value = "The parent Standardized Tag forming the statement relationship with the factor")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public StandardizedTag factor(String factor) {
    this.factor = factor;
    return this;
  }

   /**
   * The operator forming the statement relationship between the child tag (or tags) and the parent
   * @return factor
  **/
  @ApiModelProperty(value = "The operator forming the statement relationship between the child tag (or tags) and the parent")
  public String getFactor() {
    return factor;
  }

  public void setFactor(String factor) {
    this.factor = factor;
  }

  public StandardizedTag balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Whether the tag represents a credit or debit
   * @return balance
  **/
  @ApiModelProperty(value = "Whether the tag represents a credit or debit")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public StandardizedTag type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The nature of the tag, operating or nonoperating
   * @return type
  **/
  @ApiModelProperty(value = "The nature of the tag, operating or nonoperating")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StandardizedTag unit(String unit) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardizedTag standardizedTag = (StandardizedTag) o;
    return Objects.equals(this.id, standardizedTag.id) &&
        Objects.equals(this.name, standardizedTag.name) &&
        Objects.equals(this.tag, standardizedTag.tag) &&
        Objects.equals(this.statementCode, standardizedTag.statementCode) &&
        Objects.equals(this.statementType, standardizedTag.statementType) &&
        Objects.equals(this.parent, standardizedTag.parent) &&
        Objects.equals(this.factor, standardizedTag.factor) &&
        Objects.equals(this.balance, standardizedTag.balance) &&
        Objects.equals(this.type, standardizedTag.type) &&
        Objects.equals(this.unit, standardizedTag.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tag, statementCode, statementType, parent, factor, balance, type, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardizedTag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    statementCode: ").append(toIndentedString(statementCode)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

