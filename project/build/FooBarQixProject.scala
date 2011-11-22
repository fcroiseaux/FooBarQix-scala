import sbt._ 

class FooBarQixProject(info: ProjectInfo) extends DefaultProject(info) { 
  val scalaToolsSnapshots = ScalaToolsSnapshots
  val scalatest = "org.scalatest" %% "scalatest" % "1.6.1" % "test"
}
