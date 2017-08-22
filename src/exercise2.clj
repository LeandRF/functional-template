(ns exercise2)

(defn only-greater-than-five 
 "Elementos superiores a 5" 
 
 [list] 
 
 (filter 
 
 (fn [x] (> x 5)) 
 
 list
 )
 )
