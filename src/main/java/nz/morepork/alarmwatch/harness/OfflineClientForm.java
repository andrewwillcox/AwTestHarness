package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonProperty;

class OfflineClientForm {

    @JsonProperty(value = "Token")
    String token;

    @JsonProperty(value = "NameOfPerson")
    String nameOfPerson;

    @JsonProperty(value = "Reason")
    String reason;

    @JsonProperty(value = "ClientID")
    String clientID;

    @Override public String toString() {
        return "OfflineClientForm{" +
                "token='" + token + '\'' +
                ", nameOfPerson='" + nameOfPerson + '\'' +
                ", reason='" + reason + '\'' +
                ", clientID='" + clientID + '\'' +
                '}';
    }
}
