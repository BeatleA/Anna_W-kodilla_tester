package com.kodilla.testcontainers.homework;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.*;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

public class BusinessCardTest {

    @Rule
    public Network network = Network.newNetwork();

    @Rule
    public GenericContainer webServer =
            new GenericContainer(
                    new ImageFromDockerfile()
                            .withFileFromClasspath("/tmp", "/BusinessCard")
                            .withFileFromClasspath("/tmp/img", "/BusinessCard/img")
                            .withDockerfileFromBuilder(builder ->
                                    builder
                                            .from("httpd:2.4")
                                            .copy("/tmp", "/usr/local/apache2/htdocs")
                                            .copy("/tmp/img", "/usr/local/apache2/htdocs/img")
                                            .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Rule
    public BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer<>()
                    .withNetwork(network)
                    .withRecordingMode(RECORD_ALL, new File("./build/"),
                            VncRecordingContainer.VncRecordingFormat.MP4)
                    .withRecordingFileFactory(new DefaultRecordingFileFactory())
                    .withCapabilities(new ChromeOptions());

    @Test
    public void customImageTest() throws InterruptedException, IOException {
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://my-server/");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String name = driver.findElement(By.id("name")).getText();
        assertEquals("ANNA", name);
    }

}
