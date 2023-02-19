package com.example.planilladeargentina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Declaramos los objetos
    RecyclerView Inicial;
    Spinner Lista;
    List<PlanillaArgentina> DaleCampeon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Establecemos las referencias
        Inicial = findViewById(R.id.RVDatos);
        Lista = findViewById(R.id.tvPosc);
        // Creamos los datos que almacenará el spinner.
        String[] Qatar = {"Seleccione", "Porteros", "Defensas", "Mediocampistas", "Delanteros"};
        // Creamos un ArrayAdapter tipo String le establecemos la variable y seguidamente del
        // nombre de los datos que le daremos al spinner.
        ArrayAdapter<String> Jugadores26 = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Qatar);
        // Lista es el spinner y le establecemos como parametro la variable del ArrayAdapter.
        Lista.setAdapter(Jugadores26);
        // Utilizamos el ID del spinner y lo establecemos con un propiedad que nos permita si el
        // usuario selecciona un dato del spinner mostrará datos si se encuentran
        Lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Si encuentra datos de la selección del usuario
                // llamamos el método que almacena las opciones del spinner
                Todos();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Lo dejamos vació.
            }
        });
        }
    // Creamos un método
    // Al darle clic en la flecha a la par del número 49 se mostrará el código completo
    // con comentarios de que se obtiene el método.
    public void Todos(){
        // Declaramos una variable tipo String
        String op;
        // Si la variable de tipo String va hacer igual
        // al Spinner y obtenermos los datos que almacena establecemos
        // lo siguiente.
        op = Lista.getSelectedItem().toString();
        // Establecemos un switch
        switch (op){
            // Si la persona selecciona el dato tipo String,
            // escoge "Seleccione" entra en el caso "Seleccione",
            // Se mostrarán todos los jugadores.
            case "Seleccione":
                // Creamos un arreglo
                DaleCampeon = new ArrayList<>();
                // Le añadimos los datos, tanto los datos del AdaptadorPlantilla Argentina,
                // como también los de la clase creada PlanillaArgentina.
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.dibu,
                                        "Dibu Martinez",
                                        "Aston Villa",
                                        "Portero",
                                        "25",
                                        "2 de Septiembre de 1992",
                                        "Argentina")
                        );
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.rulli,
                                        "Gerónimo Rulli",
                                        "Ajax",
                                        "Portero",
                                        "12",
                                        "20 de Mato de 1992",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.armani,
                                        "Franco Armani",
                                        "River Plate",
                                        "Portero",
                                        "1",
                                        "16 de Octubre de 1986",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.nicolas,
                                        "Nicolás Tagliafico",
                                        "Olympique de Lyon",
                                        "Lateral Izquierdo",
                                        "3",
                                        "31 de Agosto de 1992",
                                        "Argentina"));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.nahuel,
                                        "Nahuel Molina",
                                        "Atlético De Madrid",
                                        "Lateral Derecho",
                                        "26",
                                        "6 de Abril de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.montiel,
                                        "Gonzalo Montiel",
                                        "Sevilla F.C",
                                        "Lateral Derecho",
                                        "4",
                                        "1 De Enero de 1997",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.foyth,
                                        "Juan Foyth",
                                        "Villarreal C.F",
                                        "Lateral Derecho",
                                        "2",
                                        "12 de Enero de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.pezzella,
                                        "Germán Pezzella",
                                        "Real Betis",
                                        "Defensa Central",
                                        "6",
                                        "27 de Junio de 1991",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.lisandro,
                                        "Lisandro MArtínez",
                                        "Manchester United",
                                        "Defensa central",
                                        "25",
                                        "18 de Enero de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.cuti,
                                        "Cristian Romero",
                                        "Tottenham Hotspurt",
                                        "Defensa Central",
                                        "13",
                                        "27 de Abril de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.otamendi,
                                        "Nicolás Otamendi",
                                        "S.L Benfica",
                                        "Defensa Central",
                                        "19",
                                        "12 de Febrero de 1988",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.marcos,
                                        "Marcos Acuña",
                                        "Sevilla F.C",
                                        "Lateral Izquierdo",
                                        "8",
                                        "28 de Noviembre de 1991",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.enzo,
                                        "Enzo Fernández",
                                        "Chelsea F.C",
                                        "Mediocampista",
                                        "24",
                                        "17 de Enero de 2001",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.depaul,
                                        "Rodrigo De Paul",
                                        "Atlético De Madrid",
                                        "Centrocampista",
                                        "7",
                                        "2 de Mayo de 1994",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.alexis,
                                        "Alexis Mac Allister",
                                        "Brighton H.A",
                                        "Centrocampista",
                                        "20",
                                        "24 de Diciembre de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.paredes,
                                        "Leandro Paredes",
                                        "Juventus",
                                        "Centrocampista",
                                        "5",
                                        "29 de Junio de 1994",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.guido,
                                        "Guido Rodríguez",
                                        "Real Betis",
                                        "Centrocampista",
                                        "18",
                                        "12 de Abril de 1994",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.exequiel,
                                        "Exequiel Palacios",
                                        "Bayern Leverkusen",
                                        "Mediocampista",
                                        "14",
                                        "5 de Octubre de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.papu,
                                        "Alejandro Gómez",
                                        "Sevilla F.C",
                                        "Extremo Izquierdo",
                                        "17",
                                        "15 de Febrero de 1988",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.almada,
                                        "Thiago Almada",
                                        "Atlanta United",
                                        "Extremo Izquierdo",
                                        "16",
                                        "26 de Abril de 2001",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.dimaria,
                                        "Ángel Di María",
                                        "Juventus",
                                        "Extremo Derecho",
                                        "11",
                                        "14 de Febrero de 1988",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.dybala,
                                        "Paulo Dybala",
                                        "A.S Roma",
                                        "Delantero",
                                        "21",
                                        "15 de Noviembre de 1993",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.angel,
                                        "Ángel Correa",
                                        "Atlético De Madrid",
                                        "Delantero",
                                        "15",
                                        "9 de Marzo de 1995",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.julian,
                                        "Julían Álvarez",
                                        "Manchester City",
                                        "Delantero",
                                        "9",
                                        "31 de Enero de 2000",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.lautaro,
                                        "Lautaro Martínez",
                                        "Inter De Milán",
                                        "Delantero",
                                        "22",
                                        "22 de Agosto de 1997",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.messi,
                                        "Lionel Messi",
                                        "Paris Saint G.",
                                        "Delantero",
                                        "10",
                                        "24 de Junio de 1987",
                                        "Argentina"
                                ));
                // Añadimos un break para romper o salir del bloque del case "Seleccione"
                break;
                // Siguiente caso si la persona escoge porteros,
                // solo se mostrará los porteros
            case "Porteros":
                // Se vacia el arreglo y no almacena nada
                DaleCampeon.isEmpty();
                // Se crea un nuevo arreglo
                DaleCampeon = new ArrayList<>();
                // Se añaden los datos
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.dibu,
                                        "Dibu Martinez",
                                        "Aston Villa",
                                        "Portero",
                                        "25",
                                        "2 de Septiembre de 1992",
                                        "Argentina")
                        );
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.rulli,
                                        "Gerónimo Rulli",
                                        "Ajax",
                                        "Portero",
                                        "12",
                                        "20 de Mato de 1992",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.armani,
                                        "Franco Armani",
                                        "River Plate",
                                        "Portero",
                                        "1",
                                        "16 de Octubre de 1986",
                                        "Argentina"
                                ));
                // Añadimos un break para romper o salir del bloque del case "Porteros"
                break;
            // Siguiente caso si la persona escoge Defensas,
            // solo se mostrará los defensas
            case "Defensas":
                // Se vacia el arreglo y no almacena nada
                DaleCampeon.isEmpty();
                // Se crea un nuevo arreglo
                DaleCampeon = new ArrayList<>();
                // Se añaden los datos al arreglo
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.otamendi,
                                        "Nicolás Otamendi",
                                        "S.L Benfica",
                                        "Defensa Central",
                                        "19",
                                        "14 de Febrero de 1993 ",
                                        "A-rgentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.nicolas,
                                        "Nicolás Tagliafico",
                                        "Olympique de Lyon",
                                        "Lateral Izquierdo",
                                        "3",
                                        "31 de Agosto de 1992",
                                        "Argentina"));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.nahuel,
                                        "Nahuel Molina",
                                        "Atlético De Madrid",
                                        "Lateral Derecho",
                                        "26",
                                        "6 de Abril de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.montiel,
                                        "Gonzalo Montiel",
                                        "Sevilla F.C",
                                        "Lateral Derecho",
                                        "4",
                                        "1 De Enero de 1997",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.foyth,
                                        "Juan Foyth",
                                        "Villarreal C.F",
                                        "Lateral Derecho",
                                        "2",
                                        "12 de Enero de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.pezzella,
                                        "Germán Pezzella",
                                        "Real Betis",
                                        "Defensa Central",
                                        "6",
                                        "27 de Junio de 1991",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.lisandro,
                                        "Lisandro Martínez",
                                        "Manchester United",
                                        "Defensa central",
                                        "25",
                                        "18 de Enero de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.cuti,
                                        "Cristian Romero",
                                        "Tottenham Hotspurt",
                                        "Defensa Central",
                                        "13",
                                        "27 de Abril de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.marcos,
                                        "Marcos Acuña",
                                        "Sevilla F.C",
                                        "Lateral Izquierdo",
                                        "8",
                                        "28 de Noviembre de 1991",
                                        "Argentina"
                                ));
                // Añadimos un break para romper o salir del bloque del case "Defensas"
                break;
            // Siguiente caso si la persona escoge Mediocampistas,
            // solo se mostrará los Mediocampistas
            case "Mediocampistas":
                // Se vacia el arreglo
                DaleCampeon.isEmpty();
                // Se crea un arreglo
                DaleCampeon = new ArrayList<>();
                // Se añaden los datos al arreglo
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.enzo,
                                        "Enzo Fernández",
                                        "Chelsea F.C",
                                        "Mediocampista",
                                        "24",
                                        "17 de Enero de 2001",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.depaul,
                                        "Rodrigo De Paul",
                                        "Atlético De Madrid",
                                        "Centrocampista",
                                        "7",
                                        "2 de Mayo de 1994",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.alexis,
                                        "Alexis Mac Allister",
                                        "Brighton H.A",
                                        "Centrocampista",
                                        "20",
                                        "24 de Diciembre de 1998",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.paredes,
                                        "Leandro Paredes",
                                        "Juventus",
                                        "Centrocampista",
                                        "5",
                                        "29 de Junio de 1994",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.guido,
                                        "Guido Rodríguez",
                                        "Real Betis",
                                        "Centrocampista",
                                        "18",
                                        "12 de Abril de 1994",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.exequiel,
                                        "Exequiel Palacios",
                                        "Bayern Leverkusen",
                                        "Mediocampista",
                                        "14",
                                        "5 de Octubre de 1998",
                                        "Argentina"
                                ));
                // Añadimos un break para romper o salir del bloque del case "Mediocampistas"
                break;
            // Siguiente caso si la persona escoge Delanteros,
            // solo se mostrará los Delanteros.
            case "Delanteros":
                DaleCampeon.isEmpty();
                DaleCampeon = new ArrayList<>();
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.papu,
                                        "Alejandro Gómez",
                                        "Sevilla F.C",
                                        "Extremo Izquierdo",
                                        "17",
                                        "15 de Febrero de 1988",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.almada,
                                        "Thiago Almada",
                                        "Atlanta United",
                                        "Extremo Izquierdo",
                                        "16",
                                        "26 de Abril de 2001",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.dimaria,
                                        "Ángel Di María",
                                        "Juventus",
                                        "Extremo Derecho",
                                        "11",
                                        "14 de Febrero de 1988",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.dybala,
                                        "Paulo Dybala",
                                        "A.S Roma",
                                        "Delantero",
                                        "21",
                                        "15 de Noviembre de 1993",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.angel,
                                        "Ángel Correa",
                                        "Atlético De Madrid",
                                        "Delantero",
                                        "15",
                                        "9 de Marzo de 1995",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.julian,
                                        "Julían Álvarez",
                                        "Manchester City",
                                        "Delantero",
                                        "9",
                                        "31 de Enero de 2000",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.lautaro,
                                        "Lautaro Martínez",
                                        "Inter De Milán",
                                        "Delantero",
                                        "22",
                                        "22 de Agosto de 1997",
                                        "Argentina"
                                ));
                DaleCampeon.add
                        (new PlanillaArgentina
                                (R.drawable.messi,
                                        "Lionel Messi",
                                        "Paris Saint G.",
                                        "Delantero",
                                        "10",
                                        "24 de Junio de 1987",
                                        "Argentina"
                                ));
                // Añadimos un break para romper o salir del bloque del case "Delanteros"
                break;
        }
        AdaptadorPlanillaArgentina Nuevo = new AdaptadorPlanillaArgentina(DaleCampeon, this);
        Inicial.setHasFixedSize(true);
        Inicial.setLayoutManager(new LinearLayoutManager(this));
        Inicial.setAdapter(Nuevo);
        }
    }
