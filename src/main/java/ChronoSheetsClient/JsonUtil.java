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
    
    if ("AggregateClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<AggregateClient>>(){}.getType();
    }
    
    if ("AggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<AggregateJobCode>>(){}.getType();
    }
    
    if ("AggregateJobTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<AggregateJobTask>>(){}.getType();
    }
    
    if ("AggregateProject".equalsIgnoreCase(className)) {
      return new TypeToken<List<AggregateProject>>(){}.getType();
    }
    
    if ("ApiResponseBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseBoolean>>(){}.getType();
    }
    
    if ("ApiResponseClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseClient>>(){}.getType();
    }
    
    if ("ApiResponseCombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseCombinedReportsData>>(){}.getType();
    }
    
    if ("ApiResponseDoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseDoLoginResponse>>(){}.getType();
    }
    
    if ("ApiResponseFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseFleetVehicle>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListBasicGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListBasicGeofence>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListExtendedGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListExtendedGeofence>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListOrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListOrgReportTimesheetFileAttachment>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListOrgReportTranscript".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListOrgReportTranscript>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListOrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListOrgReportTrip>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListRawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListRawReportItem>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListTimesheetFileAttachment>>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseForPaginatedListTrip>>(){}.getType();
    }
    
    if ("ApiResponseGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseGeofence>>(){}.getType();
    }
    
    if ("ApiResponseInsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseInsertUserResponse>>(){}.getType();
    }
    
    if ("ApiResponseInt32".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseInt32>>(){}.getType();
    }
    
    if ("ApiResponseJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseJobCode>>(){}.getType();
    }
    
    if ("ApiResponseListAggregateClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListAggregateClient>>(){}.getType();
    }
    
    if ("ApiResponseListAggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListAggregateJobCode>>(){}.getType();
    }
    
    if ("ApiResponseListClient".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListClient>>(){}.getType();
    }
    
    if ("ApiResponseListFleetSummaryReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListFleetSummaryReportItem>>(){}.getType();
    }
    
    if ("ApiResponseListFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListFleetVehicle>>(){}.getType();
    }
    
    if ("ApiResponseListInt32".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListInt32>>(){}.getType();
    }
    
    if ("ApiResponseListJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListJobCode>>(){}.getType();
    }
    
    if ("ApiResponseListJobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListJobSeriesReportItem>>(){}.getType();
    }
    
    if ("ApiResponseListOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListOrganisationGroup>>(){}.getType();
    }
    
    if ("ApiResponseListProject".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListProject>>(){}.getType();
    }
    
    if ("ApiResponseListProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListProjectCostingReportItem>>(){}.getType();
    }
    
    if ("ApiResponseListTimesheet".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListTimesheet>>(){}.getType();
    }
    
    if ("ApiResponseListTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListTimesheetTask>>(){}.getType();
    }
    
    if ("ApiResponseListUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListUserForManagement>>(){}.getType();
    }
    
    if ("ApiResponseListUserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListUserHourlyRate>>(){}.getType();
    }
    
    if ("ApiResponseListUserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListUserJobFavourite>>(){}.getType();
    }
    
    if ("ApiResponseListUsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseListUsualHoursDay>>(){}.getType();
    }
    
    if ("ApiResponseOrganisation".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseOrganisation>>(){}.getType();
    }
    
    if ("ApiResponseOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseOrganisationGroup>>(){}.getType();
    }
    
    if ("ApiResponseProject".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseProject>>(){}.getType();
    }
    
    if ("ApiResponseTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseTimesheetFileAttachment>>(){}.getType();
    }
    
    if ("ApiResponseTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseTimesheetTask>>(){}.getType();
    }
    
    if ("ApiResponseTranscription".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseTranscription>>(){}.getType();
    }
    
    if ("ApiResponseTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseTrip>>(){}.getType();
    }
    
    if ("ApiResponseUpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseUpdateOrganisationResponse>>(){}.getType();
    }
    
    if ("ApiResponseUpdateProfileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseUpdateProfileResponse>>(){}.getType();
    }
    
    if ("ApiResponseUpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseUpdateUserResponse>>(){}.getType();
    }
    
    if ("ApiResponseUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseUserForManagement>>(){}.getType();
    }
    
    if ("ApiResponseUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponseUserProfile>>(){}.getType();
    }
    
    if ("BasicCoordinate".equalsIgnoreCase(className)) {
      return new TypeToken<List<BasicCoordinate>>(){}.getType();
    }
    
    if ("BasicGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<BasicGeofence>>(){}.getType();
    }
    
    if ("BatchUpdateTimesheetRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<BatchUpdateTimesheetRequest>>(){}.getType();
    }
    
    if ("Client".equalsIgnoreCase(className)) {
      return new TypeToken<List<Client>>(){}.getType();
    }
    
    if ("ClientSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ClientSeriesReportItem>>(){}.getType();
    }
    
    if ("ClientSideUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<ClientSideUser>>(){}.getType();
    }
    
    if ("ClientTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ClientTotalsReportItem>>(){}.getType();
    }
    
    if ("CombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CombinedReportsData>>(){}.getType();
    }
    
    if ("CreateAutomationStepRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateAutomationStepRequest>>(){}.getType();
    }
    
    if ("CreateGeoFenceRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateGeoFenceRequest>>(){}.getType();
    }
    
    if ("CreateTripRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateTripRequest>>(){}.getType();
    }
    
    if ("DoLoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoLoginRequest>>(){}.getType();
    }
    
    if ("DoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoLoginResponse>>(){}.getType();
    }
    
    if ("ExtendedGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtendedGeofence>>(){}.getType();
    }
    
    if ("FleetSummaryReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetSummaryReportItem>>(){}.getType();
    }
    
    if ("FleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<List<FleetVehicle>>(){}.getType();
    }
    
    if ("Geofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<Geofence>>(){}.getType();
    }
    
    if ("InsertClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertClientRequest>>(){}.getType();
    }
    
    if ("InsertJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertJobCodeRequest>>(){}.getType();
    }
    
    if ("InsertOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertOrganisationGroupRequest>>(){}.getType();
    }
    
    if ("InsertProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertProjectRequest>>(){}.getType();
    }
    
    if ("InsertTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertTaskRequest>>(){}.getType();
    }
    
    if ("InsertUserHourlyRateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertUserHourlyRateRequest>>(){}.getType();
    }
    
    if ("InsertUserJobFavouriteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertUserJobFavouriteRequest>>(){}.getType();
    }
    
    if ("InsertUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertUserRequest>>(){}.getType();
    }
    
    if ("InsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertUserResponse>>(){}.getType();
    }
    
    if ("InsertVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<InsertVehicleRequest>>(){}.getType();
    }
    
    if ("JobCode".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobCode>>(){}.getType();
    }
    
    if ("JobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobSeriesReportItem>>(){}.getType();
    }
    
    if ("JobTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobTotalsReportItem>>(){}.getType();
    }
    
    if ("OrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrgReportTimesheetFileAttachment>>(){}.getType();
    }
    
    if ("OrgReportTranscript".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrgReportTranscript>>(){}.getType();
    }
    
    if ("OrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrgReportTrip>>(){}.getType();
    }
    
    if ("Organisation".equalsIgnoreCase(className)) {
      return new TypeToken<List<Organisation>>(){}.getType();
    }
    
    if ("OrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrganisationGroup>>(){}.getType();
    }
    
    if ("OrganisationPricingPlan".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrganisationPricingPlan>>(){}.getType();
    }
    
    if ("Project".equalsIgnoreCase(className)) {
      return new TypeToken<List<Project>>(){}.getType();
    }
    
    if ("ProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProjectCostingReportItem>>(){}.getType();
    }
    
    if ("ProjectSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProjectSeriesReportItem>>(){}.getType();
    }
    
    if ("ProjectTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProjectTotalsReportItem>>(){}.getType();
    }
    
    if ("RawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<RawReportItem>>(){}.getType();
    }
    
    if ("SaveClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaveClientRequest>>(){}.getType();
    }
    
    if ("SaveOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaveOrganisationGroupRequest>>(){}.getType();
    }
    
    if ("SaveVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaveVehicleRequest>>(){}.getType();
    }
    
    if ("SetOrganisationGroupUsersRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SetOrganisationGroupUsersRequest>>(){}.getType();
    }
    
    if ("SetUsualHoursRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SetUsualHoursRequest>>(){}.getType();
    }
    
    if ("TaskSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaskSeriesReportItem>>(){}.getType();
    }
    
    if ("TaskTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaskTotalsReportItem>>(){}.getType();
    }
    
    if ("TimeSlot".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeSlot>>(){}.getType();
    }
    
    if ("Timesheet".equalsIgnoreCase(className)) {
      return new TypeToken<List<Timesheet>>(){}.getType();
    }
    
    if ("TimesheetAutomationWithOrgAndGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimesheetAutomationWithOrgAndGeofence>>(){}.getType();
    }
    
    if ("TimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimesheetFileAttachment>>(){}.getType();
    }
    
    if ("TimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimesheetTask>>(){}.getType();
    }
    
    if ("Transcription".equalsIgnoreCase(className)) {
      return new TypeToken<List<Transcription>>(){}.getType();
    }
    
    if ("Trip".equalsIgnoreCase(className)) {
      return new TypeToken<List<Trip>>(){}.getType();
    }
    
    if ("TripCoordinate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TripCoordinate>>(){}.getType();
    }
    
    if ("UpdateGeoFenceRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateGeoFenceRequest>>(){}.getType();
    }
    
    if ("UpdateJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateJobCodeRequest>>(){}.getType();
    }
    
    if ("UpdateMyProfileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateMyProfileRequest>>(){}.getType();
    }
    
    if ("UpdateOrganisationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateOrganisationRequest>>(){}.getType();
    }
    
    if ("UpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateOrganisationResponse>>(){}.getType();
    }
    
    if ("UpdateProfileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateProfileResponse>>(){}.getType();
    }
    
    if ("UpdateProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateProjectRequest>>(){}.getType();
    }
    
    if ("UpdateTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateTaskRequest>>(){}.getType();
    }
    
    if ("UpdateUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateUserRequest>>(){}.getType();
    }
    
    if ("UpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateUserResponse>>(){}.getType();
    }
    
    if ("UserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserForManagement>>(){}.getType();
    }
    
    if ("UserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserHourlyRate>>(){}.getType();
    }
    
    if ("UserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserJobFavourite>>(){}.getType();
    }
    
    if ("UserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserProfile>>(){}.getType();
    }
    
    if ("UsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsualHoursDay>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AggregateClient".equalsIgnoreCase(className)) {
      return new TypeToken<AggregateClient>(){}.getType();
    }
    
    if ("AggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<AggregateJobCode>(){}.getType();
    }
    
    if ("AggregateJobTask".equalsIgnoreCase(className)) {
      return new TypeToken<AggregateJobTask>(){}.getType();
    }
    
    if ("AggregateProject".equalsIgnoreCase(className)) {
      return new TypeToken<AggregateProject>(){}.getType();
    }
    
    if ("ApiResponseBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseBoolean>(){}.getType();
    }
    
    if ("ApiResponseClient".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseClient>(){}.getType();
    }
    
    if ("ApiResponseCombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseCombinedReportsData>(){}.getType();
    }
    
    if ("ApiResponseDoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseDoLoginResponse>(){}.getType();
    }
    
    if ("ApiResponseFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseFleetVehicle>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListBasicGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListBasicGeofence>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListExtendedGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListExtendedGeofence>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListOrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListOrgReportTimesheetFileAttachment>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListOrgReportTranscript".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListOrgReportTranscript>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListOrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListOrgReportTrip>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListRawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListRawReportItem>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListTimesheetFileAttachment>(){}.getType();
    }
    
    if ("ApiResponseForPaginatedListTrip".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseForPaginatedListTrip>(){}.getType();
    }
    
    if ("ApiResponseGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseGeofence>(){}.getType();
    }
    
    if ("ApiResponseInsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseInsertUserResponse>(){}.getType();
    }
    
    if ("ApiResponseInt32".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseInt32>(){}.getType();
    }
    
    if ("ApiResponseJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseJobCode>(){}.getType();
    }
    
    if ("ApiResponseListAggregateClient".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListAggregateClient>(){}.getType();
    }
    
    if ("ApiResponseListAggregateJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListAggregateJobCode>(){}.getType();
    }
    
    if ("ApiResponseListClient".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListClient>(){}.getType();
    }
    
    if ("ApiResponseListFleetSummaryReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListFleetSummaryReportItem>(){}.getType();
    }
    
    if ("ApiResponseListFleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListFleetVehicle>(){}.getType();
    }
    
    if ("ApiResponseListInt32".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListInt32>(){}.getType();
    }
    
    if ("ApiResponseListJobCode".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListJobCode>(){}.getType();
    }
    
    if ("ApiResponseListJobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListJobSeriesReportItem>(){}.getType();
    }
    
    if ("ApiResponseListOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListOrganisationGroup>(){}.getType();
    }
    
    if ("ApiResponseListProject".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListProject>(){}.getType();
    }
    
    if ("ApiResponseListProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListProjectCostingReportItem>(){}.getType();
    }
    
    if ("ApiResponseListTimesheet".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListTimesheet>(){}.getType();
    }
    
    if ("ApiResponseListTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListTimesheetTask>(){}.getType();
    }
    
    if ("ApiResponseListUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListUserForManagement>(){}.getType();
    }
    
    if ("ApiResponseListUserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListUserHourlyRate>(){}.getType();
    }
    
    if ("ApiResponseListUserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListUserJobFavourite>(){}.getType();
    }
    
    if ("ApiResponseListUsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseListUsualHoursDay>(){}.getType();
    }
    
    if ("ApiResponseOrganisation".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseOrganisation>(){}.getType();
    }
    
    if ("ApiResponseOrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseOrganisationGroup>(){}.getType();
    }
    
    if ("ApiResponseProject".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseProject>(){}.getType();
    }
    
    if ("ApiResponseTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseTimesheetFileAttachment>(){}.getType();
    }
    
    if ("ApiResponseTimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseTimesheetTask>(){}.getType();
    }
    
    if ("ApiResponseTranscription".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseTranscription>(){}.getType();
    }
    
    if ("ApiResponseTrip".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseTrip>(){}.getType();
    }
    
    if ("ApiResponseUpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseUpdateOrganisationResponse>(){}.getType();
    }
    
    if ("ApiResponseUpdateProfileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseUpdateProfileResponse>(){}.getType();
    }
    
    if ("ApiResponseUpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseUpdateUserResponse>(){}.getType();
    }
    
    if ("ApiResponseUserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseUserForManagement>(){}.getType();
    }
    
    if ("ApiResponseUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponseUserProfile>(){}.getType();
    }
    
    if ("BasicCoordinate".equalsIgnoreCase(className)) {
      return new TypeToken<BasicCoordinate>(){}.getType();
    }
    
    if ("BasicGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<BasicGeofence>(){}.getType();
    }
    
    if ("BatchUpdateTimesheetRequest".equalsIgnoreCase(className)) {
      return new TypeToken<BatchUpdateTimesheetRequest>(){}.getType();
    }
    
    if ("Client".equalsIgnoreCase(className)) {
      return new TypeToken<Client>(){}.getType();
    }
    
    if ("ClientSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ClientSeriesReportItem>(){}.getType();
    }
    
    if ("ClientSideUser".equalsIgnoreCase(className)) {
      return new TypeToken<ClientSideUser>(){}.getType();
    }
    
    if ("ClientTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ClientTotalsReportItem>(){}.getType();
    }
    
    if ("CombinedReportsData".equalsIgnoreCase(className)) {
      return new TypeToken<CombinedReportsData>(){}.getType();
    }
    
    if ("CreateAutomationStepRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateAutomationStepRequest>(){}.getType();
    }
    
    if ("CreateGeoFenceRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateGeoFenceRequest>(){}.getType();
    }
    
    if ("CreateTripRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateTripRequest>(){}.getType();
    }
    
    if ("DoLoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DoLoginRequest>(){}.getType();
    }
    
    if ("DoLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DoLoginResponse>(){}.getType();
    }
    
    if ("ExtendedGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<ExtendedGeofence>(){}.getType();
    }
    
    if ("FleetSummaryReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<FleetSummaryReportItem>(){}.getType();
    }
    
    if ("FleetVehicle".equalsIgnoreCase(className)) {
      return new TypeToken<FleetVehicle>(){}.getType();
    }
    
    if ("Geofence".equalsIgnoreCase(className)) {
      return new TypeToken<Geofence>(){}.getType();
    }
    
    if ("InsertClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertClientRequest>(){}.getType();
    }
    
    if ("InsertJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertJobCodeRequest>(){}.getType();
    }
    
    if ("InsertOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertOrganisationGroupRequest>(){}.getType();
    }
    
    if ("InsertProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertProjectRequest>(){}.getType();
    }
    
    if ("InsertTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertTaskRequest>(){}.getType();
    }
    
    if ("InsertUserHourlyRateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertUserHourlyRateRequest>(){}.getType();
    }
    
    if ("InsertUserJobFavouriteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertUserJobFavouriteRequest>(){}.getType();
    }
    
    if ("InsertUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertUserRequest>(){}.getType();
    }
    
    if ("InsertUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<InsertUserResponse>(){}.getType();
    }
    
    if ("InsertVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<InsertVehicleRequest>(){}.getType();
    }
    
    if ("JobCode".equalsIgnoreCase(className)) {
      return new TypeToken<JobCode>(){}.getType();
    }
    
    if ("JobSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<JobSeriesReportItem>(){}.getType();
    }
    
    if ("JobTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<JobTotalsReportItem>(){}.getType();
    }
    
    if ("OrgReportTimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<OrgReportTimesheetFileAttachment>(){}.getType();
    }
    
    if ("OrgReportTranscript".equalsIgnoreCase(className)) {
      return new TypeToken<OrgReportTranscript>(){}.getType();
    }
    
    if ("OrgReportTrip".equalsIgnoreCase(className)) {
      return new TypeToken<OrgReportTrip>(){}.getType();
    }
    
    if ("Organisation".equalsIgnoreCase(className)) {
      return new TypeToken<Organisation>(){}.getType();
    }
    
    if ("OrganisationGroup".equalsIgnoreCase(className)) {
      return new TypeToken<OrganisationGroup>(){}.getType();
    }
    
    if ("OrganisationPricingPlan".equalsIgnoreCase(className)) {
      return new TypeToken<OrganisationPricingPlan>(){}.getType();
    }
    
    if ("Project".equalsIgnoreCase(className)) {
      return new TypeToken<Project>(){}.getType();
    }
    
    if ("ProjectCostingReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ProjectCostingReportItem>(){}.getType();
    }
    
    if ("ProjectSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ProjectSeriesReportItem>(){}.getType();
    }
    
    if ("ProjectTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<ProjectTotalsReportItem>(){}.getType();
    }
    
    if ("RawReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<RawReportItem>(){}.getType();
    }
    
    if ("SaveClientRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SaveClientRequest>(){}.getType();
    }
    
    if ("SaveOrganisationGroupRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SaveOrganisationGroupRequest>(){}.getType();
    }
    
    if ("SaveVehicleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SaveVehicleRequest>(){}.getType();
    }
    
    if ("SetOrganisationGroupUsersRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SetOrganisationGroupUsersRequest>(){}.getType();
    }
    
    if ("SetUsualHoursRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SetUsualHoursRequest>(){}.getType();
    }
    
    if ("TaskSeriesReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<TaskSeriesReportItem>(){}.getType();
    }
    
    if ("TaskTotalsReportItem".equalsIgnoreCase(className)) {
      return new TypeToken<TaskTotalsReportItem>(){}.getType();
    }
    
    if ("TimeSlot".equalsIgnoreCase(className)) {
      return new TypeToken<TimeSlot>(){}.getType();
    }
    
    if ("Timesheet".equalsIgnoreCase(className)) {
      return new TypeToken<Timesheet>(){}.getType();
    }
    
    if ("TimesheetAutomationWithOrgAndGeofence".equalsIgnoreCase(className)) {
      return new TypeToken<TimesheetAutomationWithOrgAndGeofence>(){}.getType();
    }
    
    if ("TimesheetFileAttachment".equalsIgnoreCase(className)) {
      return new TypeToken<TimesheetFileAttachment>(){}.getType();
    }
    
    if ("TimesheetTask".equalsIgnoreCase(className)) {
      return new TypeToken<TimesheetTask>(){}.getType();
    }
    
    if ("Transcription".equalsIgnoreCase(className)) {
      return new TypeToken<Transcription>(){}.getType();
    }
    
    if ("Trip".equalsIgnoreCase(className)) {
      return new TypeToken<Trip>(){}.getType();
    }
    
    if ("TripCoordinate".equalsIgnoreCase(className)) {
      return new TypeToken<TripCoordinate>(){}.getType();
    }
    
    if ("UpdateGeoFenceRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateGeoFenceRequest>(){}.getType();
    }
    
    if ("UpdateJobCodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateJobCodeRequest>(){}.getType();
    }
    
    if ("UpdateMyProfileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateMyProfileRequest>(){}.getType();
    }
    
    if ("UpdateOrganisationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateOrganisationRequest>(){}.getType();
    }
    
    if ("UpdateOrganisationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateOrganisationResponse>(){}.getType();
    }
    
    if ("UpdateProfileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateProfileResponse>(){}.getType();
    }
    
    if ("UpdateProjectRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateProjectRequest>(){}.getType();
    }
    
    if ("UpdateTaskRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateTaskRequest>(){}.getType();
    }
    
    if ("UpdateUserRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateUserRequest>(){}.getType();
    }
    
    if ("UpdateUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateUserResponse>(){}.getType();
    }
    
    if ("UserForManagement".equalsIgnoreCase(className)) {
      return new TypeToken<UserForManagement>(){}.getType();
    }
    
    if ("UserHourlyRate".equalsIgnoreCase(className)) {
      return new TypeToken<UserHourlyRate>(){}.getType();
    }
    
    if ("UserJobFavourite".equalsIgnoreCase(className)) {
      return new TypeToken<UserJobFavourite>(){}.getType();
    }
    
    if ("UserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<UserProfile>(){}.getType();
    }
    
    if ("UsualHoursDay".equalsIgnoreCase(className)) {
      return new TypeToken<UsualHoursDay>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
