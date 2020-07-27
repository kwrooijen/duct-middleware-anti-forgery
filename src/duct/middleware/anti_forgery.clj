(ns duct.middleware.anti-forgery
  (:require
   [integrant.core :as ig]
   [ring.middleware.anti-forgery :refer [wrap-anti-forgery]]))

(defmethod ig/init-key :duct.middleware/anti-forgery [_ opts]
  (fn [handler]
    (wrap-anti-forgery handler opts)))
