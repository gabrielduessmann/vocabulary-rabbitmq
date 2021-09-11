package dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO implements Serializable {
    public UUID id;
    public String comment;
}
