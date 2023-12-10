package com.vocaops.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Value;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GoogleTranslateAPITest {

    
	 @Value("${google.cloud.translation.api-key}")
	  private String apiKey;

    @DisplayName("구글번역기 API 테스트")
    @Test
    void testGoogleTranslateAPI() {
        Translate translate = TranslateOptions.newBuilder().setApiKey(apiKey).build().getService();

        String text = "안녕하세요";
        Translation translation = translate.translate(text, Translate.TranslateOption.targetLanguage("en"));

        System.out.printf("Translated Text: %s%n", translation.getTranslatedText());

         assertEquals("hello", translation.getTranslatedText());
    }
}
