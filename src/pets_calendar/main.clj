(ns pets-calendar.main
  (:require
            [pets-calendar.routes :refer [application-routes]]
            [ring.middleware.json :refer [wrap-json-body wrap-json-response]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [org.httpkit.server :refer [run-server]]))

(def app (-> application-routes
          (wrap-json-body)
          (wrap-json-response)
          (wrap-defaults site-defaults)))


(defn -main []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (run-server app {:port port})
    (println (str "Listening on port: " port))))