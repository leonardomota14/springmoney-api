CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(30),
	numero VARCHAR(5),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(10),
	cidade VARCHAR(20),
	estado VARCHAR(2),
	ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Leonardo Mota', 'Av Aberto Craveiro', '1240', 'bl 5 ap 102', 'Dias Macedo', '60.861-212', 'Fortaleza', 'CE', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Maria Ester', 'Av Aberto Craveiro', '40', 'bl 5 ap 102', 'Dias Macedo', '60.861-212', 'Caucaia', 'CE', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Maria Cecília', 'Av Aberto Craveiro', '12', 'ap 102', 'Dias Macedo', '60.861-212', 'Maracanaú', 'CE', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Naiane Pereira', 'Rua C', '3694', null, 'Barroso 2', '60.860-280', 'Fortaleza', 'CE', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Danilo Mota', 'Av Alberto Magno', '222', 'apto 505', 'Parque 2 irmao', '60.861-212', 'Salvador', 'BA', true);
