package com.example.android.exatronic;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mudarNomeLogin();
    }




    //FAZER LOG OUT
    public void logout (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    public void goToActivityTarefasOP1 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP1.class);
        startActivity(intent);
        finish();

    }
    public void goToActivityTarefasOP2 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP2.class);
        startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP3 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP3.class);
        startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP4 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP4.class);
        startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP5 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP5.class);
        startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP6 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP6.class);
        startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP7 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP7.class);
        startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP8 (View view){
       Intent intent = new Intent (this, ActivityTarefasOP8.class);
       startActivity(intent);
        finish();
    }

    public void goToActivityTarefasOP9 (View view){
        Intent intent = new Intent (this, ActivityTarefasOP9.class);
        startActivity(intent);
        finish();
    }


    //mostrar layout do modelo
    public void showOP1 (View view) {
        View thing = findViewById(R.id.layoutOP1);
        visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op1_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP2 (View view) {
        View thing = findViewById(R.id.layoutOP2);
        visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op2_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP3 (View view) {
        View thing = findViewById(R.id.layoutOP3);
        visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op3_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }
    public void showOP4 (View view) {
        View thing = findViewById(R.id.layoutOP4);
        visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op4_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP5 (View view) {
       View thing = findViewById(R.id.layoutOP5);
       visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op5_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP6 (View view) {
        View thing = findViewById(R.id.layoutOP6);
        visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op6_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP7 (View view) {
        View thing = findViewById(R.id.layoutOP7);
        visibilidadeOP(thing);
        Button Bop =(Button) findViewById(R.id.op7_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP8 (View view) {
       View thing = findViewById(R.id.layoutOP8);
       visibilidadeOP(thing);
       Button Bop =(Button) findViewById(R.id.op8_menu);
        Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void showOP9 (View view) {
        View thing = findViewById(R.id.layoutOP9);
        visibilidadeOP(thing);
      Button Bop =(Button) findViewById(R.id.op9_menu);
       Bop.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    private void visibilidadeOP (View view){


        View thing = findViewById(R.id.layoutMainOP);
        thing.setVisibility(View.GONE);
        View thing1 = findViewById(R.id.layoutOP1);
        thing1.setVisibility(View.GONE);
        View thing2 = findViewById(R.id.layoutOP2);
        thing2.setVisibility(View.GONE);
        View thing3 = findViewById(R.id.layoutOP3);
        thing3.setVisibility(View.GONE);
        View thing4 = findViewById(R.id.layoutOP4);
        thing4.setVisibility(View.GONE);
        View thing5 = findViewById(R.id.layoutOP5);
        thing5.setVisibility(View.GONE);
        View thing6 = findViewById(R.id.layoutOP6);
        thing6.setVisibility(View.GONE);
        View thing7 = findViewById(R.id.layoutOP7);
        thing7.setVisibility(View.GONE);

        View thing8 = findViewById(R.id.layoutOP8);
        thing8.setVisibility(View.GONE);
        View thing9 = findViewById(R.id.layoutOP9);
        thing9.setVisibility(View.GONE);

        Button Bop1 =(Button) findViewById(R.id.op1_menu);
        Button Bop2 =(Button) findViewById(R.id.op2_menu);
        Button Bop3 =(Button) findViewById(R.id.op3_menu);
        Button Bop4 =(Button) findViewById(R.id.op4_menu);
        Button Bop5 =(Button) findViewById(R.id.op5_menu);
        Button Bop6 =(Button) findViewById(R.id.op6_menu);
        Button Bop7 =(Button) findViewById(R.id.op7_menu);
        Button Bop8 =(Button) findViewById(R.id.op8_menu);
        Button Bop9 =(Button) findViewById(R.id.op9_menu);

        Bop1.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop2.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop3.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop4.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop5.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop6.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop7.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop8.setBackgroundColor(Color.parseColor("#C5CAE9"));
        Bop9.setBackgroundColor(Color.parseColor("#C5CAE9"));

        view.setVisibility(View.VISIBLE);
    }

    public void mudarNomeLogin (){
        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabAName()) {
            mudarTextView(GlobalVab.getInstance().getColabAName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabBName()) {
            mudarTextView(GlobalVab.getInstance().getColabBName());

        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabCName()) {
            mudarTextView(GlobalVab.getInstance().getColabCName());

        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabDName()) {
            mudarTextView(GlobalVab.getInstance().getColabDName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabEName()) {
            mudarTextView(GlobalVab.getInstance().getColabEName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabFName()) {
            mudarTextView(GlobalVab.getInstance().getColabFName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabGName()) {
            mudarTextView(GlobalVab.getInstance().getColabGName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabHName()) {
           mudarTextView(GlobalVab.getInstance().getColabHName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabIName()) {
            mudarTextView(GlobalVab.getInstance().getColabIName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabJName()) {
            mudarTextView(GlobalVab.getInstance().getColabJName());
        }

        if(GlobalVab.getInstance().getStringName()== GlobalVab.getInstance().getColabKName()) {
            mudarTextView(GlobalVab.getInstance().getColabKName());
        }
    }

    private void mudarTextView ( String nome){

        TextView loginColab =(TextView)findViewById(R.id.logoutTextOP);
        TextView loginColabOP1 =(TextView)findViewById(R.id.logoutTextOP1);
        TextView loginColabOP2 =(TextView)findViewById(R.id.logoutTextOP2);
        TextView loginColabOP3 =(TextView)findViewById(R.id.logoutTextOP3);
        TextView loginColabOP4 =(TextView)findViewById(R.id.logoutTextOP4);
        TextView loginColabOP5 =(TextView)findViewById(R.id.logoutTextOP5);
        TextView loginColabOP6 =(TextView)findViewById(R.id.logoutTextOP6);
        TextView loginColabOP7 =(TextView)findViewById(R.id.logoutTextOP7);
        TextView loginColabOP8 =(TextView)findViewById(R.id.logoutTextOP8);
        TextView loginColabOP9 =(TextView)findViewById(R.id.logoutTextOP9);

        loginColab.setText(nome);
        loginColabOP1.setText(nome);
        loginColabOP2.setText(nome);
        loginColabOP3.setText(nome);
        loginColabOP4.setText(nome);
        loginColabOP5.setText(nome);
        loginColabOP6.setText(nome);
        loginColabOP7.setText(nome);
        loginColabOP8.setText(nome);
        loginColabOP9.setText(nome);

        Button op1button=(Button)findViewById(R.id.op1_menu);
        op1button.setText("OP "+ GlobalVab.getInstance().getOP1());

        Button op2button=(Button)findViewById(R.id.op2_menu);
        op2button.setText("OP "+ GlobalVab.getInstance().getOP2());

        Button op3button=(Button)findViewById(R.id.op3_menu);
        op3button.setText("OP "+ GlobalVab.getInstance().getOP3());

        Button op4button=(Button)findViewById(R.id.op4_menu);
        op4button.setText("OP "+ GlobalVab.getInstance().getOP4());

        Button op5button=(Button)findViewById(R.id.op5_menu);
        op5button.setText("OP "+ GlobalVab.getInstance().getOP5());

        Button op6button=(Button)findViewById(R.id.op6_menu);
        op6button.setText("OP "+ GlobalVab.getInstance().getOP6());

        Button op7button=(Button)findViewById(R.id.op7_menu);
        op7button.setText("OP "+ GlobalVab.getInstance().getOP7());

        Button op8button=(Button)findViewById(R.id.op8_menu);
        op8button.setText("OP "+ GlobalVab.getInstance().getOP8());

        Button op9button=(Button)findViewById(R.id.op9_menu);
        op9button.setText("OP "+ GlobalVab.getInstance().getOP9());
    }
}
