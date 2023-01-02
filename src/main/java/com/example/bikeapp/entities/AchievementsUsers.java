
package com.example.bikeapp.entities;

        import jakarta.persistence.*;
        import lombok.*;

@Entity
@Table(name = "AchievementsUsers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AchievementsUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "achievementId")
    private Long achievementId;


}
