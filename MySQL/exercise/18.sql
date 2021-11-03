select e.sal from emp as e where e.ename = 'SMITH';

select 
	e.*
from
	emp as e
where
	e.sal > (select e.sal from emp as e where e.ename = 'SMITH')
;