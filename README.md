# Sbt Tools Jar Plugin

Looks up and adds the JDK `tools.jar` to your sbt's unmanaged jars, enabling
access to the Java Debugger Interface (JDI).

## Installation

Add the following to `project/plugins.sbt`:

```scala
addSbtPlugin("org.scala-debugger" % "sbt-jdi-tools" % "1.0.0")
```

