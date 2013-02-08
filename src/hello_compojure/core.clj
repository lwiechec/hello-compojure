(ns hello-compojure.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(load "hello")

(defroutes main-routes
  (GET "/" [] (page-hello-compojure))

  (route/resources "/")
  (route/not-found "Page not found"))

(def app (handler/site main-routes))
