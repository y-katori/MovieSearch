package models;

import javax.persistence.*;
import play.db.ebean.*;


@Entity
public class Movie extends Model {
	@Id
	public Long id;
	public String name;
	public String genre;
	public String actor;
	public String scene;
	public String img_url;
	public String description;
	
	public static Finder<Long, Movie> find = new Finder<Long, Movie>(Long.class, Movie.class);
	
}
