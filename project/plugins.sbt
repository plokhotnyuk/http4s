resolvers += Resolver.sonatypeRepo("snapshots")
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

// https://github.com/coursier/coursier/issues/450
classpathTypes += "maven-plugin"

addSbtPlugin("com.earldouglas"            %  "xsbt-web-plugin"           % "4.1.0")
addSbtPlugin("com.eed3si9n"               %  "sbt-buildinfo"             % "0.9.0")
addSbtPlugin("com.eed3si9n"               %  "sbt-unidoc"                % "0.4.3")
addSbtPlugin("com.geirsson"               %  "sbt-ci-release"            % "1.5.2")
addSbtPlugin("com.github.tkawachi"        %  "sbt-doctest"               % "0.9.6")
addSbtPlugin("org.http4s"                 %  "sbt-http4s-org"            % "0.0.0+11-f4c55ad9-SNAPSHOT")
addSbtPlugin("com.timushev.sbt"           %  "sbt-updates"               % "0.5.0")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-ghpages"               % "0.6.3")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-site"                  % "1.4.0")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-twirl"                 % "1.5.0")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-native-packager"       % "1.6.1")
addSbtPlugin("io.get-coursier"            %  "sbt-coursier"              % "1.0.3")
addSbtPlugin("io.github.davidgregory084"  %  "sbt-tpolecat"              % "0.1.10")
addSbtPlugin("io.spray"                   %  "sbt-revolver"              % "0.9.1")
addSbtPlugin("org.scalastyle"             %% "scalastyle-sbt-plugin"     % "1.0.0")
addSbtPlugin("org.tpolecat"               %  "tut-plugin"                % "0.6.13")
addSbtPlugin("pl.project13.scala"         %  "sbt-jmh"                   % "0.3.7")
