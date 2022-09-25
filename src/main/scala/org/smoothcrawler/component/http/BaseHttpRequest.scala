package org.smoothcrawler.component.http

trait BaseHttpRequest {

  def request(url: String): Any

}
