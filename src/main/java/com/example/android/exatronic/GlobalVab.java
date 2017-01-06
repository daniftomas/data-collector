package com.example.android.exatronic;

/**
 * Created by danie on 22/02/2016.
 */
public class GlobalVab {
    private static GlobalVab mInstance = null;

    private String tarefaString;
    private String nameString;

    private int OP1;
    private int OP2;
    private int OP3;
    private int OP4;
    private int OP5;
    private int OP6;
    private int OP7;
    private int OP8;
    private int OP9;
    private int OP10;
    private int OP11;
    private int OP12;

    private int OPiniciada;
    private int OPiniciadaA;
    private int OPiniciadaB;
    private int OPiniciadaC;
    private int OPiniciadaD;
    private int OPiniciadaE;
    private int OPiniciadaF;
    private int OPiniciadaG;
    private int OPiniciadaH;
    private int OPiniciadaI;
    private int OPiniciadaJ;
    private int OPiniciadaK;

    private int tarefaColabA;
    private int tarefaColabB;
    private int tarefaColabC;
    private int tarefaColabD;
    private int tarefaColabE;
    private int tarefaColabF;
    private int tarefaColabG;
    private int tarefaColabH;
    private int tarefaColabI;
    private int tarefaColabJ;
    private int tarefaColabK;


    private String colabAName;
    private String colabBName;
    private String colabCName;
    private String colabDName;
    private String colabEName;
    private String colabFName;
    private String colabGName;
    private String colabHName;
    private String colabIName;
    private String colabJName;
    private String colabKName;

    private int horaStartA;
    private int horaStartB;
    private int horaStartC;
    private int horaStartD;
    private int horaStartE;
    private int horaStartF;
    private int horaStartG;
    private int horaStartH;
    private int horaStartI;
    private int horaStartJ;
    private int horaStartK;

    private int hPausaA;
    private int hPausaB;
    private int hPausaC;
    private int hPausaD;
    private int hPausaE;
    private int hPausaF;
    private int hPausaG;
    private int hPausaH;
    private int hPausaI;
    private int hPausaJ;
    private int hPausaK;

    private int tPausaA;
    private int tPausaB;
    private int tPausaC;
    private int tPausaD;
    private int tPausaE;
    private int tPausaF;
    private int tPausaG;
    private int tPausaH;
    private int tPausaI;
    private int tPausaJ;
    private int tPausaK;

    private int horaStop;
    private int horaStart;



    private GlobalVab() {
        nameString = "Hello";
        tarefaString = "Nenhuma";

        OP1 = 121;
        OP2 = 0;
        OP3 = 149;
        OP4 = 123;
        OP5 = 138;
        OP6 = 133;
        OP7 = 132;
        OP8 = 131;
        OP9 = 139;
        OP10 = 0;
        OP11 = 0;
        OP12 = 0;


        colabAName = "A.Freitas";
        colabBName = "C.Gonçalves";
        colabCName = "C.Portela";
        colabDName = "F.Ferreira";
        colabEName = "L.Batista";
        colabFName = "A.Costa";
        colabGName = "P.Pinheiro";
        colabHName = "P.Soares";
        colabIName = "R.Jesus";
        colabJName = "R.Miranda";
        colabKName = "S.Paulino";

        tarefaColabA = 0;
        tarefaColabB = 0;
        tarefaColabC = 0;
        tarefaColabD = 0;
        tarefaColabE = 0;
        tarefaColabF = 0;
        tarefaColabG = 0;
        tarefaColabH = 0;
        tarefaColabI = 0;
        tarefaColabJ = 0;
        tarefaColabK = 0;


        OPiniciada = 0;
        OPiniciadaA = 0;
        OPiniciadaB = 0;
        OPiniciadaC = 0;
        OPiniciadaD = 0;
        OPiniciadaE = 0;
        OPiniciadaF = 0;
        OPiniciadaG = 0;
        OPiniciadaH = 0;
        OPiniciadaI = 0;
        OPiniciadaJ = 0;
        OPiniciadaK = 0;

        hPausaA=0;
        hPausaB=0;
        hPausaC=0;
        hPausaD=0;
        hPausaE=0;
        hPausaF=0;
        hPausaG=0;
        hPausaH=0;
        hPausaI=0;
        hPausaJ=0;
        hPausaK=0;


        tPausaA=0;
        tPausaB=0;
        tPausaC=0;
        tPausaD=0;
        tPausaE=0;
        tPausaF=0;
        tPausaG=0;
        tPausaH=0;
        tPausaI=0;
        tPausaJ=0;
        tPausaK=0;


    }


    public static GlobalVab getInstance() {
        if (mInstance == null) {
            mInstance = new GlobalVab();
        }
        return mInstance;
    }

    //PARA O NOME
    public String getStringName() {
        return this.nameString;
    }

    public void setStringName(String value) {
        nameString = value;
    }

    //PARA A TAREFA
    public String getStringTarefa() {
        return this.tarefaString;
    }

    public void setStringTarefa(String value) {
        tarefaString = value;
    }




    //PARA AS TAREFAS DOS COLABORADORES

    public int getTarefaColabA() {
        return this.tarefaColabA;
    }

    public void setTarefaColabA(int value) {
        tarefaColabA = value;
    }

    public int getTarefaColabB() {
        return this.tarefaColabB;
    }

    public void setTarefaColabB(int value) {
        tarefaColabB = value;
    }


    public int getTarefaColabC() {
        return this.tarefaColabC;
    }

    public void setTarefaColabC(int value) {
        tarefaColabC = value;
    }


    public int getTarefaColabD() {
        return this.tarefaColabD;
    }

    public void setTarefaColabD(int value) {
        tarefaColabD = value;
    }

    public int getTarefaColabE() {
        return this.tarefaColabE;
    }

    public void setTarefaColabE(int value) {
        tarefaColabE = value;
    }

    public int getTarefaColabF() {
        return this.tarefaColabF;
    }

    public void setTarefaColabF(int value) {
        tarefaColabF = value;
    }

    public int getTarefaColabG() {
        return this.tarefaColabG;
    }

    public void setTarefaColabG(int value) {
        tarefaColabG = value;
    }

    public int getTarefaColabH() {
        return this.tarefaColabH;
    }

    public void setTarefaColabH(int value) {
        tarefaColabH = value;
    }

    public int getTarefaColabI() {
        return this.tarefaColabI;
    }

    public void setTarefaColabI(int value) {
        tarefaColabI = value;
    }

    public int getTarefaColabJ() {
        return this.tarefaColabJ;
    }

    public void setTarefaColabJ(int value) {
        tarefaColabJ = value;
    }

    public int getTarefaColabK() {
        return this.tarefaColabK;
    }

    public void setTarefaColabK(int value) {
        tarefaColabK = value;
    }

    // Para 'chamar' os nomes dos colaboradores

    public String getColabAName (){
        return this.colabAName;
    }

    public String getColabBName (){
        return this.colabBName;
    }

    public  String getColabCName (){
        return this.colabCName;
    }

    public String getColabDName(){
        return this.colabDName;
    }

    public String getColabEName (){
        return this.colabEName;
    }

    public String getColabFName (){
        return this.colabFName;
    }
    public String getColabGName (){
        return this.colabGName;
    }
    public String getColabHName (){
        return this.colabHName;
    }
    public String getColabIName (){
        return this.colabIName;
    }
    public String getColabJName (){
        return this.colabJName;
    }
    public String getColabKName (){
        return this.colabKName;
    }

    //PARA SACAR OS NUMEROS DAS OPS

    public int getOP1 (){
        return this.OP1;
    }

    public int getOP2 (){
        return this.OP2;
    }

    public int getOP3 (){
        return this.OP3;
    }
    public int getOP4 (){
        return this.OP4;
    }
    public int getOP5 (){
        return this.OP5;
    }
    public int getOP6 (){
        return this.OP6;
    }
    public int getOP7 (){
        return this.OP7;
    }
    public int getOP8 (){
        return this.OP8;
    }
    public int getOP9 (){
        return this.OP9;
    }
    public int getOP10 (){
        return this.OP10;
    }
    public int getOP11 (){
        return this.OP11;
    }
    public int getOP12 (){
        return this.OP12;
    }




    //PARA SACAR AS HORAS DE START E STOP

    public int getHoraStartA (){
        return this.horaStartA;
    }

    public void setHoraStartA (int value){
        horaStartA = value;
    }

    public int getHoraStartB (){
        return this.horaStartB;
    }

    public void setHoraStartB (int value){
        horaStartB = value;
    }

    public int getHoraStartC (){
        return this.horaStartC;
    }

    public void setHoraStartC (int value){
        horaStartC = value;
    }

    public int getHoraStartD (){
        return this.horaStartD;
    }

    public void setHoraStartD (int value){
        horaStartD = value;
    }

    public int getHoraStartE (){
        return this.horaStartE;
    }

    public void setHoraStartE (int value){
        horaStartE = value;
    }

    public int getHoraStartF (){
        return this.horaStartF;
    }

    public void setHoraStartF (int value){
        horaStartF = value;
    }

    public int getHoraStartG (){
        return this.horaStartG;
    }

    public void setHoraStartG (int value){
        horaStartG = value;
    }
    public int getHoraStartH (){
        return this.horaStartH;
    }

    public void setHoraStartH (int value){
        horaStartH = value;
    }
    public int getHoraStartI (){
        return this.horaStartI;
    }

    public void setHoraStartI (int value){
        horaStartI = value;
    }

    public int getHoraStartJ (){
        return this.horaStartJ;
    }

    public void setHoraStartJ (int value){
        horaStartJ = value;
    }
    public int getHoraStartK (){
        return this.horaStartK;
    }

    public void setHoraStartK (int value){
        horaStartK = value;
    }




    public int getHorasStop (){
        return this.horaStop;
    }

    public void setHoraStop (int value){
        horaStop = value;
    }

    public int getHorasStart (){
        return this.horaStart;
    }

    public void setHoraStart (int value){
        horaStart = value;
    }


    //OP INICIADA

    public int getOPiniciada (){
        return this.OPiniciada;
    }

    public void setOPiniciada (int value){
        OPiniciada = value;
    }
    public int getOPiniciadaA (){
        return this.OPiniciadaA;
    }

    public void setOPiniciadaA (int value){
        OPiniciadaA = value;
    }

    public int getOPiniciadaB (){
        return this.OPiniciadaB;
    }

    public void setOPiniciadaB (int value){
        OPiniciadaB = value;
    }

    public int getOPiniciadaC (){
        return this.OPiniciadaC;
    }

    public void setOPiniciadaC (int value){
        OPiniciadaC = value;
    }

    public int getOPiniciadaD (){
        return this.OPiniciadaD;
    }

    public void setOPiniciadaD (int value){
        OPiniciadaD = value;
    }

    public int getOPiniciadaE (){
        return this.OPiniciadaE;
    }

    public void setOPiniciadaE (int value){
        OPiniciadaE = value;
    }

    public int getOPiniciadaF (){
        return this.OPiniciadaF;
    }

    public void setOPiniciadaF (int value){
        OPiniciadaF = value;
    }

    public int getOPiniciadaG (){
        return this.OPiniciadaG;
    }

    public void setOPiniciadaG (int value){
        OPiniciadaG = value;
    }

    public int getOPiniciadaH (){
        return this.OPiniciadaH;
    }

    public void setOPiniciadaH (int value){
        OPiniciadaH = value;
    }

    public int getOPiniciadaI (){
        return this.OPiniciadaI;
    }

    public void setOPiniciadaI (int value){
        OPiniciadaI = value;
    }

    public int getOPiniciadaJ (){
        return this.OPiniciadaJ;
    }

    public void setOPiniciadaJ (int value){
        OPiniciadaJ = value;
    }
    public int getOPiniciadaK (){
        return this.OPiniciadaK;
    }

    public void setOPiniciadaK (int value){
        OPiniciadaK = value;
    }


    //HORAS DAS PAUSAS E TEMPOS DE PAUSAS

    public int getHPausaA (){
        return this.hPausaA;
    }

    public void setHPausaA(int value) {
        hPausaA = value;
    }
    public int getHPausaB (){
        return this.hPausaB;
    }

    public void setHPausaB(int value) {
        hPausaB = value;
    }

    public int getHPausaC (){
        return this.hPausaC;
    }

    public void setHPausaC(int value) {
        hPausaC = value;
    }

    public int getHPausaD (){
        return this.hPausaD;
    }

    public void setHPausaD(int value) {
        hPausaD = value;
    }

    public int getHPausaE (){
        return this.hPausaE;
    }

    public void setHPausaE(int value) {
        hPausaE = value;
    }

    public int getHPausaF (){
        return this.hPausaF;
    }

    public void setHPausaF(int value) {
        hPausaF = value;
    }

    public int getHPausaG (){
        return this.hPausaG;
    }

    public void setHPausaG(int value) {
        hPausaG = value;
    }

    public int getHPausaH (){
        return this.hPausaH;
    }

    public void setHPausaH(int value) {
        hPausaH = value;
    }

    public int getHPausaI (){
        return this.hPausaI;
    }

    public void setHPausaI(int value) {
        hPausaI = value;
    }

    public int getHPausaJ (){
        return this.hPausaJ;
    }

    public void setHPausaJ(int value) {
        hPausaJ = value;
    }

    public int getHPausaK (){
        return this.hPausaK;
    }

    public void setHPausaK(int value) {
        hPausaK = value;
    }


    //TEMPOS PAUSAS
    public int getTPausaA (){
        return this.tPausaA;
    }

    public void setTPausaA(int value) {
        tPausaA = value;
    }
    public int getTPausaB (){
        return this.tPausaB;
    }

    public void setTPausaB(int value) {
        tPausaB = value;
    }

    public int getTPausaC (){
        return this.tPausaC;
    }

    public void setTPausaC(int value) {
        tPausaC = value;
    }

    public int getTPausaD (){
        return this.tPausaD;
    }

    public void setTPausaD(int value) {
        tPausaD = value;
    }

    public int getTPausaE (){
        return this.tPausaE;
    }

    public void setTPausaE(int value) {
        tPausaE = value;
    }

    public int getTPausaF (){
        return this.tPausaF;
    }

    public void setTPausaF(int value) {
        tPausaF = value;
    }

    public int getTPausaG (){
        return this.tPausaG;
    }

    public void setTPausaG(int value) {
        tPausaG = value;
    }

    public int getTPausaH (){
        return this.tPausaH;
    }

    public void setTPausaH(int value) {
       tPausaH = value;
    }

    public int getTPausaI (){
        return this.tPausaI;
    }

    public void setTPausaI(int value) {
        tPausaI = value;
    }

    public int getTPausaJ (){
        return this.tPausaJ;
    }

    public void setTPausaJ(int value) {
        tPausaJ = value;
    }

    public int getTPausaK (){
        return this.tPausaK;
    }

    public void setTPausaK(int value) {
        tPausaK = value;
    }

}