package kodlamaio.hmrs.business.requestes.job;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateJobRequest {
    private String position;
    private String Description;
    private int typeId;
}
