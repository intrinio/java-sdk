

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
 * Data for the provided Crypto Currency Pair.
 */
@ApiModel(description = "Data for the provided Crypto Currency Pair.")

public class CryptoPairSummary {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  public CryptoPairSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Crypto Currency Pair name.
   * @return name
  **/
  @ApiModelProperty(value = "The Crypto Currency Pair name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CryptoPairSummary code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The Crypto Currency Pair code.
   * @return code
  **/
  @ApiModelProperty(value = "The Crypto Currency Pair code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoPairSummary cryptoPairSummary = (CryptoPairSummary) o;
    return Objects.equals(this.name, cryptoPairSummary.name) &&
        Objects.equals(this.code, cryptoPairSummary.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoPairSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

