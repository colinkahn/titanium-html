(ns titanhtml.web
    (:use compojure.core)
    (:use hiccup.core)
    (:require [titanhtml.core :as t]))

(defn response [body]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body body})

(defroutes handler
  (GET "/" []
    (response (html [:span "Hello World"])))
)

(def app handler)
