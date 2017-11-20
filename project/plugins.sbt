logLevel := Level.Warn

resolvers += Resolver.sonatypeRepo("snapshots")

resolvers += Resolver.sonatypeRepo("releases")

// Used for signing in order to publish jars
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

// Used to ensure proper publish process is followed
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")
