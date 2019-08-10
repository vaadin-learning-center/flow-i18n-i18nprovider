package junit.com.vaadin.tutorial.flow.i18n.i18nprovider;

import junit.com.vaadin.tutorial.flow.VaadinTutorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.dependencies.core.logger.HasLogger;

@VaadinTutorial
public class VaadinAppTest
    implements HasLogger {


  @Test
  void test001(VaadinAppPageObject pageObject) {
    final String url = "http://" + pageObject.getHostIpAddress() + ":8899/";
    logger().info("URL : " + url);
    pageObject.load(url);
    Assertions.assertEquals("0",pageObject.labelCounter().getText());
    pageObject.btn().click();
    Assertions.assertEquals("1",pageObject.labelCounter().getText());
    pageObject.btn().click();
    Assertions.assertEquals("2",pageObject.labelCounter().getText());


  }
}
