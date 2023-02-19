package com.example.planilladeargentina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPlanillaArgentina extends RecyclerView.Adapter<AdaptadorPlanillaArgentina.ViewHolder> {
    // Declaramos las variables globales
    List<PlanillaArgentina> MiEquipo;
    LayoutInflater MiInflaterARG;
    Context Campeones;

    // Constructor de cada variable global
    public AdaptadorPlanillaArgentina(List<PlanillaArgentina> miEquipo, Context campeones) {
        MiEquipo = miEquipo;
        MiInflaterARG = LayoutInflater.from(campeones);
        Campeones = campeones;
    }

    @NonNull
    @Override
    public AdaptadorPlanillaArgentina.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Devolveremos la interfaz de nuestra plantilla.
        View DaleCampeon = MiInflaterARG.inflate(R.layout.planilla_argentina, null);
        return new  AdaptadorPlanillaArgentina.ViewHolder(DaleCampeon);
    }

    // Pinta los valores cada vez que se recicle la vista
    @Override
    public void onBindViewHolder(@NonNull AdaptadorPlanillaArgentina.ViewHolder holder, int position) {
        holder.binData(MiEquipo.get(position));
    }

    // Devuelve la cantidad de registros del adaptador
    @Override
    public int getItemCount() {
        return MiEquipo.size();
    }
    // Creamos la subclase para el ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{
        // Declaramos los objetos
        ImageView Foto;
        TextView Nombre,Equipo,Posicion,Dorsal,Fecha,Lugar;
        // Constructor al ViewHolder y lo que mostrará
        ViewHolder(View Plantilla){
            super(Plantilla);
            // Establecemos las referencias que creamos en la subclase
            Foto = Plantilla.findViewById(R.id.ImagenJugador);
            Nombre = Plantilla.findViewById(R.id.txNombre);
            Equipo = Plantilla.findViewById(R.id.txEquipo);
            Posicion = Plantilla.findViewById(R.id.txPosicion);
            Dorsal = Plantilla.findViewById(R.id.txDorsal);
            Fecha = Plantilla.findViewById(R.id.txNacimiento);
            Lugar = Plantilla.findViewById(R.id.txNacionalidad);
        }
        // Creamos el método que nos permitirá cambiar los valores en tiempo de
        // ejecución
         public void binData(final PlanillaArgentina ElEquipo){
            // Asignamos valores a los datos a cada referencia creada en la subclase
            Foto.setImageResource(ElEquipo.getMostrarFoto());
            Nombre.setText(ElEquipo.getMostrarNombre());
            Equipo.setText(ElEquipo.getMostrarEquipo());
            Posicion.setText(ElEquipo.getMostrarPosicion());
            Dorsal.setText(ElEquipo.getMostrarNumero());
            Fecha.setText(ElEquipo.getMostrarNacimiento());
            Lugar.setText(ElEquipo.getNacionalidad());
        }
    }
}
