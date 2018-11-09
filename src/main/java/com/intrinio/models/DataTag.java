

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
 * DataTag
 */

public class DataTag {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("statement_code")
  private String statementCode = null;

  /**
   * The format of the financial statment to which this Data Tag belongs
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

  public DataTag id(String id) {
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

  public DataTag name(String name) {
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

  public DataTag tag(String tag) {
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

  public DataTag statementCode(String statementCode) {
    this.statementCode = statementCode;
    return this;
  }

   /**
   * The code of the financial statement to which this Data Tag belongs
   * @return statementCode
  **/
  @ApiModelProperty(value = "The code of the financial statement to which this Data Tag belongs")
  public String getStatementCode() {
    return statementCode;
  }

  public void setStatementCode(String statementCode) {
    this.statementCode = statementCode;
  }

  public DataTag statementType(StatementTypeEnum statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   * The format of the financial statment to which this Data Tag belongs
   * @return statementType
  **/
  @ApiModelProperty(value = "The format of the financial statment to which this Data Tag belongs")
  public StatementTypeEnum getStatementType() {
    return statementType;
  }

  public void setStatementType(StatementTypeEnum statementType) {
    this.statementType = statementType;
  }

  public DataTag parent(String parent) {
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

  public DataTag factor(String factor) {
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

  public DataTag balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Whether the Data Tag represents a credit or debit
   * @return balance
  **/
  @ApiModelProperty(value = "Whether the Data Tag represents a credit or debit")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public DataTag type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The nature of the Data Tag, operating or nonoperating
   * @return type
  **/
  @ApiModelProperty(value = "The nature of the Data Tag, operating or nonoperating")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataTag unit(String unit) {
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
    DataTag dataTag = (DataTag) o;
    return Objects.equals(this.id, dataTag.id) &&
        Objects.equals(this.name, dataTag.name) &&
        Objects.equals(this.tag, dataTag.tag) &&
        Objects.equals(this.statementCode, dataTag.statementCode) &&
        Objects.equals(this.statementType, dataTag.statementType) &&
        Objects.equals(this.parent, dataTag.parent) &&
        Objects.equals(this.factor, dataTag.factor) &&
        Objects.equals(this.balance, dataTag.balance) &&
        Objects.equals(this.type, dataTag.type) &&
        Objects.equals(this.unit, dataTag.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tag, statementCode, statementType, parent, factor, balance, type, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTag {\n");
    
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

