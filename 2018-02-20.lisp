
;;the program works by dividing the decimal number by 62, it stores the mod of that in a list called list-of-digits-for-solution
;;if the quotient is not zero then the program stores the mod and passes the quotient along with the list to be divided again
;;if the quotient is zero then the program is done and it prints the list
    ;the list has to be reversed before the whole number is returned because it stores the digits in reversed order

(defparameter *base62* (string "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"))


(defun convert-to-base62 ( input  list-of-digits-for-solution)
  (let ((quotient  (multiple-value-bind (q r) (floor input 62) q)); multiple value bind gets first part, the floor of the quotient ex (floor 5 2) => 2.5 => 2
	(remainder (mod input 62)))                               ; mod always returns integers

    (cond ((= quotient 0)               ;if the quotient is zero then the program is done. 
	     (reverse (cons (subseq *base62* remainder (1+ remainder)) list-of-digits-for-solution)))
					; subseq gets the value of the digit in base62, it then adds the value to
					; the list, the list keeps track of the digits of the whole number in base 62
	  
	   (t           (convert-to-base62 quotient  (cons (subseq *base62* remainder (1+ remainder)) list-of-digits-for-solution))))))
	                                          
	    
