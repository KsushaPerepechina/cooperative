package by.bsuir.core.sequence.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;
    private Long sequence;
}
