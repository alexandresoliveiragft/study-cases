package dev.alexandreoliveira.studycase.liquibasedemo.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.uuid.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "tbl_todos")
public class ToDoEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "uuid", type = UuidGenerator.class)
    private UUID id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "description", nullable = false, columnDefinition = "text")
    private String description;

    @Column(name = "date", nullable = false, columnDefinition = "timestamptz")
    private String date;

    @Column(name = "is_finished", columnDefinition = "boolean default false")
    private Boolean isFinished;

}
