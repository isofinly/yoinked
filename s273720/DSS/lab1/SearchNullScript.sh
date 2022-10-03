psql -h pg -d studs -c "
select distinct table_name
from (select table_name, column_name
      from information_schema.columns
      where table_schema = '$1'
     ) as tncn
where fn_check_nulls(table_name, column_name); "