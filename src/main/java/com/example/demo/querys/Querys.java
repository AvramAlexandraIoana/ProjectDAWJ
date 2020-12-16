package com.example.demo.querys;

public class Querys {
    public final static String GET_USERS_SQL = "SELECT * FROM USER";
    public final static String ADD_USER_SQL = "INSERT INTO USER(userId, firstName, lastName) VALUES(null, ?, ?)";
    public final static String DELETE_USER = "DELETE FROM USER WHERE userId = ?";
    public final static String COMANDA_USER = "SELECT c.numeComanda, c.pretComanda, p.firstName, p.lastName FROM mydb.comanda c join mydb.user p on c.userId = p.userId";
}
