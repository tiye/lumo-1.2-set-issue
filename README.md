
Minimal reproduce demo for https://github.com/anmonteiro/lumo/issues/98

```
=>> uname -a
Darwin chen 15.6.0 Darwin Kernel Version 15.6.0: Mon Aug 29 20:21:34 PDT 2016; root:xnu-3248.60.11~1/RELEASE_X86_64 x86_64

=>> /Users/chen/repo/gist/lumo/build/lumo -c src/ build.cljs
#error {:message "failed compiling file:out/cljs/core.cljs", :data {:file "out/cljs/core.cljs"}, :cause #error {:message "failed compiling file:/Users/chen/repo/gist/lumo-demos/set-bug/src/demo/main.cljs", :data {:file "/Users/chen/repo/gist/lumo-demos/set-bug/src/demo/main.cljs"}, :cause #error {:message "Could not analyze dep clojure.set", :data {:tag :cljs/analysis-error}, :cause #error {:message "Could not parse ns form demo.main", :data {:tag :cljs/analysis-error}, :cause #error {:message "Invalid :refer, var clojure.set/union does not exist", :data {:tag :cljs/analysis-error}}}}}}
```
