package xyz.phyoekhant.padc_week2.views.pods;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;
import xyz.phyoekhant.padc_week2.R;
import xyz.phyoekhant.padc_week2.controllers.BaseController;
import xyz.phyoekhant.padc_week2.controllers.DetailController;


/**
 * Created by Phyoe Khant on 6/14/17.
 */
public class ViewPodDetail extends LinearLayout {

    @BindView(R.id.circleView)
    CircleImageView circleView;

    private DetailController mController;

    public ViewPodDetail(Context context) {
        super(context);
    }

    public ViewPodDetail(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPodDetail(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ViewPodDetail(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        ButterKnife.bind(this,this);

    }

    public void setController(BaseController controller){
        mController = (DetailController) controller;
    }

    @OnClick(R.id.btn_check)
    public void onClick(View view){
        mController.onTapCheckaAvailability();
    }
}
