package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@Data
@Embeddable
public class Price {
    private Long value;
    private String currency;
}
