package org.smoothcrawler.component.data

trait BaseHttpResponseParser {

  def parseContent(response: Any): Any

}
