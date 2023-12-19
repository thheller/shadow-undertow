(defproject thheller/shadow-undertow "0.3.4"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :license
  {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
   :url "https://www.eclipse.org/legal/epl-2.0/"}

  :repositories
  {"clojars" {:url "https://clojars.org/repo"
              :sign-releases false}}

  :dependencies
  [[org.clojure/clojure "1.11.1" :scope "provided"]
   [org.clojure/core.async "1.5.648"]
   [io.undertow/undertow-core "2.3.10.Final"]]

  :source-paths
  ["src/main"]

  :java-source-paths
  ["src/main"]

  :javac-options
  ["-target" "1.8"
   "-source" "1.8"]

  :test-paths
  ["src/test"])
