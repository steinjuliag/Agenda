create table usuario (
	id_usuario INT(11) AUTO_INCREMENT,
	nome varchar(50) not null,
	senha varchar(50) not null,
	primary key (id_usuario)
);

create table profissional (
   	 id_profissional INT(11) AUTO_INCREMENT,
	nome varchar(60) not null,
	funcao varchar(40)not null,
	primary key (id_profissional)
);

create table servico (
	id_servico INT(11)AUTO_INCREMENT,
	id_profissional int not null,
	nome varchar(40) not null,
	descricao varchar(40) not null,
	valor decimal(9,3) not null,
	tempo_servico_minutos int not null,
	primary key (id_servico),
	FOREIGN KEY( id_profissional) REFERENCES profissional (id_profissional)
);

create table agenda (
        id_agenda INT(11) AUTO_INCREMENT,
	data_inicial date not null,
	data_Final timestamp not null,
	id_usuario bigint not null,
	primary key (id_agenda)
);

create table
	agenda_servico (
	id_agenda INT(11) AUTO_INCREMENT,
	id_servico INT(11) not null,
	foreign key (id_servico) references servico (id_servico),
	foreign key (id_agenda) references agenda (id_agenda)
	);