--Program to delete emp record of given empno.
--If experience is more than 43years then only delete the record:
DECLARE
v_empno emp.empno%type;
v_hiredate emp.hiredate%type;
v_exp INT;
BEGIN
    v_empno := &empno;
    SELECT hiredate INTO v_hiredate from emp where empno = v_empno;
    v_exp := ((sysdate-v_hiredate)/365);
    if v_exp>40 THEN
    delete from emp where empno = v_empno;
    dbms_output.put_line('experience is ' || v_exp);
    dbms_output.put_line('record deleted Successfully');
    end if;
    dbms_output.put_line('check above line');
END;
    /