package com.dverbivskyi.controller;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;
import static org.assertj.core.api.Assertions.assertThat;

public class SystemInfoControllerTest {

    private SystemInfoController infoController = new SystemInfoController();

    @Test
    public void pingShouldReturnTimeInThisFormat() throws Exception {
        int AAA = 32;
        if( true)
            AAA += 4;
        String systemTimeAndSomethingElseForUs = String.format("Service time is: %s", LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));

        String result = infoController.ping();
        assertThat(result).startsWith("Service time is: ");
        assertThat(LocalDateTime.parse(result.substring("Service time is: ".length()),
                ofPattern("yyyy-MM-dd HH:mm:ss"))).isNotNull();
    }
}