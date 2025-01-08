package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String profilePicturePath;
    @NotBlank(message = "Username cannot be empty")
    private String username;
    @NotBlank(message = "Password cannot be empty")
    private String password;
    @Column(name = "is_admin")
    private Boolean isAdmin = false;

    public UserEntity(String name, String profilePicturePath, String username, String password, Boolean isAdmin) {
        this.name = name;
        this.profilePicturePath = profilePicturePath;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return String.format("UserEntity(id=%d, name='%s', profilePicturePath='%s', username='%s', isAdmin=%b)", id, name, profilePicturePath, username, isAdmin);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(profilePicturePath, that.profilePicturePath) &&
                Objects.equals(username, that.username) &&
                Objects.equals(isAdmin, that.isAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, profilePicturePath, username, isAdmin);
    }

}
