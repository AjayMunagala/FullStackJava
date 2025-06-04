DECLARE
v_empno emp.empno%type;
v_exp int;
v_hiredate emp.hiredate%type;
BEGIN
    v_empno := &empno;
    select hiredate into v_hiredate from emp where empno = v_empno;
    v_exp := trunc(((sysdate-v_hiredate)/365));
    dbms_output.put_line('Experience of a empno =' || v_empno || ' is '|| v_exp);
END;
/