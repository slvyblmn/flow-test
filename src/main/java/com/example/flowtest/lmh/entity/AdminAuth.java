package com.example.flowtest.lmh.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "AdminAuths")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdminAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
