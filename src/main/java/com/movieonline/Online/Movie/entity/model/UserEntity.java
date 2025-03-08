package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
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

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private byte[] profilePicturePath;

    @NotBlank(message = "Username cannot be empty")
    private String username;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    private Boolean isAdmin = false;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserBookingEntity> bookings = new ArrayList<>();

    public UserEntity(String name, byte[] profilePicturePath, String username, String password, Boolean isAdmin) {
        this.name = name;
        this.profilePicturePath = profilePicturePath;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.bookings = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("UserEntity(id=%d, name='%s', username='%s', isAdmin=%b, bookings=%s)",
                id, name, username, isAdmin, bookings.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(username, that.username) &&
                Objects.equals(isAdmin, that.isAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, isAdmin);
    }
}