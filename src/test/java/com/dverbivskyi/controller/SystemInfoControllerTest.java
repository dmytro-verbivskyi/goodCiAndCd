package com.dverbivskyi.controller;

import org.junit.Test;

import java.time.LocalDateTime;

import static java.time.format.DateTimeFormatter.ofPattern;
import static org.assertj.core.api.Assertions.assertThat;

public class SystemInfoControllerTest {

    private SystemInfoController infoController = new SystemInfoController();

    @Test
    public void pingShouldReturnTimeInThisFormat() throws Exception {
        String result = infoController.ping();
        assertThat(result).startsWith("Service time is: ");
        assertThat(LocalDateTime.parse(result.substring("Service time is: ".length()),
                ofPattern("yyyy-MM-dd HH:mm:ss"))).isNotNull();
    }
}