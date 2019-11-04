DROP TABLE tbMatricula;
DROP TABLE tbTurma;
DROP TABLE tbInstrutor;
DROP TABLE tbAluno;
DROP TABLE tbAVista;
DROP TABLE tbCurso;
DROP TABLE tbAPrazo;

create table tbCurso(
sigla_curso varchar(2) not null,
nome_curso varchar2(40) not null,
carga_horaria int not null,
valor_curso number(10,2) not null,
prog_curso varchar2(50),
data_vig_curso date,
valor_hora_inst number(8,2),
constraint pk_sigla_curso primary key (sigla_curso)
);

create table tbTurma(
sigla_turma varchar(2) not null,
sigla_curso varchar(2) not null,
nome_t varchar2(50) not null,
qnt_vagas int,
dt_inicio date,
periodo varchar2(50),
dt_term date,
constraint pk_sigla_turma primary key (sigla_turma),
constraint fk_sigla_curso foreign key (sigla_curso) references tbCurso(sigla_curso)
);

create table tbInstrutor(
cpf number(11,0) not null,
nome_inst varchar(100) not null,
dt_nasc date not null,
sexo varchar(8) not null,
civil varchar(40),
endereco varchar2(255) not null,
num varchar2(4) not null,
cep varchar2(8),
bairro varchar2(255),
tel_res varchar2(10),
tel_cel varchar(11),
cidade varchar(50),
uf varchar(2),
rg varchar2(13) not null,
area_atuacao varchar2(30),
formacao varchar2(30),
email varchar2(100) not null,
constraint pk_cpf primary key (cpf)
);

create table tbAluno(
cpf number(11,0) not null,
nome_inst varchar(100) not null,
dt_nasc date not null,
sexo varchar(8) not null,
civil varchar(30),
escolaridade varchar(40),
endereco varchar2(255) not null,
num varchar2(4),
cep varchar2(8),
cidade varchar(50),
uf varchar(2),
bairro varchar2(255),
tel_res varchar2(10),
tel_cel varchar(11),
rg varchar2(13) not null,
email varchar2(100) not null,
constraint pk_cpfaluno primary key (cpf)
);

CREATE SEQUENCE seq_avista START WITH 1;

create table tbAVista(
  id  NUMBER(10)  not null,
  valor number(10,2) not null,
  agencia int,
  nCheque int,
  preData varchar(10),
  primary key(id)
);


CREATE SEQUENCE seq_aprazo START WITH 1;

CREATE TABLE tbAPrazo(
  id  NUMBER(10)  not null,
  valor number(10,2) not null,
  taxa_juros number(10,2),
  qtdeMensalidade int,
  dtVencimento varchar2(10),
  primary key(id)
  );

create table tbMatricula(
  data varchar2(10),
  qtdeFaltas int,
  nota number(8,2),
  sigla_turma varchar(2) not null ,
  cpf_aluno number(11) not null ,
  avista_id NUMBER(10) ,
  aprazo_id NUMBER(10) ,
  primary key (sigla_turma, cpf_aluno),
  foreign key (sigla_turma) references tbTurma(sigla_turma),
  foreign key (cpf_aluno) references tbAluno(cpf),
  foreign key (avista_id) references tbAVista(id),
  foreign key (aprazo_id)  references tbAPrazo(id)
);

alter table tbTurma add cpf_inst number(11, 0);
alter table tbTurma add constraint fk_inst foreign key (cpf_inst) references tbInstrutor(cpf);