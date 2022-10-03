select distinct table_name
from (select table_name, column_name
      from information_schema.columns
      where table_schema = 's273720'
     ) as tncn
where fn_check_nulls(table_name, column_name);