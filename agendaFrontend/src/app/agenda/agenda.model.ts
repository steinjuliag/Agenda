import { ServicoModel } from './servico.moldel';

export class AgendaModel {
    constructor(
        public idAgenda?: number,
        public dataInicial?: any,
        public dataFinal?: any,
        public servicos?: ServicoModel[]
    ) {
        this.servicos = []

    }
}