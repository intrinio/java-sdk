

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Option;
import com.intrinio.models.OptionSyntheticGreeksRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsGreekContractRealtime
 */

public class ApiResponseOptionsGreekContractRealtime {
  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("option")
  private Option option = null;

  @SerializedName("greeks")
  private OptionSyntheticGreeksRealtime greeks = null;

  public ApiResponseOptionsGreekContractRealtime messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ApiResponseOptionsGreekContractRealtime addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Any messages or warnings about the data
   * @return messages
  **/
  @ApiModelProperty(value = "Any messages or warnings about the data")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public ApiResponseOptionsGreekContractRealtime option(Option option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public Option getOption() {
    return option;
  }

  public void setOption(Option option) {
    this.option = option;
  }

  public ApiResponseOptionsGreekContractRealtime greeks(OptionSyntheticGreeksRealtime greeks) {
    this.greeks = greeks;
    return this;
  }

   /**
   * Get greeks
   * @return greeks
  **/
  @ApiModelProperty(value = "")
  public OptionSyntheticGreeksRealtime getGreeks() {
    return greeks;
  }

  public void setGreeks(OptionSyntheticGreeksRealtime greeks) {
    this.greeks = greeks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsGreekContractRealtime apiResponseOptionsGreekContractRealtime = (ApiResponseOptionsGreekContractRealtime) o;
    return Objects.equals(this.messages, apiResponseOptionsGreekContractRealtime.messages) &&
        Objects.equals(this.option, apiResponseOptionsGreekContractRealtime.option) &&
        Objects.equals(this.greeks, apiResponseOptionsGreekContractRealtime.greeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, option, greeks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsGreekContractRealtime {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    greeks: ").append(toIndentedString(greeks)).append("\n");
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

