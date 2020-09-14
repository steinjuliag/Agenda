export class UsuarioModel {
    constructor(
        public id?: number,
        public name?: string,
        public email?: string,
        public possuiDivida?: boolean,
        public divida?: Divida
    ) {
        this.divida = new Divida();
    }
}

export class Divida {
    constructor(
        public id?: number,
        public usuarioId?: number,
        public motivo?: string,
        public data?: any,
        public valor?: number
    ) {
    }
}