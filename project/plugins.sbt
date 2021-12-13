addSbtPlugin("com.dwijnand"      % "sbt-travisci"    % "1.2.0")
addSbtPlugin("com.lucidchart"    % "sbt-scalafmt"    % "1.16")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"         % "1.0.2")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.6.0")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.0")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.32" // Needed by sbt-git
