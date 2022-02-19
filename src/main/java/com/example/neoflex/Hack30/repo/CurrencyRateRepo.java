package com.example.neoflex.Hack30.repo;

import com.example.neoflex.Hack30.entity.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRateRepo extends JpaRepository<CurrencyRate, Long> {
}
