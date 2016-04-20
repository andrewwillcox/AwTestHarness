package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ClientForm {
  @JsonProperty(value = "Token")
  String token;
  @JsonProperty(value = "ClientID")
  String clientID;
}
