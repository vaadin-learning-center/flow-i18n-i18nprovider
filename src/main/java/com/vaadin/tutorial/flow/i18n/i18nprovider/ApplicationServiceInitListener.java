package com.vaadin.tutorial.flow.i18n.i18nprovider;

import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static java.lang.System.setProperty;

public class ApplicationServiceInitListener
    implements VaadinServiceInitListener, HasLogger {

  @Override
  public void serviceInit(ServiceInitEvent e) {
    setProperty("vaadin.i18n.provider", VaadinI18NProvider.class.getName());
  }

}
