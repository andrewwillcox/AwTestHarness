package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.List;

public class LoadClientForm {


    @JsonProperty(value = "Token")
    String Token;

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

    @JsonProperty(value = "ClientID")
    String ClientID;

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

    @Override public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Token", Token)
                .add("FirstName", FirstName)
                .add("LastName", LastName)
                .add("MobileNo", MobileNo)
                .add("Email", Email)
                .add("Address", Address)
                .add("ClientID", ClientID)
                .add("SecurityQuestion", SecurityQuestion)
                .add("SecurityAnswer", SecurityAnswer)
                .add("PhotosVideos", PhotosVideos)
                .add("AlarmEvents", AlarmEvents)
                .add("NonAlarmEvents", NonAlarmEvents)
                .add("EmergencyServices", EmergencyServices)
                .add("EmergencyContacts", EmergencyContacts)
                .toString();
    }
}
