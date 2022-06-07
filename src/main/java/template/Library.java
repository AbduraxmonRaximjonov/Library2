package template;


import lombok.*;
import template.role.ABS;
import template.role.LibStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Library extends ABS {
    private String location;
    private LibStatus libStatus; // open/closed

}
