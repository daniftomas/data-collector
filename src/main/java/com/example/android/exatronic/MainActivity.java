package com.example.android.exatronic;

        import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mudarNomesBotoes();
        }



    // fazer Login e sacar o nome do colaborador.
    public void colabA (View view) {

        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabAName());

        fazerLogin(GlobalVab.getInstance().getTarefaColabA(),GlobalVab.getInstance().getOPiniciadaA());
    }

    public void colabB (View view){

        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabBName());

        fazerLogin(GlobalVab.getInstance().getTarefaColabB(),GlobalVab.getInstance().getOPiniciadaB());

    }
    public void colabC (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabCName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabC(),GlobalVab.getInstance().getOPiniciadaC());

    }
    public void colabD (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabDName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabD(), GlobalVab.getInstance().getOPiniciadaD());

    }
    public void colabE (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabEName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabE(),GlobalVab.getInstance().getOPiniciadaE());
    }
    public void colabF (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabFName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabF(),GlobalVab.getInstance().getOPiniciadaF());
    }
    public void colabG (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabGName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabG(),GlobalVab.getInstance().getOPiniciadaG());

    }
    public void colabH (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabHName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabH(),GlobalVab.getInstance().getOPiniciadaH());

    }
    public void colabI (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabIName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabI(),GlobalVab.getInstance().getOPiniciadaI());

    }
    public void colabJ (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabJName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabJ(),GlobalVab.getInstance().getOPiniciadaJ());

    }
    public void colabK (View view){

        //usar o singleton
        GlobalVab.getInstance().setStringName(GlobalVab.getInstance().getColabKName());

        //decidir caminho pa login que necessita da confirmação de inicio de atividade
        fazerLogin(GlobalVab.getInstance().getTarefaColabK(), GlobalVab.getInstance().getOPiniciadaK());

    }


    // VERIFICAR SE O COLAB ESTÁ ATIVO

    private void fazerLogin (int atividade, int OP){

        if (atividade == 0) {
            //Ir para a atividade escolha de OP
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        else {
            if (OP==1) {
                Intent intent = new Intent(this, ActivityTarefasOP1.class);
                startActivity(intent);
            }
            if (OP==2) {
                Intent intent = new Intent(this, ActivityTarefasOP2.class);
                startActivity(intent);
            }

            if (OP==3) {
                Intent intent = new Intent(this, ActivityTarefasOP3.class);
                startActivity(intent);
            }

            if (OP==4) {
                Intent intent = new Intent(this, ActivityTarefasOP4.class);
                startActivity(intent);
            }
            if (OP==5) {
                Intent intent = new Intent(this, ActivityTarefasOP5.class);
                startActivity(intent);
            }
            if (OP==6) {
                Intent intent = new Intent(this, ActivityTarefasOP6.class);
                startActivity(intent);
            }

            if (OP==7) {
                Intent intent = new Intent(this, ActivityTarefasOP7.class);
                startActivity(intent);
            }

            if (OP==8) {
                Intent intent = new Intent(this, ActivityTarefasOP8.class);
                startActivity(intent);
            }

            if (OP==9) {
               Intent intent = new Intent(this, ActivityTarefasOP9.class);
               startActivity(intent);
            }
        }
        finish();
    }

    //mudar nomes dos botoes dos colabs
    public void mudarNomesBotoes (){

        Button colabA = (Button) findViewById(R.id.colabA);
        colabA.setText(GlobalVab.getInstance().getColabAName());

        Button colabB = (Button) findViewById(R.id.colabB);
        colabB.setText(GlobalVab.getInstance().getColabBName());

        Button colabC = (Button) findViewById(R.id.colabC);
        colabC.setText(GlobalVab.getInstance().getColabCName());

        Button colabD = (Button) findViewById(R.id.colabD);
        colabD.setText(GlobalVab.getInstance().getColabDName());

        Button colabE = (Button) findViewById(R.id.colabE);
        colabE.setText(GlobalVab.getInstance().getColabEName());

        Button colabF = (Button) findViewById(R.id.colabF);
        colabF.setText(GlobalVab.getInstance().getColabFName());

        Button colabG = (Button) findViewById(R.id.colabG);
        colabG.setText(GlobalVab.getInstance().getColabGName());

        Button colabH = (Button) findViewById(R.id.colabH);
        colabH.setText(GlobalVab.getInstance().getColabHName());

        Button colabI = (Button) findViewById(R.id.colabI);
        colabI.setText(GlobalVab.getInstance().getColabIName());

        Button colabJ = (Button) findViewById(R.id.colabJ);
        colabJ.setText(GlobalVab.getInstance().getColabJName());

        Button colabK = (Button) findViewById(R.id.colabK);
        colabK.setText(GlobalVab.getInstance().getColabKName());

    }

}
