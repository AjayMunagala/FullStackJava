DECLARE
r emp%Rowtype;
v_empno emp.empno%type;

BEGIN
    v_empno := &empno;
    select * into r from emp where empno = v_empno;
    dbms_output.put_line(r.empno || ' ' || r.ename || ' ' || r.job || ' ' || r.sal || ' ' || r.comm || ' ' || r.deptno);
END;
/