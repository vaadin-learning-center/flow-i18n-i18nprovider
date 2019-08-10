package junit.com.vaadin.tutorial.flow.i18n.i18nprovider;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.html.testbench.SpanElement;
import com.vaadin.tutorial.flow.i18n.i18nprovider.VaadinApp;
import junit.com.vaadin.tutorial.flow.WebDriverParameterResolver;
import org.openqa.selenium.WebDriver;

public class VaadinAppPageObject
    extends WebDriverParameterResolver.GenericPageObject {

  public VaadinAppPageObject(WebDriver webdriver, String hostIpAddress, String vncAdress) {
    super(webdriver, hostIpAddress, vncAdress);
  }

  public SpanElement labelCounter() {
    return this.$(SpanElement.class)
               .id(VaadinApp.SPAN_ID);
  }

  public ButtonElement btn() {
    return this.$(ButtonElement.class)
               .id(VaadinApp.BUTTON_ID);
  }

}
