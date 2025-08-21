Sistema de Gerenciamento de Produtos 🛒
Este é um sistema simples em Java para gerenciamento de produtos, com funcionalidades de cadastro, validação de dados e tratamento de exceções.

✨ Funcionalidades
✅ Cadastro de novos produtos
🚫 Validação contra códigos duplicados
📦 Controle da quantidade em estoque
🗂️ Verificação de categoria válida
⚠️ Tratamento de exceções personalizadas
🧾 Exceções personalizadas
O sistema utiliza exceções customizadas para garantir integridade e consistência nos dados:

CodigoDuplicadoException: lançado quando um produto com o mesmo código já existe.
QntdEstoqueInvalidaException: lançado quando a quantidade em estoque é inválida (por exemplo, negativa).
CategoriaInvalidaException: lançado quando a categoria informada não é reconhecida.
🛠️ Tecnologias utilizadas
Java 11 ou superior
Scanner (entrada via terminal)
Programação orientada a objetos
📦 Estrutura do Projeto
src/ ├── exceptions/ │ ├── CodigoDuplicadoException.java │ ├── QntdEstoqueInvalidaException.java │ └── CategoriaInvalidaException.java ├── model/ │ └── Produto.java ├── sistema/ │ └── SistemaProdutos.java └── Main.java

🚀 Como executar
Clone o repositório:
git clone (https://github.com/gabriel-freitas96/Atividade1-fase.git)
✅ Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir Issues ou enviar Pull Requests.

📄 Licença

Este projeto está licenciado sob a MIT License
.

Desenvolvido com 💻 por
-Gabriel Lacerda
-Samires Carmo
