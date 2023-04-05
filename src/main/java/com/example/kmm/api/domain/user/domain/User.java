package com.example.kmm.api.domain.user.domain;

import com.example.kmm.api.domain.user.dto.AuditingFields;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * User class.
 *
 * <p>
 * date: 2023-04-05
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Getter
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "user",
    indexes = {
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
})
@Entity
public class User extends AuditingFields {

    @Id
    @Column(length = 50)
    private String userId;

    @Setter
    @Column(nullable = false)
    private String userPassword;

    @Setter
    @Column(length = 100)
    private String name;

    @Setter
    private int point;

    private User(String userId, String userPassword, String name, int point) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.name = name;
        this.point = point;
    }

    public static User of(String userId, String userPassword, String name, int point) {
        return new User(userId, userPassword, name, point);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User that = (User) o;
        return this.getUserId().equals(that.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
