print("Bank transaction")

import mysql.connector
con = mysql.connector.connect(host='localhost', password='123456789', user='root')

if con.is_connected():
    print("connection created..")
   
mycursor=mydb.cursor()
mycursor.execute("create a database if not exists")
mycursor.execute("use bank")
mycursor.execute("create a table if not exist bank_master( acno varchar(30),city char(255),city char(255),mobileno char(255),balance int)")
mycursor.execute("create table if not exists banktrans(acno varchar(255),amount)")
name=input("enter the name(limit 35 character)")
city=input("enter ")
con.commit();