
CREATE TABLE IF NOT EXISTS Enfermeiro (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    coren VARCHAR(50),
    especialidade VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Medico (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    crm VARCHAR(50),
    especialidade VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Hospital (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    cep VARCHAR(10),
    estado VARCHAR(2),
    cidade VARCHAR(255),
    bairro VARCHAR(255),
    rua VARCHAR(255),
    numero VARCHAR(50),
    complemento VARCHAR(50),
    tipo VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Paciente (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    nascimento DATE,
    cep VARCHAR(10),
    estado VARCHAR(2),
    cidade VARCHAR(255),
    bairro VARCHAR(255),
    rua VARCHAR(255),
    numero VARCHAR(50),
    complemento VARCHAR(50),
    dados_de_saude VARCHAR(255)
);