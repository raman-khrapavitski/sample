package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "[not_cb_table_name]", schema = "dbo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotCBModel {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    private String field;
}
