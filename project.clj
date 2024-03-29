(defproject titanhtml "0.1.0"
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler titanhtml.web/app}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clojurewerkz/titanium "1.0.0-beta1"]
                 [potemkin "0.2.0"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]
                 ])
