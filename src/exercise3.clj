(ns exercise3)

(defn fibonacci [val]
"Serie Fibonacci"

(if (< val 2) val 

(+ (fibonacci(- val 1)) (fibonacci(- val 2))))

)
