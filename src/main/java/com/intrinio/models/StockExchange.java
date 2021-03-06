

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
 * An organized and regulated financial market in which securities are bought and sold.
 */
@ApiModel(description = "An organized and regulated financial market in which securities are bought and sold.")

public class StockExchange {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mic")
  private String mic = null;

  @SerializedName("acronym")
  private String acronym = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("first_stock_price_date")
  private LocalDate firstStockPriceDate = null;

  @SerializedName("last_stock_price_date")
  private LocalDate lastStockPriceDate = null;

  public StockExchange id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the Stock Exchange
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Stock Exchange")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StockExchange name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the exchange
   * @return name
  **/
  @ApiModelProperty(value = "The name of the exchange")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StockExchange mic(String mic) {
    this.mic = mic;
    return this;
  }

   /**
   * The Market Identifier Code (MIC) of the exchange
   * @return mic
  **/
  @ApiModelProperty(value = "The Market Identifier Code (MIC) of the exchange")
  public String getMic() {
    return mic;
  }

  public void setMic(String mic) {
    this.mic = mic;
  }

  public StockExchange acronym(String acronym) {
    this.acronym = acronym;
    return this;
  }

   /**
   * The acronym of the exchange&#39;s name
   * @return acronym
  **/
  @ApiModelProperty(value = "The acronym of the exchange's name")
  public String getAcronym() {
    return acronym;
  }

  public void setAcronym(String acronym) {
    this.acronym = acronym;
  }

  public StockExchange city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city in which the exchange is located
   * @return city
  **/
  @ApiModelProperty(value = "The city in which the exchange is located")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public StockExchange country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country in which the exchange is located
   * @return country
  **/
  @ApiModelProperty(value = "The country in which the exchange is located")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public StockExchange countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The 2-digit code of the exchange&#39;s country
   * @return countryCode
  **/
  @ApiModelProperty(value = "The 2-digit code of the exchange's country")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public StockExchange website(String website) {
    this.website = website;
    return this;
  }

   /**
   * The website of the exchange
   * @return website
  **/
  @ApiModelProperty(value = "The website of the exchange")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public StockExchange firstStockPriceDate(LocalDate firstStockPriceDate) {
    this.firstStockPriceDate = firstStockPriceDate;
    return this;
  }

   /**
   * The earliest date for which Intrinio has stock prices for the exchange
   * @return firstStockPriceDate
  **/
  @ApiModelProperty(value = "The earliest date for which Intrinio has stock prices for the exchange")
  public LocalDate getFirstStockPriceDate() {
    return firstStockPriceDate;
  }

  public void setFirstStockPriceDate(LocalDate firstStockPriceDate) {
    this.firstStockPriceDate = firstStockPriceDate;
  }

  public StockExchange lastStockPriceDate(LocalDate lastStockPriceDate) {
    this.lastStockPriceDate = lastStockPriceDate;
    return this;
  }

   /**
   * The latest date for which Intrinio has stock prices for the exchange
   * @return lastStockPriceDate
  **/
  @ApiModelProperty(value = "The latest date for which Intrinio has stock prices for the exchange")
  public LocalDate getLastStockPriceDate() {
    return lastStockPriceDate;
  }

  public void setLastStockPriceDate(LocalDate lastStockPriceDate) {
    this.lastStockPriceDate = lastStockPriceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockExchange stockExchange = (StockExchange) o;
    return Objects.equals(this.id, stockExchange.id) &&
        Objects.equals(this.name, stockExchange.name) &&
        Objects.equals(this.mic, stockExchange.mic) &&
        Objects.equals(this.acronym, stockExchange.acronym) &&
        Objects.equals(this.city, stockExchange.city) &&
        Objects.equals(this.country, stockExchange.country) &&
        Objects.equals(this.countryCode, stockExchange.countryCode) &&
        Objects.equals(this.website, stockExchange.website) &&
        Objects.equals(this.firstStockPriceDate, stockExchange.firstStockPriceDate) &&
        Objects.equals(this.lastStockPriceDate, stockExchange.lastStockPriceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mic, acronym, city, country, countryCode, website, firstStockPriceDate, lastStockPriceDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockExchange {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mic: ").append(toIndentedString(mic)).append("\n");
    sb.append("    acronym: ").append(toIndentedString(acronym)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    firstStockPriceDate: ").append(toIndentedString(firstStockPriceDate)).append("\n");
    sb.append("    lastStockPriceDate: ").append(toIndentedString(lastStockPriceDate)).append("\n");
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

