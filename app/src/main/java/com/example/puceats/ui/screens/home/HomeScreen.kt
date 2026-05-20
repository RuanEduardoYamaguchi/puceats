package com.example.puceats.ui.screens.home

// Layouts do Compose
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import android.R.attr.top
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset


// Preview
import androidx.compose.ui.tooling.preview.Preview
// Material Design
import androidx.compose.material3.Text
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import android.R.attr.fontWeight

// Compose
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

// Modifier
import androidx.compose.ui.Modifier

// Image modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import com.example.puceats.R

// Cores
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle

// Unidade de tamanho
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun HomeScreen() {
    Column( //Coluna primária (tela inteira)
        modifier = Modifier
            .fillMaxSize() //Ocupa full size ne
            .background(Color(0xFFF5F5F5)) //cor de fundo

    ) {
        Column(

            modifier = Modifier

                // Ocupa largura máxima
                .fillMaxWidth()

                // Altura do header
                .height(180.dp)

                // Cor vermelha
                .background(Color(0xFF700303)),

            // Centraliza horizontalmente os filhos
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            // Linha horizontal para logo + texto
            Row(

                modifier = Modifier

                    // Ocupa largura máxima
                    .fillMaxWidth()

                    // Espaçamento superior
                    .padding(top = 24.dp),

                // Centraliza horizontalmente os itens da Row
                horizontalArrangement = Arrangement.Center,

                // Alinha verticalmente logo e texto
                verticalAlignment = Alignment.CenterVertically
            ) {

                // LOGO
                Image(

                    // Imagem do drawable
                    painter = painterResource(id = R.drawable.logopuceats),

                    // Acessibilidade
                    contentDescription = "Logo do PucEats",

                    modifier = Modifier

                        // Tamanho da logo
                        .size(120.dp)
                )

                // TEXTO
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold

                            )
                        ){
                            append("PUC")

                        }
                    }
                )
            }
        }
    }
}