package sastoque.nicolas.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game extends AppCompatActivity implements View.OnClickListener {

    protected Button btnNuevoJuego,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    protected Button[] tablerofront;

    Object[] tableroback;
    String turno;

    public void nuevoJuego(){
        tableroback = new Object[10];
        for(int i=0; i<10; i++){
            tableroback[i] = "";
        }
        turno = "X";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);

        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        nuevoJuego();

        tablerofront = new Button[]{btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
        for(Button btn : tablerofront){
            btn.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        //do something...
        Button btn = (Button)v;
    }

    public void click(Button btn){
        int x = 0;
        btn.setText(turno);

        switch (btn.getId()){
            case R.id.btn1:
                tableroback[1] = turno;
                break;
            case R.id.btn2:
                tableroback[2] = turno;
                break;
            case R.id.btn3:
                tableroback[3] = turno;
                break;

            case R.id.btn4:
                tableroback[4] = turno;
                break;
            case R.id.btn5:
                tableroback[5] = turno;
                break;
            case R.id.btn6:
                tableroback[6] = turno;
                break;

            case R.id.btn7:
                tableroback[7] = turno;
                break;
            case R.id.btn8:
                tableroback[8] = turno;
                break;
            case R.id.btn9:
                tableroback[9] = turno;
                break;
        }

        if(turno == "X"){
            turno = "O";
        }
        else{
            turno = "X";
        }

        btn.setClickable(true);
    }
}

