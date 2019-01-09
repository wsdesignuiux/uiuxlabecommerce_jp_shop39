package e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop39.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.Shop_39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.model.Comment_model_Shop39;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyCommentHolder> {

    private final ArrayList<Comment_model_Shop39> commentArrayList;
    private final Context context;

    public CommentAdapter(Context context, ArrayList<Comment_model_Shop39> commentArrayList) {
            this.commentArrayList=commentArrayList;
            this.context=context;
    }

    @NonNull
    @Override
    public MyCommentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(context).inflate(R.layout.item_comment,viewGroup,false);
        return new MyCommentHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCommentHolder myCommentHolder, int i) {

        myCommentHolder.commenter_name.setText(commentArrayList.get(i).getCommenter_name());
        myCommentHolder.commenter_image.setImageResource(commentArrayList.get(i).getCommenter_image());
        myCommentHolder.comment_time.setText(commentArrayList.get(i).getComment_time());
        myCommentHolder.comment.setText(commentArrayList.get(i).getComment());


        if(i==1){
            myCommentHolder.comment_image2.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return commentArrayList.size();
    }

    class MyCommentHolder extends RecyclerView.ViewHolder{
        ImageView commenter_image,comment_image2;
        TextView commenter_name,comment_time,comment;
        public MyCommentHolder(@NonNull View itemView) {
            super(itemView);
            commenter_image=itemView.findViewById(R.id.commenter_image);
            commenter_name=itemView.findViewById(R.id.commenter_name);
            comment_time=itemView.findViewById(R.id.comment_time);
            comment=itemView.findViewById(R.id.comment);
            comment_image2=itemView.findViewById(R.id.comment_image2);

        }
    }
}
