import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import owner.CredsOwner;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class BaseTest {

    @BeforeAll
   static void beforeAll(){

       CredsOwner credsOwner = ConfigFactory.create(CredsOwner.class);


       System.setProperty("RemoteUrl", "selenoid.autotests.cloud/wd/hub");
       String remoteUrl = System.getProperty("RemoteUrl");
     SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

       Configuration.browserSize = "1920x1080";
      Configuration.remote = "https://" + credsOwner.login() + ":" + credsOwner.password() + "@" + remoteUrl;

       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("enableVNC", true);
      capabilities.setCapability("enableVideo", true);
       Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}