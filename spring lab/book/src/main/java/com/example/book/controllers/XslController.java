package com.example.book.controllers;

import com.example.book.dto.AuthorDto;
import com.example.book.dto.GenreDto;
import com.example.book.services.AuthorService;
import com.example.book.services.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/xsl")
public class XslController {

    private final AuthorService authorService;
    private final GenreService genreService;

    public XslController(AuthorService authorService, GenreService genreService) {
        this.authorService = authorService;
        this.genreService = genreService;
    }

    @GetMapping("/author")
    public ModelAndView getAuthor() {
        Iterable<AuthorDto> authors = authorService.getAllAuthors();
        return new ModelAndView("authorXSL", "authors", authors); // Pass the iterable directly
    }

    @GetMapping("/genre")
    public ModelAndView getGenre() {
        Iterable<GenreDto> genres = genreService.getAllGenres();
        return new ModelAndView("genreXSL", "genres", genres); // Pass the iterable directly
    }
}
