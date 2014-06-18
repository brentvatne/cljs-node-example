(ns cljs-node-example.core
  (:require [cljs.nodejs :as nodejs]))

(defn -main [& args]
  (println "Hello world!"))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)
