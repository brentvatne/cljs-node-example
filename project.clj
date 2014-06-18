(defproject cljs-node-example "0.1.0-SNAPSHOT"
  :description "A sample command line tool in Node via ClojureScript"
  :url "https://github.com/brentvatne/cljs-node-example"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "cljs-node-example"
              :source-paths ["src"]
              :compiler {
                :output-to "bin/example"
                :output-dir "out"
                :optimizations :advanced
                :target :nodejs}}]})
