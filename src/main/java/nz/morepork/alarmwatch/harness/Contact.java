package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {

    @JsonProperty(value = "FullName")
    String FullName;

    @JsonProperty(value = "MobileNo")
    String MobileNo;

    @JsonProperty(value = "DayTimePhone")
    String DayTimePhone;

    @JsonProperty(value = "AfterHourPhone")
    String AfterHourPhone;

    @Override public String toString() {
        return "Contact{" +
                "FullName='" + FullName + '\'' +
                ", MobileNo='" + MobileNo + '\'' +
                ", DayTimePhone='" + DayTimePhone + '\'' +
                ", AfterHourPhone='" + AfterHourPhone + '\'' +
                '}';
    }

}
