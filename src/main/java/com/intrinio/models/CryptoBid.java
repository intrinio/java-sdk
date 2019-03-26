

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
 * A Crypto Currency Bid Price
 */
@ApiModel(description = "A Crypto Currency Bid Price")

public class CryptoBid {
  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("size")
  private BigDecimal size = null;

  public CryptoBid price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * The bid price of the book entry.
   * @return price
  **/
  @ApiModelProperty(value = "The bid price of the book entry.")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CryptoBid size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The size for the bid price of the book entry.
   * @return size
  **/
  @ApiModelProperty(value = "The size for the bid price of the book entry.")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoBid cryptoBid = (CryptoBid) o;
    return Objects.equals(this.price, cryptoBid.price) &&
        Objects.equals(this.size, cryptoBid.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoBid {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

