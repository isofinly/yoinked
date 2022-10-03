$var = abc123abc;
print $var;
$var =~ s/(.)\d.*\1/d/;
print $var;
