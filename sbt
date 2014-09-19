#!/bin/bash

SBT_VERSION=0.13.6

SBT_BASE=~/.sbt
SBT_HOME=${SBT_BASE}/${SBT_VERSION}

SBT_URL=http://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt-launch/${SBT_VERSION}/sbt-launch.jar

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
case "`uname`" in
  CYGWIN* )
    cygwin=true
    ;;
  Darwin* )
    darwin=true
    ;;
  MINGW* )
    msys=true
    ;;
esac

# For Cygwin, ensure paths are in UNIX format before anything is touched.
if $cygwin ; then
    [ -n "$JAVA_HOME" ] && JAVA_HOME=`cygpath --unix "$JAVA_HOME"`
fi

if [ ! -d "${SBT_HOME}" ] || [ ! -a "${SBT_HOME}/sbt-launch.jar" ] ; then
    echo "Getting SBT..."
    if [ ! -d "${SBT_HOME}" ] ; then
        mkdir -p ${SBT_HOME}
    fi
    wget -qO ${SBT_HOME}/sbt-launch.jar ${SBT_URL}
fi

SBT_OPTS="-Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"
java $SBT_OPTS -jar ${SBT_HOME}/sbt-launch.jar "$@"

