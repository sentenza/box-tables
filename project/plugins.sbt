// ensures dependencies are fetched via coursier rather than by sbt itself, that relies on its own custom version of Ivy
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.1")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.1")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.0.0")

// A flexible Scala code linting tool
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.16")

// TODO: Scalastyle is an abandoned project!
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// Formatting scala code automatically
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")

// Support releasing Scala projects to Bintray
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

// ScalaJS
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.7.1")

// Cross-platform compilation support for sbt
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.1.0")