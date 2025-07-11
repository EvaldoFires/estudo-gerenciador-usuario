CREATE TYPE tipo_especialidade AS ENUM (
     'CARDIOLOGIA',
     'DERMATOLOGIA',
     'PEDIATRIA',
     'CLINICO'
 );

 CREATE TYPE tipo_tipoHospital AS ENUM (
      'AMA',
      'UPA',
      'PS'
  );

CREATE TABLE IF NOT EXISTS Enfermeira (
    id SERIAL PRIMARY KEY,
    cep VARCHAR(10),
    estado VARCHAR(50),
    cidade VARCHAR(50),
    bairro VARCHAR(50),
    rua VARCHAR(100),
    numero VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Enfermeira (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    coren VARCHAR(50),
    especialidade tipo_especialidade
);

CREATE TABLE IF NOT EXISTS Medico (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    crm VARCHAR(50),
    especialidade tipo_especialidade
);

CREATE TABLE IF NOT EXISTS Hospital (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    coren VARCHAR(50),
    endereco_cep VARCHAR(10)
    endereco_estado VARCHAR(2),
    endereco_cidade VARCHAR(255),
    endereco_rua VARCHAR(255),
    endereco_bairro VARCHAR(255),
    endereco_numero VARCHAR(50),
    endereco_complemento VARCHAR(50),
    tipo tipo_tipoHospital
);

CREATE TABLE IF NOT EXISTS Paciente (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    data_nascimento DATE,
    endereco_cep VARCHAR(10)
    endereco_estado VARCHAR(2),
    endereco_cidade VARCHAR(255),
    endereco_rua VARCHAR(255),
    endereco_bairro VARCHAR(255),
    endereco_numero VARCHAR(50),
    endereco_complemento VARCHAR(50),
    dados_de_saude VARCHAR(255)
);