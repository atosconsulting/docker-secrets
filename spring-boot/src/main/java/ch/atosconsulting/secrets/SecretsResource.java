package ch.atosconsulting.secrets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretsResource {

    @Value("${secret}")
    private String secret;

    @RequestMapping("/secret")
    public String show() {
        return "Hello " + secret + "\n";
    }
}
