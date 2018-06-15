

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
 * StockMarketIndexSummary
 */

public class StockMarketIndexSummary {
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

  @SerializedName("observation_start")
  private LocalDate observationStart = null;

  @SerializedName("observation_end")
  private LocalDate observationEnd = null;

  public StockMarketIndexSummary id(String id) {
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

  public StockMarketIndexSummary symbol(String symbol) {
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

  public StockMarketIndexSummary name(String name) {
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

  public StockMarketIndexSummary continent(String continent) {
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

  public StockMarketIndexSummary country(String country) {
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

  public StockMarketIndexSummary updateFrequency(String updateFrequency) {
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

  public StockMarketIndexSummary lastUpdated(LocalDate lastUpdated) {
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

  public StockMarketIndexSummary observationStart(LocalDate observationStart) {
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

  public StockMarketIndexSummary observationEnd(LocalDate observationEnd) {
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
    StockMarketIndexSummary stockMarketIndexSummary = (StockMarketIndexSummary) o;
    return Objects.equals(this.id, stockMarketIndexSummary.id) &&
        Objects.equals(this.symbol, stockMarketIndexSummary.symbol) &&
        Objects.equals(this.name, stockMarketIndexSummary.name) &&
        Objects.equals(this.continent, stockMarketIndexSummary.continent) &&
        Objects.equals(this.country, stockMarketIndexSummary.country) &&
        Objects.equals(this.updateFrequency, stockMarketIndexSummary.updateFrequency) &&
        Objects.equals(this.lastUpdated, stockMarketIndexSummary.lastUpdated) &&
        Objects.equals(this.observationStart, stockMarketIndexSummary.observationStart) &&
        Objects.equals(this.observationEnd, stockMarketIndexSummary.observationEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol, name, continent, country, updateFrequency, lastUpdated, observationStart, observationEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockMarketIndexSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    updateFrequency: ").append(toIndentedString(updateFrequency)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

