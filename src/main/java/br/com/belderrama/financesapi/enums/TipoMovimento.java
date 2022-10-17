package br.com.belderrama.financesapi.enums;

public enum TipoMovimento {
    RECEITA(1),
    DESPESA(2);

    private int code;

    private TipoMovimento(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static TipoMovimento valueOf(int code){
        for(TipoMovimento value : TipoMovimento.values()){
            if(code == value.getCode()){
                return value;
            }
        }
        throw new IllegalArgumentException("Tipo de Movimento Invalido");
    }

}
