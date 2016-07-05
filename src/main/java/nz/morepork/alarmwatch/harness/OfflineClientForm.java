package nz.morepork.alarmwatch.harness;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class OfflineClientForm extends ClientForm {

  @JsonProperty(value = "NameOfPerson")
  String nameOfPerson;

  @JsonProperty(value = "Reason")
  String reason;

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("nameOfPerson", nameOfPerson)
        .add("reason", reason)
        .toString();
  }
}
