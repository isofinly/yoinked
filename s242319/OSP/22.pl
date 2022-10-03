$var = abc123abc;
print $var;
$var =~ s/(?<=\d)[a-z]+/X/g;
print $var;
