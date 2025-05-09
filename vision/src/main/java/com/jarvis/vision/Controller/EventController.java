package com.jarvis.vision.Controller;
import com.jarvis.vision.dto.EventRequest;
import com.jarvis.vision.service.EventProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sdk")
public class EventController {

    private final EventProducer eventProducer;

    public EventController(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
    }

    @PostMapping("/event")
    public ResponseEntity<String> publishEvent(@RequestBody EventRequest event) {
        eventProducer.sendEvent(event);
        return ResponseEntity.ok("Event sent successfully!");
    }
}