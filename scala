export JAVA_HOME="$(brew --prefix openjdk@21)/libexec/openjdk.jdk/Contents/Home"
export SBT_CREDENTIALS=$HOME/.ivy2/.credentials
export PATH="$(brew --prefix openjdk@21)/bin:$PATH"

source "$HOME/.sdkman/bin/sdkman-init.sh"
