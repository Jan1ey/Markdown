update
	emp as e
set 
	e.sal = e.sal * 1.1
where 
	timestampdiff(YEAR, e.hiredate, now()) > 30
;