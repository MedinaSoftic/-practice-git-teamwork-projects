package org.example.Controller;

import org.example.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class MovieController {

    private final List<Movie> movies = new ArrayList<>();


    @Autowired
    private org.example.GeminiApp geminiApp;

    @GetMapping("/")
    public String formPage() {
        return """
                <html>
                <body>
                    <h1>Add a movie: </h1>
                
                    <form action="/add" method="post">
                    Title: <input type='text' name='title' /><br/>
                    Rating: <input type='text' name='rating' /><br/>
                
                    <input type='submit' value='Submit' />
                    </form>
                </body>
                </html>
                """;
    }
    @PostMapping("/add")
    public String addMovie(@RequestParam String title, @RequestParam int rating) {
        String description = geminiApp.generateDescription(title);

        Movie movie = new Movie(title, rating, description);
        movies.add(movie);

        StringBuilder html = new StringBuilder();
        html.append("<html><body>");
        html.append("<h1>All Movies</h1>");
        html.append("<a href='/'>Add Another Movie</a><br>");

        for (Movie m : movies) {
            html.append("<pre>").append(m.toString()).append("</pre><hr>");
        }

        html.append("</body></html>");
        return html.toString();
    }
}
