(ns migratory-birds.core
  (:gen-class))

(defn get-max [input]
  (reduce max input))

(defn get-most-frequent-count [hm]
  (get-max (vals hm))
  )

(defn has-highest-frequency [highest-frequency [k v]]
  (= highest-frequency v))

(defn migrate-birds [input]
  (def hm (frequencies input))
  (def highest-frequency (get-most-frequent-count hm))
  (def filter-for-highest-frequency (filter (partial has-highest-frequency highest-frequency) hm))
  (first (min (keys filter-for-highest-frequency))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def input (read-string (str (slurp "src/migratory_birds/input04.txt"))))
  (println (migrate-birds input))
  )


; output 4

