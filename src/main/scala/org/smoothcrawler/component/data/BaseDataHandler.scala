package org.smoothcrawler.component.data

trait BaseDataHandler {

  def process(parsedResponse: Any): Any

}
