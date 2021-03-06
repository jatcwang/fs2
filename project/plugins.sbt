val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.1.1")

addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.9.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.5")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.7.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.4")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.3")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
addSbtPlugin("com.47deg" % "sbt-microsites" % "1.2.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.19")
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.8.0")
