package org.arraipay.arraiapay.ModelCartao;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ModelCartao {
    @Getter
    @Setter

    int id_cartao;

    String codigo_qr;

    String nome_participante;

    boolean status;

    double saldo_atual;

    int id_cartao_anterior;

    LocalDateTime data_cricao;
}
