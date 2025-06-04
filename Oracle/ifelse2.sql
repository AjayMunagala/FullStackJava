--Program to increase salary of given empno with given amount. 
--After increment if sal is more than 10000 then cancel it:

DECLARE
v_sal emp.sal%type;
v_amount number(7);
v_empno emp.empno%type;
BEGIN
    
    v_empno := &empno;
    V_amount := &amount;
    select sal into v_sal from emp where empno = v_empno;
    
    
    IF (v_sal+v_amount) > 10000 then 
    rollback;
    dbms_output.put_line('salary > 10000');
    else 
    UPDATE emp set sal=sal+v_amount WHERE empno = v_empno;
    commit;
    dbms_output.put_line('salary updated');
    end if;

END;
/