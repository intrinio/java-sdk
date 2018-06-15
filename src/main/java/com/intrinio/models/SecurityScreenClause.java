

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
 * A conditional clause used tp screen securities
 */
@ApiModel(description = "A conditional clause used tp screen securities")

public class SecurityScreenClause {
  @SerializedName("field")
  private String field = null;

  /**
   * The logic operator to use when screening
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    EQ("eq"),
    
    GT("gt"),
    
    GTE("gte"),
    
    LT("lt"),
    
    LTE("lte"),
    
    CONTAINS("contains");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("value")
  private String value = null;

  public SecurityScreenClause field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The field to use when screening, such as an Intrinio Data Tag
   * @return field
  **/
  @ApiModelProperty(value = "The field to use when screening, such as an Intrinio Data Tag")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SecurityScreenClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The logic operator to use when screening
   * @return operator
  **/
  @ApiModelProperty(value = "The logic operator to use when screening")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public SecurityScreenClause value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value to screen by
   * @return value
  **/
  @ApiModelProperty(value = "The value to screen by")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScreenClause securityScreenClause = (SecurityScreenClause) o;
    return Objects.equals(this.field, securityScreenClause.field) &&
        Objects.equals(this.operator, securityScreenClause.operator) &&
        Objects.equals(this.value, securityScreenClause.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScreenClause {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

