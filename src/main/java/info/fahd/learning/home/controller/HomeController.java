package info.fahd.learning.home.controller;

import info.fahd.learning.common.JsonHttpResponse;
import info.fahd.learning.common.ResponseObject;
import info.fahd.learning.home.dto.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping(path="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getLandingPagePlain(){
        logger.debug("Entering getLandingPagePlain() method.");
        return "Things are looking good!";
    }

    @GetMapping(path="/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public JsonHttpResponse getLandingPage() {
        logger.debug("Entering getLandingPage() method.");
        ResponseObject<HomePage> response = new ResponseObject<>();
        response.setPayload(homepageContent());
        return new JsonHttpResponse(response);
    }

    private HomePage homepageContent(){
        logger.debug("Entering homepageContent() method.");
        String[] list = ("This is placeholder information here,This is second line").split(",");
        HomePage homePage = new HomePage("Fahd Khan", "Info on Fahd",
                Arrays.asList(list));
        return homePage;
    }
}
