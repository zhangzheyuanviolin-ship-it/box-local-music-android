            package p000;

            import android.app.Dialog;
            import android.content.Context;
            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
/* 6 */     public class IOiOOll1 extends Dialog implements O0oiOi, OIOoOIolI, OII0l00, OiIoOoIi01 {
                public O0oiiOll0O1 I00iOIl;
                public final IIlio101Io I00iiI;
                public final OllO00oiil I00iiO;
                public final OllO00oiil I00iio;

                public IOiOOll1(Context context, int i) {
/* 1 */             super(context, i);
/* 10 */            OIOo1iiI oIOo1iiI = new OIOo1iiI(21);
/* 13 */            oIOo1iiI.I00iiI = this;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            II1oo0l11IOI iI1oo0l11IOI = new II1oo0l11IOI();
/* 21 */            iI1oo0l11IOI.I0000O = this;
/* 23 */            iI1oo0l11IOI.I0000oI00 = oIOo1iiI;
/* 32 */            iI1oo0l11IOI.I0001Ioi1lo = new lolOiIoiillI(15);
/* 39 */            iI1oo0l11IOI.I000II = new LinkedHashMap();
/* 42 */            iI1oo0l11IOI.I0000Il00O = true;
/* 44 */            VarHandle.storeStoreFence();
/* 51 */            IIlio101Io iIlio101Io = new IIlio101Io(24);
/* 54 */            iIlio101Io.I00iiI = iI1oo0l11IOI;
/* 60 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(25);
/* 63 */            i1I0i0Ilo1Oi.I00iiI = iI1oo0l11IOI;
/* 65 */            VarHandle.storeStoreFence();
/* 68 */            iIlio101Io.I00iiO = i1I0i0Ilo1Oi;
/* 70 */            VarHandle.storeStoreFence();
/* 73 */            this.I00iiI = iIlio101Io;
/* 78 */            IOiOOli iOiOOli = new IOiOOli(0);
/* 81 */            iOiOOli.I00iiI = this;
/* 83 */            VarHandle.storeStoreFence();
/* 91 */            this.I00iiO = new OllO00oiil(iOiOOli);
/* 95 */            IOiOOli iOiOOli2 = new IOiOOli(1);
/* 98 */            iOiOOli2.I00iiI = this;
/* 100 */           VarHandle.storeStoreFence();
/* 108 */           this.I00iio = new OllO00oiil(iOiOOli2);
                }

                public static final void I0000oI00(IOiOOll1 iOiOOll1) {
/* 1 */             super.onBackPressed();
                }

                @Override
                public final iOliil I00000oIO() {
/* 9 */             return I00000oOI().I00000oOI().I0000Il00O;
                }

                @Override
                public final OIOoO1IOIo I00000oOI() {
/* 7 */             return (OIOoO1IOIo) this.I00iio.getValue();
                }

                public final O0oiiOll0O1 I0000Il00O() {
/* 1 */             O0oiiOll0O1 o0oiiOll0O1 = this.I00iOIl;
/* 3 */             if (o0oiiOll0O1 != null) {
/* 20 */                return o0oiiOll0O1;
                    }
/* 8 */             O0oiiOll0O1 o0oiiOll0O12 = new O0oiiOll0O1(this, true);
/* 11 */            this.I00iOIl = o0oiiOll0O12;
/* 20 */            return o0oiiOll0O12;
                }

                public final void I0000O() {
/* 12 */            getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
/* 26 */            getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
/* 40 */            getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
/* 54 */            getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
                }

                @Override
                public final I1I0i0Ilo1Oi I000O01llI0() {
/* 5 */             return (I1I0i0Ilo1Oi) this.I00iiI.I00iiO;
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             return I0000Il00O();
                }

                @Override
                public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             I0000O();
/* 4 */             super.addContentView(view, layoutParams);
                }

                @Override
                public final void onBackPressed() {
/* 9 */             ((Iii11o1) this.I00iiO.getValue()).I00000oIO();
                }

                @Override
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 12 */            I00000oOI().I0000Il00O(getOnBackInvokedDispatcher());
/* 17 */            this.I00iiI.I00oo1iO0ll(bundle);
/* 26 */            I0000Il00O().I010iIIOlo(O0oOOiI0.ON_CREATE);
                }

                @Override
                public final Bundle onSaveInstanceState() {
/* 1 */             Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
/* 7 */             this.I00iiI.I00ooIo0(bundleOnSaveInstanceState);
/* 20 */            return bundleOnSaveInstanceState;
                }

                @Override
                public final void onStart() {
/* 1 */             super.onStart();
/* 10 */            I0000Il00O().I010iIIOlo(O0oOOiI0.ON_RESUME);
                }

                @Override
                public void onStop() {
/* 7 */             I0000Il00O().I010iIIOlo(O0oOOiI0.ON_DESTROY);
/* 11 */            this.I00iOIl = null;
/* 13 */            super.onStop();
                }

                @Override
                public void setContentView(int i) {
/* 1 */             I0000O();
/* 4 */             super.setContentView(i);
                }

                @Override
/* 7 */         public void setContentView(View view) {
/* 8 */             I0000O();
/* 9 */             super.setContentView(view);
                }

                @Override
/* 9 */         public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 10 */            I0000O();
/* 11 */            super.setContentView(view, layoutParams);
                }
            }
