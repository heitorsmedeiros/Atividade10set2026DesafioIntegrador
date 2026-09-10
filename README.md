# Atividade10set2026DesafioIntegrador

## Sistema de Consulta de Benefícios

O programa em `Main.java` lê os seguintes dados (uma entrada por linha):

1. Nome do colaborador
2. Idade
3. Salário
4. Tempo de empresa (anos)
5. Quantidade de filhos
6. Modalidade de trabalho (`presencial` ou `home office`)
7. Utiliza veículo próprio (`sim` ou `não`)

Com base nesses dados, o sistema informa:

- Direito ao vale-alimentação
- Direito ao auxílio-creche
- Elegibilidade para plano de saúde
- Direito ao auxílio home office
- Direito ao auxílio combustível
- Participação na PLR
- Elegibilidade para bolsa de estudos

### Regras implementadas

- Vale-alimentação: salário até R$ 5.000,00
- Auxílio-creche: colaborador com 1 ou mais filhos
- Plano de saúde: 1 ano ou mais de empresa
- Auxílio home office: modalidade `home office`
- Auxílio combustível: modalidade `presencial` e uso de veículo próprio (`sim`)
- PLR: 1 ano ou mais de empresa
- Bolsa de estudos: 2 anos ou mais de empresa e idade até 35 anos

## Execução

```bash
javac Main.java
java Main
```
