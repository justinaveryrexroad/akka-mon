package org.akkamon.core.instruments

import akka.contrib.pattern.ReceivePipeline
import org.akkamon.core.ActorStack

trait LoggingTrait extends ActorStack {

  this: ReceivePipeline =>

  pipelineOuter(
    inner => {
      case x =>
        exporter.processMessage(s"Message received in ${actorName}")
        receive(x)
        exporter.processMessage(s"Message processed in ${actorName}")
    })
}