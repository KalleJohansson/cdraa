package se.raa.cdraa.hello;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LangService {

    public List<Lang> getLangs() {
        List<Lang> langs = new ArrayList<>();
        langs.add(new Lang("Java", "Störst"));
        langs.add(new Lang("Javascript", "Kung"));
        langs.add(new Lang("Kotlin", "New kid on the block"));
        langs.add(new Lang("Groovy", "Hipster"));
        langs.add(new Lang("Scala", "Stylish"));
        langs.add(new Lang("Pascal", "Sience"));
        langs.add(new Lang("Python", "Funny ?"));
        langs.add(new Lang("Basic", "basic"));
        langs.add(new Lang("PHP", "but why ?"));
        langs.add(new Lang("Ruby", "not so much"));

        return langs;
    }
}
