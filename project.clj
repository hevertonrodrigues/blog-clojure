(defproject blog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [org.clojure/java.jdbc "0.3.0-alpha5"] ;; Clojure/Java database
                 [mysql/mysql-connector-java "5.1.25"] ;;MySQL connector
                 [de.ubercode.clostache/clostache "1.3.1"] ;;Mustache dependence
                 [ring-basic-authentication "1.0.2"]] ;;basic auth
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler blog.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
