package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.db.ebean.Model;

@Entity
public class Ranking extends Model {

    @Id
    public Long id;
    public Integer rank;
    public String title;
    public String thumbnail_url;
    public String distribution;
    public Integer del_flg;
    @CreatedTimestamp
    public Date create_date;
    @UpdatedTimestamp
    public Date update_date;

    public static Finder<Long, Ranking> finder =
            new Finder<Long, Ranking>(Long.class, Ranking.class);
    
    @Override
    public String toString() {
        return ("[id:" + id + ", title:" + title + "]");
    }
}
