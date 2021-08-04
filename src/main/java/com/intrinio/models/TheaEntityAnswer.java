

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.TheaSourceDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An answer object returned by Thea in response to a query about a specific entity
 */
@ApiModel(description = "An answer object returned by Thea in response to a query about a specific entity")

public class TheaEntityAnswer {
  @SerializedName("answer")
  private String answer = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("source_documents")
  private List<TheaSourceDocument> sourceDocuments = null;

  public TheaEntityAnswer answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * The summarized answer returned from Thea
   * @return answer
  **/
  @ApiModelProperty(value = "The summarized answer returned from Thea")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public TheaEntityAnswer content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The underlying content the answer was sourced from
   * @return content
  **/
  @ApiModelProperty(value = "The underlying content the answer was sourced from")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public TheaEntityAnswer sourceDocuments(List<TheaSourceDocument> sourceDocuments) {
    this.sourceDocuments = sourceDocuments;
    return this;
  }

  public TheaEntityAnswer addSourceDocumentsItem(TheaSourceDocument sourceDocumentsItem) {
    if (this.sourceDocuments == null) {
      this.sourceDocuments = new ArrayList<>();
    }
    this.sourceDocuments.add(sourceDocumentsItem);
    return this;
  }

   /**
   * The documents from which Thea answer data is sourced
   * @return sourceDocuments
  **/
  @ApiModelProperty(value = "The documents from which Thea answer data is sourced")
  public List<TheaSourceDocument> getSourceDocuments() {
    return sourceDocuments;
  }

  public void setSourceDocuments(List<TheaSourceDocument> sourceDocuments) {
    this.sourceDocuments = sourceDocuments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheaEntityAnswer theaEntityAnswer = (TheaEntityAnswer) o;
    return Objects.equals(this.answer, theaEntityAnswer.answer) &&
        Objects.equals(this.content, theaEntityAnswer.content) &&
        Objects.equals(this.sourceDocuments, theaEntityAnswer.sourceDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, content, sourceDocuments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheaEntityAnswer {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    sourceDocuments: ").append(toIndentedString(sourceDocuments)).append("\n");
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

