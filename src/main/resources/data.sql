INSERT INTO cliente(nome, email, senha, cpf, telefone, data_nascimento)
VALUES ('Irineu Júnior','iri.jr@gmail.com', '123', '789.674.789-98', '9 2658-5236', '1985-03-13');

INSERT INTO cliente(nome, email, senha, cpf, telefone, data_nascimento)
VALUES ('Daenerys Targaryen','maedragoes@com', '123', '123.654.789-98', '9 8745-4789', '1996-05-23');

INSERT INTO cliente(nome, email, senha, cpf, telefone, data_nascimento)
VALUES ('Carol Denvers','cap.marvel@gmail.com', '456', '987.654.789-98', '9 9854-1425', '1979-07-10');

INSERT INTO cliente(nome, email, senha, cpf, telefone, data_nascimento)
VALUES ('Steve Rogers','cap.america@gmail.com', '789', '967.257.146-23', '9 8945-3576', '1914-11-15');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Recife','256', 
'Encantadora cidade costeira no nordeste do Brasil, oferecendo praias deslumbrantes, rica herança colonial, cultura diversificada, música animada e uma cena gastronômica deliciosa.', 
'https://a.cdn-hotels.com/gdcs/production165/d295/de825d07-0f3f-41e6-b41b-031791c6d729.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Natal',
'328',  
'Natal é uma acolhedora cidade no nordeste do Brasil, conhecida por suas praias paradisíacas, dunas de areia, cultura folclórica, delícias culinárias típicas e festivais animados.', 
'https://visit.natal.br/assets/img/galeria3-min.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Curitiba',
'358',
'Curitiba, capital do Paraná, é uma cidade brasileira moderna e bem planejada. Conhecida por seus parques exuberantes, arquitetura inovadora, cultura rica, gastronomia diversificada e povo acolhedor.', 
'https://imgmd.net/images/v1/guia/1684234/curitiba-185-c.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Belo Horizonte',
'339',
'Belo Horizonte, capital de Minas Gerais, encanta com sua arquitetura moderna, cultura rica e culinária deliciosa, destacando-se pelos bares e botecos típicos da região. Cidade vibrante e acolhedora.', 
'https://viagemeturismo.abril.com.br/wp-content/uploads/2011/09/GettyImages-1164542668.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Belém',
'370',
'Belém, situada na Amazônia brasileira, é uma cidade repleta de exotismo e beleza natural. Conhecida por sua rica história, gastronomia amazônica, mercados coloridos e festivais culturais envolventes.', 
'https://visitbrasil.com/wp-content/uploads/2021/06/Belem-do-Para-1.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Fernando de Noronha',
'596',
'Noronha é um paraíso tropical no Brasil, famoso por suas praias de areias douradas, águas cristalinas, vida marinha exuberante e preservação ambiental. Destino perfeito para mergulho.', 
'https://www.dicasdeviagem.com/wp-content/uploads/2022/01/baia-dos-porcos-morro-noronha-scaled.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Jericoacoara',
'459',
'Jericoacoara é um paraíso escondido no nordeste do Brasil, com dunas imponentes, praias intocadas e lagoas de águas cristalinas. Um destino paradisíaco para os amantes de natureza, esportes aquáticos e tranquilidade.', 
'https://blogmaladeviagem.com.br/wp-content/uploads/2023/05/jericoacoara.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Alagoas',
'396',
'Alagoas é um estado encantador no nordeste do Brasil, conhecido por suas praias deslumbrantes de águas mornas e coqueirais, recifes de corais, gastronomia rica e cultura folclórica cativante. Um destino tropical imperdível.', 
'https://imagens.portalzuk.com.br/blog/625/63350ed3d3a1e.jpg');

INSERT INTO destino(nome, valor, descricao, imagem)
VALUES ('Imperatriz',
'422',
'Imperatriz é uma cidade acolhedora no estado do Maranhão, Brasil. Destaca-se por sua rica cultura, festivais animados, culinária típica, parques arborizados e proximidade com belezas naturais como rios e cachoeiras.', 
'https://blog.123milhas.com/wp-content/uploads/2023/01/onde-se-hospedar-em-imperatriz-hoteis-e-pousadas-conexao123-2.jpg');

INSERT INTO contato(nome, email, mensagem)
VALUES ('Juquinha de Assis',
'juca@com',  
'Gostaria de saber sobre minha viagem!'
);

INSERT INTO contato(nome, email, mensagem)
VALUES ('Théo José',
'josel@com',  
'Como eu posso comprar uma viagem para Fernando de Noronha?'
);

INSERT INTO reserva(cliente_id, data_hora, destino_id)
VALUES (1,
'2023-12-03 14:30:00',  
2
);

INSERT INTO reserva(cliente_id, data_hora, destino_id)
VALUES (2,
'2024-01-10 21:00:00',  
1
);

INSERT INTO reserva(cliente_id, data_hora, destino_id)
VALUES (3,
'2024-01-10 21:00:00',  
3
);
