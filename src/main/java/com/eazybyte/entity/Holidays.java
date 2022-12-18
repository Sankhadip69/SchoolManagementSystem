package com.eazybyte.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="holidays")
public class Holidays extends BaseEntity {
    @Id
    private String day;

    private String reason;

    @Enumerated(EnumType.STRING)
    private Type type;

    public enum Type {
        FESTIVAL, FEDERAL
    }
}
