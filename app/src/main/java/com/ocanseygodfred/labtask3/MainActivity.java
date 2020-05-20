package com.ocanseygodfred.labtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static heading Heading;
    public Button [][] buttons;
    public static final int SIDE = 8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChessGUI();



    }



    private void ChessGUI() {

        Heading = new heading();



        Point size= new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w=size.x / SIDE;

        GridLayout gridLayout= new GridLayout(this);
        gridLayout.setBackgroundColor(Color.rgb(111,111,111));
        gridLayout.setPadding(0,200,0,65);
        gridLayout.setColumnCount(SIDE);
        gridLayout.setRowCount(SIDE);




        buttons=new Button[SIDE][SIDE];



        for(int row = 0; row<SIDE; row++){
            for(int col = 0; col<SIDE; col++){
                buttons[row][col]= new Button(this);
                gridLayout.addView(buttons[row][col],w ,w);
                buttons[row][col].setTextColor(Color.GREEN);
                buttons[row] [col].setTextSize(26);
            }
        }


            colorization();



        setContentView(gridLayout);

        buttons[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              colorization();

                buttons[1][3].setBackgroundColor(Color.GREEN); buttons[1][3].setTextColor(Color.BLACK);
                buttons[2][2].setBackgroundColor(Color.GREEN);
                buttons[2][0].setBackgroundColor(Color.GREEN);
            }
        });

        buttons[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorization();

                buttons[2][7].setBackgroundColor(Color.GREEN); buttons[1][4].setTextColor(Color.BLACK);
                buttons[2][5].setBackgroundColor(Color.GREEN);
                buttons[1][4].setBackgroundColor(Color.GREEN);
            }
        });

         buttons[7][1].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 colorization();
                 buttons[5][0].setBackgroundColor(Color.GREEN); buttons[6][3].setTextColor(Color.BLACK);
                 buttons[5][2].setBackgroundColor(Color.GREEN);
                 buttons[6][3].setBackgroundColor(Color.GREEN);
             }
         });

         buttons[7][6].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 colorization();
                 buttons[6][4].setBackgroundColor(Color.GREEN); buttons[6][4].setTextColor(Color.BLACK);
                 buttons[5][5].setBackgroundColor(Color.GREEN);
                 buttons[5][7].setBackgroundColor(Color.GREEN);
             }
         });



    }

    public void colorization() {
        buttons[0][0].setBackgroundColor(Color.BLACK);
        buttons[0][0].setText(Heading.rook);
        buttons[0][1].setBackgroundColor(Color.WHITE);
        buttons[0][1].setText(Heading.knight);
        buttons[0][2].setBackgroundColor(Color.BLACK);
        buttons[0][2].setText(Heading.bishop);
        buttons[0][3].setBackgroundColor(Color.WHITE);
        buttons[0][3].setText(Heading.queen);
        buttons[0][4].setBackgroundColor(Color.BLACK);
        buttons[0][4].setText(Heading.king);
        buttons[0][5].setBackgroundColor(Color.WHITE);
        buttons[0][5].setText(Heading.bishop);
        buttons[0][6].setBackgroundColor(Color.BLACK);
        buttons[0][6].setText(Heading.knight);
        buttons[0][7].setBackgroundColor(Color.WHITE);
        buttons[0][7].setText(Heading.rook);

        buttons[1][0].setBackgroundColor(Color.WHITE);
        buttons[1][0].setText(Heading.pawn);
        buttons[1][1].setBackgroundColor(Color.BLACK);
        buttons[1][1].setText(Heading.pawn);
        buttons[1][2].setBackgroundColor(Color.WHITE);
        buttons[1][2].setText(Heading.pawn);
        buttons[1][3].setBackgroundColor(Color.BLACK);
        buttons[1][3].setText(Heading.pawn);
        buttons[1][4].setBackgroundColor(Color.WHITE);
        buttons[1][4].setText(Heading.pawn);
        buttons[1][5].setBackgroundColor(Color.BLACK);
        buttons[1][5].setText(Heading.pawn);
        buttons[1][6].setBackgroundColor(Color.WHITE);
        buttons[1][6].setText(Heading.pawn);
        buttons[1][7].setBackgroundColor(Color.BLACK);
        buttons[1][7].setText(Heading.pawn);

        buttons[2][0].setBackgroundColor(Color.BLACK);
        buttons[2][1].setBackgroundColor(Color.WHITE);
        buttons[2][2].setBackgroundColor(Color.BLACK);
        buttons[2][3].setBackgroundColor(Color.WHITE);
        buttons[2][4].setBackgroundColor(Color.BLACK);
        buttons[2][5].setBackgroundColor(Color.WHITE);
        buttons[2][6].setBackgroundColor(Color.BLACK);
        buttons[2][7].setBackgroundColor(Color.WHITE);

        buttons[3][0].setBackgroundColor(Color.WHITE);
        buttons[3][1].setBackgroundColor(Color.BLACK);
        buttons[3][2].setBackgroundColor(Color.WHITE);
        buttons[3][3].setBackgroundColor(Color.BLACK);
        buttons[3][4].setBackgroundColor(Color.WHITE);
        buttons[3][5].setBackgroundColor(Color.BLACK);
        buttons[3][6].setBackgroundColor(Color.WHITE);
        buttons[3][7].setBackgroundColor(Color.BLACK);

        buttons[4][0].setBackgroundColor(Color.BLACK);
        buttons[4][1].setBackgroundColor(Color.WHITE);
        buttons[4][2].setBackgroundColor(Color.BLACK);
        buttons[4][3].setBackgroundColor(Color.WHITE);
        buttons[4][4].setBackgroundColor(Color.BLACK);
        buttons[4][5].setBackgroundColor(Color.WHITE);
        buttons[4][6].setBackgroundColor(Color.BLACK);
        buttons[4][7].setBackgroundColor(Color.WHITE);

        buttons[5][0].setBackgroundColor(Color.WHITE);
        buttons[5][1].setBackgroundColor(Color.BLACK);
        buttons[5][2].setBackgroundColor(Color.WHITE);
        buttons[5][3].setBackgroundColor(Color.BLACK);
        buttons[5][4].setBackgroundColor(Color.WHITE);
        buttons[5][5].setBackgroundColor(Color.BLACK);
        buttons[5][6].setBackgroundColor(Color.WHITE);
        buttons[5][7].setBackgroundColor(Color.BLACK);

        buttons[6][0].setBackgroundColor(Color.BLACK);
        buttons[6][0].setText(Heading.pawn);
        buttons[6][1].setBackgroundColor(Color.WHITE);
        buttons[6][1].setText(Heading.pawn);
        buttons[6][2].setBackgroundColor(Color.BLACK);
        buttons[6][2].setText(Heading.pawn);
        buttons[6][3].setBackgroundColor(Color.WHITE);
        buttons[6][3].setText(Heading.pawn);
        buttons[6][4].setBackgroundColor(Color.BLACK);
        buttons[6][4].setText(Heading.pawn);
        buttons[6][5].setBackgroundColor(Color.WHITE);
        buttons[6][5].setText(Heading.pawn);
        buttons[6][6].setBackgroundColor(Color.BLACK);
        buttons[6][6].setText(Heading.pawn);
        buttons[6][7].setBackgroundColor(Color.WHITE);
        buttons[6][7].setText(Heading.pawn);

        buttons[7][0].setBackgroundColor(Color.WHITE);
        buttons[7][0].setText(Heading.rook);
        buttons[7][1].setBackgroundColor(Color.BLACK);
        buttons[7][1].setText(Heading.knight);
        buttons[7][2].setBackgroundColor(Color.WHITE);
        buttons[7][2].setText(Heading.bishop);
        buttons[7][3].setBackgroundColor(Color.BLACK);
        buttons[7][3].setText(Heading.queen);
        buttons[7][4].setBackgroundColor(Color.WHITE);
        buttons[7][4].setText(Heading.king);
        buttons[7][5].setBackgroundColor(Color.BLACK);
        buttons[7][5].setText(Heading.bishop);
        buttons[7][6].setBackgroundColor(Color.WHITE);
        buttons[7][6].setText(Heading.knight);
        buttons[7][7].setBackgroundColor(Color.BLACK);
        buttons[7][7].setText(Heading.rook);
    }



}
