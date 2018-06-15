

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
import org.threeten.bp.LocalDate;

/**
 * StockMarketIndex
 */

public class StockMarketIndex {
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

  @SerializedName("update_frequency")
  private String updateFrequency = null;

  @SerializedName("last_updated")
  private LocalDate lastUpdated = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("observation_start")
  private LocalDate observationStart = null;

  @SerializedName("observation_end")
  private LocalDate observationEnd = null;

  public StockMarketIndex id(String id) {
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

  public StockMarketIndex symbol(String symbol) {
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

  public StockMarketIndex name(String name) {
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

  public StockMarketIndex continent(String continent) {
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

  public StockMarketIndex country(String country) {
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

  public StockMarketIndex updateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
    return this;
  }

   /**
   * How often the Index is updated
   * @return updateFrequency
  **/
  @ApiModelProperty(value = "How often the Index is updated")
  public String getUpdateFrequency() {
    return updateFrequency;
  }

  public void setUpdateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
  }

  public StockMarketIndex lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * When the Index was updated last
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "When the Index was updated last")
  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public StockMarketIndex description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A paragraph describing the index and its scope
   * @return description
  **/
  @ApiModelProperty(value = "A paragraph describing the index and its scope")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StockMarketIndex observationStart(LocalDate observationStart) {
    this.observationStart = observationStart;
    return this;
  }

   /**
   * The earliest date for which data is available
   * @return observationStart
  **/
  @ApiModelProperty(value = "The earliest date for which data is available")
  public LocalDate getObservationStart() {
    return observationStart;
  }

  public void setObservationStart(LocalDate observationStart) {
    this.observationStart = observationStart;
  }

  public StockMarketIndex observationEnd(LocalDate observationEnd) {
    this.observationEnd = observationEnd;
    return this;
  }

   /**
   * The latest date for which data is available
   * @return observationEnd
  **/
  @ApiModelProperty(value = "The latest date for which data is available")
  public LocalDate getObservationEnd() {
    return observationEnd;
  }

  public void setObservationEnd(LocalDate observationEnd) {
    this.observationEnd = observationEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockMarketIndex stockMarketIndex = (StockMarketIndex) o;
    return Objects.equals(this.id, stockMarketIndex.id) &&
        Objects.equals(this.symbol, stockMarketIndex.symbol) &&
        Objects.equals(this.name, stockMarketIndex.name) &&
        Objects.equals(this.continent, stockMarketIndex.continent) &&
        Objects.equals(this.country, stockMarketIndex.country) &&
        Objects.equals(this.updateFrequency, stockMarketIndex.updateFrequency) &&
        Objects.equals(this.lastUpdated, stockMarketIndex.lastUpdated) &&
        Objects.equals(this.description, stockMarketIndex.description) &&
        Objects.equals(this.observationStart, stockMarketIndex.observationStart) &&
        Objects.equals(this.observationEnd, stockMarketIndex.observationEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol, name, continent, country, updateFrequency, lastUpdated, description, observationStart, observationEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockMarketIndex {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    updateFrequency: ").append(toIndentedString(updateFrequency)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    observationStart: ").append(toIndentedString(observationStart)).append("\n");
    sb.append("    observationEnd: ").append(toIndentedString(observationEnd)).append("\n");
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

