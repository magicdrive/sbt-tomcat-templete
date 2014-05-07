
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.9.0" excludeAll(
            ExclusionRule(organization = "org.mortbay.jetty"),
            ExclusionRule(organization = "org.apache.tomcat.embed")
))
