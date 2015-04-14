(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(average [ 1 2 10])
