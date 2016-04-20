package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class OfflineClientForm extends ClientForm {

  @JsonProperty(value = "NameOfPerson")
  String nameOfPerson;

  @JsonProperty(value = "Reason")
  String reason;

}
