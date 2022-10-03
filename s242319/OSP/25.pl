$var = abc123abc;
print $var;
$var =~ s/(\d+)/$1*2/e;
print $var;
