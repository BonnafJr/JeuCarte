package monprojet.entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class PartiesGagnees{
    @OneToMany(mappedBy = "partieGagnees")
    @ToString.Exclude
    private List<PartieSyllabes> partieSyllabes = new ArrayList<>();

    @OneToMany(mappedBy = "partieGagnees")
    @ToString.Exclude
    private List<PartieMemory> partieMemory = new ArrayList<>();
}
