

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
 * A Forex Currency
 */
@ApiModel(description = "A Forex Currency")

public class ForexCurrency {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("country")
  private String country = null;

  public ForexCurrency code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The ISO 4217 currency code
   * @return code
  **/
  @ApiModelProperty(example = "AUD", value = "The ISO 4217 currency code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ForexCurrency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the currency
   * @return name
  **/
  @ApiModelProperty(example = "Dollar", value = "The name of the currency")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ForexCurrency country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country in which the currency is used
   * @return country
  **/
  @ApiModelProperty(example = "Australia", value = "The country in which the currency is used")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForexCurrency forexCurrency = (ForexCurrency) o;
    return Objects.equals(this.code, forexCurrency.code) &&
        Objects.equals(this.name, forexCurrency.name) &&
        Objects.equals(this.country, forexCurrency.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForexCurrency {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

