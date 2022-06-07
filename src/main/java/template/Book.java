package template;

import lombok.*;
import template.role.ABS;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book extends ABS {
    private String author;
    private String LibraryId;
    private String userId = "";

    @Override
    public String toString() {
        return          "\n\tid: " + getId() +
                        "\t\tname: " + getName() +
                        "\t\tid: " + getId() +
                        "\tauthor: " + author;
    }
}
