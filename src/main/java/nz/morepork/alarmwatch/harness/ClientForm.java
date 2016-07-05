package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ClientForm {
  @JsonProperty(value = "receivedAt")
  private final DateTime receivedAt = DateTime.now();

  @JsonProperty(value = "Token", required = true)
  String token;

  @JsonProperty(value = "ClientID", required = true)
  String clientID;

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("token", token)
        .add("clientID", clientID)
        .add("receivedAt", receivedAt)
        .toString();
  }
}
