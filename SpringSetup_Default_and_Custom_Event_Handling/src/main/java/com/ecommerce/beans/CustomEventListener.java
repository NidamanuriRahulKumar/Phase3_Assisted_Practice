package com.ecommerce.beans;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
        
   public void onApplicationEvent(CustomEvent event) {
      System.out.println(event.toString());
   }
}
