package Applications;

public class Contract {

    String obiectulContractului;
    int anulIncheieriiContractului;
    String partileContractului;
    int cnpContractanti;

    Contract(String obiectulContractuluiParam, int anulIncheieriiContractuluiParam, String partileContractuluiParam, int cnpContractantiParam) {
        this.obiectulContractului = obiectulContractuluiParam;
        this.anulIncheieriiContractului = anulIncheieriiContractuluiParam;
        this.cnpContractanti = cnpContractantiParam;
        this.partileContractului = partileContractuluiParam;
    }
}
