package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

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
        return MoreObjects.toStringHelper(this)
                .add("token", token)
                .add("nameOfPerson", nameOfPerson)
                .add("reason", reason)
                .add("clientID", clientID)
                .toString();
    }
}
