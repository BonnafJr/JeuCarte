package monprojet.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class PaireSyllabes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer syllabe;

    @NonNull
    private String audio;
}
