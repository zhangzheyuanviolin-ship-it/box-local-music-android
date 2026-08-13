            package p000;

            import android.view.View;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class lI1o0o0 {
                public static final OO1li00iOO I00000oIO(View view) {
/* 8 */             OO1li00iOO oO1li00iOO = (OO1li00iOO) view.getTag(R.id.pooling_container_listener_holder_tag);
/* 10 */            if (oO1li00iOO != null) {
/* 77 */                return oO1li00iOO;
                    }
/* 14 */            OO1li00iOO oO1li00iOO2 = new OO1li00iOO();
/* 22 */            oO1li00iOO2.I00000oIO = new ArrayList();
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            view.setTag(R.id.pooling_container_listener_holder_tag, oO1li00iOO2);
/* 77 */            return oO1li00iOO2;
                }
            }
