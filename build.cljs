
(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'demo.main
   :output-to "main.js"
   :optimizations :advanced
   :target :nodejs})
