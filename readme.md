1. Classe Filme:

Atributos:

    Título do filme
    Gênero
    Classificação indicativa
    Duração
    Elenco de atores

Métodos:

    Obter informações do filme (retorna detalhes como título, gênero, classificação, etc.)

2. Classe Sessão:

Atributos:

    Filme (referência ao filme exibido)
    Data e horário de início
    Duração da sessão
    Assentos disponíveis (matriz representando a ocupação dos assentos)

Métodos:

    Verificar disponibilidade de assentos
    Reservar assentos temporariamente
    Obter detalhes da sessão (retorna informações como filme, horário, assentos disponíveis, etc.)

3. Classe Cliente:

Atributos:

    Nome
    Endereço de e-mail
    Número de telefone

Métodos:

    Efetuar pagamento (pode ser parte de um processo maior de compra)
    Visualizar histórico de compras

4. Classe Assento:

Atributos:

    Número do assento
    Status (disponível, ocupado, reservado)

Métodos:

    Marcar assento como ocupado
    Marcar assento como reservado
    Liberar assento

5. Classe Ingresso:

Atributos:

    Sessão (referência à sessão associada)
    Assentos selecionados
    Preço total

Métodos:

    Calcular preço do ingresso com base em critérios específicos
    Emitir ingresso (gerar informações detalhadas sobre a compra)

6. Classe Sistema:

Atributos:

    Lista de filmes em exibição
    Lista de sessões programadas
    Lista de clientes
    Registros de vendas

Métodos:

    Adicionar nova sessão
    Realizar venda de ingresso
    Consultar informações sobre filmes e sessões
    Gerar relatórios de vendas

7. Classe Pagamento:

Métodos:

    Processar pagamento (integração com gateway de pagamento)
    Calcular descontos e preços diferenciados

8. Classe Reserva:

Atributos:

    Sessão (referência à sessão reservada)
    Assentos reservados
    Tempo de reserva

Métodos:

    Efetuar reserva de assentos
    Verificar tempo de validade da reserva
