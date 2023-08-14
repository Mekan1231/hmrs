package kodlamaio.hmrs.business.requestes.candidatecv;

import java.sql.Timestamp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandidateCvRequest {
    @NotNull
    @NotBlank
    private String educationInformationSchoolName;

    @NotNull
    @NotBlank
    private String educatianInformationDepartmentName;

    @NotNull
    @NotBlank
    private Timestamp educationInformationStartDate;

    @NotNull
    @NotBlank
    private Timestamp educationInformationFinishDate;

    @NotNull
    @NotBlank
    private String jobExperienceCompanyName;

    @NotNull
    @NotBlank
    private String jobExperiencePosition;

    @NotNull
    @NotBlank
    private Timestamp jobExperienceStartDate;

    @NotNull
    @NotBlank
    private Timestamp jobExperienceFinishdate;


    private String foreignLanguageName;
    private String foreignLanguageLevel;
    private String imageUrl;
    private String githubUrl;
    private String linkedinUrl;

    private String programmingLanguageName;
    private String programmingLanguageTechnologyName;
    private String coverLetter;



}
