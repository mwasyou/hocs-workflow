package uk.gov.digital.ho.hocs.workflow.caseworkClient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uk.gov.digital.ho.hocs.workflow.model.StageName;

import java.util.UUID;

@NoArgsConstructor
@Getter
public class GetCaseworkStageResponse {

    @JsonProperty("type")
    private StageName type;

    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("caseReference")
    private String caseReference;

}
