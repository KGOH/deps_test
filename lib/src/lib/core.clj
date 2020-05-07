(ns lib.core
  (:require [matcho.core :as matcho]
            [cheshire.core :as json]))

(defn serialize [a]
  {:post
   [(matcho/match
      {:data       a
       :serialized string?})]}
  {:data       a
   :serialized (json/generate-string a)})
