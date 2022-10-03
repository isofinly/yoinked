#!/bin/bash

if [ -d "$1" ]; then
	lsof +d $1 | awk '$4~"[wWuU]$" {print $9}' > 1
	ls -al | grep '^p' | awk '{print $9}' > 2 
	join 1 2 | uniq -u
	rm 1 2 	
else
  >&2 echo "Enter directory name"
  exit 1
fi