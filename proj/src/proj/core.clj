(ns proj.core
  (:require [lib.core :as lib]))

(defn mk-data [a] (lib/serialize {:body a}))
