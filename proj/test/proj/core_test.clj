(ns proj.core-test
  (:require [clojure.test :as t]
            [proj.core :as sut]
            [matcho.core :as matcho]))

(t/deftest core-test
  (t/testing "mk-data"
    (matcho/match
      (sut/mk-data {:a :b}) ; Will fail. Should show full data in actual field
      {:data       {:body {:a :c}}
       :serialized string?})))
