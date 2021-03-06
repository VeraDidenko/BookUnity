/*
 * Swagger BookUnity
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import javax.validation.constraints.*;

/**
 * Massage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-24T18:42:49.417Z")
public class Massage   {
  @JsonProperty("content")
  private String content = null;

  @JsonProperty("createAt")
  private String createAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("to")
  private Account to = null;

  @JsonProperty("from")
  private Account from = null;

  public Massage content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @JsonProperty("content")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Massage createAt(String createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * Get createAt
   * @return createAt
   **/
  @JsonProperty("createAt")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getCreateAt() {
    return createAt;
  }

  public void setCreateAt(String createAt) {
    this.createAt = createAt;
  }

  public Massage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Massage to(Account to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   **/
  @JsonProperty("to")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Account getTo() {
    return to;
  }

  public void setTo(Account to) {
    this.to = to;
  }

  public Massage from(Account from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   **/
  @JsonProperty("from")
  @ApiModelProperty(value = "")
  public Account getFrom() {
    return from;
  }

  public void setFrom(Account from) {
    this.from = from;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Massage massage = (Massage) o;
    return Objects.equals(this.content, massage.content) &&
        Objects.equals(this.createAt, massage.createAt) &&
        Objects.equals(this.id, massage.id) &&
        Objects.equals(this.to, massage.to) &&
        Objects.equals(this.from, massage.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, createAt, id, to, from);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Massage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

