/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hellosign.openapi.JSON;


import com.hellosign.openapi.ApiException;
/**
 * A group of documents that a user can take ownership of via the claim URL.
 */
@ApiModel(description = "A group of documents that a user can take ownership of via the claim URL.")
@JsonPropertyOrder({
    UnclaimedDraftResponse.JSON_PROPERTY_SIGNATURE_REQUEST_ID,
    UnclaimedDraftResponse.JSON_PROPERTY_CLAIM_URL,
    UnclaimedDraftResponse.JSON_PROPERTY_SIGNING_REDIRECT_URL,
    UnclaimedDraftResponse.JSON_PROPERTY_REQUESTING_REDIRECT_URL,
    UnclaimedDraftResponse.JSON_PROPERTY_EXPIRES_AT,
    UnclaimedDraftResponse.JSON_PROPERTY_TEST_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnclaimedDraftResponse {
  public static final String JSON_PROPERTY_SIGNATURE_REQUEST_ID = "signature_request_id";
  private String signatureRequestId;

  public static final String JSON_PROPERTY_CLAIM_URL = "claim_url";
  private String claimUrl;

  public static final String JSON_PROPERTY_SIGNING_REDIRECT_URL = "signing_redirect_url";
  private String signingRedirectUrl;

  public static final String JSON_PROPERTY_REQUESTING_REDIRECT_URL = "requesting_redirect_url";
  private String requestingRedirectUrl;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Integer expiresAt;

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  private Boolean testMode;

  public UnclaimedDraftResponse() { 
  }

  public UnclaimedDraftResponse signatureRequestId(String signatureRequestId) {
    this.signatureRequestId = signatureRequestId;
    return this;
  }

   /**
   * The ID of the signature request that is represented by this UnclaimedDraft.
   * @return signatureRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the signature request that is represented by this UnclaimedDraft.")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignatureRequestId() {
    return signatureRequestId;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureRequestId(String signatureRequestId) {
    this.signatureRequestId = signatureRequestId;
  }


  public UnclaimedDraftResponse claimUrl(String claimUrl) {
    this.claimUrl = claimUrl;
    return this;
  }

   /**
   * The URL to be used to claim this UnclaimedDraft.
   * @return claimUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to be used to claim this UnclaimedDraft.")
  @JsonProperty(JSON_PROPERTY_CLAIM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClaimUrl() {
    return claimUrl;
  }


  @JsonProperty(JSON_PROPERTY_CLAIM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClaimUrl(String claimUrl) {
    this.claimUrl = claimUrl;
  }


  public UnclaimedDraftResponse signingRedirectUrl(String signingRedirectUrl) {
    this.signingRedirectUrl = signingRedirectUrl;
    return this;
  }

   /**
   * The URL you want signers redirected to after they successfully sign.
   * @return signingRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL you want signers redirected to after they successfully sign.")
  @JsonProperty(JSON_PROPERTY_SIGNING_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSigningRedirectUrl() {
    return signingRedirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_SIGNING_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigningRedirectUrl(String signingRedirectUrl) {
    this.signingRedirectUrl = signingRedirectUrl;
  }


  public UnclaimedDraftResponse requestingRedirectUrl(String requestingRedirectUrl) {
    this.requestingRedirectUrl = requestingRedirectUrl;
    return this;
  }

   /**
   * The URL you want signers redirected to after they successfully request a signature (Will only be returned in the response if it is applicable to the request.).
   * @return requestingRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL you want signers redirected to after they successfully request a signature (Will only be returned in the response if it is applicable to the request.).")
  @JsonProperty(JSON_PROPERTY_REQUESTING_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestingRedirectUrl() {
    return requestingRedirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTING_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestingRedirectUrl(String requestingRedirectUrl) {
    this.requestingRedirectUrl = requestingRedirectUrl;
  }


  public UnclaimedDraftResponse expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * When the link expires.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the link expires.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  public UnclaimedDraftResponse testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * Whether this is a test draft. Signature requests made from test drafts have no legal value.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this is a test draft. Signature requests made from test drafts have no legal value.")
  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTestMode() {
    return testMode;
  }


  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }


  /**
   * Return true if this UnclaimedDraftResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnclaimedDraftResponse unclaimedDraftResponse = (UnclaimedDraftResponse) o;
    return Objects.equals(this.signatureRequestId, unclaimedDraftResponse.signatureRequestId) &&
        Objects.equals(this.claimUrl, unclaimedDraftResponse.claimUrl) &&
        Objects.equals(this.signingRedirectUrl, unclaimedDraftResponse.signingRedirectUrl) &&
        Objects.equals(this.requestingRedirectUrl, unclaimedDraftResponse.requestingRedirectUrl) &&
        Objects.equals(this.expiresAt, unclaimedDraftResponse.expiresAt) &&
        Objects.equals(this.testMode, unclaimedDraftResponse.testMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureRequestId, claimUrl, signingRedirectUrl, requestingRedirectUrl, expiresAt, testMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnclaimedDraftResponse {\n");
    sb.append("    signatureRequestId: ").append(toIndentedString(signatureRequestId)).append("\n");
    sb.append("    claimUrl: ").append(toIndentedString(claimUrl)).append("\n");
    sb.append("    signingRedirectUrl: ").append(toIndentedString(signingRedirectUrl)).append("\n");
    sb.append("    requestingRedirectUrl: ").append(toIndentedString(requestingRedirectUrl)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (signatureRequestId != null) {
        if (isFileTypeOrListOfFiles(signatureRequestId)) {
            fileTypeFound = true;
        }

        if (signatureRequestId.getClass().equals(java.io.File.class) ||
            signatureRequestId.getClass().equals(Integer.class) ||
            signatureRequestId.getClass().equals(String.class) ||
            signatureRequestId.getClass().isEnum()) {
            map.put("signature_request_id", signatureRequestId);
        } else if (isListOfFile(signatureRequestId)) {
            for(int i = 0; i< getListSize(signatureRequestId); i++) {
                map.put("signature_request_id[" + i + "]", getFromList(signatureRequestId, i));
            }
        }
        else {
            map.put("signature_request_id", JSON.getDefault().getMapper().writeValueAsString(signatureRequestId));
        }
    }
    if (claimUrl != null) {
        if (isFileTypeOrListOfFiles(claimUrl)) {
            fileTypeFound = true;
        }

        if (claimUrl.getClass().equals(java.io.File.class) ||
            claimUrl.getClass().equals(Integer.class) ||
            claimUrl.getClass().equals(String.class) ||
            claimUrl.getClass().isEnum()) {
            map.put("claim_url", claimUrl);
        } else if (isListOfFile(claimUrl)) {
            for(int i = 0; i< getListSize(claimUrl); i++) {
                map.put("claim_url[" + i + "]", getFromList(claimUrl, i));
            }
        }
        else {
            map.put("claim_url", JSON.getDefault().getMapper().writeValueAsString(claimUrl));
        }
    }
    if (signingRedirectUrl != null) {
        if (isFileTypeOrListOfFiles(signingRedirectUrl)) {
            fileTypeFound = true;
        }

        if (signingRedirectUrl.getClass().equals(java.io.File.class) ||
            signingRedirectUrl.getClass().equals(Integer.class) ||
            signingRedirectUrl.getClass().equals(String.class) ||
            signingRedirectUrl.getClass().isEnum()) {
            map.put("signing_redirect_url", signingRedirectUrl);
        } else if (isListOfFile(signingRedirectUrl)) {
            for(int i = 0; i< getListSize(signingRedirectUrl); i++) {
                map.put("signing_redirect_url[" + i + "]", getFromList(signingRedirectUrl, i));
            }
        }
        else {
            map.put("signing_redirect_url", JSON.getDefault().getMapper().writeValueAsString(signingRedirectUrl));
        }
    }
    if (requestingRedirectUrl != null) {
        if (isFileTypeOrListOfFiles(requestingRedirectUrl)) {
            fileTypeFound = true;
        }

        if (requestingRedirectUrl.getClass().equals(java.io.File.class) ||
            requestingRedirectUrl.getClass().equals(Integer.class) ||
            requestingRedirectUrl.getClass().equals(String.class) ||
            requestingRedirectUrl.getClass().isEnum()) {
            map.put("requesting_redirect_url", requestingRedirectUrl);
        } else if (isListOfFile(requestingRedirectUrl)) {
            for(int i = 0; i< getListSize(requestingRedirectUrl); i++) {
                map.put("requesting_redirect_url[" + i + "]", getFromList(requestingRedirectUrl, i));
            }
        }
        else {
            map.put("requesting_redirect_url", JSON.getDefault().getMapper().writeValueAsString(requestingRedirectUrl));
        }
    }
    if (expiresAt != null) {
        if (isFileTypeOrListOfFiles(expiresAt)) {
            fileTypeFound = true;
        }

        if (expiresAt.getClass().equals(java.io.File.class) ||
            expiresAt.getClass().equals(Integer.class) ||
            expiresAt.getClass().equals(String.class) ||
            expiresAt.getClass().isEnum()) {
            map.put("expires_at", expiresAt);
        } else if (isListOfFile(expiresAt)) {
            for(int i = 0; i< getListSize(expiresAt); i++) {
                map.put("expires_at[" + i + "]", getFromList(expiresAt, i));
            }
        }
        else {
            map.put("expires_at", JSON.getDefault().getMapper().writeValueAsString(expiresAt));
        }
    }
    if (testMode != null) {
        if (isFileTypeOrListOfFiles(testMode)) {
            fileTypeFound = true;
        }

        if (testMode.getClass().equals(java.io.File.class) ||
            testMode.getClass().equals(Integer.class) ||
            testMode.getClass().equals(String.class) ||
            testMode.getClass().isEnum()) {
            map.put("test_mode", testMode);
        } else if (isListOfFile(testMode)) {
            for(int i = 0; i< getListSize(testMode); i++) {
                map.put("test_mode[" + i + "]", getFromList(testMode, i));
            }
        }
        else {
            map.put("test_mode", JSON.getDefault().getMapper().writeValueAsString(testMode));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

