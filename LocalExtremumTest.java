package com.isa.aem.local.extremum;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;


public class LocalExtremumTest {

    LocalExtremum localExtremum = new LocalExtremum();
    LocalExtremumTestRepository localExtremumTestRepository = new LocalExtremumTestRepository();

    @Test
    @DisplayName("Should return one minimum if found")
    public void returnsOneMinimumIfFound() {
        Double firstMinExtremum = localExtremum.findFirstMinExtremum(localExtremumTestRepository.manyCurrenciesWithTheSameRate);
        assertThat(firstMinExtremum)
                .isEqualTo(1.222);
    }

    @Test
    @DisplayName("Should return zero minimum if not found")
    public void returnsZeroMinimumIfNotFound() {
        Double firstMinExtremum = localExtremum.findFirstMinExtremum(localExtremumTestRepository.emptyList);
        assertThat(firstMinExtremum); ;
    }

    @Test
    @DisplayName("Should return one maximum if found")
    public void returnsOneMaximumIfFound() {
        Double firstMaxExtremum = localExtremum.findFirstMaxExtremum(localExtremumTestRepository.manyCurrenciesWithTheSameRate);
        assertThat(firstMaxExtremum)
                .isEqualTo(3.888);
    }

    @Test
    @DisplayName("Should return zero maximum if not found")
    public void returnsZeroMaximumIfNotFound() {
        Double firstMaxExtremum = localExtremum.findFirstMaxExtremum(localExtremumTestRepository.emptyList);
        assertThat(firstMaxExtremum)
                .isNull();
    }

    @Test
    public void returnsAllFoundMinimums() {

    }


}
