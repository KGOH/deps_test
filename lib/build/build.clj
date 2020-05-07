(ns build
  (:require [cambada.uberjar :as uberjar]))

(defn -main [& [version]]
  (assert version "Pleas provide version")
  (println "Build version:" version)
  (uberjar/-main
   "-a" "all"
   "-p" "resources:../ui/build"
   "--app-group-id" "kgoh"
   "--app-artifact-id" "lib"
   "--app-version" version
   "-m" "clojure.main"
   "--no-copy-source"))

(comment
  (-main)
  nil)

