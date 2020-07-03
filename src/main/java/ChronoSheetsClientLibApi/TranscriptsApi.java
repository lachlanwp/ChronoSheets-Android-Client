/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiInvoker;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Pair;

import ChronoSheetsClientLibModel.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import ChronoSheetsClientLibModel.ApiResponseForPaginatedListOrgReportTranscript;
import ChronoSheetsClientLibModel.ApiResponseTranscription;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class TranscriptsApi {
  String basePath = "https://api.chronosheets.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get an audio to text transcript for a particular audio file attachment
  * 
   * @param fileAttachmentId The ID of the file attachment that has a transcript.  It should be an audio file attachment.
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return ApiResponseTranscription
  */
  public ApiResponseTranscription transcriptsGetMyTranscript (Integer fileAttachmentId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'fileAttachmentId' is set
    if (fileAttachmentId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'fileAttachmentId' when calling transcriptsGetMyTranscript",
        new ApiException(400, "Missing the required parameter 'fileAttachmentId' when calling transcriptsGetMyTranscript"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscript",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscript"));
    }

    // create path and map variables
    String path = "/Transcripts/GetMyTranscript";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "FileAttachmentId", fileAttachmentId));
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ApiResponseTranscription) ApiInvoker.deserialize(localVarResponse, "", ApiResponseTranscription.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get an audio to text transcript for a particular audio file attachment
   * 
   * @param fileAttachmentId The ID of the file attachment that has a transcript.  It should be an audio file attachment.   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void transcriptsGetMyTranscript (Integer fileAttachmentId, String xChronosheetsAuth, final Response.Listener<ApiResponseTranscription> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'fileAttachmentId' is set
    if (fileAttachmentId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'fileAttachmentId' when calling transcriptsGetMyTranscript",
        new ApiException(400, "Missing the required parameter 'fileAttachmentId' when calling transcriptsGetMyTranscript"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscript",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscript"));
    }

    // create path and map variables
    String path = "/Transcripts/GetMyTranscript".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "FileAttachmentId", fileAttachmentId));

    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ApiResponseTranscription) ApiInvoker.deserialize(localVarResponse,  "", ApiResponseTranscription.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.
  * 
   * @param startDate The Start date of the date range.  Transcripts after this date will be obtained.
   * @param endDate The End date of the date range.  Transcripts before this date will be obtained.
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @param skip Skip this many transcripts
   * @param take Take this many transcripts
   * @param keyword Search the text content of the transcript keywords
   * @return ApiResponseForPaginatedListOrgReportTranscript
  */
  public ApiResponseForPaginatedListOrgReportTranscript transcriptsGetMyTranscripts (Date startDate, Date endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling transcriptsGetMyTranscripts",
        new ApiException(400, "Missing the required parameter 'startDate' when calling transcriptsGetMyTranscripts"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling transcriptsGetMyTranscripts",
        new ApiException(400, "Missing the required parameter 'endDate' when calling transcriptsGetMyTranscripts"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscripts",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscripts"));
    }

    // create path and map variables
    String path = "/Transcripts/GetMyTranscripts";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "StartDate", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "EndDate", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Skip", skip));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Take", take));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Keyword", keyword));
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ApiResponseForPaginatedListOrgReportTranscript) ApiInvoker.deserialize(localVarResponse, "", ApiResponseForPaginatedListOrgReportTranscript.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.
   * 
   * @param startDate The Start date of the date range.  Transcripts after this date will be obtained.   * @param endDate The End date of the date range.  Transcripts before this date will be obtained.   * @param xChronosheetsAuth The ChronoSheets Auth Token   * @param skip Skip this many transcripts   * @param take Take this many transcripts   * @param keyword Search the text content of the transcript keywords
  */
  public void transcriptsGetMyTranscripts (Date startDate, Date endDate, String xChronosheetsAuth, Integer skip, Integer take, String keyword, final Response.Listener<ApiResponseForPaginatedListOrgReportTranscript> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling transcriptsGetMyTranscripts",
        new ApiException(400, "Missing the required parameter 'startDate' when calling transcriptsGetMyTranscripts"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling transcriptsGetMyTranscripts",
        new ApiException(400, "Missing the required parameter 'endDate' when calling transcriptsGetMyTranscripts"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscripts",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling transcriptsGetMyTranscripts"));
    }

    // create path and map variables
    String path = "/Transcripts/GetMyTranscripts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "StartDate", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "EndDate", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Skip", skip));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Take", take));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Keyword", keyword));

    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ApiResponseForPaginatedListOrgReportTranscript) ApiInvoker.deserialize(localVarResponse,  "", ApiResponseForPaginatedListOrgReportTranscript.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
