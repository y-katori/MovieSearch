package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.SearchResult;

import models.Movie;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class SearchMovies extends Controller {
	
	public static class SearchForm {
		public String genre = "";
		public String actor = "";
		public String scene = "";
	}

    public static Result index() {
    	SearchForm searchForm = new SearchForm();
    	Form<SearchForm> form = new Form(SearchForm.class).fill(searchForm); 
    	
        return ok(searchMovies.render("Search",form));
    }
    
    public static Result search() {
    	Form<SearchForm> form = new Form(SearchForm.class).bindFromRequest();
    	if(form.hasErrors()) {
    		return badRequest(searchMovies.render("ERROR", form));
    	} else {
    		SearchForm searchForm = form.get();
    		List<Movie> movieList = Movie.find.where()
    				.ilike("genre", "%" +searchForm.genre + "%")
    				.ilike("actor", "%" +searchForm.actor + "%")
    				.ilike("scene", "%" +searchForm.scene + "%")
    				.findList();
    		return  ok(searchResult.render("Search Result",movieList));
    	}
    }

}
