

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
 * An Index representing a Standard Industrial Classification (SIC) code.
 */
@ApiModel(description = "An Index representing a Standard Industrial Classification (SIC) code.")

public class SICIndex {
  @SerializedName("id")
  private String id = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("continent")
  private String continent = null;

  @SerializedName("country")
  private String country = null;

  public SICIndex id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Intrinio ID for the Index
   * @return id
  **/
  @ApiModelProperty(value = "Intrinio ID for the Index")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SICIndex symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol used to identify the Index
   * @return symbol
  **/
  @ApiModelProperty(value = "The symbol used to identify the Index")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SICIndex name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Index
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Index")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SICIndex continent(String continent) {
    this.continent = continent;
    return this;
  }

   /**
   * The continent of the country of focus for the Index
   * @return continent
  **/
  @ApiModelProperty(value = "The continent of the country of focus for the Index")
  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public SICIndex country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country of focus for the Index
   * @return country
  **/
  @ApiModelProperty(value = "The country of focus for the Index")
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
    SICIndex siCIndex = (SICIndex) o;
    return Objects.equals(this.id, siCIndex.id) &&
        Objects.equals(this.symbol, siCIndex.symbol) &&
        Objects.equals(this.name, siCIndex.name) &&
        Objects.equals(this.continent, siCIndex.continent) &&
        Objects.equals(this.country, siCIndex.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol, name, continent, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SICIndex {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
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

