(ns pets-calendar.routes
  (:require [compojure.core :refer [defroutes context GET]]
            [pets-calendar.pets.handler :as pets])
  (:gen-class))

(defroutes application-routes
  (context "/api" []
    (context "/pets" []
      (GET "/" [] (pets/index)))))