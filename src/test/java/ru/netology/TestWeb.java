package ru.netology;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestWeb {

    @BeforeEach
    void setUp() {
        open("http://localhost:9999/");
    }
    @Test
    void shouldSubmitRequest() {
        $("[data-test-id=name] input").setValue("Петров-Водкин Петр");
        $("[data-test-id=phone] input").setValue("+79008007755");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }


}


