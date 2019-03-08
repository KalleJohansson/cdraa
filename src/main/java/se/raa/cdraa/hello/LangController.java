package se.raa.cdraa.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class LangController {

    @Autowired
    LangService langService;

    @GetMapping(value = "/langs", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Lang>> getLangs() {
        List<Lang> langs = this.langService.getLangs();

        return new ResponseEntity(langs, HttpStatus.OK);
    }
}
