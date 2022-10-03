CREATE OR REPLACE FUNCTION s273720.fn_check_nulls(table_name name, column_name name)
    RETURNS bool
    LANGUAGE 'plpgsql'
    COST 100
AS
$BODY$
declare
    c             int;
    table_name_i  text := quote_ident(table_name);
    column_name_i text := quote_ident(column_name);
BEGIN
    execute 'select count(*) from ' || table_name_i || ' where ' || column_name_i || ' is null' into c;
    return c != 0;
END;

$BODY$;