package org.vaadin.pekkam.event;

import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import org.vaadin.pekkam.Canvas;

@DomEvent("click")
public class MouseClickEvent extends MouseEvent
{
   public MouseClickEvent(
      Canvas source,
      boolean fromClient,
      @EventData("event.clientX") int clientX,
      @EventData("event.clientY") int clientY,
      @EventData("event.button") int button
   )
   {
      super(source, fromClient, clientX, clientY, button);
   }
}
