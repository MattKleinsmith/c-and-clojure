(println "  F |      C")
(println "--------------")
(doseq [f (range 0 301 10)]
  (println (format "%3d | %6.1f" f (* (/ 5.0 9.0) (- f 32)))))
