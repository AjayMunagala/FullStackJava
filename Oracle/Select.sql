DECLARE
v_ename emp.ename%type;
V_sal emp.sal%type;
v_empno emp.empno%type;


BEGIN
    v_empno := &empno;
    SELECT ename,sal into v_ename, v_sal from EMP where empno = v_empno;
    dbms_output.put_line(v_ename || '    '||v_sal);

END;
/