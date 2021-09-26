package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB db = new OracleFactory().getDatabase();
		//DB db = new PostgresFactory().getDatabase();

		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");

	}
}
