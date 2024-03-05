public class Contract {

    String obiectulContractului;
    int numarContract;
    int anulIncheieriiContractului;
    String partileContractului;


    Contract(String obiectulContractuluiParam,int numarContractParam){
        this.obiectulContractului = obiectulContractuluiParam;
        this.numarContract = numarContractParam;
    }

    Contract(int anulIncheieriiContractuluiParam,String partileContractuluiParam){
        this.anulIncheieriiContractului = anulIncheieriiContractuluiParam;
        this.partileContractului = partileContractuluiParam;
    }

    public String getObiectulContractului(){
        return obiectulContractului;
    }

    public void setAnulIncheieriiContractului(int anulIncheieriiContractuluiParam){
        this.anulIncheieriiContractului = anulIncheieriiContractuluiParam;
    }
}
