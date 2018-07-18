package uk.gov.digital.ho.hocs.workflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uk.gov.digital.ho.hocs.workflow.model.DocumentType;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class CreateDocumentRequest {

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("type")
    private DocumentType type;

    @JsonProperty("s3UntrustedUrl")
    private String s3UntrustedUrl;
}