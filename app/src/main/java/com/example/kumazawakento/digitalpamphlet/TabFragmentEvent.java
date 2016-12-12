package com.example.kumazawakento.digitalpamphlet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.kumazawakento.digitalpamphlet.EventInfo;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TabFragmentEvent.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TabFragmentEvent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabFragmentEvent extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TabFragmentEvent() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param page Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment TabFragmentEvent.
     */
    // TODO: Rename and change types and number of parameters
    public static TabFragmentEvent newInstance(int page) {
        TabFragmentEvent fragment = new TabFragmentEvent();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //mParam1 = getArguments().getString(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_fragment_event, container, false);
        ListView listView = (ListView)view.findViewById(R.id.listView1);
        // 追加するアイテムを生成する
        final String[] eventTitle = {"リアル謎解き探索ゲーム", "カラオケ大会", "ビンゴ大会",
                "ヒーローショー","フレンドパーク","ゆるキャラ", "能の演舞・体験", "押し花", "ダンスパフォーマンス",
                "地域・他大学模擬店", "フリーマーケット"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1);
        for(int i=0;i<eventTitle.length;i++){
            adapter.add(eventTitle[i]);

        }
        listView.setAdapter(adapter);

        //リスト項目が選択された時のイベントを追加
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String msg = position + "番目のアイテムがクリックされました";
                //Toast.makeText(getActivity().getApplicationContext(),msg, Toast.LENGTH_SHORT).show();

                // Fragmentを作成します
                Bundle bundle = new Bundle();
                bundle.putInt("position", position);
                EventFragment fragment = new EventFragment();
                fragment.setArguments(bundle);
                // Fragmentの追加や削除といった変更を行う際は、Transactionを利用します
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                // 新しく追加を行うのでaddを使用します
                // 他にも、メソッドにはreplace removeがあります
                // メソッドの1つ目の引数は対象のViewGroupのID、2つ目の引数は追加するfragment
                transaction.add(R.id.container, fragment);
                //transaction.add(R.id.container, fragment);
                // 最後にcommitを使用することで変更を反映します
                transaction.commit();

            }
        });


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update ar gument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void makeEventView(int i, View v){
        TextView name = (TextView)v.findViewById(R.id.textView1);
        TextView text = (TextView)v.findViewById(R.id.textView2);
        ImageView image = (ImageView)v.findViewById(R.id.imageView1);

        name.setText(EventInfo.getEventName(i));
        text.setText(EventInfo.getEventText(i));
        image.setImageDrawable(EventInfo.getImageRes(i,v));

    }

}
