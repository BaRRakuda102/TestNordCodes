import com.codeborne.selenide.Condition;
import helpers.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class NordCodesTests extends BaseTest {

    @Test
    @DisplayName("Проверка открытия ссылки")
    void testLink() {
        step("Проверка открытия ссылки", () -> {
            open("https://nord.codes");
            $(".intro-text").shouldHave(Condition.text("РАЗРАБОТКА ИГРОВЫХ ПРОДУКТОВ!"));
        });
    }

    @Test
    @DisplayName("Открытие страницы Контакты")
    void shouldKontats() {
        step("Проверка открытия ссылки", () -> {
            open("https://nord.codes");
            $("#menu-item-383").click();
        });
    }

    @Test
    @DisplayName("Заполнение формы")
    void sendMessage() {
        step("Заполнение формы", () -> {
            open("https://nord.codes");
            $("#pirate-forms-contact-name").setValue("Test Name");
            $("#pirate-forms-contact-email").setValue("testemail@test.com");
            $("#pirate-forms-contact-subject").setValue("Test");
            $("#pirate-forms-contact-message").setValue("Хочу у вас работать)");
        });
    }
}
