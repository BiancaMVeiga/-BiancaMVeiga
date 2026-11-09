// Construtor para inicializar os dados
public AvaliacaoBurnout(int exaustaoEmocional, int despersonalizacao, int realizacaoProfissional) {
    this.exaustaoEmocional = exaustaoEmocional;
    this.despersonalizacao = despersonalizacao;
    this.realizacaoProfissional = realizacaoProfissional;
}

// Lógica psicológica/empresarial para calcular o nível de risco
public String calcularRiscoBurnout() {
    if (this.exaustaoEmocional >= 8 && this.despersonalizacao >= 7) {
        return "Alto Risco de Burnout - Atenção imediata e intervenção recomendada.";
    } else if (this.exaustaoEmocional >= 5 || this.despersonalizacao >= 5) {
        return "Risco Moderado - Sinais de esgotamento, necessita de reestruturação de rotina.";
    } else {
        return "Baixo Risco - Níveis estáveis de bem-estar.";
    }
}

// Getters para permitir que o sistema exiba os valores
public int getExaustaoEmocional() { return exaustaoEmocional; }
public int getDespersonalizacao() { return despersonalizacao; }
public int getRealizacaoProfissional() { return realizacaoProfissional; }
}

