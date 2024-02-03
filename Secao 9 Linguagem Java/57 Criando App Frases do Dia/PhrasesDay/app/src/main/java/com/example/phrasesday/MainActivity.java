package com.example.phrasesday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void renderNewPhrase(View view) {
        String[] phrases = {
                "A cada manhã, somos renascidos. O que fazemos hoje importa mais do que ontem.",
                "O segredo para ter um dia incrível está em começar com pensamentos positivos.",
                "Cada novo dia é uma página em branco no seu livro da vida. Escreva uma história inspiradora.",
                "A jornada de mil milhas começa com um simples passo. Que o seu dia seja repleto de passos determinados.",
                "A felicidade não é algo pronto. Ela vem das suas próprias ações. Faça hoje algo que te faça feliz.",
                "Acredite nas possibilidades de hoje, porque cada dia traz consigo novas oportunidades.",
                "Você é mais forte do que pensa e mais capaz do que imagina. Acredite em si mesmo.",
                "O otimismo é a fé que leva à realização. Mantenha-se positivo e conquiste seus objetivos.",
                "Cada manhã é uma dádiva, uma chance de recomeçar e fazer melhor do que ontem.",
                "A vida é curta, não perca tempo com arrependimentos. Aproveite cada momento e faça deste dia memorável."
        };

        TextView text = findViewById(R.id.textViewPhrase);
        Random random = new Random();
        text.setText(phrases[random.nextInt(phrases.length - 1)]);
    }
}