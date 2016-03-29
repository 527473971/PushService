package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready too."))
  }

  def login = Action {
    Ok(views.html.login("login info "))
  }


}