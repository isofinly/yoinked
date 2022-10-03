#!/usr/bin/env python

import random
import psycopg2

database = raw_input("Enter name of data base:")
hostName = raw_input("Enter name of host:")
portNum = raw_input("Enter port:")
userName = raw_input("Enter user name:")
pssword = raw_input("Enter password:")

conn = psycopg2.connect(dbname=database, user=userName, password=pssword, host=hostName, port=portNum)
cur = conn.cursor()

tableName = raw_input("Enter table name: ")
countOfAttrib = int( raw_input("Enter number of attributes:") )

attribNames = []
attribValues=[]
numOfCombinations = 1

for i in range(countOfAttrib):
	attribName = raw_input("Enter attrib name: ")
	mode = raw_input("Enter how to add attribute {} (f-file, c - comline, r -random):".format(attribName))
	
	lines =[]

	if mode == "f":
		fileName = raw_input("Enter file name:")
		f = open(fileName)
		lines = f.readlines()
	elif mode == "c":
		count = int(raw_input("Enter count of strings for attribute:"))
		
		for j in range(count):
			string = raw_input("Enter a string #{}:".format(j))
			lines.append(string)
	elif mode =="r":
		minimum = (int(raw_input("Enter minimum:"))) 
		maximum = (int(raw_input("Enter maximum:"))) 
		count = int(raw_input("Enter count of strings for attribute:"))
		
		for j in range(count):
			lines.append(str(random.randint(minimum, maximum)))

	numOfCombinations *= len(lines)

	attribValues.append(lines)
	attribNames.append(attribName)

sqlStr = "INSERT INTO {} (".format(tableName)

sqlStr = sqlStr + attribNames[0]

for i in range( 1, len(attribNames)):
	sqlStr = sqlStr +","+attribNames[i]

sqlStr = sqlStr +") VALUES ("

indexesOfAttribVals = []
lensOfAttribValues = []

for values in attribValues:
	indexesOfAttribVals.append(0)
	lensOfAttribValues.append(len(values))

index = countOfAttrib-1
mainIndex = index

def decardMultiply(firstArr, secondArr):
	result = []
	for first in firstArr:
		for second in secondArr:
			result.append(first+","+second)
	return result

records = attribValues[0]

for i in range(1, countOfAttrib):
	records = decardMultiply(records, attribValues[i])

for r in records:
	r = sqlStr + r + ");"
	cur.execute(r)
	conn.commit()
print("Done!")

