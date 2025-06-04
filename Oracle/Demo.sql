DECLARE 
V_EMPNO EMP.EMPNO%TYPE;
V_SAL EMP.SAL%TYPE;
BEGIN
    v_empno := &empno;
    v_sal := &sal;
    UPDATE EMP SET SAL = SAL+v_sal where empno=v_empno;
    dbms_output.put_line('Salary updated');
    COMMIT;
END;
/