(defproject hello-compojure "0.1.0-SNAPSHOT"
  :description "simple example for using compojure, from the book"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler hello-compojure.core/app}
)
