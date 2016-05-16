DROP TABLE IF EXISTS bank;
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS transaction;

DELETE FROM bank;
DELETE FROM customer;
DELETE FROM account;
DELETE FROM transaction;

CREATE TABLE bank(
	 bank_id   VARCHAR(20),
	 bank_name VARCHAR(20) NOT NULL,
	 PRIMARY KEY(bank_id)
);

CREATE TABLE customer(
	  customer_id    VARCHAR(20) PRIMARY KEY,
	  bank_id        VARCHAR(20) NOT NULL,
	  first_name     VARCHAR(20) NOT NULL,
  	  last_name      VARCHAR(20) NOT NULL,
	  FOREIGN KEY (bank_id) REFERENCES bank(bank_id) ON DELETE CASCADE
);

CREATE TABLE account(
	  account_id      	 VARCHAR(20) PRIMARY KEY,
	  customer_id     	 VARCHAR(20) NOT NULL,
	  account_type   	 VARCHAR(20) NOT NULL,
	  balance        	 DOUBLE NOT NULL DEFAULT 0.0,
	  interest_rate    	 DOUBLE NOT NULL DEFAULT 0.0,
	  overdraft_amount 	 DOUBLE NOT NULL DEFAULT 0.0,
	  overdraft_protect	 DOUBLE NOT NULL DEFAULT 0.0,
	  FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE
);

CREATE TABLE transaction(
	  transaction_id     INT AUTO_INCREMENT PRIMARY KEY,
	  bank_id            VARCHAR(20),
	  customer_id        VARCHAR(20),
	  account_id         VARCHAR(20),
	  transaction_type   VARCHAR(20),
	  transaction_date   DATETIME,
	  transaction_amount DOUBLE,
	  FOREIGN KEY (bank_id) REFERENCES bank(bank_id) ON DELETE CASCADE,
	  FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE,
	  FOREIGN KEY (account_id) REFERENCES account(account_id) ON DELETE CASCADE
);