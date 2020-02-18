package io.spring.start.movieratingdataservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.start.movieratingdataservice.models.Rating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {

	@RequestMapping("/{movieId}")
	public List<Rating> getMovieRatingResource(@PathVariable("movieId") String movieId) {
		return Collections.singletonList(new Rating("tras", 4));
	}
}
