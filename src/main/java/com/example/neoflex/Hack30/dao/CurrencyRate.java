package com.example.neoflex.Hack30.dao;

import lombok.*;
//import org.hibernate.Hibernate;
//
//import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

//@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class CurrencyRate {

//    @Id
//    @GeneratedValue
//    @Column(nullable = false)
    private Long id;

    @NonNull private String name;
    @NonNull private LocalDateTime dateTime;
    @NonNull private Double min;
    @NonNull private Double max;
    @NonNull private Double open;
    @NonNull private Double close;

//    @ElementCollection
    private List<Double> events;

    @Override
    public boolean equals(Object o) {
        return this == o
                || o != null
//                && Hibernate.getClass(this) == Hibernate.getClass(o)
                && id != null
                && o instanceof CurrencyRate currencyRate
                && Objects.equals(id, currencyRate.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
