package org.smoothcrawler.factory

import org.smoothcrawler.component.data.{BaseDataHandler, BaseHttpResponseParser}
import org.smoothcrawler.component.http.BaseHttpRequest

import scala.beans.BeanProperty

class CrawlerFactory (
    @BeanProperty var httpRequest: BaseHttpRequest = null,
    @BeanProperty var httpResponseParser: BaseHttpResponseParser = null,
    @BeanProperty var dataHandler: BaseDataHandler = null) {
}
