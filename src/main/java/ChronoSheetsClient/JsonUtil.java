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

package ChronoSheetsClient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import ChronoSheetsClientLibModel.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CSAggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSAggregateJobCode>>(){}.getType();
    }
    
    if ("CSAggregateJobTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSAggregateJobTask>>(){}.getType();
    }
    
    if ("CSApiResponseBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseBoolean>>(){}.getType();
    }
    
    if ("CSApiResponseClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseClient>>(){}.getType();
    }
    
    if ("CSApiResponseCombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseCombinedReportsData>>(){}.getType();
    }
    
    if ("CSApiResponseDoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseDoLoginResponse>>(){}.getType();
    }
    
    if ("CSApiResponseFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseFleetVehicle>>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment>>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListOrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseForPaginatedListOrgReportTrip>>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListRawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseForPaginatedListRawReportItem>>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseForPaginatedListTrip>>(){}.getType();
    }
    
    if ("CSApiResponseInsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseInsertUserResponse>>(){}.getType();
    }
    
    if ("CSApiResponseInt32".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseInt32>>(){}.getType();
    }
    
    if ("CSApiResponseJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseJobCode>>(){}.getType();
    }
    
    if ("CSApiResponseListAggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListAggregateJobCode>>(){}.getType();
    }
    
    if ("CSApiResponseListClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListClient>>(){}.getType();
    }
    
    if ("CSApiResponseListFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListFleetVehicle>>(){}.getType();
    }
    
    if ("CSApiResponseListInt32".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListInt32>>(){}.getType();
    }
    
    if ("CSApiResponseListJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListJobCode>>(){}.getType();
    }
    
    if ("CSApiResponseListJobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListJobSeriesReportItem>>(){}.getType();
    }
    
    if ("CSApiResponseListOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListOrganisationGroup>>(){}.getType();
    }
    
    if ("CSApiResponseListProject".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListProject>>(){}.getType();
    }
    
    if ("CSApiResponseListProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListProjectCostingReportItem>>(){}.getType();
    }
    
    if ("CSApiResponseListTimesheet".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListTimesheet>>(){}.getType();
    }
    
    if ("CSApiResponseListTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListTimesheetTask>>(){}.getType();
    }
    
    if ("CSApiResponseListUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListUserForManagement>>(){}.getType();
    }
    
    if ("CSApiResponseListUserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListUserHourlyRate>>(){}.getType();
    }
    
    if ("CSApiResponseListUserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListUserJobFavourite>>(){}.getType();
    }
    
    if ("CSApiResponseListUsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseListUsualHoursDay>>(){}.getType();
    }
    
    if ("CSApiResponseOrganisation".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseOrganisation>>(){}.getType();
    }
    
    if ("CSApiResponseOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseOrganisationGroup>>(){}.getType();
    }
    
    if ("CSApiResponseProject".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseProject>>(){}.getType();
    }
    
    if ("CSApiResponseSignupResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseSignupResponse>>(){}.getType();
    }
    
    if ("CSApiResponseTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseTimesheetTask>>(){}.getType();
    }
    
    if ("CSApiResponseTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseTrip>>(){}.getType();
    }
    
    if ("CSApiResponseUpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseUpdateOrganisationResponse>>(){}.getType();
    }
    
    if ("CSApiResponseUpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseUpdateUserResponse>>(){}.getType();
    }
    
    if ("CSApiResponseUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseUserForManagement>>(){}.getType();
    }
    
    if ("CSApiResponseUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSApiResponseUserProfile>>(){}.getType();
    }
    
    if ("CSBatchUpdateTimesheetRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSBatchUpdateTimesheetRequest>>(){}.getType();
    }
    
    if ("CSClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSClient>>(){}.getType();
    }
    
    if ("CSClientSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSClientSeriesReportItem>>(){}.getType();
    }
    
    if ("CSClientSideUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSClientSideUser>>(){}.getType();
    }
    
    if ("CSClientTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSClientTotalsReportItem>>(){}.getType();
    }
    
    if ("CSCombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSCombinedReportsData>>(){}.getType();
    }
    
    if ("CSCreateTripRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSCreateTripRequest>>(){}.getType();
    }
    
    if ("CSDoLoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSDoLoginRequest>>(){}.getType();
    }
    
    if ("CSDoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSDoLoginResponse>>(){}.getType();
    }
    
    if ("CSFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSFleetVehicle>>(){}.getType();
    }
    
    if ("CSInsertClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertClientRequest>>(){}.getType();
    }
    
    if ("CSInsertJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertJobCodeRequest>>(){}.getType();
    }
    
    if ("CSInsertOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertOrganisationGroupRequest>>(){}.getType();
    }
    
    if ("CSInsertProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertProjectRequest>>(){}.getType();
    }
    
    if ("CSInsertTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertTaskRequest>>(){}.getType();
    }
    
    if ("CSInsertUserHourlyRateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertUserHourlyRateRequest>>(){}.getType();
    }
    
    if ("CSInsertUserJobFavouriteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertUserJobFavouriteRequest>>(){}.getType();
    }
    
    if ("CSInsertUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertUserRequest>>(){}.getType();
    }
    
    if ("CSInsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertUserResponse>>(){}.getType();
    }
    
    if ("CSInsertVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSInsertVehicleRequest>>(){}.getType();
    }
    
    if ("CSJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSJobCode>>(){}.getType();
    }
    
    if ("CSJobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSJobSeriesReportItem>>(){}.getType();
    }
    
    if ("CSJobTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSJobTotalsReportItem>>(){}.getType();
    }
    
    if ("CSOrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSOrgReportTimesheetFileAttachment>>(){}.getType();
    }
    
    if ("CSOrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSOrgReportTrip>>(){}.getType();
    }
    
    if ("CSOrganisation".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSOrganisation>>(){}.getType();
    }
    
    if ("CSOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSOrganisationGroup>>(){}.getType();
    }
    
    if ("CSProject".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSProject>>(){}.getType();
    }
    
    if ("CSProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSProjectCostingReportItem>>(){}.getType();
    }
    
    if ("CSProjectSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSProjectSeriesReportItem>>(){}.getType();
    }
    
    if ("CSProjectTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSProjectTotalsReportItem>>(){}.getType();
    }
    
    if ("CSRawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSRawReportItem>>(){}.getType();
    }
    
    if ("CSSaveClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSSaveClientRequest>>(){}.getType();
    }
    
    if ("CSSaveOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSSaveOrganisationGroupRequest>>(){}.getType();
    }
    
    if ("CSSaveVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSSaveVehicleRequest>>(){}.getType();
    }
    
    if ("CSSetOrganisationGroupUsersRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSSetOrganisationGroupUsersRequest>>(){}.getType();
    }
    
    if ("CSSetUsualHoursRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSSetUsualHoursRequest>>(){}.getType();
    }
    
    if ("CSSignupResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSSignupResponse>>(){}.getType();
    }
    
    if ("CSTaskSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTaskSeriesReportItem>>(){}.getType();
    }
    
    if ("CSTaskTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTaskTotalsReportItem>>(){}.getType();
    }
    
    if ("CSTimeSlot".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTimeSlot>>(){}.getType();
    }
    
    if ("CSTimesheet".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTimesheet>>(){}.getType();
    }
    
    if ("CSTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTimesheetTask>>(){}.getType();
    }
    
    if ("CSTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTrip>>(){}.getType();
    }
    
    if ("CSTripCoordinate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSTripCoordinate>>(){}.getType();
    }
    
    if ("CSUpdateJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateJobCodeRequest>>(){}.getType();
    }
    
    if ("CSUpdateMyProfileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateMyProfileRequest>>(){}.getType();
    }
    
    if ("CSUpdateOrganisationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateOrganisationRequest>>(){}.getType();
    }
    
    if ("CSUpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateOrganisationResponse>>(){}.getType();
    }
    
    if ("CSUpdateProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateProjectRequest>>(){}.getType();
    }
    
    if ("CSUpdateTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateTaskRequest>>(){}.getType();
    }
    
    if ("CSUpdateUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateUserRequest>>(){}.getType();
    }
    
    if ("CSUpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUpdateUserResponse>>(){}.getType();
    }
    
    if ("CSUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUserForManagement>>(){}.getType();
    }
    
    if ("CSUserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUserHourlyRate>>(){}.getType();
    }
    
    if ("CSUserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUserJobFavourite>>(){}.getType();
    }
    
    if ("CSUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUserProfile>>(){}.getType();
    }
    
    if ("CSUsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<List<CSUsualHoursDay>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CSAggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<CSAggregateJobCode>(){}.getType();
    }
    
    if ("CSAggregateJobTask".equalsIgnoreCase(className)) {
      return new TypeToken<CSAggregateJobTask>(){}.getType();
    }
    
    if ("CSApiResponseBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseBoolean>(){}.getType();
    }
    
    if ("CSApiResponseClient".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseClient>(){}.getType();
    }
    
    if ("CSApiResponseCombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseCombinedReportsData>(){}.getType();
    }
    
    if ("CSApiResponseDoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseDoLoginResponse>(){}.getType();
    }
    
    if ("CSApiResponseFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseFleetVehicle>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListOrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseForPaginatedListOrgReportTrip>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListRawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseForPaginatedListRawReportItem>(){}.getType();
    }
    
    if ("CSApiResponseForPaginatedListTrip".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseForPaginatedListTrip>(){}.getType();
    }
    
    if ("CSApiResponseInsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseInsertUserResponse>(){}.getType();
    }
    
    if ("CSApiResponseInt32".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseInt32>(){}.getType();
    }
    
    if ("CSApiResponseJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseJobCode>(){}.getType();
    }
    
    if ("CSApiResponseListAggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListAggregateJobCode>(){}.getType();
    }
    
    if ("CSApiResponseListClient".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListClient>(){}.getType();
    }
    
    if ("CSApiResponseListFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListFleetVehicle>(){}.getType();
    }
    
    if ("CSApiResponseListInt32".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListInt32>(){}.getType();
    }
    
    if ("CSApiResponseListJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListJobCode>(){}.getType();
    }
    
    if ("CSApiResponseListJobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListJobSeriesReportItem>(){}.getType();
    }
    
    if ("CSApiResponseListOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListOrganisationGroup>(){}.getType();
    }
    
    if ("CSApiResponseListProject".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListProject>(){}.getType();
    }
    
    if ("CSApiResponseListProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListProjectCostingReportItem>(){}.getType();
    }
    
    if ("CSApiResponseListTimesheet".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListTimesheet>(){}.getType();
    }
    
    if ("CSApiResponseListTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListTimesheetTask>(){}.getType();
    }
    
    if ("CSApiResponseListUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListUserForManagement>(){}.getType();
    }
    
    if ("CSApiResponseListUserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListUserHourlyRate>(){}.getType();
    }
    
    if ("CSApiResponseListUserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListUserJobFavourite>(){}.getType();
    }
    
    if ("CSApiResponseListUsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseListUsualHoursDay>(){}.getType();
    }
    
    if ("CSApiResponseOrganisation".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseOrganisation>(){}.getType();
    }
    
    if ("CSApiResponseOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseOrganisationGroup>(){}.getType();
    }
    
    if ("CSApiResponseProject".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseProject>(){}.getType();
    }
    
    if ("CSApiResponseSignupResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseSignupResponse>(){}.getType();
    }
    
    if ("CSApiResponseTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseTimesheetTask>(){}.getType();
    }
    
    if ("CSApiResponseTrip".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseTrip>(){}.getType();
    }
    
    if ("CSApiResponseUpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseUpdateOrganisationResponse>(){}.getType();
    }
    
    if ("CSApiResponseUpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseUpdateUserResponse>(){}.getType();
    }
    
    if ("CSApiResponseUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseUserForManagement>(){}.getType();
    }
    
    if ("CSApiResponseUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<CSApiResponseUserProfile>(){}.getType();
    }
    
    if ("CSBatchUpdateTimesheetRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSBatchUpdateTimesheetRequest>(){}.getType();
    }
    
    if ("CSClient".equalsIgnoreCase(className)) {
      return new TypeToken<CSClient>(){}.getType();
    }
    
    if ("CSClientSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSClientSeriesReportItem>(){}.getType();
    }
    
    if ("CSClientSideUser".equalsIgnoreCase(className)) {
      return new TypeToken<CSClientSideUser>(){}.getType();
    }
    
    if ("CSClientTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSClientTotalsReportItem>(){}.getType();
    }
    
    if ("CSCombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<CSCombinedReportsData>(){}.getType();
    }
    
    if ("CSCreateTripRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSCreateTripRequest>(){}.getType();
    }
    
    if ("CSDoLoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSDoLoginRequest>(){}.getType();
    }
    
    if ("CSDoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSDoLoginResponse>(){}.getType();
    }
    
    if ("CSFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<CSFleetVehicle>(){}.getType();
    }
    
    if ("CSInsertClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertClientRequest>(){}.getType();
    }
    
    if ("CSInsertJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertJobCodeRequest>(){}.getType();
    }
    
    if ("CSInsertOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertOrganisationGroupRequest>(){}.getType();
    }
    
    if ("CSInsertProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertProjectRequest>(){}.getType();
    }
    
    if ("CSInsertTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertTaskRequest>(){}.getType();
    }
    
    if ("CSInsertUserHourlyRateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertUserHourlyRateRequest>(){}.getType();
    }
    
    if ("CSInsertUserJobFavouriteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertUserJobFavouriteRequest>(){}.getType();
    }
    
    if ("CSInsertUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertUserRequest>(){}.getType();
    }
    
    if ("CSInsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertUserResponse>(){}.getType();
    }
    
    if ("CSInsertVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSInsertVehicleRequest>(){}.getType();
    }
    
    if ("CSJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<CSJobCode>(){}.getType();
    }
    
    if ("CSJobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSJobSeriesReportItem>(){}.getType();
    }
    
    if ("CSJobTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSJobTotalsReportItem>(){}.getType();
    }
    
    if ("CSOrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<CSOrgReportTimesheetFileAttachment>(){}.getType();
    }
    
    if ("CSOrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<CSOrgReportTrip>(){}.getType();
    }
    
    if ("CSOrganisation".equalsIgnoreCase(className)) {
      return new TypeToken<CSOrganisation>(){}.getType();
    }
    
    if ("CSOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<CSOrganisationGroup>(){}.getType();
    }
    
    if ("CSProject".equalsIgnoreCase(className)) {
      return new TypeToken<CSProject>(){}.getType();
    }
    
    if ("CSProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSProjectCostingReportItem>(){}.getType();
    }
    
    if ("CSProjectSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSProjectSeriesReportItem>(){}.getType();
    }
    
    if ("CSProjectTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSProjectTotalsReportItem>(){}.getType();
    }
    
    if ("CSRawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSRawReportItem>(){}.getType();
    }
    
    if ("CSSaveClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSSaveClientRequest>(){}.getType();
    }
    
    if ("CSSaveOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSSaveOrganisationGroupRequest>(){}.getType();
    }
    
    if ("CSSaveVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSSaveVehicleRequest>(){}.getType();
    }
    
    if ("CSSetOrganisationGroupUsersRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSSetOrganisationGroupUsersRequest>(){}.getType();
    }
    
    if ("CSSetUsualHoursRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSSetUsualHoursRequest>(){}.getType();
    }
    
    if ("CSSignupResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSSignupResponse>(){}.getType();
    }
    
    if ("CSTaskSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSTaskSeriesReportItem>(){}.getType();
    }
    
    if ("CSTaskTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<CSTaskTotalsReportItem>(){}.getType();
    }
    
    if ("CSTimeSlot".equalsIgnoreCase(className)) {
      return new TypeToken<CSTimeSlot>(){}.getType();
    }
    
    if ("CSTimesheet".equalsIgnoreCase(className)) {
      return new TypeToken<CSTimesheet>(){}.getType();
    }
    
    if ("CSTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<CSTimesheetTask>(){}.getType();
    }
    
    if ("CSTrip".equalsIgnoreCase(className)) {
      return new TypeToken<CSTrip>(){}.getType();
    }
    
    if ("CSTripCoordinate".equalsIgnoreCase(className)) {
      return new TypeToken<CSTripCoordinate>(){}.getType();
    }
    
    if ("CSUpdateJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateJobCodeRequest>(){}.getType();
    }
    
    if ("CSUpdateMyProfileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateMyProfileRequest>(){}.getType();
    }
    
    if ("CSUpdateOrganisationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateOrganisationRequest>(){}.getType();
    }
    
    if ("CSUpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateOrganisationResponse>(){}.getType();
    }
    
    if ("CSUpdateProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateProjectRequest>(){}.getType();
    }
    
    if ("CSUpdateTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateTaskRequest>(){}.getType();
    }
    
    if ("CSUpdateUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateUserRequest>(){}.getType();
    }
    
    if ("CSUpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CSUpdateUserResponse>(){}.getType();
    }
    
    if ("CSUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<CSUserForManagement>(){}.getType();
    }
    
    if ("CSUserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<CSUserHourlyRate>(){}.getType();
    }
    
    if ("CSUserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<CSUserJobFavourite>(){}.getType();
    }
    
    if ("CSUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<CSUserProfile>(){}.getType();
    }
    
    if ("CSUsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<CSUsualHoursDay>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
