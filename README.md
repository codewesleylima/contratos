<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## PROJETO PESSOAL - GERENCIAMENTO DE CONTRATOS 📋 📑:

#### Descrição:
Projeto voltado para a criação de uma API REST que cadastre contratos completos no banco de dados local, incluindo dados pessoais, profissionais e de endereço do titular, seguindo arquitetura em camadas com Spring Boot.

#### Funcionalidades:
1. 📝 Cadastro de contratos completos (dados pessoais, profissionais, endereço e contrato);

#### Tecnologias utilizadas:
- ☕ Java 25;
- 🍃 Spring Boot 3.2.0;
- 🐘 Gradle;
- 🗃️ JPA/Hibernate;
- 🐬 H2 Database;
- 🔒 Lombok;
- ✔️ Spring Validation;

#### Curl de exemplo:

1 - Cadastro de contrato completo:
```cmd
curl --request POST \
  --url http://localhost:8080/v1/contratos/cadastrar \
  --header 'Content-Type: application/json' \
  --header 'User-Agent: insomnia/10.3.1' \
  --data '{
  "dadosPessoais": {
    "nomeCompleto": "João Silva Santos",
    "cpf": "12345678900",
    "rg": "12345678",
    "dataNascimento": "1990-01-15",
    "estadoCivil": "Solteiro",
    "nacionalidade": "Brasileiro"
  },
  "dadosProfissionais": {
    "profissao": "Engenheiro",
    "cargo": "Analista de Sistemas",
    "funcao": "Desenvolvimento",
    "salario": "5000.00",
    "departamento": "TI"
  },
  "dadosEndereco": {
    "rua": "Rua das Flores",
    "numero": "123",
    "complemento": "Apto 45",
    "bairro": "Centro",
    "cidade": "São Paulo",
    "estado": "SP",
    "cep": "01234-567"
  },
  "valorMensal": 2500.00,
  "status": true
}'
```

## 🛺 Autor

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesley-lima-244405251/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQEVAsL2UL6A0w/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1721323972268?e=1746662400&v=beta&t=4_2RDPgz5FqJ2G-yRQk3y0vWMVRpSeAPKMAO7IOFXeE" width="100px;" alt="Foto do Wesley Lima"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
