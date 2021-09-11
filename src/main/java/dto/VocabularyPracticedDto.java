package dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
public class VocabularyPracticedDto implements Serializable {
    public UUID vocabularyId;
}
