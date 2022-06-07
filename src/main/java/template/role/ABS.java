package template.role;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ABS {
    private final String id = UUID.randomUUID().toString();
    private String name;
}
