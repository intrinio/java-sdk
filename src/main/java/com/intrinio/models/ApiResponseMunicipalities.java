

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Municipality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseMunicipalities
 */

public class ApiResponseMunicipalities {
  @SerializedName("municipalities")
  private List<Municipality> municipalities = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseMunicipalities municipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public ApiResponseMunicipalities addMunicipalitiesItem(Municipality municipalitiesItem) {
    if (this.municipalities == null) {
      this.municipalities = new ArrayList<Municipality>();
    }
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * Get municipalities
   * @return municipalities
  **/
  @ApiModelProperty(value = "")
  public List<Municipality> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
  }

  public ApiResponseMunicipalities nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data. If null, no further results are available.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data. If null, no further results are available.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseMunicipalities apiResponseMunicipalities = (ApiResponseMunicipalities) o;
    return Objects.equals(this.municipalities, apiResponseMunicipalities.municipalities) &&
        Objects.equals(this.nextPage, apiResponseMunicipalities.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(municipalities, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseMunicipalities {\n");
    
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

