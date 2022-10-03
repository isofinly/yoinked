#!/bin/sh

# output users which baned from access system 
# in unix same system for restrict users from accessing use usermod -e or change -E0 comand they can't get a shell prompt to run commands 
# in file /etc/passwd (or same /etc/nsswitch.conf whith all all users - 'getent passwd' comand ) in last point of 
# steucture we have User’s Login shell (we need /sbin/nologin or /bin/false)

getent passwd | egrep '(/sbin/nologin|/bin/false)' | awk -F: '{ print $1}' |  awk -F$ '{ print $1}' | sort 