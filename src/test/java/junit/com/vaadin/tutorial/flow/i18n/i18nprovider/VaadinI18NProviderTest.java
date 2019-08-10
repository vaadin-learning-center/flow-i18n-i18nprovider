package junit.com.vaadin.tutorial.flow.i18n.i18nprovider;

import com.vaadin.tutorial.flow.i18n.i18nprovider.VaadinApp;
import com.vaadin.tutorial.flow.i18n.i18nprovider.VaadinI18NProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class VaadinI18NProviderTest {


  @Test
  void test001() {
    final VaadinI18NProvider provider = new VaadinI18NProvider();
    Assertions.assertEquals(2,provider.getProvidedLocales().size());
  }

  @Test
  void test002() {
    final VaadinI18NProvider provider = new VaadinI18NProvider();
    final String translation = provider.getTranslation(VaadinApp.KEY_BTN_CLICK_ME, Locale.ENGLISH);
    Assertions.assertEquals("click me",translation);
  }

  @Test
  void test003() {
    final VaadinI18NProvider provider = new VaadinI18NProvider();
    final String translation = provider.getTranslation(VaadinApp.KEY_BTN_CLICK_ME, Locale.GERMAN);
    Assertions.assertEquals("druecke mich",translation);
  }



}
