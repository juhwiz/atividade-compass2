USE atividade2;

CREATE TABLE filmes (
	ID INT AUTO_INCREMENT,
    NOME VARCHAR(100),
    DESCRICAO VARCHAR(150),
    ANO DATE, 
    PRIMARY KEY(ID)
);

INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 1', 'Pedra Filosofal', '2001-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 2', 'Camara Secreta', '2002-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 3', 'Prisoneiro de Askaban', '2004-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 4', 'Calice de Fogo', '2005-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 5', 'Ordem da Fenix', '2007-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 6', 'Ordem da Fenix', '2009-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 7', 'Reliquias parte um', '2010-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Harry Potter 7 parte 2', 'Reliquias parte dois', '2011-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Jogos Vorazes 1', 'Hunger Games', '2012-01-01');
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Jogos Vorazes 2', 'Em Chamas', '2013-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Jogos Vorazes 3', 'A Esperança', '2014-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Jogos Vorazes 3 parte 2', 'A Esperança parte dois', '2015-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Divergente', 'O filme', '2014-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Insurgente', 'Da serie Divergente', '2015-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Convergente', 'Da serie Divergente', '2016-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Star Wars: Epsodio 1', 'A Ameaça Fantasma', '1999-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Star Wars: Epsodio 2', 'Ataque dos Clones', '2002-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Star Wars: Epsodio 3', 'A vingança dos Sith', '2005-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Star Wars: ', 'O Despertar da Força', '2015-01-01' );
INSERT INTO filmes (NOME, DESCRICAO, ANO) VALUES ('Star Wars: ', 'Os Ultimos Jedi', '2017-01-01' );

SELECT ID, NOME, DESCRICAO, YEAR(ANO) FROM FILMES;

