Declare
x NUMBER;
y NUMBER;
z NUMBER;
Begin
x := &x;
y := &y;
z := x + y;
dbms_output.put_line('The sum of x and y is: ' || z);                                                   
End;
/
