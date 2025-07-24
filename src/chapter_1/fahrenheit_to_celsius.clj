(defn get-celsius [f]
  (* (/ 5 9) (- f 32)))

(defn get-row [f]
  [f (get-celsius f)])

(println "  F |      C")
(println "--------------")
(doseq [[f c] (map get-row (range 0 301 10))]
  (println (format "%3d | %6.1f" f (float c))))
