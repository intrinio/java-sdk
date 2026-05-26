

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
import org.threeten.bp.OffsetDateTime;

/**
 * The websocket status summary for a connection.
 */
@ApiModel(description = "The websocket status summary for a connection.")

public class AccountWebsocketStatus {
  @SerializedName("feed")
  private String feed = null;

  @SerializedName("feed_connection_number")
  private Integer feedConnectionNumber = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("connected_on")
  private OffsetDateTime connectedOn = null;

  @SerializedName("status_updated_on")
  private OffsetDateTime statusUpdatedOn = null;

  @SerializedName("is_delayed")
  private Boolean isDelayed = null;

  @SerializedName("is_firehose")
  private Boolean isFirehose = null;

  @SerializedName("trade_subscriptions")
  private Integer tradeSubscriptions = null;

  @SerializedName("quote_subscriptions")
  private Integer quoteSubscriptions = null;

  @SerializedName("refresh_subscriptions")
  private Integer refreshSubscriptions = null;

  @SerializedName("unusual_activity_subscriptions")
  private Integer unusualActivitySubscriptions = null;

  @SerializedName("packets_per_second")
  private BigDecimal packetsPerSecond = null;

  @SerializedName("total_packets_sent")
  private String totalPacketsSent = null;

  @SerializedName("events_per_second")
  private BigDecimal eventsPerSecond = null;

  @SerializedName("total_events")
  private String totalEvents = null;

  @SerializedName("total_sent_events")
  private String totalSentEvents = null;

  @SerializedName("total_drops")
  private String totalDrops = null;

  @SerializedName("queue_depth_percentage")
  private BigDecimal queueDepthPercentage = null;

  public AccountWebsocketStatus feed(String feed) {
    this.feed = feed;
    return this;
  }

   /**
   * The feed name for the connection.
   * @return feed
  **/
  @ApiModelProperty(value = "The feed name for the connection.")
  public String getFeed() {
    return feed;
  }

  public void setFeed(String feed) {
    this.feed = feed;
  }

  public AccountWebsocketStatus feedConnectionNumber(Integer feedConnectionNumber) {
    this.feedConnectionNumber = feedConnectionNumber;
    return this;
  }

   /**
   * The connection number for this account within a feed.
   * @return feedConnectionNumber
  **/
  @ApiModelProperty(value = "The connection number for this account within a feed.")
  public Integer getFeedConnectionNumber() {
    return feedConnectionNumber;
  }

  public void setFeedConnectionNumber(Integer feedConnectionNumber) {
    this.feedConnectionNumber = feedConnectionNumber;
  }

  public AccountWebsocketStatus ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * The IP address detected for the client connection.
   * @return ip
  **/
  @ApiModelProperty(value = "The IP address detected for the client connection.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public AccountWebsocketStatus connectedOn(OffsetDateTime connectedOn) {
    this.connectedOn = connectedOn;
    return this;
  }

   /**
   * The UTC time this client connection connected to the server.
   * @return connectedOn
  **/
  @ApiModelProperty(value = "The UTC time this client connection connected to the server.")
  public OffsetDateTime getConnectedOn() {
    return connectedOn;
  }

  public void setConnectedOn(OffsetDateTime connectedOn) {
    this.connectedOn = connectedOn;
  }

  public AccountWebsocketStatus statusUpdatedOn(OffsetDateTime statusUpdatedOn) {
    this.statusUpdatedOn = statusUpdatedOn;
    return this;
  }

   /**
   * The UTC time the server updated this client connection status data.
   * @return statusUpdatedOn
  **/
  @ApiModelProperty(value = "The UTC time the server updated this client connection status data.")
  public OffsetDateTime getStatusUpdatedOn() {
    return statusUpdatedOn;
  }

  public void setStatusUpdatedOn(OffsetDateTime statusUpdatedOn) {
    this.statusUpdatedOn = statusUpdatedOn;
  }

  public AccountWebsocketStatus isDelayed(Boolean isDelayed) {
    this.isDelayed = isDelayed;
    return this;
  }

   /**
   * Whether this connection is delayed an extra 15 minutes from the source. Note that the Delayed SIP source is already delayed, so this value will be false for those connections.
   * @return isDelayed
  **/
  @ApiModelProperty(value = "Whether this connection is delayed an extra 15 minutes from the source. Note that the Delayed SIP source is already delayed, so this value will be false for those connections.")
  public Boolean isIsDelayed() {
    return isDelayed;
  }

  public void setIsDelayed(Boolean isDelayed) {
    this.isDelayed = isDelayed;
  }

  public AccountWebsocketStatus isFirehose(Boolean isFirehose) {
    this.isFirehose = isFirehose;
    return this;
  }

   /**
   * The client connection is in firehose mode (all channels subscribed).
   * @return isFirehose
  **/
  @ApiModelProperty(value = "The client connection is in firehose mode (all channels subscribed).")
  public Boolean isIsFirehose() {
    return isFirehose;
  }

  public void setIsFirehose(Boolean isFirehose) {
    this.isFirehose = isFirehose;
  }

  public AccountWebsocketStatus tradeSubscriptions(Integer tradeSubscriptions) {
    this.tradeSubscriptions = tradeSubscriptions;
    return this;
  }

   /**
   * The count of channel subscriptions for trade events.
   * @return tradeSubscriptions
  **/
  @ApiModelProperty(value = "The count of channel subscriptions for trade events.")
  public Integer getTradeSubscriptions() {
    return tradeSubscriptions;
  }

  public void setTradeSubscriptions(Integer tradeSubscriptions) {
    this.tradeSubscriptions = tradeSubscriptions;
  }

  public AccountWebsocketStatus quoteSubscriptions(Integer quoteSubscriptions) {
    this.quoteSubscriptions = quoteSubscriptions;
    return this;
  }

   /**
   * The count of channel subscriptions for ask and bid events.
   * @return quoteSubscriptions
  **/
  @ApiModelProperty(value = "The count of channel subscriptions for ask and bid events.")
  public Integer getQuoteSubscriptions() {
    return quoteSubscriptions;
  }

  public void setQuoteSubscriptions(Integer quoteSubscriptions) {
    this.quoteSubscriptions = quoteSubscriptions;
  }

  public AccountWebsocketStatus refreshSubscriptions(Integer refreshSubscriptions) {
    this.refreshSubscriptions = refreshSubscriptions;
    return this;
  }

   /**
   * The count of channel subscriptions for refresh events (OPRA options feed only).
   * @return refreshSubscriptions
  **/
  @ApiModelProperty(value = "The count of channel subscriptions for refresh events (OPRA options feed only).")
  public Integer getRefreshSubscriptions() {
    return refreshSubscriptions;
  }

  public void setRefreshSubscriptions(Integer refreshSubscriptions) {
    this.refreshSubscriptions = refreshSubscriptions;
  }

  public AccountWebsocketStatus unusualActivitySubscriptions(Integer unusualActivitySubscriptions) {
    this.unusualActivitySubscriptions = unusualActivitySubscriptions;
    return this;
  }

   /**
   * The count of channel subscriptions for unusual activity events (OPRA options feed only).
   * @return unusualActivitySubscriptions
  **/
  @ApiModelProperty(value = "The count of channel subscriptions for unusual activity events (OPRA options feed only).")
  public Integer getUnusualActivitySubscriptions() {
    return unusualActivitySubscriptions;
  }

  public void setUnusualActivitySubscriptions(Integer unusualActivitySubscriptions) {
    this.unusualActivitySubscriptions = unusualActivitySubscriptions;
  }

  public AccountWebsocketStatus packetsPerSecond(BigDecimal packetsPerSecond) {
    this.packetsPerSecond = packetsPerSecond;
    return this;
  }

   /**
   * The packets per second sent since the last status update.
   * @return packetsPerSecond
  **/
  @ApiModelProperty(value = "The packets per second sent since the last status update.")
  public BigDecimal getPacketsPerSecond() {
    return packetsPerSecond;
  }

  public void setPacketsPerSecond(BigDecimal packetsPerSecond) {
    this.packetsPerSecond = packetsPerSecond;
  }

  public AccountWebsocketStatus totalPacketsSent(String totalPacketsSent) {
    this.totalPacketsSent = totalPacketsSent;
    return this;
  }

   /**
   * The total packets sent since the beginning of this connection.  A packet is a group of events sent as one message over the websocket.
   * @return totalPacketsSent
  **/
  @ApiModelProperty(value = "The total packets sent since the beginning of this connection.  A packet is a group of events sent as one message over the websocket.")
  public String getTotalPacketsSent() {
    return totalPacketsSent;
  }

  public void setTotalPacketsSent(String totalPacketsSent) {
    this.totalPacketsSent = totalPacketsSent;
  }

  public AccountWebsocketStatus eventsPerSecond(BigDecimal eventsPerSecond) {
    this.eventsPerSecond = eventsPerSecond;
    return this;
  }

   /**
   * The events per second sent since the last status update.
   * @return eventsPerSecond
  **/
  @ApiModelProperty(value = "The events per second sent since the last status update.")
  public BigDecimal getEventsPerSecond() {
    return eventsPerSecond;
  }

  public void setEventsPerSecond(BigDecimal eventsPerSecond) {
    this.eventsPerSecond = eventsPerSecond;
  }

  public AccountWebsocketStatus totalEvents(String totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

   /**
   * The total events sent to this connection&#39;s server-side queue since the beginning of this connection.  An event is an individual occurrence of a trade, quote, etc.
   * @return totalEvents
  **/
  @ApiModelProperty(value = "The total events sent to this connection's server-side queue since the beginning of this connection.  An event is an individual occurrence of a trade, quote, etc.")
  public String getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(String totalEvents) {
    this.totalEvents = totalEvents;
  }

  public AccountWebsocketStatus totalSentEvents(String totalSentEvents) {
    this.totalSentEvents = totalSentEvents;
    return this;
  }

   /**
   * The total events sent to the client inside packets. A packet is a group of events sent as one message over the websocket.
   * @return totalSentEvents
  **/
  @ApiModelProperty(value = "The total events sent to the client inside packets. A packet is a group of events sent as one message over the websocket.")
  public String getTotalSentEvents() {
    return totalSentEvents;
  }

  public void setTotalSentEvents(String totalSentEvents) {
    this.totalSentEvents = totalSentEvents;
  }

  public AccountWebsocketStatus totalDrops(String totalDrops) {
    this.totalDrops = totalDrops;
    return this;
  }

   /**
   * The total number of events dropped from the connection&#39;s server-side queue.  Event drops happen when the connection&#39;s server-side queue is full. The server-side queue fills due to client-side connections not receiving packets fast enough, which can be caused by a slow network, or clients not decoupling processing of packets from the receipt of packets.
   * @return totalDrops
  **/
  @ApiModelProperty(value = "The total number of events dropped from the connection's server-side queue.  Event drops happen when the connection's server-side queue is full. The server-side queue fills due to client-side connections not receiving packets fast enough, which can be caused by a slow network, or clients not decoupling processing of packets from the receipt of packets.")
  public String getTotalDrops() {
    return totalDrops;
  }

  public void setTotalDrops(String totalDrops) {
    this.totalDrops = totalDrops;
  }

  public AccountWebsocketStatus queueDepthPercentage(BigDecimal queueDepthPercentage) {
    this.queueDepthPercentage = queueDepthPercentage;
    return this;
  }

   /**
   * The percentage that the connection&#39;s server-side queue is full. 0-100.
   * @return queueDepthPercentage
  **/
  @ApiModelProperty(value = "The percentage that the connection's server-side queue is full. 0-100.")
  public BigDecimal getQueueDepthPercentage() {
    return queueDepthPercentage;
  }

  public void setQueueDepthPercentage(BigDecimal queueDepthPercentage) {
    this.queueDepthPercentage = queueDepthPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWebsocketStatus accountWebsocketStatus = (AccountWebsocketStatus) o;
    return Objects.equals(this.feed, accountWebsocketStatus.feed) &&
        Objects.equals(this.feedConnectionNumber, accountWebsocketStatus.feedConnectionNumber) &&
        Objects.equals(this.ip, accountWebsocketStatus.ip) &&
        Objects.equals(this.connectedOn, accountWebsocketStatus.connectedOn) &&
        Objects.equals(this.statusUpdatedOn, accountWebsocketStatus.statusUpdatedOn) &&
        Objects.equals(this.isDelayed, accountWebsocketStatus.isDelayed) &&
        Objects.equals(this.isFirehose, accountWebsocketStatus.isFirehose) &&
        Objects.equals(this.tradeSubscriptions, accountWebsocketStatus.tradeSubscriptions) &&
        Objects.equals(this.quoteSubscriptions, accountWebsocketStatus.quoteSubscriptions) &&
        Objects.equals(this.refreshSubscriptions, accountWebsocketStatus.refreshSubscriptions) &&
        Objects.equals(this.unusualActivitySubscriptions, accountWebsocketStatus.unusualActivitySubscriptions) &&
        Objects.equals(this.packetsPerSecond, accountWebsocketStatus.packetsPerSecond) &&
        Objects.equals(this.totalPacketsSent, accountWebsocketStatus.totalPacketsSent) &&
        Objects.equals(this.eventsPerSecond, accountWebsocketStatus.eventsPerSecond) &&
        Objects.equals(this.totalEvents, accountWebsocketStatus.totalEvents) &&
        Objects.equals(this.totalSentEvents, accountWebsocketStatus.totalSentEvents) &&
        Objects.equals(this.totalDrops, accountWebsocketStatus.totalDrops) &&
        Objects.equals(this.queueDepthPercentage, accountWebsocketStatus.queueDepthPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feed, feedConnectionNumber, ip, connectedOn, statusUpdatedOn, isDelayed, isFirehose, tradeSubscriptions, quoteSubscriptions, refreshSubscriptions, unusualActivitySubscriptions, packetsPerSecond, totalPacketsSent, eventsPerSecond, totalEvents, totalSentEvents, totalDrops, queueDepthPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWebsocketStatus {\n");
    
    sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
    sb.append("    feedConnectionNumber: ").append(toIndentedString(feedConnectionNumber)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    connectedOn: ").append(toIndentedString(connectedOn)).append("\n");
    sb.append("    statusUpdatedOn: ").append(toIndentedString(statusUpdatedOn)).append("\n");
    sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
    sb.append("    isFirehose: ").append(toIndentedString(isFirehose)).append("\n");
    sb.append("    tradeSubscriptions: ").append(toIndentedString(tradeSubscriptions)).append("\n");
    sb.append("    quoteSubscriptions: ").append(toIndentedString(quoteSubscriptions)).append("\n");
    sb.append("    refreshSubscriptions: ").append(toIndentedString(refreshSubscriptions)).append("\n");
    sb.append("    unusualActivitySubscriptions: ").append(toIndentedString(unusualActivitySubscriptions)).append("\n");
    sb.append("    packetsPerSecond: ").append(toIndentedString(packetsPerSecond)).append("\n");
    sb.append("    totalPacketsSent: ").append(toIndentedString(totalPacketsSent)).append("\n");
    sb.append("    eventsPerSecond: ").append(toIndentedString(eventsPerSecond)).append("\n");
    sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
    sb.append("    totalSentEvents: ").append(toIndentedString(totalSentEvents)).append("\n");
    sb.append("    totalDrops: ").append(toIndentedString(totalDrops)).append("\n");
    sb.append("    queueDepthPercentage: ").append(toIndentedString(queueDepthPercentage)).append("\n");
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

