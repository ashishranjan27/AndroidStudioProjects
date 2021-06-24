package com.example.rvadddeleteupdate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.gson.Gson
import org.json.JSONException
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var models = ArrayList<Model>()
    lateinit var rvTechSolPoint: RecyclerView
    var rvAdapter: RvAdapter? = null
    lateinit var tvAdd: TextView
    var tvUpdate: TextView? = null
    var etEnterName: EditText? = null
    var position = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvTechSolPoint = findViewById(R.id.rv_list_item) //recycler view
        etEnterName = findViewById(R.id.et_enter_name) //jaha par name likhe ho
        tvAdd = findViewById(R.id.tv_add) //Add button
        //        tvUpdate = findViewById(R.id.tv_update);     //jo nahi samjhe


        //Setting it as true doesn't mean that the RecyclerView size is fixed, just means it won't change because of change in the adapter content.
        // For example the RecyclerView size can change because of a size change on its parent. setHasFixedSize() is used to let the RecyclerView keep the same size.
        rvTechSolPoint.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvTechSolPoint.setLayoutManager(layoutManager)


        /*new RvAdapter.Onclick() {
            @Override
            public void onEvent(Model model, int pos) {
                position = pos;
                tvUpdate.setVisibility(View.VISIBLE);
                etEnterName.setText(model.getName());
            }
        }*/rvAdapter = RvAdapter(applicationContext, models)
        rvTechSolPoint.setAdapter(rvAdapter)
        tvAdd.setOnClickListener(this)
        //        tvUpdate.setOnClickListener(this);
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.tv_add -> {
                insertMethod(etEnterName!!.text.toString())
                etEnterName!!.setText("")
            }
        }
    }

    private fun insertMethod(name: String) {
        val gson = Gson()
        try {
            val jsonObject = JSONObject()
            jsonObject.put("name", name)
            val model = gson.fromJson(jsonObject.toString(), Model::class.java)
            models.add(0, model)

            //add at the top
            //models.add(0,model);
            rvAdapter!!.notifyDataSetChanged()


//            public void addQuestion(Question question){
//                this.questionList.add(0, question);
//                notifyItemInserted(0);
//                mRecyclerView.smoothScrollToPosition(0);
//            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }
}