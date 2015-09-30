name := "sillycat-stripe"

version := "1.0"

libraryDependencies ++= Seq(
  "com.stripe"       % "stripe-java" % "1.37.0",                     //MIT
  "org.slf4j"        % "slf4j-api" % "1.7.12",                       // MIT
  "com.typesafe"     % "config" % "1.3.0",                           // Apache v2
  "org.scalatest"    %% "scalatest" % "2.2.0" % "test",              // Apache v2
  "org.mockito"      % "mockito-all" % "1.9.5" % "test"              // MIT
)


