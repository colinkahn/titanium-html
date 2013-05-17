(ns titanhtml.core
  [:require 
          [clojurewerkz.titanium.graph :as tg]
          [clojurewerkz.titanium.edges :as te]
          [clojurewerkz.titanium.vertices :as tv]
          [clojurewerkz.titanium.types :as tt]
          [clojurewerkz.titanium.query :as tq]
          [potemkin :as po]
          [ogre.tinkergraph :as g]
          [ogre.core :as q]])

(po/import-macro tg/transact!)
(po/import-fn tv/find-by-id)
(po/import-fn tv/find-by-kv)
(po/import-fn tv/create!)

(defn to-maps [v]
    (doall (map tv/to-map v)))

(defn maps-with-ids! [p]
  (-> p q/into-vec! to-maps))

(def graph-config
  {"storage.backend" "cassandra"
   "storage.hostname" "localhost"})

(tg/open graph-config)
