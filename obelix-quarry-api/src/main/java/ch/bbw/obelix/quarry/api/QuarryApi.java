package ch.bbw.obelix.quarry.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

public interface QuarryApi {

    @GetExchange("/api/mehnirs")
    List<MenhirDto> getallMehnirs();
}
