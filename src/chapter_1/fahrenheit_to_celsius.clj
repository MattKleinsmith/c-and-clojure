(ns chapter-1.fahrenheit-to-celsius
  (:require [clojure.java.io :as io]))

(defn get-celsius [f]
  (* (/ 5 9) (- f 32)))

(defn get-row [f]
  [f (get-celsius f)])

(with-open [w (io/writer "fahrenheit-to-celsius.txt")]
  (.write w "  F |      C\n")
  (.write w "--------------\n")
  (doseq [[f c] (map get-row (range 0 301 10))]
    (.write w (format "%3d | %6.1f\n" (int f) (float c)))))
