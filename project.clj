(defproject kwrooijen/duct-middleware-anti-forgery "0.1.0"
  :description "Duct middleware for anti-forgery"
  :url "https://github.com/kwrooijen/duct-middleware-anti-forgery"
  :license {:name "MIT"}
  :dependencies [[ring/ring-anti-forgery "1.3.0"]
                 [integrant "0.8.0"]]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :sign-releases false}]])
