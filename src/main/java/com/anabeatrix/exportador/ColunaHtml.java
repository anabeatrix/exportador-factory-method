package com.anabeatrix.exportador;

import java.util.function.Function;

class ColunaHtml extends AbstractColuna {

    protected ColunaHtml(Function<Produto, Object> obtemValorColuna, String titulo) {

        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "<td>";
    }

    @Override
    public String fechar() {
        return "</td>";
    }
}
