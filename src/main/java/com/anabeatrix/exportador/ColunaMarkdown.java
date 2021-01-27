package com.anabeatrix.exportador;

import java.util.function.Function;

class ColunaMarkdown extends AbstractColuna{

    protected ColunaMarkdown(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return " | ";
    }

    @Override
    public String fechar() {
        return " ";
    }
}
