package uk.gov.digital.ho.hocs.workflow.infoClient;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uk.gov.digital.ho.hocs.workflow.model.StageName;

import java.time.LocalDate;
import java.util.Map;

@NoArgsConstructor
@Getter
public class InfoGetDeadlinesResponse {

    @JsonProperty("deadlines")
    private Map<StageName, LocalDate> deadlines;
}
