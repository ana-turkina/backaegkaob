package ee.valiitit.backaegkaob.domain.funeral;

import ee.valiitit.backaegkaob.domain.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "funeral", schema = "kaob")
public class Funeral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "funeral_instructions", nullable = false, length = Integer.MAX_VALUE)
    private String funeralInstructions;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}