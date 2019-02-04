

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
 * A local Municipality
 */
@ApiModel(description = "A local Municipality")

public class Municipality {
  @SerializedName("id")
  private String id = null;

  @SerializedName("census_id")
  private BigDecimal censusId = null;

  @SerializedName("government_name")
  private String governmentName = null;

  @SerializedName("government_type")
  private String governmentType = null;

  @SerializedName("primary_contact_type")
  private String primaryContactType = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("web_site")
  private String webSite = null;

  @SerializedName("population")
  private BigDecimal population = null;

  @SerializedName("population_as_of_year")
  private BigDecimal populationAsOfYear = null;

  @SerializedName("enrollment")
  private BigDecimal enrollment = null;

  @SerializedName("enrollment_as_of_year")
  private BigDecimal enrollmentAsOfYear = null;

  @SerializedName("area_name")
  private String areaName = null;

  @SerializedName("area_type")
  private String areaType = null;

  @SerializedName("latitude")
  private Float latitude = null;

  @SerializedName("longitude")
  private Float longitude = null;

  public Municipality id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for Municipality
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for Municipality")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Municipality censusId(BigDecimal censusId) {
    this.censusId = censusId;
    return this;
  }

   /**
   * The ID for the census
   * @return censusId
  **/
  @ApiModelProperty(value = "The ID for the census")
  public BigDecimal getCensusId() {
    return censusId;
  }

  public void setCensusId(BigDecimal censusId) {
    this.censusId = censusId;
  }

  public Municipality governmentName(String governmentName) {
    this.governmentName = governmentName;
    return this;
  }

   /**
   * The government name of the Municipality
   * @return governmentName
  **/
  @ApiModelProperty(value = "The government name of the Municipality")
  public String getGovernmentName() {
    return governmentName;
  }

  public void setGovernmentName(String governmentName) {
    this.governmentName = governmentName;
  }

  public Municipality governmentType(String governmentType) {
    this.governmentType = governmentType;
    return this;
  }

   /**
   * The type of government of the Municipality
   * @return governmentType
  **/
  @ApiModelProperty(value = "The type of government of the Municipality")
  public String getGovernmentType() {
    return governmentType;
  }

  public void setGovernmentType(String governmentType) {
    this.governmentType = governmentType;
  }

  public Municipality primaryContactType(String primaryContactType) {
    this.primaryContactType = primaryContactType;
    return this;
  }

   /**
   * The primary contact type of the Municipality
   * @return primaryContactType
  **/
  @ApiModelProperty(value = "The primary contact type of the Municipality")
  public String getPrimaryContactType() {
    return primaryContactType;
  }

  public void setPrimaryContactType(String primaryContactType) {
    this.primaryContactType = primaryContactType;
  }

  public Municipality address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * The first line of the address
   * @return address1
  **/
  @ApiModelProperty(value = "The first line of the address")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Municipality address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * The second line of the address (i.e. suite number)
   * @return address2
  **/
  @ApiModelProperty(value = "The second line of the address (i.e. suite number)")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Municipality city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city in which the Municipality is located in
   * @return city
  **/
  @ApiModelProperty(value = "The city in which the Municipality is located in")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Municipality state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state in which the Municipality is located in
   * @return state
  **/
  @ApiModelProperty(value = "The state in which the Municipality is located in")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Municipality zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * The zip code in which the Municipality is located in
   * @return zip
  **/
  @ApiModelProperty(value = "The zip code in which the Municipality is located in")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Municipality webSite(String webSite) {
    this.webSite = webSite;
    return this;
  }

   /**
   * The web site of the Municipality
   * @return webSite
  **/
  @ApiModelProperty(value = "The web site of the Municipality")
  public String getWebSite() {
    return webSite;
  }

  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }

  public Municipality population(BigDecimal population) {
    this.population = population;
    return this;
  }

   /**
   * The population of the Municipality
   * @return population
  **/
  @ApiModelProperty(value = "The population of the Municipality")
  public BigDecimal getPopulation() {
    return population;
  }

  public void setPopulation(BigDecimal population) {
    this.population = population;
  }

  public Municipality populationAsOfYear(BigDecimal populationAsOfYear) {
    this.populationAsOfYear = populationAsOfYear;
    return this;
  }

   /**
   * The year from which the population of the Municipality was measured
   * @return populationAsOfYear
  **/
  @ApiModelProperty(value = "The year from which the population of the Municipality was measured")
  public BigDecimal getPopulationAsOfYear() {
    return populationAsOfYear;
  }

  public void setPopulationAsOfYear(BigDecimal populationAsOfYear) {
    this.populationAsOfYear = populationAsOfYear;
  }

  public Municipality enrollment(BigDecimal enrollment) {
    this.enrollment = enrollment;
    return this;
  }

   /**
   * The enrollment of the Municipality
   * @return enrollment
  **/
  @ApiModelProperty(value = "The enrollment of the Municipality")
  public BigDecimal getEnrollment() {
    return enrollment;
  }

  public void setEnrollment(BigDecimal enrollment) {
    this.enrollment = enrollment;
  }

  public Municipality enrollmentAsOfYear(BigDecimal enrollmentAsOfYear) {
    this.enrollmentAsOfYear = enrollmentAsOfYear;
    return this;
  }

   /**
   * The year from which the enrollment of the Municipality was measured
   * @return enrollmentAsOfYear
  **/
  @ApiModelProperty(value = "The year from which the enrollment of the Municipality was measured")
  public BigDecimal getEnrollmentAsOfYear() {
    return enrollmentAsOfYear;
  }

  public void setEnrollmentAsOfYear(BigDecimal enrollmentAsOfYear) {
    this.enrollmentAsOfYear = enrollmentAsOfYear;
  }

  public Municipality areaName(String areaName) {
    this.areaName = areaName;
    return this;
  }

   /**
   * The name of the area of the Municipality
   * @return areaName
  **/
  @ApiModelProperty(value = "The name of the area of the Municipality")
  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public Municipality areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * The type of area of the Municipality
   * @return areaType
  **/
  @ApiModelProperty(value = "The type of area of the Municipality")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public Municipality latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude of the location of the Municipality
   * @return latitude
  **/
  @ApiModelProperty(value = "The latitude of the location of the Municipality")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Municipality longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude of the location of the Municipality
   * @return longitude
  **/
  @ApiModelProperty(value = "The longitude of the location of the Municipality")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Municipality municipality = (Municipality) o;
    return Objects.equals(this.id, municipality.id) &&
        Objects.equals(this.censusId, municipality.censusId) &&
        Objects.equals(this.governmentName, municipality.governmentName) &&
        Objects.equals(this.governmentType, municipality.governmentType) &&
        Objects.equals(this.primaryContactType, municipality.primaryContactType) &&
        Objects.equals(this.address1, municipality.address1) &&
        Objects.equals(this.address2, municipality.address2) &&
        Objects.equals(this.city, municipality.city) &&
        Objects.equals(this.state, municipality.state) &&
        Objects.equals(this.zip, municipality.zip) &&
        Objects.equals(this.webSite, municipality.webSite) &&
        Objects.equals(this.population, municipality.population) &&
        Objects.equals(this.populationAsOfYear, municipality.populationAsOfYear) &&
        Objects.equals(this.enrollment, municipality.enrollment) &&
        Objects.equals(this.enrollmentAsOfYear, municipality.enrollmentAsOfYear) &&
        Objects.equals(this.areaName, municipality.areaName) &&
        Objects.equals(this.areaType, municipality.areaType) &&
        Objects.equals(this.latitude, municipality.latitude) &&
        Objects.equals(this.longitude, municipality.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, censusId, governmentName, governmentType, primaryContactType, address1, address2, city, state, zip, webSite, population, populationAsOfYear, enrollment, enrollmentAsOfYear, areaName, areaType, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Municipality {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    censusId: ").append(toIndentedString(censusId)).append("\n");
    sb.append("    governmentName: ").append(toIndentedString(governmentName)).append("\n");
    sb.append("    governmentType: ").append(toIndentedString(governmentType)).append("\n");
    sb.append("    primaryContactType: ").append(toIndentedString(primaryContactType)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    webSite: ").append(toIndentedString(webSite)).append("\n");
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    populationAsOfYear: ").append(toIndentedString(populationAsOfYear)).append("\n");
    sb.append("    enrollment: ").append(toIndentedString(enrollment)).append("\n");
    sb.append("    enrollmentAsOfYear: ").append(toIndentedString(enrollmentAsOfYear)).append("\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

