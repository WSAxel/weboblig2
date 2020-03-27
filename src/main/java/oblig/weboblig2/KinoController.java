package oblig.weboblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class KinoController {
    public final List<Kino> alleFilmer = new ArrayList<>();

    @PostMapping("/lagre")
    public void LagreFilmene(Kino innFilmer) {
        alleFilmer.add(innFilmer);
    }

    @GetMapping("/hentAlle")
    public List<Kino> hentAlle() {
        return alleFilmer;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {alleFilmer.clear();}

}