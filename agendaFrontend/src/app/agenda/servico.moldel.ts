export class ServicoModel {
    // recebe objeto json
    constructor(
        public idServico?: number,
        public nome?: String,
        public valor?: number,
        public tempoServicoMinutos?: number,
        public profissional?: Profissional
    ) {
        this.profissional = new Profissional();
    }
}

export class Profissional {
    constructor(
        public idProfissional?: number,
        public nome?: String,
        public funcao?: String
    ) {
    }
}