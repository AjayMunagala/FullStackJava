
CREATE OR REPLACE PROCEDURE 
Addition(x number, y Number) 
AS
z NUMBER(5);
BEGIN
    z := x + y;
    dbms_output.put_line('Sum of '|| x ||'&'|| y ||' is '|| z);
END;
/