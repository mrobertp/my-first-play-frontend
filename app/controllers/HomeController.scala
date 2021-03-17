package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import uk.gov.hmrc.play.bootstrap.controller.FrontendController
import views.html.Index


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(mcc: MessagesControllerComponents, indexView: Index) extends FrontendController(mcc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index: Action[AnyContent] = Action { implicit request =>
    Ok(indexView())
  }
}
