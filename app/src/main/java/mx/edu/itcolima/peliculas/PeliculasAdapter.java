package mx.edu.itcolima.peliculas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by macbookprolate2011 on 11/03/16.
 */
public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder>
{
    public List<PeliculasModel> peliculasModelList;

    public PeliculasAdapter(List<PeliculasModel> peliculasModelList) {
        this.peliculasModelList = peliculasModelList;
    }

    @Override
    public PeliculasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        PeliculasViewHolder pv = new PeliculasViewHolder(v);

        return pv;
    }

    @Override
    public void onBindViewHolder(PeliculasViewHolder holder, int position) {
        holder.imagen.setImageResource(peliculasModelList.get(position).getImagen());
        holder.nombre.setText(peliculasModelList.get(position).getNombre());
        holder.vistos.setText(peliculasModelList.get(position).getVistos());

    }

    @Override
    public int getItemCount() {
        return peliculasModelList.size();
    }


    public class PeliculasViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView nombre;
        TextView vistos;

        public PeliculasViewHolder(final View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            vistos = (TextView) itemView.findViewById(R.id.vistas);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(itemView.getContext(),"pelicula: "+
                            nombre.getText().toString(),Toast.LENGTH_LONG).show();

                }
            });

        }
    }







}
