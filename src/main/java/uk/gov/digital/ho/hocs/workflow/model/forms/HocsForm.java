package uk.gov.digital.ho.hocs.workflow.model.forms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class HocsForm {

    @JsonProperty("schema")
    private HocsSchema schema;

    @Setter
    @JsonRawValue
    // We can do raw value here as all we do is pass it to the UI.
    private String data;

}
