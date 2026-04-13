<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## PROJETO PESSOAL - GERENCIAMENTO DE CONTRATOS 📋 📑:

#### Descrição:
Projeto voltado para a criação de uma API REST que cadastre contratos no banco de dados local, seguindo arquitetura em camadas com Spring Boot.

#### Funcionalidades:
1. 📝 Cadastro de contratos;
2. 📋 Listagem de contratos;
3. 🔍 Busca de contratos por status;
4. 🔎 Busca de contrato por nome do titular;

#### Tecnologias utilizadas:
- ☕ Java 25;
- 🍃 Spring Boot 3.2.0;
- 🐘 Gradle;
- 🗃️ JPA/Hibernate;
- 🐬 H2 Database;
- 🔒 Lombok;
- ✔️ Spring Validation;

#### Curl de exemplo:

1 - Cadastro de contrato:
```cmd
curl --request POST \
  --url http://localhost:8080/v1/contratos/cadastrar \
  --header 'Content-Type: application/json' \
  --header 'User-Agent: insomnia/10.3.1' \
  --data '{
  "cpf": "12345678900",
  "nomeTitular": "João Silva",
  "valorMensal": 2500.00,
  "Status": true
}'
```

2 - Listagem de contratos:
```cmd
curl --request GET \
  --url http://localhost:8080/v1/contratos/listar-todos \
  --header 'User-Agent: insomnia/10.3.1'
```

3 - Busca de contratos por status:
```cmd
curl --request GET \
  --url http://localhost:8080/v1/contratos/listar-status/true \
  --header 'User-Agent: insomnia/10.3.1'
```

4 - Busca de contrato por nome:
```cmd
curl --request GET \
  --url http://localhost:8080/v1/contratos/buscar-nome/João \
  --header 'User-Agent: insomnia/10.3.1'
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
