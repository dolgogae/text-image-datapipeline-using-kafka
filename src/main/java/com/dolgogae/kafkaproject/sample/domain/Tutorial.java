package com.dolgogae.kafkaproject.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
    @PrimaryKey
    private UUID id;

    private String title;
    private String description;
    private boolean published;
}
