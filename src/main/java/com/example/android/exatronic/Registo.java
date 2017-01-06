package com.example.android.exatronic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;

public class Registo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo);
        GlobalVab.getInstance();
        sacarTarefaAtiva();
    }

    int tarefaAtiva;
    int tempoPausa;
    int op;
    int opNome;
    int dif;
    int temp=0;
    int temp2=0;

    String horaI = segundoParaHora(GlobalVab.getInstance().getHorasStart());
    String horaF = segundoParaHora(GlobalVab.getInstance().getHorasStop());

    public void fazRegisto(View view) {

        EditText editQuantidade = (EditText) findViewById(R.id.edit_quantidade);
        String quantidade = editQuantidade.getText().toString();

        EditText editAnomalias = (EditText) findViewById(R.id.edit_anomalias);
        String anomalias = editAnomalias.getText().toString();

        EditText editObservacoes = (EditText) findViewById(R.id.edit_observacoes);
        String observacoes = editObservacoes.getText().toString();

        // sacar info preenchida

        int numQuant;
        int numAnom;

        if (quantidade.matches("[0-9]+") && quantidade.length() > 0 && (anomalias.matches("[0-9]+") || anomalias.length() == 0)) {
            numQuant = Integer.valueOf(quantidade);

            if (anomalias.length() == 0) {
                numAnom = 0;
            } else {
                numAnom = Integer.valueOf(anomalias);
            }

            TextView aviso =(TextView)findViewById(R.id.tempo_pausa_maior);

            String minutos = minutosTarefa(GlobalVab.getInstance().getHorasStart(), GlobalVab.getInstance().getHorasStop());


            if (tempoPausa < dif||temp==1) {

                String lineToXML = createLinetoXML(opNome, GlobalVab.getInstance().getStringName(), tarefaAtiva, horaI, horaF, minutos, numQuant, numAnom, observacoes);
                displayExperiment(lineToXML);

                //CRIAR FUNÇÃO E ADICIONAR LINHA AO FICHEIRO

                try {
                    File myFile = new File("/sdcard/MIA/OP" + opNome + ".txt");

                    if (!myFile.exists()) {
                        myFile.createNewFile();
                        FileWriter fileWriter = new FileWriter(myFile, true);
                        fileWriter.append("OP;Nome;Tarefa;Hora Inicio;Dia;Hora Fim;Minutos;Quantidade;Anomalias;Causas;Observacoes;\n" + lineToXML);
                        fileWriter.close();
                    } else {
                        FileWriter fileWriter = new FileWriter(myFile, true);
                        fileWriter.append(lineToXML);
                        fileWriter.close();
                    }
                } catch (Exception e) {
                }

                /////////////////////enviarParaFicheiro (lineToXML);

                //fazer o o butão logout aparecer, de registo desaparecer, e botao OP ativo

                Button logoutButton = (Button) findViewById(R.id.logoutRegistoButton);
                logoutButton.setVisibility(View.VISIBLE);

                Button registobutton = (Button) findViewById(R.id.registo);
                registobutton.setVisibility(View.INVISIBLE);

                TextView registado = (TextView) findViewById(R.id.registo_textView);
                registado.setVisibility(View.VISIBLE);

                aviso.setText("");

                tarefaAtiva = 0;
                tempoPausa = 0;
                GlobalVab.getInstance().setOPiniciada(0);

            }

            if (tempoPausa > dif&&temp==0) {
                aviso.setText("O seu tempo de pausa é maior que o seu tempo ativo. \nDeixe uma observação se entender necessário ou continue com o registo.");
                temp=1;
            }

        }

        if ((quantidade.matches("[0-9]+") == false && quantidade.length() > 0) || (anomalias.matches("[0-9]+") == false && anomalias.length() > 0)) {
            Toast.makeText(this, "Em 'Quantidade' e 'Anomalias',inserir apenas números. ", Toast.LENGTH_LONG).show();
        }

        if (quantidade.length() == 0) {
            Toast.makeText(this, "Tem de inserir a quantidade produzida.", Toast.LENGTH_LONG).show();
        }
    }


    // SACAR CAUSAS PARA STRING FINAL
    private String causasToString() {

        String causas = "";

        CheckBox causa1 = (CheckBox) findViewById(R.id.causa1_checkbox);
        boolean hasCausa1 = causa1.isChecked();

        CheckBox causa2 = (CheckBox) findViewById(R.id.causa2_checkbox);
        boolean hasCausa2 = causa2.isChecked();

        CheckBox causa3 = (CheckBox) findViewById(R.id.causa3_checkbox);
        boolean hasCausa3 = causa3.isChecked();


        if (hasCausa1) {
            if (causas.length() == 0) {
                causas = "Defeito na matéria prima" + causas;
            } else {
                causas = "Defeito na matéria prima," + causas;
            }
        }

        if (hasCausa2) {

            if (causas.length() == 0) {
                causas = "Problema proveniente de tarefas anteriores" + causas;
            } else {
                causas = "Problema proveniente de tarefas anteriores," + causas;
            }
        }

        if (hasCausa3) {
            if (causas.length() == 0) {
                causas = "Outro" + causas;
            } else {
                causas = "Outro," + causas;
            }
        }

        return causas;
    }

    // CRIAR LINHA STRING FINAL PARA ENVIAR PARA O XML
    private String createLinetoXML(int op, String name, int tarefa, String horaInicio, String horaFim, String time, int quantidade, int anomalia, String observacoes) {
        Calendar c = Calendar.getInstance();

        String causas = causasToString();
        String tarefaString = Integer.toString(tarefa);
        CheckBox seletiva = (CheckBox) findViewById(R.id.seletiva_checkbox);
        boolean hasSeletiva = seletiva.isChecked();
        if (hasSeletiva) {
            tarefaString += "S";
        }

        if (tempoPausa != 0) {
            String tempPausa = segundoParaHora(tempoPausa);
            observacoes = observacoes + ", tempo de pausa: " + tempPausa + ".";
        }

        String lineToXML = op + ";" + name + ";" + tarefaString + ";" + c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR)
                + ";" + horaInicio + ";" + horaFim + ";" + time + ";" + quantidade + ";" + anomalia + ";" + causas + ";" + observacoes + ";\n";


        return lineToXML;

    }



    private void displayExperiment(String message) {
        TextView data = (TextView) findViewById(R.id.experiment);
        data.setText(message);
    }


    //sacar a tarefa ativa
    // sacar o tempo de iniciO
    // sacar a op iniciada
    // colocar o colabrador inativo
    // tempo de pausa a zero
    // OP iniciada a zero
    //mudar nome da tarefa no botão e nome no titulo


    private void sacarTarefaAtiva() {

        TextView loginColab = (TextView) findViewById(R.id.logoutRegistoText);
        Button opButton = (Button) findViewById(R.id.OPbutton);

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabAName()) {
            op = GlobalVab.getInstance().getOPiniciadaA();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabA());
            tempoPausa = GlobalVab.getInstance().getTPausaA();

            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartA());
            loginColab.setText(GlobalVab.getInstance().getColabAName());
            GlobalVab.getInstance().setTarefaColabA(0);
            GlobalVab.getInstance().setOPiniciadaA(0);
            GlobalVab.getInstance().setTPausaA(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabBName()) {
            op = GlobalVab.getInstance().getOPiniciadaB();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabB());
            tempoPausa = GlobalVab.getInstance().getTPausaB();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartB());
            loginColab.setText(GlobalVab.getInstance().getColabBName());
            GlobalVab.getInstance().setTarefaColabB(0);
            GlobalVab.getInstance().setOPiniciadaB(0);
            GlobalVab.getInstance().setTPausaB(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabCName()) {
            op = GlobalVab.getInstance().getOPiniciadaC();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabC());
            tempoPausa = GlobalVab.getInstance().getTPausaC();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartC());
            loginColab.setText(GlobalVab.getInstance().getColabCName());
            GlobalVab.getInstance().setTarefaColabC(0);
            GlobalVab.getInstance().setOPiniciadaC(0);
            GlobalVab.getInstance().setTPausaC(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabDName()) {
            op = GlobalVab.getInstance().getOPiniciadaD();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabD());
            tempoPausa = GlobalVab.getInstance().getTPausaD();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartD());
            loginColab.setText(GlobalVab.getInstance().getColabDName());
            GlobalVab.getInstance().setTarefaColabD(0);
            GlobalVab.getInstance().setOPiniciadaD(0);
            GlobalVab.getInstance().setTPausaD(0);

        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabEName()) {
            op = GlobalVab.getInstance().getOPiniciadaE();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabE());
            tempoPausa = GlobalVab.getInstance().getTPausaE();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartE());
            loginColab.setText(GlobalVab.getInstance().getColabEName());
            GlobalVab.getInstance().setTarefaColabE(0);
            GlobalVab.getInstance().setOPiniciadaE(0);
            GlobalVab.getInstance().setTPausaE(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabFName()) {
            op = GlobalVab.getInstance().getOPiniciadaF();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabF());
            tempoPausa = GlobalVab.getInstance().getTPausaF();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartF());
            loginColab.setText(GlobalVab.getInstance().getColabFName());
            GlobalVab.getInstance().setTarefaColabF(0);
            GlobalVab.getInstance().setOPiniciadaF(0);
            GlobalVab.getInstance().setTPausaF(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabGName()) {
            op = GlobalVab.getInstance().getOPiniciadaG();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabG());
            tempoPausa = GlobalVab.getInstance().getTPausaG();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartG());
            loginColab.setText(GlobalVab.getInstance().getColabGName());
            GlobalVab.getInstance().setTarefaColabG(0);
            GlobalVab.getInstance().setOPiniciadaG(0);
            GlobalVab.getInstance().setTPausaG(0);
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabHName()) {
            op = GlobalVab.getInstance().getOPiniciadaH();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabH());
            tempoPausa = GlobalVab.getInstance().getTPausaH();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartH());
            loginColab.setText(GlobalVab.getInstance().getColabHName());
            GlobalVab.getInstance().setTarefaColabH(0);
            GlobalVab.getInstance().setOPiniciadaH(0);
            GlobalVab.getInstance().setTPausaH(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabIName()) {
            op = GlobalVab.getInstance().getOPiniciadaI();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabI());
            tempoPausa = GlobalVab.getInstance().getTPausaI();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartI());
            loginColab.setText(GlobalVab.getInstance().getColabIName());
            GlobalVab.getInstance().setTarefaColabI(0);
            GlobalVab.getInstance().setOPiniciadaI(0);
            GlobalVab.getInstance().setTPausaI(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabJName()) {
            op = GlobalVab.getInstance().getOPiniciadaJ();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabJ());
            tempoPausa = GlobalVab.getInstance().getTPausaJ();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartJ());
            loginColab.setText(GlobalVab.getInstance().getColabJName());
            GlobalVab.getInstance().setTarefaColabJ(0);
            GlobalVab.getInstance().setOPiniciadaJ(0);
            GlobalVab.getInstance().setTPausaJ(0);
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabKName()) {
            op = GlobalVab.getInstance().getOPiniciadaK();
            tarefaAtiva = mudarNomeTarefa(GlobalVab.getInstance().getTarefaColabK());
            tempoPausa = GlobalVab.getInstance().getTPausaK();


            GlobalVab.getInstance().setHoraStart(GlobalVab.getInstance().getHoraStartK());
            loginColab.setText(GlobalVab.getInstance().getColabKName());
            GlobalVab.getInstance().setTPausaK(0);
            GlobalVab.getInstance().setTarefaColabK(0);
            GlobalVab.getInstance().setOPiniciadaK(0);
        }

        horaI = segundoParaHora(GlobalVab.getInstance().getHorasStart());

        TextView horaDeI = (TextView)findViewById(R.id.edit_horas_inicio);
        horaDeI.setText(horaI);
        TextView horaDeF = (TextView)findViewById(R.id.edit_horas_fim);
        horaDeF.setText(horaF);

        Button tarefaButton = (Button) findViewById(R.id.buttonRegistoTarefa);
        tarefaButton.setText("Tarefa " + tarefaAtiva);

        opButton.setText("OP" + opNome);
    }


    //MUDAR O NOME DAS TAREFAS

    private int mudarNomeTarefa(int tarefa) {
        TextView registo = (TextView) findViewById(R.id.titulo_registo);
        CheckBox seletiva = (CheckBox) findViewById(R.id.seletiva_checkbox);
        TextView registoTarefa = (TextView)findViewById(R.id.registo_tarefa);


        //modelo RCPC8 3V2
        if (op == 1) {
            opNome =GlobalVab.getInstance().getOP1();
            registo.setText("Registo - Modelo 1");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar Componente A");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Slide Switch e Fichas Connblock");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Rotary Switches");
                seletiva.setVisibility(View.VISIBLE);

            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText(" - Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText(" - Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }
        ///MODELO Tunísia
        if (op == GlobalVab.getInstance().getOP2()) {
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar Slide Switch e RJ45");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Connblock Switch");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Rotary Switches e Fichas RJ45");
                seletiva.setVisibility(View.VISIBLE);

            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText("- Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText("- Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }

        //MODELO RAQUITED 6 V2
        if (op == 3) {
            opNome=GlobalVab.getInstance().getOP3();
            registo.setText("Registo - Modelo RAQUITED 6 V2");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar Fichas RJ45");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Slide Switch e Rotary Switches");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Ficha RJ45 e Fichas PDB");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText("- Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText("- Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }

        //MODELO RCPC 8 2V3 p/ agrupar
        if (op == 4) {
            opNome=GlobalVab.getInstance().getOP4();
            registo.setText("Registo - Modelo RCPC8 2V3 p/ agrupar");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar Fichas RJ45 e Slide Switch");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Fichas Conn Block");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Fichas RJ45 e Rotary Switches");
                seletiva.setVisibility(View.VISIBLE);

            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText("- Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText("- Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }

        //MODELO RCPC 8 3V2 p/ agrupar
        if (op == 5) {
            opNome=GlobalVab.getInstance().getOP5();
            registo.setText("Registo - Modelo RCPC 8 3V2 p/ agrupar");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar RJ45 ");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Slide Switch e Fichas Connblock");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Ficha RJ45 e Rotary Switches");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText("- Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText("- Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }

        //MODELO RCPC 6 2V3
        if (op == 6) {
            opNome = GlobalVab.getInstance().getOP6();
            registo.setText("Registo - Modelo RCPC 6 2V3");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar Fichas RJ45 e Slide Switch");
            }
            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Fichas Connblock");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Fichas RJ45 e Rotary Switches");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText("- Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText("- Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }

        }

            //MODELO RCPC 8 2V3
            if (op == 7) {
                opNome=GlobalVab.getInstance().getOP7();
                registo.setText("Registo - Modelo RCPC 8 2V3");
                if (tarefa == 1) {
                    tarefaAtiva = 4;
                    registoTarefa.setText("- Colocar Fichas RJ45 e Slide Switch");
                }
                if (tarefa == 2) {
                    tarefaAtiva = 5;
                    registoTarefa.setText("- Colocar Fichas Conn Block");
                }
                if (tarefa == 3) {
                    tarefaAtiva = 9;
                    registoTarefa.setText("- Passar na Onda");
                }
                if (tarefa == 4) {
                    tarefaAtiva = 13;
                    registoTarefa.setText("- Rework Pós Onda");
                }
                if (tarefa == 5) {
                    tarefaAtiva = 14;
                    registoTarefa.setText("- Limpeza Pós Onda");
                }
                if (tarefa == 6) {
                    tarefaAtiva = 16;
                    registoTarefa.setText("- Colocar Fichas RJ45 e Rotary Switches");
                    seletiva.setVisibility(View.VISIBLE);
                }
                if (tarefa == 7) {
                    tarefaAtiva = 20;
                    registoTarefa.setText("- Rework Pós-Seletiva ");
                    seletiva.setVisibility(View.VISIBLE);
                }
                if (tarefa == 8) {
                    tarefaAtiva = 21;
                    registoTarefa.setText("- Despainelizar");
                }
                if (tarefa == 9) {
                    tarefaAtiva = 23;
                    registoTarefa.setText("- Colocar etiqueta no modelo");
                }
                if (tarefa == 10) {
                    tarefaAtiva = 24;
                    registoTarefa.setText("- Realizar Testes");
                }
                if (tarefa == 11) {
                    tarefaAtiva = 25;
                    registoTarefa.setText("- Inspeção Visual");
                }
                if (tarefa == 12) {
                    tarefaAtiva = 28;
                    registoTarefa.setText("- Embalamento");
                }
        }

        //modelo RCPC12 3V2
        if (op == 8) {
            opNome =GlobalVab.getInstance().getOP8();
            registo.setText("Registo - Modelo RCPC 12 3V2");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar RJ45");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Slide Switch e Fichas Connblock");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Rotary Switches");
                seletiva.setVisibility(View.VISIBLE);

            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText(" - Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText(" - Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }

        //modelo RCPC6 3V2
        if (op == 9) {
            opNome =GlobalVab.getInstance().getOP9();
            registo.setText("Registo - Modelo RCPC 6 3V2");
            if (tarefa == 1) {
                tarefaAtiva = 4;
                registoTarefa.setText("- Colocar RJ45");
            }

            if (tarefa == 2) {
                tarefaAtiva = 5;
                registoTarefa.setText("- Colocar Slide Switch e Fichas Connblock");
            }
            if (tarefa == 3) {
                tarefaAtiva = 9;
                registoTarefa.setText("- Passar na Onda");
            }
            if (tarefa == 4) {
                tarefaAtiva = 13;
                registoTarefa.setText("- Rework Pós Onda");
            }
            if (tarefa == 5) {
                tarefaAtiva = 14;
                registoTarefa.setText("- Limpeza Pós Onda");
            }
            if (tarefa == 6) {
                tarefaAtiva = 16;
                registoTarefa.setText("- Colocar Rotary Switches");
                seletiva.setVisibility(View.VISIBLE);

            }
            if (tarefa == 7) {
                tarefaAtiva = 20;
                registoTarefa.setText("- Rework Pós-Seletiva ");
                seletiva.setVisibility(View.VISIBLE);
            }
            if (tarefa == 8) {
                tarefaAtiva = 21;
                registoTarefa.setText("- Despainelizar");
            }
            if (tarefa == 9) {
                tarefaAtiva = 23;
                registoTarefa.setText(" - Colocar etiqueta no modelo");
            }
            if (tarefa == 10) {
                tarefaAtiva = 24;
                registoTarefa.setText(" - Realizar Testes");
            }
            if (tarefa == 11) {
                tarefaAtiva = 25;
                registoTarefa.setText("- Inspeção Visual");
            }
            if (tarefa == 12) {
                tarefaAtiva = 28;
                registoTarefa.setText("- Embalamento");
            }
        }

        return tarefaAtiva;
    }


    // passar segundos para hora

    public String segundoParaHora(int segundos) {
        String hora;

        int horas = segundos / 3600;
        int minutos = (segundos - (horas * 3600)) / 60;
        int seg = segundos - ((horas * 3600) + (minutos * 60));
        hora = horas + ":" + minutos + ":" + seg;
        return hora;
    }

    public String minutosTarefa(int horaInicio, int horaFinal) {
        dif = horaFinal - horaInicio - tempoPausa;

        //double min= (double)dif/60;
        //String minutosString = Double.toString(min);

        //minutosString = minutosString.replace(".",",");
        //return minutosString;

        String hora = segundoParaHora(dif);

        return hora;
    }

    //FAZER LOG OUT
    public void logout(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //VOLTAR PARA O MENU OP
    public void voltarOP(View view) {

        if (tarefaAtiva != 0) {
            Toast.makeText(this, "Necessário fazer registo primeiro.", Toast.LENGTH_LONG).show();
        } else {

            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
            finish();
        }
    }

}
