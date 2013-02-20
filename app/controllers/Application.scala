package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("COMING SOON!", "App is being DEVELOPED", "We apologize for the inconvenience, but this part of our site is still being developed. Please try back later!"))
  }
  
}