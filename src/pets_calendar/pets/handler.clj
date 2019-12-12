(ns pets-calendar.pets.handler
  (:require [pets-calendar.database.core :refer [db]])
  (:gen-class))

(defn index [] {:status 200 :body {:status "ok"}})