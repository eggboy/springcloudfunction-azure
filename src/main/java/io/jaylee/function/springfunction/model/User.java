package io.jaylee.function.springfunction.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "user_master")
@ToString
public class User {

    @Id
    private String userId;
    private String lastName;
    private String firstName;
    private String email;
}
