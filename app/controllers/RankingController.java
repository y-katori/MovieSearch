package controllers;

import java.util.List;

import models.Ranking;
import play.mvc.Controller;
import play.mvc.Result;

public class RankingController extends Controller {

    public static Result index() {
        List<Ranking> ranking = Ranking.finder.all();

        return ok(views.html.ranking.render("映画ランキング", ranking));
    }
}
