source "$(brew --prefix chruby)/share/chruby/chruby.sh"

# Set the ruby version to the latest installed
chruby ruby

source "$(brew --prefix chruby)/share/chruby/auto.sh"