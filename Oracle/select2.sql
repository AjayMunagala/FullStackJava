DECLARE
v_balance accounts.balance%type;
v_accno accounts.accno%type;

BEGIN
    v_accno := &accno;
    SELECT BALANCE INTO v_balance from accounts where  accno=v_accno;
    dbms_output.put_line('balance in account is '|| v_balance);


END;
/