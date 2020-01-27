

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * An earnings record for the identifier
 */
@ApiModel(description = "An earnings record for the identifier")

public class EarningsRecord {
  @SerializedName("quarter")
  private String quarter = null;

  /**
   * Indicates the time of the announcement
   */
  @JsonAdapter(TimeOfDayEnum.Adapter.class)
  public enum TimeOfDayEnum {
    BEFORE_MARKET("Before Market"),
    
    DURING_MARKET("During Market"),
    
    AFTER_MARKET("After Market"),
    
    UNSPECIFIED("Unspecified");

    private String value;

    TimeOfDayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeOfDayEnum fromValue(String text) {
      for (TimeOfDayEnum b : TimeOfDayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TimeOfDayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeOfDayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeOfDayEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeOfDayEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("time_of_day")
  private TimeOfDayEnum timeOfDay = null;

  @SerializedName("broadcast_url")
  private String broadcastUrl = null;

  @SerializedName("transcript_url")
  private String transcriptUrl = null;

  @SerializedName("transcript_quarter")
  private String transcriptQuarter = null;

  @SerializedName("transcript_fiscal_year")
  private String transcriptFiscalYear = null;

  @SerializedName("conference_call_date")
  private LocalDate conferenceCallDate = null;

  @SerializedName("conference_call_time")
  private String conferenceCallTime = null;

  @SerializedName("conference_call_phone_number")
  private String conferenceCallPhoneNumber = null;

  @SerializedName("conference_call_passcode")
  private String conferenceCallPasscode = null;

  @SerializedName("last_confirmation_date")
  private LocalDate lastConfirmationDate = null;

  @SerializedName("board_of_directors_meeting_date")
  private LocalDate boardOfDirectorsMeetingDate = null;

  /**
   * The type of meeting - \&quot;B\&quot; indicates a Board of Directors meeting and \&quot;S\&quot; indicates a Shareholder meeting
   */
  @JsonAdapter(BoardOfDirectorsMeetingTypeEnum.Adapter.class)
  public enum BoardOfDirectorsMeetingTypeEnum {
    B("B"),
    
    S("S");

    private String value;

    BoardOfDirectorsMeetingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BoardOfDirectorsMeetingTypeEnum fromValue(String text) {
      for (BoardOfDirectorsMeetingTypeEnum b : BoardOfDirectorsMeetingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BoardOfDirectorsMeetingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BoardOfDirectorsMeetingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BoardOfDirectorsMeetingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BoardOfDirectorsMeetingTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("board_of_directors_meeting_type")
  private BoardOfDirectorsMeetingTypeEnum boardOfDirectorsMeetingType = null;

  @SerializedName("company_website")
  private String companyWebsite = null;

  @SerializedName("q1_date")
  private LocalDate q1Date = null;

  @SerializedName("q2_date")
  private LocalDate q2Date = null;

  @SerializedName("q3_date")
  private LocalDate q3Date = null;

  @SerializedName("q4_date")
  private LocalDate q4Date = null;

  /**
   * The nature of the next reported earnings date - \&quot;V\&quot; indicates a Verified date, \&quot;T\&quot; indicates that the date was gathered from the company, but is still considered Tentative, and \&quot;I\&quot; indicates that the date is forecased or Inferred
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    V("V"),
    
    T("T"),
    
    I("I");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("next_earnings_date")
  private LocalDate nextEarningsDate = null;

  @SerializedName("next_earnings_quarter")
  private String nextEarningsQuarter = null;

  @SerializedName("next_earnings_fiscal_year")
  private Integer nextEarningsFiscalYear = null;

  @SerializedName("preliminary_earnings_date")
  private LocalDate preliminaryEarningsDate = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public EarningsRecord quarter(String quarter) {
    this.quarter = quarter;
    return this;
  }

   /**
   * The letter “Q” followed by the quarter number the earnings information applies to
   * @return quarter
  **/
  @ApiModelProperty(value = "The letter “Q” followed by the quarter number the earnings information applies to")
  public String getQuarter() {
    return quarter;
  }

  public void setQuarter(String quarter) {
    this.quarter = quarter;
  }

  public EarningsRecord timeOfDay(TimeOfDayEnum timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

   /**
   * Indicates the time of the announcement
   * @return timeOfDay
  **/
  @ApiModelProperty(value = "Indicates the time of the announcement")
  public TimeOfDayEnum getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(TimeOfDayEnum timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public EarningsRecord broadcastUrl(String broadcastUrl) {
    this.broadcastUrl = broadcastUrl;
    return this;
  }

   /**
   * Link for Conference Call recording
   * @return broadcastUrl
  **/
  @ApiModelProperty(value = "Link for Conference Call recording")
  public String getBroadcastUrl() {
    return broadcastUrl;
  }

  public void setBroadcastUrl(String broadcastUrl) {
    this.broadcastUrl = broadcastUrl;
  }

  public EarningsRecord transcriptUrl(String transcriptUrl) {
    this.transcriptUrl = transcriptUrl;
    return this;
  }

   /**
   * Link to the earnings release transcript
   * @return transcriptUrl
  **/
  @ApiModelProperty(value = "Link to the earnings release transcript")
  public String getTranscriptUrl() {
    return transcriptUrl;
  }

  public void setTranscriptUrl(String transcriptUrl) {
    this.transcriptUrl = transcriptUrl;
  }

  public EarningsRecord transcriptQuarter(String transcriptQuarter) {
    this.transcriptQuarter = transcriptQuarter;
    return this;
  }

   /**
   * The letter “Q” followed by the quarter number the earnings transcript applies to
   * @return transcriptQuarter
  **/
  @ApiModelProperty(value = "The letter “Q” followed by the quarter number the earnings transcript applies to")
  public String getTranscriptQuarter() {
    return transcriptQuarter;
  }

  public void setTranscriptQuarter(String transcriptQuarter) {
    this.transcriptQuarter = transcriptQuarter;
  }

  public EarningsRecord transcriptFiscalYear(String transcriptFiscalYear) {
    this.transcriptFiscalYear = transcriptFiscalYear;
    return this;
  }

   /**
   * Fiscal year in YYYY format for the earnings transcript
   * @return transcriptFiscalYear
  **/
  @ApiModelProperty(value = "Fiscal year in YYYY format for the earnings transcript")
  public String getTranscriptFiscalYear() {
    return transcriptFiscalYear;
  }

  public void setTranscriptFiscalYear(String transcriptFiscalYear) {
    this.transcriptFiscalYear = transcriptFiscalYear;
  }

  public EarningsRecord conferenceCallDate(LocalDate conferenceCallDate) {
    this.conferenceCallDate = conferenceCallDate;
    return this;
  }

   /**
   * Date of the conference call
   * @return conferenceCallDate
  **/
  @ApiModelProperty(value = "Date of the conference call")
  public LocalDate getConferenceCallDate() {
    return conferenceCallDate;
  }

  public void setConferenceCallDate(LocalDate conferenceCallDate) {
    this.conferenceCallDate = conferenceCallDate;
  }

  public EarningsRecord conferenceCallTime(String conferenceCallTime) {
    this.conferenceCallTime = conferenceCallTime;
    return this;
  }

   /**
   * Published time of the conference call
   * @return conferenceCallTime
  **/
  @ApiModelProperty(value = "Published time of the conference call")
  public String getConferenceCallTime() {
    return conferenceCallTime;
  }

  public void setConferenceCallTime(String conferenceCallTime) {
    this.conferenceCallTime = conferenceCallTime;
  }

  public EarningsRecord conferenceCallPhoneNumber(String conferenceCallPhoneNumber) {
    this.conferenceCallPhoneNumber = conferenceCallPhoneNumber;
    return this;
  }

   /**
   * Publicly available phone number for replay conference call
   * @return conferenceCallPhoneNumber
  **/
  @ApiModelProperty(value = "Publicly available phone number for replay conference call")
  public String getConferenceCallPhoneNumber() {
    return conferenceCallPhoneNumber;
  }

  public void setConferenceCallPhoneNumber(String conferenceCallPhoneNumber) {
    this.conferenceCallPhoneNumber = conferenceCallPhoneNumber;
  }

  public EarningsRecord conferenceCallPasscode(String conferenceCallPasscode) {
    this.conferenceCallPasscode = conferenceCallPasscode;
    return this;
  }

   /**
   * Passcode for replay conference call
   * @return conferenceCallPasscode
  **/
  @ApiModelProperty(value = "Passcode for replay conference call")
  public String getConferenceCallPasscode() {
    return conferenceCallPasscode;
  }

  public void setConferenceCallPasscode(String conferenceCallPasscode) {
    this.conferenceCallPasscode = conferenceCallPasscode;
  }

  public EarningsRecord lastConfirmationDate(LocalDate lastConfirmationDate) {
    this.lastConfirmationDate = lastConfirmationDate;
    return this;
  }

   /**
   * Date of last earnings date update by a WSH analyst
   * @return lastConfirmationDate
  **/
  @ApiModelProperty(value = "Date of last earnings date update by a WSH analyst")
  public LocalDate getLastConfirmationDate() {
    return lastConfirmationDate;
  }

  public void setLastConfirmationDate(LocalDate lastConfirmationDate) {
    this.lastConfirmationDate = lastConfirmationDate;
  }

  public EarningsRecord boardOfDirectorsMeetingDate(LocalDate boardOfDirectorsMeetingDate) {
    this.boardOfDirectorsMeetingDate = boardOfDirectorsMeetingDate;
    return this;
  }

   /**
   * Date of Board/Shareholder Meeting
   * @return boardOfDirectorsMeetingDate
  **/
  @ApiModelProperty(value = "Date of Board/Shareholder Meeting")
  public LocalDate getBoardOfDirectorsMeetingDate() {
    return boardOfDirectorsMeetingDate;
  }

  public void setBoardOfDirectorsMeetingDate(LocalDate boardOfDirectorsMeetingDate) {
    this.boardOfDirectorsMeetingDate = boardOfDirectorsMeetingDate;
  }

  public EarningsRecord boardOfDirectorsMeetingType(BoardOfDirectorsMeetingTypeEnum boardOfDirectorsMeetingType) {
    this.boardOfDirectorsMeetingType = boardOfDirectorsMeetingType;
    return this;
  }

   /**
   * The type of meeting - \&quot;B\&quot; indicates a Board of Directors meeting and \&quot;S\&quot; indicates a Shareholder meeting
   * @return boardOfDirectorsMeetingType
  **/
  @ApiModelProperty(value = "The type of meeting - \"B\" indicates a Board of Directors meeting and \"S\" indicates a Shareholder meeting")
  public BoardOfDirectorsMeetingTypeEnum getBoardOfDirectorsMeetingType() {
    return boardOfDirectorsMeetingType;
  }

  public void setBoardOfDirectorsMeetingType(BoardOfDirectorsMeetingTypeEnum boardOfDirectorsMeetingType) {
    this.boardOfDirectorsMeetingType = boardOfDirectorsMeetingType;
  }

  public EarningsRecord companyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
    return this;
  }

   /**
   * Website link for the company
   * @return companyWebsite
  **/
  @ApiModelProperty(value = "Website link for the company")
  public String getCompanyWebsite() {
    return companyWebsite;
  }

  public void setCompanyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
  }

  public EarningsRecord q1Date(LocalDate q1Date) {
    this.q1Date = q1Date;
    return this;
  }

   /**
   * Earnings Date for 1st quarter
   * @return q1Date
  **/
  @ApiModelProperty(value = "Earnings Date for 1st quarter")
  public LocalDate getQ1Date() {
    return q1Date;
  }

  public void setQ1Date(LocalDate q1Date) {
    this.q1Date = q1Date;
  }

  public EarningsRecord q2Date(LocalDate q2Date) {
    this.q2Date = q2Date;
    return this;
  }

   /**
   * Earnings Date for 2nd quarter
   * @return q2Date
  **/
  @ApiModelProperty(value = "Earnings Date for 2nd quarter")
  public LocalDate getQ2Date() {
    return q2Date;
  }

  public void setQ2Date(LocalDate q2Date) {
    this.q2Date = q2Date;
  }

  public EarningsRecord q3Date(LocalDate q3Date) {
    this.q3Date = q3Date;
    return this;
  }

   /**
   * Earnings Date for 3rd quarter
   * @return q3Date
  **/
  @ApiModelProperty(value = "Earnings Date for 3rd quarter")
  public LocalDate getQ3Date() {
    return q3Date;
  }

  public void setQ3Date(LocalDate q3Date) {
    this.q3Date = q3Date;
  }

  public EarningsRecord q4Date(LocalDate q4Date) {
    this.q4Date = q4Date;
    return this;
  }

   /**
   * Earnings Date for 4th quarter
   * @return q4Date
  **/
  @ApiModelProperty(value = "Earnings Date for 4th quarter")
  public LocalDate getQ4Date() {
    return q4Date;
  }

  public void setQ4Date(LocalDate q4Date) {
    this.q4Date = q4Date;
  }

  public EarningsRecord type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The nature of the next reported earnings date - \&quot;V\&quot; indicates a Verified date, \&quot;T\&quot; indicates that the date was gathered from the company, but is still considered Tentative, and \&quot;I\&quot; indicates that the date is forecased or Inferred
   * @return type
  **/
  @ApiModelProperty(value = "The nature of the next reported earnings date - \"V\" indicates a Verified date, \"T\" indicates that the date was gathered from the company, but is still considered Tentative, and \"I\" indicates that the date is forecased or Inferred")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EarningsRecord nextEarningsDate(LocalDate nextEarningsDate) {
    this.nextEarningsDate = nextEarningsDate;
    return this;
  }

   /**
   * Next earnings date
   * @return nextEarningsDate
  **/
  @ApiModelProperty(value = "Next earnings date")
  public LocalDate getNextEarningsDate() {
    return nextEarningsDate;
  }

  public void setNextEarningsDate(LocalDate nextEarningsDate) {
    this.nextEarningsDate = nextEarningsDate;
  }

  public EarningsRecord nextEarningsQuarter(String nextEarningsQuarter) {
    this.nextEarningsQuarter = nextEarningsQuarter;
    return this;
  }

   /**
   * The quarter of the next earnings release
   * @return nextEarningsQuarter
  **/
  @ApiModelProperty(value = "The quarter of the next earnings release")
  public String getNextEarningsQuarter() {
    return nextEarningsQuarter;
  }

  public void setNextEarningsQuarter(String nextEarningsQuarter) {
    this.nextEarningsQuarter = nextEarningsQuarter;
  }

  public EarningsRecord nextEarningsFiscalYear(Integer nextEarningsFiscalYear) {
    this.nextEarningsFiscalYear = nextEarningsFiscalYear;
    return this;
  }

   /**
   * The fiscal year associated with next earnings date and next earnings quarter
   * @return nextEarningsFiscalYear
  **/
  @ApiModelProperty(value = "The fiscal year associated with next earnings date and next earnings quarter")
  public Integer getNextEarningsFiscalYear() {
    return nextEarningsFiscalYear;
  }

  public void setNextEarningsFiscalYear(Integer nextEarningsFiscalYear) {
    this.nextEarningsFiscalYear = nextEarningsFiscalYear;
  }

  public EarningsRecord preliminaryEarningsDate(LocalDate preliminaryEarningsDate) {
    this.preliminaryEarningsDate = preliminaryEarningsDate;
    return this;
  }

   /**
   * The release date of a preliminary earnings report
   * @return preliminaryEarningsDate
  **/
  @ApiModelProperty(value = "The release date of a preliminary earnings report")
  public LocalDate getPreliminaryEarningsDate() {
    return preliminaryEarningsDate;
  }

  public void setPreliminaryEarningsDate(LocalDate preliminaryEarningsDate) {
    this.preliminaryEarningsDate = preliminaryEarningsDate;
  }

  public EarningsRecord security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsRecord earningsRecord = (EarningsRecord) o;
    return Objects.equals(this.quarter, earningsRecord.quarter) &&
        Objects.equals(this.timeOfDay, earningsRecord.timeOfDay) &&
        Objects.equals(this.broadcastUrl, earningsRecord.broadcastUrl) &&
        Objects.equals(this.transcriptUrl, earningsRecord.transcriptUrl) &&
        Objects.equals(this.transcriptQuarter, earningsRecord.transcriptQuarter) &&
        Objects.equals(this.transcriptFiscalYear, earningsRecord.transcriptFiscalYear) &&
        Objects.equals(this.conferenceCallDate, earningsRecord.conferenceCallDate) &&
        Objects.equals(this.conferenceCallTime, earningsRecord.conferenceCallTime) &&
        Objects.equals(this.conferenceCallPhoneNumber, earningsRecord.conferenceCallPhoneNumber) &&
        Objects.equals(this.conferenceCallPasscode, earningsRecord.conferenceCallPasscode) &&
        Objects.equals(this.lastConfirmationDate, earningsRecord.lastConfirmationDate) &&
        Objects.equals(this.boardOfDirectorsMeetingDate, earningsRecord.boardOfDirectorsMeetingDate) &&
        Objects.equals(this.boardOfDirectorsMeetingType, earningsRecord.boardOfDirectorsMeetingType) &&
        Objects.equals(this.companyWebsite, earningsRecord.companyWebsite) &&
        Objects.equals(this.q1Date, earningsRecord.q1Date) &&
        Objects.equals(this.q2Date, earningsRecord.q2Date) &&
        Objects.equals(this.q3Date, earningsRecord.q3Date) &&
        Objects.equals(this.q4Date, earningsRecord.q4Date) &&
        Objects.equals(this.type, earningsRecord.type) &&
        Objects.equals(this.nextEarningsDate, earningsRecord.nextEarningsDate) &&
        Objects.equals(this.nextEarningsQuarter, earningsRecord.nextEarningsQuarter) &&
        Objects.equals(this.nextEarningsFiscalYear, earningsRecord.nextEarningsFiscalYear) &&
        Objects.equals(this.preliminaryEarningsDate, earningsRecord.preliminaryEarningsDate) &&
        Objects.equals(this.security, earningsRecord.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quarter, timeOfDay, broadcastUrl, transcriptUrl, transcriptQuarter, transcriptFiscalYear, conferenceCallDate, conferenceCallTime, conferenceCallPhoneNumber, conferenceCallPasscode, lastConfirmationDate, boardOfDirectorsMeetingDate, boardOfDirectorsMeetingType, companyWebsite, q1Date, q2Date, q3Date, q4Date, type, nextEarningsDate, nextEarningsQuarter, nextEarningsFiscalYear, preliminaryEarningsDate, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsRecord {\n");
    
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    broadcastUrl: ").append(toIndentedString(broadcastUrl)).append("\n");
    sb.append("    transcriptUrl: ").append(toIndentedString(transcriptUrl)).append("\n");
    sb.append("    transcriptQuarter: ").append(toIndentedString(transcriptQuarter)).append("\n");
    sb.append("    transcriptFiscalYear: ").append(toIndentedString(transcriptFiscalYear)).append("\n");
    sb.append("    conferenceCallDate: ").append(toIndentedString(conferenceCallDate)).append("\n");
    sb.append("    conferenceCallTime: ").append(toIndentedString(conferenceCallTime)).append("\n");
    sb.append("    conferenceCallPhoneNumber: ").append(toIndentedString(conferenceCallPhoneNumber)).append("\n");
    sb.append("    conferenceCallPasscode: ").append(toIndentedString(conferenceCallPasscode)).append("\n");
    sb.append("    lastConfirmationDate: ").append(toIndentedString(lastConfirmationDate)).append("\n");
    sb.append("    boardOfDirectorsMeetingDate: ").append(toIndentedString(boardOfDirectorsMeetingDate)).append("\n");
    sb.append("    boardOfDirectorsMeetingType: ").append(toIndentedString(boardOfDirectorsMeetingType)).append("\n");
    sb.append("    companyWebsite: ").append(toIndentedString(companyWebsite)).append("\n");
    sb.append("    q1Date: ").append(toIndentedString(q1Date)).append("\n");
    sb.append("    q2Date: ").append(toIndentedString(q2Date)).append("\n");
    sb.append("    q3Date: ").append(toIndentedString(q3Date)).append("\n");
    sb.append("    q4Date: ").append(toIndentedString(q4Date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nextEarningsDate: ").append(toIndentedString(nextEarningsDate)).append("\n");
    sb.append("    nextEarningsQuarter: ").append(toIndentedString(nextEarningsQuarter)).append("\n");
    sb.append("    nextEarningsFiscalYear: ").append(toIndentedString(nextEarningsFiscalYear)).append("\n");
    sb.append("    preliminaryEarningsDate: ").append(toIndentedString(preliminaryEarningsDate)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

