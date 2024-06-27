package com.example;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.validation.annotation.Validated;

@Document
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class CbDocumentModel {
    @Id
    private String id;
    @Field
    private String field;
}
