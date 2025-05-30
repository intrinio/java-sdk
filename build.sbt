lazy val root = (project in file(".")).
  settings(
    organization := "com.intrinio",
    name := "intrinio-sdk",
    version := "6.31.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.6.14",
      "com.squareup.okhttp" % "okhttp" % "2.7.5",
      "com.squareup.okhttp" % "logging-interceptor" % "2.7.5",
      "com.google.code.gson" % "gson" % "2.10",
      "com.evanlennick" % "retry4j" % "0.15.0",
      "org.threeten" % "threetenbp" % "1.6.8" % "compile",
      "io.gsonfire" % "gson-fire" % "1.9.0" % "compile",
      "junit" % "junit" % "4.13.2" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
