package xyz.phyoekhant.padc_week2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.phyoekhant.padc_week2.R;

public class HomeActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this, this);
    }

    @OnClick(R.id.btn_detail)
    public void onClick(View view){
        navigateToDetail();
    }

    private void navigateToDetail(){
        Intent intent = DetailActivity.newIntent();
        startActivity(intent);
    }
}
