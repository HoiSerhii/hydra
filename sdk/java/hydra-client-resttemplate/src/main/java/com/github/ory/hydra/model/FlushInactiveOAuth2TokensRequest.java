/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * FlushInactiveOAuth2TokensRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T13:51:05.405+02:00")
public class FlushInactiveOAuth2TokensRequest {
  @JsonProperty("notAfter")
  private OffsetDateTime notAfter = null;

  public FlushInactiveOAuth2TokensRequest notAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

   /**
   * NotAfter sets after which point tokens should not be flushed. This is useful when you want to keep a history of recently issued tokens for auditing.
   * @return notAfter
  **/
  @ApiModelProperty(value = "NotAfter sets after which point tokens should not be flushed. This is useful when you want to keep a history of recently issued tokens for auditing.")
  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlushInactiveOAuth2TokensRequest flushInactiveOAuth2TokensRequest = (FlushInactiveOAuth2TokensRequest) o;
    return Objects.equals(this.notAfter, flushInactiveOAuth2TokensRequest.notAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notAfter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlushInactiveOAuth2TokensRequest {\n");
    
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
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

