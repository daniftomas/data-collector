package com.example.android.exatronic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class ActivityTarefasOP1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tarefas_op1);

        visibilidadeLayoutsInicio();
        mudarNomeLogin();
    }


    int pauseActive=0;
    int temp=0;

    //FAZER LOGOUT
    public void logout(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //VOLTAR PARA O MENU OP
    public void voltarOP (View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        finish();
    }

    //MENU DE ESCOLHA DE OPs
    public void showOP1Tarefa1(View view) {
        visibilidadeLayouts(1);
    }

    public void showOP1Tarefa2(View view) {
        visibilidadeLayouts(2);
    }

    public void showOP1Tarefa3(View view) {
        visibilidadeLayouts(3);
    }

    public void showOP1Tarefa4(View view) {
        visibilidadeLayouts(4);
    }

    public void showOP1Tarefa5(View view) {
        visibilidadeLayouts(5);
    }

    public void showOP1Tarefa6(View view) {
        visibilidadeLayouts(6);
    }

    public void showOP1Tarefa7(View view) {
        visibilidadeLayouts(7);
    }
    public void showOP1Tarefa8(View view) {
        visibilidadeLayouts(8);
    }
    public void showOP1Tarefa9(View view) {
        visibilidadeLayouts(9);
    }
    public void showOP1Tarefa10(View view) {
        visibilidadeLayouts(10);
    }
    public void showOP1Tarefa11(View view) {
        visibilidadeLayouts(11);
    }
    public void showOP1Tarefa12(View view) {
        visibilidadeLayouts(12);
    }

    //VISIBILIDADE DA DOS BOTOES COM TAREFAS ATIVAS

    private void visibilidadeBotoesTarefas (int tarefaAtiva){

        View buttontarefa1= findViewById(R.id.buttonTarefa1);
        buttontarefa1.setVisibility(View.INVISIBLE);
        View buttontarefa2 = findViewById(R.id.buttonTarefa2);
        buttontarefa2.setVisibility(View.INVISIBLE);
        View buttontarefa3 = findViewById(R.id.buttonTarefa3);
        buttontarefa3.setVisibility(View.INVISIBLE);
        View buttontarefa4 = findViewById(R.id.buttonTarefa4);
        buttontarefa4.setVisibility(View.INVISIBLE);
        View buttontarefa5 = findViewById(R.id.buttonTarefa5);
        buttontarefa5.setVisibility(View.INVISIBLE);
        View buttontarefa6 = findViewById(R.id.buttonTarefa6);
        buttontarefa6.setVisibility(View.INVISIBLE);
        View buttontarefa7 = findViewById(R.id.buttonTarefa7);
        buttontarefa7.setVisibility(View.INVISIBLE);
        View buttontarefa8 = findViewById(R.id.buttonTarefa8);
        buttontarefa8.setVisibility(View.INVISIBLE);
        View buttontarefa9 = findViewById(R.id.buttonTarefa9);
        buttontarefa9.setVisibility(View.INVISIBLE);
        View buttontarefa10 = findViewById(R.id.buttonTarefa10);
        buttontarefa10.setVisibility(View.INVISIBLE);
        View buttontarefa11 = findViewById(R.id.buttonTarefa11);
        buttontarefa11.setVisibility(View.INVISIBLE);
        View buttontarefa12 = findViewById(R.id.buttonTarefa12);
        buttontarefa12.setVisibility(View.INVISIBLE);

        if(tarefaAtiva == 1){
            buttontarefa1.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 2){
            buttontarefa2.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 3){
            buttontarefa3.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 4){
            buttontarefa4.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 5){
            buttontarefa5.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 6){
            buttontarefa6.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 7){
            buttontarefa7.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 8){
            buttontarefa8.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 9){
            buttontarefa9.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 10){
            buttontarefa10.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 11){
            buttontarefa10.setVisibility(View.VISIBLE);
        }
        if(tarefaAtiva == 12){
            buttontarefa10.setVisibility(View.VISIBLE);
        }

    }

    public void startTarefa1(View view) {
        //saber qual o colab que iniciou a tarefa e guardar o inicio de atividade

        alterarDadosStart(1);

        //dar start no chronometro
        //
        View startbutton = findViewById(R.id.OP1_tarefa1_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(1);
    }


    public void startTarefa2(View view) {

        //saber qual o colab que iniciou a tarefa e guardar o inicio de atividade

        alterarDadosStart(2);

        //dar start no chronometro

        //
        View startbutton = findViewById(R.id.OP1_tarefa2_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(2);
    }

    public void startTarefa3(View view) {
        //saber qual o colab que iniciou a tarefa e guardar o inicio de atividade

        alterarDadosStart(3);
        //dar start no chronometro

        //
        View startbutton = findViewById(R.id.OP1_tarefa3_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(3);

    }

    public void startTarefa4(View view) {

        //saber qual o colab que iniciou a tarefa e guardar o inicio de atividade
        alterarDadosStart(4);

        //dar start no chronometro

        //
        View startbutton = findViewById(R.id.OP1_tarefa4_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(4);
    }

    public void startTarefa5(View view) {

        //saber qual o colab que iniciou a tarefa e guardar o inicio de atividade
        alterarDadosStart(5);

        //dar start no chronometro

        View startbutton = findViewById(R.id.OP1_tarefa5_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(5);

    }

    public void startTarefa6(View view) {
        //dar start no chronometro
        alterarDadosStart(6);

        //
        View startbutton = findViewById(R.id.OP1_tarefa6_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(6);

    }

    public void startTarefa7(View view) {
        //dar start no chronometro
        alterarDadosStart(7);

        //
        View startbutton = findViewById(R.id.OP1_tarefa7_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(7);
    }

    public void startTarefa8(View view) {
        //dar start no chronometro
        alterarDadosStart(8);

        //
        View startbutton = findViewById(R.id.OP1_tarefa8_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(8);

    }

    public void startTarefa9(View view) {
        //dar start no chronometro
        alterarDadosStart(9);

        //
        View startbutton = findViewById(R.id.OP1_tarefa9_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(9);

    }

    public void startTarefa10(View view) {
        //dar start no chronometro
        alterarDadosStart(10);

        //
        View startbutton = findViewById(R.id.OP1_tarefa10_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(10);

    }

    public void startTarefa11(View view) {
        //dar start no chronometro
        alterarDadosStart(11);

        //
        View startbutton = findViewById(R.id.OP1_tarefa11_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(11);

    }
    public void startTarefa12(View view) {
        //dar start no chronometro
        alterarDadosStart(12);

        //
        View startbutton = findViewById(R.id.OP1_tarefa12_startbutton);
        startbutton.setVisibility(View.GONE);

        visibilidadeBotoesTarefas(12);

    }

    //VERRIFICAR QUEM FEZ LOGIN E ALTERAR INFO

    private void alterarDadosStart(int tarefa) {

        Button op1Button = (Button)findViewById(R.id.OP1button);
        op1Button.setClickable(false);


        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabAName()) {
            GlobalVab.getInstance().setTarefaColabA(tarefa);
            GlobalVab.getInstance().setOPiniciadaA(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartA(c.get(Calendar.HOUR_OF_DAY)*3600 + c.get(Calendar.MINUTE)*60 + c.get(Calendar.SECOND));
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabBName()) {
            GlobalVab.getInstance().setTarefaColabB(tarefa);
            GlobalVab.getInstance().setOPiniciadaB(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartB(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));

        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabCName()) {
            GlobalVab.getInstance().setTarefaColabC(tarefa);
            GlobalVab.getInstance().setOPiniciadaC(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartC(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));

        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabDName()) {
            GlobalVab.getInstance().setTarefaColabD(tarefa);
            GlobalVab.getInstance().setOPiniciadaD(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartD(c.get(Calendar.HOUR_OF_DAY) * 3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));
        }


        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabEName()) {
            GlobalVab.getInstance().setTarefaColabE(tarefa);
            GlobalVab.getInstance().setOPiniciadaE(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartE(c.get(Calendar.HOUR_OF_DAY)*3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));

        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabFName()) {
            GlobalVab.getInstance().setTarefaColabF(tarefa);
            GlobalVab.getInstance().setOPiniciadaF(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartF(c.get(Calendar.HOUR_OF_DAY)*3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabGName()) {
            GlobalVab.getInstance().setTarefaColabG(tarefa);
            GlobalVab.getInstance().setOPiniciadaG(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartG(c.get(Calendar.HOUR_OF_DAY)*3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabHName()) {
            GlobalVab.getInstance().setTarefaColabH(tarefa);
            GlobalVab.getInstance().setOPiniciadaH(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartH(c.get(Calendar.HOUR_OF_DAY)*3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabIName()) {
            GlobalVab.getInstance().setTarefaColabI(tarefa);
            GlobalVab.getInstance().setOPiniciadaI(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartI(c.get(Calendar.HOUR_OF_DAY)*3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabJName()) {
            GlobalVab.getInstance().setTarefaColabJ(tarefa);
            GlobalVab.getInstance().setOPiniciadaJ(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartJ(c.get(Calendar.HOUR_OF_DAY)*3600+c.get(Calendar.MINUTE)*60+c.get(Calendar.SECOND));
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabKName()) {
            GlobalVab.getInstance().setTarefaColabK(tarefa);
            GlobalVab.getInstance().setOPiniciadaK(1);
            Calendar c = Calendar.getInstance();
            GlobalVab.getInstance().setHoraStartK((c.get(Calendar.HOUR_OF_DAY)*3600)+(c.get(Calendar.MINUTE)*60)+c.get(Calendar.SECOND));
        }
    }



    //DAR PAUSA NAS TAREFAS
    public void pauseTarefa1 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa1_pausebutton);
            alterarDadosPause(pauseButton);
    }

    public void pauseTarefa2 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa2_pausebutton);
        alterarDadosPause(pauseButton);
    }

    public void pauseTarefa3 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa3_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa4 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa4_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa5 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa5_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa6 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa6_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa7 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa7_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa8 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa8_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa9 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa9_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa10 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa10_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa11 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa11_pausebutton);
        alterarDadosPause(pauseButton);
    }
    public void pauseTarefa12 (View view){

        Button pauseButton = (Button)findViewById(R.id.OP1_tarefa12_pausebutton);
        alterarDadosPause(pauseButton);
    }


    //alterar dados da pausa

    private void alterarDadosPause(Button pauseButton) {

        int HFimPausa;
        boolean temp=false;
        int calculo;

        if (pauseActive==0) {
            pauseButton.setText("Retomar");
            temp=true;
            pauseActive=1;
            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabAName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaA(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabBName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaB(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabCName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaC(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
            }
            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabDName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaD(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
            }


            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabEName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaE(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
               }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabFName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaF(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
               }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabGName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaG(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
                }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabHName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaH(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
                }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabIName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaI(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
               }
            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabJName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaJ(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
                }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabKName()) {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHPausaK(c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND));
                }

        }

        if(temp==false && pauseActive!=0){

            pauseButton.setText("Pausar");
            pauseActive=0;

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabAName()) {
                Calendar c = Calendar.getInstance();
                HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaA(GlobalVab.getInstance().getTPausaA()+(HFimPausa-GlobalVab.getInstance().getHPausaA()));
                GlobalVab.getInstance().setHPausaA(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabBName()) {
                Calendar c = Calendar.getInstance();
                 HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaB(GlobalVab.getInstance().getTPausaB() + (HFimPausa - GlobalVab.getInstance().getHPausaB()));
                GlobalVab.getInstance().setHPausaB(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabCName()) {
                Calendar c = Calendar.getInstance();
                 HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaC(GlobalVab.getInstance().getTPausaC() + (HFimPausa - GlobalVab.getInstance().getHPausaC()));
                GlobalVab.getInstance().setHPausaC(0);
            }
            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabDName()) {
                Calendar c = Calendar.getInstance();
                 HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaD(GlobalVab.getInstance().getTPausaD() + (HFimPausa - GlobalVab.getInstance().getHPausaD()));
                GlobalVab.getInstance().setHPausaD(0);
            }


            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabEName()) {
                Calendar c = Calendar.getInstance();
                 HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaE(GlobalVab.getInstance().getTPausaE() + (HFimPausa - GlobalVab.getInstance().getHPausaE()));
                GlobalVab.getInstance().setHPausaE(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabFName()) {
                Calendar c = Calendar.getInstance();
                HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaF(GlobalVab.getInstance().getTPausaF() + (HFimPausa - GlobalVab.getInstance().getHPausaF()));
                GlobalVab.getInstance().setHPausaF(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabGName()) {
                Calendar c = Calendar.getInstance();
                HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaG(GlobalVab.getInstance().getTPausaG() + (HFimPausa - GlobalVab.getInstance().getHPausaG()));
                GlobalVab.getInstance().setHPausaG(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabHName()) {
                Calendar c = Calendar.getInstance();
                HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaH(GlobalVab.getInstance().getTPausaH() + (HFimPausa - GlobalVab.getInstance().getHPausaH()));
                GlobalVab.getInstance().setHPausaH(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabIName()) {
                Calendar c = Calendar.getInstance();
                HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaI(GlobalVab.getInstance().getTPausaI() + (HFimPausa - GlobalVab.getInstance().getHPausaI()));
                GlobalVab.getInstance().setHPausaI(0);
            }
            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabJName()) {
                Calendar c = Calendar.getInstance();
                 HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaJ(GlobalVab.getInstance().getTPausaJ() + (HFimPausa - GlobalVab.getInstance().getHPausaJ()));
                GlobalVab.getInstance().setHPausaJ(0);
            }

            if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabKName()) {
                Calendar c = Calendar.getInstance();
                HFimPausa= c.get(Calendar.HOUR_OF_DAY) * 3600 + c.get(Calendar.MINUTE) * 60 + c.get(Calendar.SECOND);
                GlobalVab.getInstance().setTPausaK(GlobalVab.getInstance().getTPausaK() + (HFimPausa - GlobalVab.getInstance().getHPausaK()));
                GlobalVab.getInstance().setHPausaK(0);
            }
        }


    }


    //DAR STOP NAS TAREFAS
    public void stopTarefa1(View view) {
        goToRegisto();
    }

    public void stopTarefa2(View view) {
        goToRegisto();
    }

    public void stopTarefa3(View view) {

        goToRegisto();
    }

    public void stopTarefa4(View view) {

        goToRegisto();
    }

    public void stopTarefa5(View view) {

        goToRegisto();
    }

    public void stopTarefa6(View view) {
        goToRegisto();
    }

    public void stopTarefa7(View view) {
        goToRegisto();
    }
    public void stopTarefa8(View view) {
        goToRegisto();
    }
    public void stopTarefa9(View view) {
        goToRegisto();
    }
    public void stopTarefa10(View view) {
        goToRegisto();
    }
    public void stopTarefa11(View view) {
        goToRegisto();
    }
    public void stopTarefa12(View view) {
        goToRegisto();
    }


    // IR PARA ATIVIDADE REGISTO E SACAR A HORA DE STOP
    private void goToRegisto() {
        //ir para o registo
        if (pauseActive!=0){
            Toast.makeText(this, "Tem uma pausa ativa.", Toast.LENGTH_LONG).show();
        }
        else {
            if (temp==0){
                Toast.makeText(this, "Confirme paragem novamente.", Toast.LENGTH_LONG).show();
                temp=1;
            }
            else {
                Calendar c = Calendar.getInstance();
                GlobalVab.getInstance().setHoraStop((c.get(Calendar.HOUR_OF_DAY) * 3600) + (c.get(Calendar.MINUTE) * 60) + c.get(Calendar.SECOND));
                Intent intent = new Intent(this, Registo.class);
                startActivity(intent);
                finish();
            }
        }
    }


    //visibilidade no inicio
    public void visibilidadeLayoutsInicio() {
        int tarefaAtiva = 0;

        Button op1Button = (Button)findViewById(R.id.OP1button);

        Button pausa1 = (Button)findViewById(R.id.OP1_tarefa1_pausebutton);
        Button pausa2 = (Button)findViewById(R.id.OP1_tarefa2_pausebutton);
        Button pausa3 = (Button)findViewById(R.id.OP1_tarefa3_pausebutton);
        Button pausa4 = (Button)findViewById(R.id.OP1_tarefa4_pausebutton);
        Button pausa5 = (Button)findViewById(R.id.OP1_tarefa5_pausebutton);
        Button pausa6 = (Button)findViewById(R.id.OP1_tarefa6_pausebutton);
        Button pausa7 = (Button)findViewById(R.id.OP1_tarefa7_pausebutton);
        Button pausa8 = (Button)findViewById(R.id.OP1_tarefa8_pausebutton);
        Button pausa9 = (Button)findViewById(R.id.OP1_tarefa9_pausebutton);
        Button pausa10 = (Button)findViewById(R.id.OP1_tarefa10_pausebutton);
        Button pausa11 = (Button)findViewById(R.id.OP1_tarefa11_pausebutton);
        Button pausa12 = (Button)findViewById(R.id.OP1_tarefa12_pausebutton);



        View buttontarefa1 =  findViewById(R.id.buttonTarefa1);
        View buttontarefa2 =  findViewById(R.id.buttonTarefa2);
        View buttontarefa3 =  findViewById(R.id.buttonTarefa3);
        View buttontarefa4 =  findViewById(R.id.buttonTarefa4);
        View buttontarefa5 =  findViewById(R.id.buttonTarefa5);
        View buttontarefa6 =  findViewById(R.id.buttonTarefa6);
        View buttontarefa7 =  findViewById(R.id.buttonTarefa7);
        View buttontarefa8 =  findViewById(R.id.buttonTarefa8);
        View buttontarefa9 =  findViewById(R.id.buttonTarefa9);
        View buttontarefa10 =  findViewById(R.id.buttonTarefa10);
        View buttontarefa11 =  findViewById(R.id.buttonTarefa11);
        View buttontarefa12 =  findViewById(R.id.buttonTarefa12);


        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabAName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabA();
            pauseActive =GlobalVab.getInstance().getHPausaA();
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabBName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabB();
            pauseActive =GlobalVab.getInstance().getHPausaB();
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabCName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabC();
            pauseActive =GlobalVab.getInstance().getHPausaC();
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabDName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabD();
            pauseActive =GlobalVab.getInstance().getHPausaD();
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabEName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabE();
            pauseActive =GlobalVab.getInstance().getHPausaE();
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabFName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabF();
            pauseActive =GlobalVab.getInstance().getHPausaF();
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabGName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabG();
            pauseActive =GlobalVab.getInstance().getHPausaG();
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabHName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabH();
            pauseActive =GlobalVab.getInstance().getHPausaH();

        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabIName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabI();
            pauseActive =GlobalVab.getInstance().getHPausaI();
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabJName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabJ();
            pauseActive =GlobalVab.getInstance().getHPausaJ();
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabKName()) {
            tarefaAtiva = GlobalVab.getInstance().getTarefaColabK();
            pauseActive =GlobalVab.getInstance().getHPausaK();
        }



        if(pauseActive==0){
            pausa1.setText("Pausar");
            pausa2.setText("Pausar");
            pausa3.setText("Pausar");
            pausa4.setText("Pausar");
            pausa5.setText("Pausar");
            pausa6.setText("Pausar");
            pausa7.setText("Pausar");
            pausa8.setText("Pausar");
            pausa9.setText("Pausar");
            pausa10.setText("Pausar");
            pausa11.setText("Pausar");
            pausa12.setText("Pausar");

        }

        if(pauseActive!=0){
            pausa1.setText("Retomar");
            pausa2.setText("Retomar");
            pausa3.setText("Retomar");
            pausa4.setText("Retomar");
            pausa5.setText("Retomar");
            pausa6.setText("Retomar");
            pausa7.setText("Retomar");
            pausa8.setText("Retomar");
            pausa9.setText("Retomar");
            pausa10.setText("Retomar");
            pausa11.setText("Retomar");
            pausa12.setText("Retomar");
        }


        if (tarefaAtiva == 0) {
            visibilidadeLayouts(0);

            op1Button.setClickable(true);

            buttontarefa1.setVisibility(View.VISIBLE);
            buttontarefa2.setVisibility(View.VISIBLE);
            buttontarefa3.setVisibility(View.VISIBLE);
            buttontarefa4.setVisibility(View.VISIBLE);
            buttontarefa5.setVisibility(View.VISIBLE);
            buttontarefa6.setVisibility(View.VISIBLE);
            buttontarefa7.setVisibility(View.VISIBLE);
            buttontarefa8.setVisibility(View.VISIBLE);
            buttontarefa9.setVisibility(View.VISIBLE);
            buttontarefa10.setVisibility(View.VISIBLE);
            buttontarefa11.setVisibility(View.VISIBLE);
            buttontarefa12.setVisibility(View.VISIBLE);


        }
        if (tarefaAtiva!=0){
            op1Button.setClickable(false);
        }

        if (tarefaAtiva == 1) {

            visibilidadeLayouts(1);

            visibilidadeBotoesTarefas(1);

            View startbutton = findViewById(R.id.OP1_tarefa1_startbutton);
            startbutton.setVisibility(View.GONE);


        }

        if (tarefaAtiva == 2) {

            visibilidadeLayouts(2);

            visibilidadeBotoesTarefas(2);

            View startbutton = findViewById(R.id.OP1_tarefa2_startbutton);
            startbutton.setVisibility(View.GONE);
        }

        if (tarefaAtiva == 3) {

            visibilidadeLayouts(3);

            visibilidadeBotoesTarefas(3);

            View startbutton =  findViewById(R.id.OP1_tarefa3_startbutton);
            startbutton.setVisibility(View.GONE);

        }
        if (tarefaAtiva == 4) {

            visibilidadeLayouts(4);

            visibilidadeBotoesTarefas(4);

            View startbutton =  findViewById(R.id.OP1_tarefa4_startbutton);
            startbutton.setVisibility(View.GONE);

        }
        if (tarefaAtiva == 5) {

            visibilidadeLayouts(5);

            visibilidadeBotoesTarefas(5);

            View startbutton =  findViewById(R.id.OP1_tarefa5_startbutton);
            startbutton.setVisibility(View.GONE);

        }

        if (tarefaAtiva == 6) {

            visibilidadeLayouts(6);

            visibilidadeBotoesTarefas(6);

            View startbutton =  findViewById(R.id.OP1_tarefa6_startbutton);
            startbutton.setVisibility(View.GONE);

        }

        if (tarefaAtiva == 7) {

            visibilidadeLayouts(7);

            visibilidadeBotoesTarefas(7);

            View startbutton = findViewById(R.id.OP1_tarefa7_startbutton);
            startbutton.setVisibility(View.GONE);

        }

        if (tarefaAtiva == 8) {

            visibilidadeLayouts(8);

            visibilidadeBotoesTarefas(8);

            View startbutton =  findViewById(R.id.OP1_tarefa8_startbutton);
            startbutton.setVisibility(View.GONE);

        }
        if (tarefaAtiva == 9) {

            visibilidadeLayouts(9);

            visibilidadeBotoesTarefas(9);

            View startbutton =  findViewById(R.id.OP1_tarefa9_startbutton);
            startbutton.setVisibility(View.GONE);

        }
        if (tarefaAtiva == 10) {

            visibilidadeLayouts(10);

            visibilidadeBotoesTarefas(10);

            View startbutton =  findViewById(R.id.OP1_tarefa10_startbutton);
            startbutton.setVisibility(View.GONE);

        }

        if (tarefaAtiva == 11) {

            visibilidadeLayouts(11);

            visibilidadeBotoesTarefas(11);

            View startbutton =  findViewById(R.id.OP1_tarefa11_startbutton);
            startbutton.setVisibility(View.GONE);

        }
        if (tarefaAtiva == 12) {

            visibilidadeLayouts(12);

            visibilidadeBotoesTarefas(12);

            View startbutton =  findViewById(R.id.OP1_tarefa12_startbutton);
            startbutton.setVisibility(View.GONE);

        }
    }

    //Layouts das tarefas visiveis por numero de tarefa
    private void visibilidadeLayouts(int layoutTarefa) {

        View tarefa = findViewById(R.id.layoutOP1_Tarefa);
        tarefa.setVisibility(View.GONE);
        View tarefa1 = findViewById(R.id.layoutOP1_Tarefa1);
        tarefa1.setVisibility(View.GONE);
        View tarefa2 = findViewById(R.id.layoutOP1_Tarefa2);
        tarefa2.setVisibility(View.GONE);
        View tarefa3 = findViewById(R.id.layoutOP1_Tarefa3);
        tarefa3.setVisibility(View.GONE);
        View tarefa4 = findViewById(R.id.layoutOP1_Tarefa4);
        tarefa4.setVisibility(View.GONE);
        View tarefa5 = findViewById(R.id.layoutOP1_Tarefa5);
        tarefa5.setVisibility(View.GONE);
        View tarefa6 = findViewById(R.id.layoutOP1_Tarefa6);
        tarefa6.setVisibility(View.GONE);
        View tarefa7 = findViewById(R.id.layoutOP1_Tarefa7);
        tarefa7.setVisibility(View.GONE);
        View tarefa8 = findViewById(R.id.layoutOP1_Tarefa8);
        tarefa8.setVisibility(View.GONE);
        View tarefa9 = findViewById(R.id.layoutOP1_Tarefa9);
        tarefa9.setVisibility(View.GONE);
        View tarefa10 = findViewById(R.id.layoutOP1_Tarefa10);
        tarefa10.setVisibility(View.GONE);
        View tarefa11 = findViewById(R.id.layoutOP1_Tarefa11);
        tarefa11.setVisibility(View.GONE);
        View tarefa12 = findViewById(R.id.layoutOP1_Tarefa12);
        tarefa12.setVisibility(View.GONE);

        if (layoutTarefa == 0) {
            tarefa.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 1) {
            tarefa1.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 2) {
            tarefa2.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 3) {
            tarefa3.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 4) {
            tarefa4.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 5) {
            tarefa5.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 6) {
            tarefa6.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 7) {
            tarefa7.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 8) {
            tarefa8.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 9) {
            tarefa9.setVisibility(View.VISIBLE);
        }
        if (layoutTarefa == 10) {
            tarefa10.setVisibility(View.VISIBLE);
        }

        if (layoutTarefa == 11) {
            tarefa11.setVisibility(View.VISIBLE);
        }
        if (layoutTarefa == 12) {
            tarefa12.setVisibility(View.VISIBLE);
        }

    }



    public void mudarNomeLogin() {

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabAName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabAName());
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabBName()) {
            mudarNomeTextView(GlobalVab.getInstance().getColabBName());
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabCName()) {
            mudarNomeTextView(GlobalVab.getInstance().getColabCName());
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabDName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabDName());
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabEName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabEName());
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabFName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabFName());
        }

        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabGName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabGName());
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabHName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabHName());
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabIName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabIName());
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabJName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabJName());
        }
        if (GlobalVab.getInstance().getStringName() == GlobalVab.getInstance().getColabKName()) {
            mudarNomeTextView (GlobalVab.getInstance().getColabKName());
        }
    }

        private void mudarNomeTextView (String nome) {

            TextView loginColab = (TextView) findViewById(R.id.logoutTextTarefa);
            TextView loginColabTarefa1 = (TextView) findViewById(R.id.logoutTextTarefa1);
            TextView loginColabTarefa2 = (TextView) findViewById(R.id.logoutTextTarefa2);
            TextView loginColabTarefa3 = (TextView) findViewById(R.id.logoutTextTarefa3);
            TextView loginColabTarefa4 = (TextView) findViewById(R.id.logoutTextTarefa4);
            TextView loginColabTarefa5 = (TextView) findViewById(R.id.logoutTextTarefa5);
            TextView loginColabTarefa6 = (TextView) findViewById(R.id.logoutTextTarefa6);
            TextView loginColabTarefa7 = (TextView) findViewById(R.id.logoutTextTarefa7);
            TextView loginColabTarefa8 = (TextView) findViewById(R.id.logoutTextTarefa8);
            TextView loginColabTarefa9 = (TextView) findViewById(R.id.logoutTextTarefa9);
            TextView loginColabTarefa10 = (TextView) findViewById(R.id.logoutTextTarefa10);
            TextView loginColabTarefa11 = (TextView) findViewById(R.id.logoutTextTarefa11);
            TextView loginColabTarefa12 = (TextView) findViewById(R.id.logoutTextTarefa12);

            Button opbutton=(Button)findViewById(R.id.OP1button);
            opbutton.setText("OP "+ GlobalVab.getInstance().getOP1());

            loginColab.setText(nome);
            loginColabTarefa1.setText(nome);
            loginColabTarefa2.setText(nome);
            loginColabTarefa3.setText(nome);
            loginColabTarefa4.setText(nome);
            loginColabTarefa5.setText(nome);
            loginColabTarefa6.setText(nome);
            loginColabTarefa7.setText(nome);
            loginColabTarefa8.setText(nome);
            loginColabTarefa9.setText(nome);
            loginColabTarefa10.setText(nome);
            loginColabTarefa11.setText(nome);
            loginColabTarefa12.setText(nome);
        }
}
