
(ns demo.main
  (:require [clojure.set :refer [union]]))

(.log js/console (union #{1} #{2}))
