

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFStats;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Historical daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility
 */
@ApiModel(description = "Historical daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility")

public class ETFHistoricalStats {
  @SerializedName("messages")
  private  messages = null;

  @SerializedName("etf")
  private ETFSummary etf = null;

  @SerializedName("stats")
  private List<ETFStats> stats = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ETFHistoricalStats messages( messages) {
    this.messages = messages;
    return this;
  }

  public ETFHistoricalStats addMessagesItem( messagesItem) {
    if (this.messages == null) {
      this.messages = ;
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * A list of messages related to the request, such as warnings or errors.
   * @return messages
  **/
  @ApiModelProperty(value = "A list of messages related to the request, such as warnings or errors.")
  public  getMessages() {
    return messages;
  }

  public void setMessages( messages) {
    this.messages = messages;
  }

  public ETFHistoricalStats etf(ETFSummary etf) {
    this.etf = etf;
    return this;
  }

   /**
   * A brief summary of the ETF it which these stats refer.  Not included when returning historical stats.
   * @return etf
  **/
  @ApiModelProperty(value = "A brief summary of the ETF it which these stats refer.  Not included when returning historical stats.")
  public ETFSummary getEtf() {
    return etf;
  }

  public void setEtf(ETFSummary etf) {
    this.etf = etf;
  }

  public ETFHistoricalStats stats(List<ETFStats> stats) {
    this.stats = stats;
    return this;
  }

  public ETFHistoricalStats addStatsItem(ETFStats statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<>();
    }
    this.stats.add(statsItem);
    return this;
  }

   /**
   * The historical stats for the ETF
   * @return stats
  **/
  @ApiModelProperty(value = "The historical stats for the ETF")
  public List<ETFStats> getStats() {
    return stats;
  }

  public void setStats(List<ETFStats> stats) {
    this.stats = stats;
  }

  public ETFHistoricalStats nextPage(String nextPage) {
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
    ETFHistoricalStats etFHistoricalStats = (ETFHistoricalStats) o;
    return Objects.equals(this.messages, etFHistoricalStats.messages) &&
        Objects.equals(this.etf, etFHistoricalStats.etf) &&
        Objects.equals(this.stats, etFHistoricalStats.stats) &&
        Objects.equals(this.nextPage, etFHistoricalStats.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, etf, stats, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFHistoricalStats {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

