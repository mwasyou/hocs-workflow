package uk.gov.digital.ho.hocs.workflow.caseworkClient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import uk.gov.digital.ho.hocs.workflow.model.StageName;

import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
public class CreateCaseworkStageRequest {

    @JsonProperty("type")
    private StageName stageName;

    @JsonProperty("teamUUID")
    private UUID teamUUID;

    @JsonProperty("userUUID")
    private UUID userUUID;

    @JsonProperty("data")
    private Map<String, String> stageData;
}
