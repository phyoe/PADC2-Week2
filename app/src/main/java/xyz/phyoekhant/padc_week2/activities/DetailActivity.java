package xyz.phyoekhant.padc_week2.activities;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.phyoekhant.padc_week2.MyApp;
import xyz.phyoekhant.padc_week2.R;
import xyz.phyoekhant.padc_week2.controllers.DetailController;
import xyz.phyoekhant.padc_week2.views.pods.ViewPodDetail;

public class DetailActivity extends BaseActivity implements DetailController {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.img_detail)
    ImageView imgDetail;

    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;

    @BindView(R.id.vp_detail)
    ViewPodDetail viewPodDetail;

    public static Intent newIntent(){
        Intent intent = new Intent(MyApp.getContext(), DetailActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //collapsingToolbar.setTitle(getString(R.string.app_name));
        Glide.with(imgDetail.getContext())
                .load(R.drawable.bg_sakura)
                .fitCenter()
                .placeholder(R.drawable.img_preview)
                .error(R.drawable.img_preview)
                .into(imgDetail);

        viewPodDetail.setController(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favourite) {

            Toast.makeText(MyApp.getContext(), R.string.action_favourite, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_share) {

            Toast.makeText(MyApp.getContext(), R.string.action_share, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapCheckaAvailability() {
        Toast.makeText(MyApp.getContext(), R.string.str_check, Toast.LENGTH_SHORT).show();
    }
}
