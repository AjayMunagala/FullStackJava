---Program to increase salary of given empno based on job as following:
--If job is MANAGER then increase 20% on sal
 --CLERK 15%
 --OTHERS 10%
DECLARE
v_job emp.job%type;
v_empno emp.empno%type;
v_per int;

BEGIN
    v_empno := &empno;
    SELECT job INTO v_job from emp where empno = v_empno;
    IF v_job = 'MANAGER' THEN
    v_per := 20;
    ELSIF v_job = 'CLERK' THEN
    v_per := 15;
    ELSIF v_job = 'SALESMAN' THEN
    v_per := 10;
    ELSE
    v_per := 5;
    END IF;
    UPDATE EMP SET SAL = sal+v_per/100 WHERE empno = v_empno;
       dbms_output.put_line('salary increased for'|| v_empno|| ' employee is ='|| v_per|| '%');
       dbms_output.put_line('job of employee is = '||v_job);
END;
/


 