/**
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
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

import ChronoSheetsClientLibModel.CSApiResponseInsertUserResponse;
import ChronoSheetsClientLibModel.CSApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.CSApiResponseUpdateUserResponse;
import ChronoSheetsClientLibModel.CSApiResponseUserForManagement;
import ChronoSheetsClientLibModel.CSInsertUserRequest;
import ChronoSheetsClientLibModel.CSUpdateUserRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class UsersApi {
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
  * Create a user in your organisation
  * 
   * @param request 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseInsertUserResponse
  */
  public CSApiResponseInsertUserResponse usersCreateTimesheetUser (CSInsertUserRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling usersCreateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'request' when calling usersCreateTimesheetUser"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersCreateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersCreateTimesheetUser"));
    }

    // create path and map variables
    String path = "/api/Users/CreateTimesheetUser";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded",
      "multipart/form-data"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CSApiResponseInsertUserResponse) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseInsertUserResponse.class);
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
   * Create a user in your organisation
   * 
   * @param request    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void usersCreateTimesheetUser (CSInsertUserRequest request, String xChronosheetsAuth, final Response.Listener<CSApiResponseInsertUserResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling usersCreateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'request' when calling usersCreateTimesheetUser"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersCreateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersCreateTimesheetUser"));
    }

    // create path and map variables
    String path = "/api/Users/CreateTimesheetUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded","multipart/form-data"
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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CSApiResponseInsertUserResponse) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseInsertUserResponse.class));
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
  * Get a particular user in your organisation
  * 
   * @param userId 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseUserForManagement
  */
  public CSApiResponseUserForManagement usersGetTimesheetUser (Integer userId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling usersGetTimesheetUser",
        new ApiException(400, "Missing the required parameter 'userId' when calling usersGetTimesheetUser"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUser",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUser"));
    }

    // create path and map variables
    String path = "/api/Users/GetTimesheetUser";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "UserId", userId));
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
         return (CSApiResponseUserForManagement) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseUserForManagement.class);
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
   * Get a particular user in your organisation
   * 
   * @param userId    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void usersGetTimesheetUser (Integer userId, String xChronosheetsAuth, final Response.Listener<CSApiResponseUserForManagement> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling usersGetTimesheetUser",
        new ApiException(400, "Missing the required parameter 'userId' when calling usersGetTimesheetUser"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUser",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUser"));
    }

    // create path and map variables
    String path = "/api/Users/GetTimesheetUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "UserId", userId));

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
              responseListener.onResponse((CSApiResponseUserForManagement) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseUserForManagement.class));
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
  * Get users for your organisation
  * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseListUserForManagement
  */
  public CSApiResponseListUserForManagement usersGetTimesheetUsers (String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUsers",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUsers"));
    }

    // create path and map variables
    String path = "/api/Users/GetTimesheetUsers";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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
         return (CSApiResponseListUserForManagement) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseListUserForManagement.class);
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
   * Get users for your organisation
   * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void usersGetTimesheetUsers (String xChronosheetsAuth, final Response.Listener<CSApiResponseListUserForManagement> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUsers",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersGetTimesheetUsers"));
    }

    // create path and map variables
    String path = "/api/Users/GetTimesheetUsers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


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
              responseListener.onResponse((CSApiResponseListUserForManagement) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseListUserForManagement.class));
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
  * Update a user
  * 
   * @param request 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseUpdateUserResponse
  */
  public CSApiResponseUpdateUserResponse usersUpdateTimesheetUser (CSUpdateUserRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling usersUpdateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'request' when calling usersUpdateTimesheetUser"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersUpdateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersUpdateTimesheetUser"));
    }

    // create path and map variables
    String path = "/api/Users/UpdateTimesheetUser";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded",
      "multipart/form-data"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CSApiResponseUpdateUserResponse) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseUpdateUserResponse.class);
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
   * Update a user
   * 
   * @param request    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void usersUpdateTimesheetUser (CSUpdateUserRequest request, String xChronosheetsAuth, final Response.Listener<CSApiResponseUpdateUserResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling usersUpdateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'request' when calling usersUpdateTimesheetUser"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling usersUpdateTimesheetUser",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling usersUpdateTimesheetUser"));
    }

    // create path and map variables
    String path = "/api/Users/UpdateTimesheetUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded","multipart/form-data"
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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CSApiResponseUpdateUserResponse) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseUpdateUserResponse.class));
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
