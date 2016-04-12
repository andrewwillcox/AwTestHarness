package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonProperty;

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
        return "LoadClientForm{" +
                "Token='" + Token + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MobileNo='" + MobileNo + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", ClientID='" + ClientID + '\'' +
                ", SecurityQuestion='" + SecurityQuestion + '\'' +
                ", SecurityAnswer='" + SecurityAnswer + '\'' +
                ", PhotosVideos='" + PhotosVideos + '\'' +
                ", AlarmEvents='" + AlarmEvents + '\'' +
                ", NonAlarmEvents='" + NonAlarmEvents + '\'' +
                ", EmergencyServices='" + EmergencyServices + '\'' +
                ", EmergencyContacts=" + EmergencyContacts +
                '}';
    }
}
