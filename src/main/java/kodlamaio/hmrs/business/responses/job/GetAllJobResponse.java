package kodlamaio.hmrs.business.responses.job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllJobResponse {
    private int id;
    private String position;
    private String description;
    private String typeName;
}
