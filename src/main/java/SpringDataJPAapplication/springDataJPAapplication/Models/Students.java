package SpringDataJPAapplication.springDataJPAapplication.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
    name = "students",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "student_email_unique",
            columnNames = "email"
        )
    }
)
public class Students {


    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )

    @Column(
        name = "id",
        updatable = false
    )
    private Long id;

    @Column(
        name = "first_name",
        updatable = true,
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(
        name = "last_name",
        updatable = true,
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
        name = "email",
        updatable = true,
        columnDefinition = "TEXT"
    )
    private String email;

    @Column(
        name = "age",
        updatable = true,
        nullable = false,
        columnDefinition = "INTEGER"
    )
    private Integer age;

    public Students(Long id, String firstName, String lastName, String email, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }


}
