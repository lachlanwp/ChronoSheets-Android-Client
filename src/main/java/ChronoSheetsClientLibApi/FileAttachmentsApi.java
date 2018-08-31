/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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

import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListTimesheetFileAttachment;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class FileAttachmentsApi {
  String basePath = "https://www.chronosheets.com";
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
  * Delete a particular timesheet file attachment
  * 
   * @param fileAttachmentId The Id of the file attachment to delete
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseBoolean
  */
  public CSApiResponseBoolean fileAttachmentsDeleteTimesheetFileAttachment (Integer fileAttachmentId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'fileAttachmentId' is set
    if (fileAttachmentId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'fileAttachmentId' when calling fileAttachmentsDeleteTimesheetFileAttachment",
        new ApiException(400, "Missing the required parameter 'fileAttachmentId' when calling fileAttachmentsDeleteTimesheetFileAttachment"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsDeleteTimesheetFileAttachment",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsDeleteTimesheetFileAttachment"));
    }

    // create path and map variables
    String path = "/api/FileAttachments/DeleteTimesheetFileAttachment";

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CSApiResponseBoolean) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseBoolean.class);
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
   * Delete a particular timesheet file attachment
   * 
   * @param fileAttachmentId The Id of the file attachment to delete   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void fileAttachmentsDeleteTimesheetFileAttachment (Integer fileAttachmentId, String xChronosheetsAuth, final Response.Listener<CSApiResponseBoolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'fileAttachmentId' is set
    if (fileAttachmentId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'fileAttachmentId' when calling fileAttachmentsDeleteTimesheetFileAttachment",
        new ApiException(400, "Missing the required parameter 'fileAttachmentId' when calling fileAttachmentsDeleteTimesheetFileAttachment"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsDeleteTimesheetFileAttachment",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsDeleteTimesheetFileAttachment"));
    }

    // create path and map variables
    String path = "/api/FileAttachments/DeleteTimesheetFileAttachment".replaceAll("\\{format\\}","json");

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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CSApiResponseBoolean) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseBoolean.class));
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
  * Get my file attachments.  Get files you&#39;ve attached to timesheets.
  * 
   * @param startDate The Start date of the date range.  File attachments after this date will be obtained.
   * @param endDate The End date of the date range.  File attachments before this date will be obtained.
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @param skip Skip this many File attachments
   * @param take Take this many File attachments
   * @return CSApiResponseForPaginatedListTimesheetFileAttachment
  */
  public CSApiResponseForPaginatedListTimesheetFileAttachment fileAttachmentsGetMyFileAttachments (Date startDate, Date endDate, String xChronosheetsAuth, Integer skip, Integer take) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling fileAttachmentsGetMyFileAttachments",
        new ApiException(400, "Missing the required parameter 'startDate' when calling fileAttachmentsGetMyFileAttachments"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling fileAttachmentsGetMyFileAttachments",
        new ApiException(400, "Missing the required parameter 'endDate' when calling fileAttachmentsGetMyFileAttachments"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsGetMyFileAttachments",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsGetMyFileAttachments"));
    }

    // create path and map variables
    String path = "/api/FileAttachments/GetMyFileAttachments";

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
         return (CSApiResponseForPaginatedListTimesheetFileAttachment) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseForPaginatedListTimesheetFileAttachment.class);
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
   * Get my file attachments.  Get files you&#39;ve attached to timesheets.
   * 
   * @param startDate The Start date of the date range.  File attachments after this date will be obtained.   * @param endDate The End date of the date range.  File attachments before this date will be obtained.   * @param xChronosheetsAuth The ChronoSheets Auth Token   * @param skip Skip this many File attachments   * @param take Take this many File attachments
  */
  public void fileAttachmentsGetMyFileAttachments (Date startDate, Date endDate, String xChronosheetsAuth, Integer skip, Integer take, final Response.Listener<CSApiResponseForPaginatedListTimesheetFileAttachment> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling fileAttachmentsGetMyFileAttachments",
        new ApiException(400, "Missing the required parameter 'startDate' when calling fileAttachmentsGetMyFileAttachments"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling fileAttachmentsGetMyFileAttachments",
        new ApiException(400, "Missing the required parameter 'endDate' when calling fileAttachmentsGetMyFileAttachments"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsGetMyFileAttachments",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling fileAttachmentsGetMyFileAttachments"));
    }

    // create path and map variables
    String path = "/api/FileAttachments/GetMyFileAttachments".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((CSApiResponseForPaginatedListTimesheetFileAttachment) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseForPaginatedListTimesheetFileAttachment.class));
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
