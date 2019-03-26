

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
 * A subset of data for the provided Crypto Exchange that includes only the name and the code of the Crypto Exchange.
 */
@ApiModel(description = "A subset of data for the provided Crypto Exchange that includes only the name and the code of the Crypto Exchange.")

public class CryptoExchangeSummary {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  public CryptoExchangeSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Crypto Exchange name.
   * @return name
  **/
  @ApiModelProperty(value = "The Crypto Exchange name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CryptoExchangeSummary code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The Crypto Exchange code.
   * @return code
  **/
  @ApiModelProperty(value = "The Crypto Exchange code.")
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
    CryptoExchangeSummary cryptoExchangeSummary = (CryptoExchangeSummary) o;
    return Objects.equals(this.name, cryptoExchangeSummary.name) &&
        Objects.equals(this.code, cryptoExchangeSummary.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoExchangeSummary {\n");
    
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

