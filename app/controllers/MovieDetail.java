package controllers;

import models.Movie;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.movieDetail;

/**
 * Created by itohshunsuke on 2015/03/21.
 */
public class MovieDetail extends Controller {

    public static Result index(Long id) {

        Movie movie = Movie.find.byId(id);

        return ok(movieDetail.render(movie));
    }
}
