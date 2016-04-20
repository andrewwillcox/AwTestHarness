package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LoadClientForm extends ClientForm {

  @JsonProperty(value = "FirstName")
  String FirstName;

  @JsonProperty(value = "LastName")
  String LastName;

  @JsonProperty(value = "MobileNo")
  String MobileNo;

  @JsonProperty(value = "Email")
  String Email;

  @JsonProperty(value = "Address")
  String Address;

  @JsonProperty(value = "SecurityQuestion")
  String SecurityQuestion;

  @JsonProperty(value = "SecurityAnswer")
  String SecurityAnswer;

  @JsonProperty(value = "PhotosVideos")
  String PhotosVideos;

  @JsonProperty(value = "AlarmEvents")
  String AlarmEvents;

  @JsonProperty(value = "NonAlarmEvents")
  String NonAlarmEvents;

  @JsonProperty(value = "EmergencyServices")
  String EmergencyServices;

  @JsonProperty(value = "EmergencyContacts")
  List<Contact> EmergencyContacts;
}
