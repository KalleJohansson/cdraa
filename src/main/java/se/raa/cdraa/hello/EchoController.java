package se.raa.cdraa.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class EchoController {

    @GetMapping(value = "/echo", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Host> echo() throws UnknownHostException {
        String hostname = InetAddress.getLocalHost().getHostName();
        hostname = "Hej sa Jens, " + hostname;
        Host host = new Host();
        host.setHostname(hostname);

        return new ResponseEntity<Host>(host, HttpStatus.OK);
    }
}
