package org.smoothcrawler.factory

import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalamock.scalatest.MockFactory
import org.smoothcrawler.component.data.{BaseDataHandler, BaseHttpResponseParser}
import org.smoothcrawler.component.http.BaseHttpRequest

class CrawlerFactoryTest extends AnyFlatSpec with BeforeAndAfterEach with MockFactory {

  private var underTest: CrawlerFactory = _

  override def beforeEach(): Unit = {
    underTest = new CrawlerFactory
  }

  "CrawlerFactory" should "have getter and setter of attribute *httpRequest*" in {
    assert(underTest.httpRequest == null)
    val mockHttpRequest = mock[BaseHttpRequest]
//    mockHttpRequest expects Symbol("request") withArgs ("http://127.0.0.1:8888/test")
    underTest.httpRequest = mockHttpRequest
    assert(underTest.httpRequest != null && underTest.httpRequest == mockHttpRequest)
  }

  "CrawlerFactory" should "have getter and setter of attribute *httpResponseParser*" in {
    assert(underTest.httpRequest == null)
    val mockHttpResponseParser = mock[BaseHttpResponseParser]
    underTest.httpResponseParser = mockHttpResponseParser
    assert(underTest.httpResponseParser != null && underTest.httpResponseParser == mockHttpResponseParser)
  }

  "CrawlerFactory" should "have getter and setter of attribute *dataHandler*" in {
    assert(underTest.dataHandler == null)
    val mockDataHandler = mock[BaseDataHandler]
    underTest.dataHandler = mockDataHandler
    assert(underTest.dataHandler != null && underTest.dataHandler == mockDataHandler)
  }

}
