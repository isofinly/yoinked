$var = '1.223';
$var =~ s/,/./;
print $var;
$var =~ s/((\d+)((\.?|\,?)(\d+)))/$1*2/e;
print $var;
