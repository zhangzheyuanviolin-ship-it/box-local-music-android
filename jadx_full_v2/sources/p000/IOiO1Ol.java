            package p000;

            import android.app.Activity;
            import android.app.PictureInPictureUiState;
            import android.content.Intent;
            import android.content.res.Configuration;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Trace;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import com.box.gallery.R;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CopyOnWriteArraySet;
            
/* 19 */    public abstract class IOiO1Ol extends Activity implements Oool1Ii0I, Io1IOII0lo, OiIoOoIi01, OIOoOIolI, OII0l00, I0IOio, OIOoll110I0, O0oiOi, O0O1l1 {
                public O0oiiOll0O1 I00iOIl;
                public IOoi01o I00iiI;
                public IOO000ilo I00iiO;
                public IIlio101Io I00iio;
                public Oool0l1iOIOl I00ilI0I1;
                public IOiO11OOiliI I00ilO0;
                public OllO00oiil I00io1l;
                public IOiO1IOloOiO I00ioIO;
                public CopyOnWriteArrayList I00l0I0l0lO1;
                public CopyOnWriteArrayList I00l0OO0IO;
                public CopyOnWriteArrayList I00li1OI;
                public CopyOnWriteArrayList I00ll1;
                public CopyOnWriteArrayList I00lli11;
                public CopyOnWriteArrayList I00lll10;
                public CopyOnWriteArrayList I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public boolean I00o101lO;
                public OllO00oiil I00oI0i;
                public OllO00oiil I00oII;
                public OllO00oiil I00oIiI10;

                public static final void I000o00OoI0I(Ill0oOi0 ill0oOi0) {
                    try {
/* 1 */                 super.onBackPressed();
                    } catch (IllegalStateException e) {
/* 31 */                if (!O0000Ioio00.I0000O(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
/* 77 */                    throw e;
                        }
                    } catch (NullPointerException e2) {
/* 16 */                if (!O0000Ioio00.I0000O(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
/* 19 */                    throw e2;
                        }
                    }
                }

                @Override
                public final iOliil I00000oIO() {
/* 9 */             return I00000oOI().I00000oOI().I0000Il00O;
                }

                @Override
                public final OIOoO1IOIo I00000oOI() {
/* 7 */             return (OIOoO1IOIo) this.I00oIiI10.getValue();
                }

                @Override
                public Oool0IIIO0o I0000O() {
/* 7 */             return (Oool0IIIO0o) this.I00oII.getValue();
                }

                @Override
                public final OI0l1OOllOo I0000oI00() {
/* 4 */             OI0l1OOllOo oI0l1OOllOo = new OI0l1OOllOo(0);
/* 11 */            if (getApplication() != null) {
/* 19 */                oI0l1OOllOo.I00000oOI(Oool01i.I0000O, getApplication());
                    }
/* 24 */            oI0l1OOllOo.I00000oOI(OiIoII10il0.I00000oIO, this);
/* 29 */            oI0l1OOllOo.I00000oOI(OiIoII10il0.I00000oOI, this);
/* 32 */            Intent intent = getIntent();
/* 43 */            Bundle extras = intent != null ? intent.getExtras() : null;
/* 44 */            if (extras != null) {
/* 48 */                oI0l1OOllOo.I00000oOI(OiIoII10il0.I0000Il00O, extras);
                    }
/* 55 */            return oI0l1OOllOo;
                }

                @Override
                public final IOiO1IOloOiO I0001Ioi1lo() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public final Oool0l1iOIOl I000II() {
/* 5 */             if (getApplication() == null) {
/* 37 */                I000II.I001IO000("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
/* 40 */                return null;
                    }
/* 7 */             Oool0l1iOIOl oool0l1iOIOl = this.I00ilI0I1;
/* 9 */             if (oool0l1iOIOl != null) {
/* 34 */                return oool0l1iOIOl;
                    }
/* 15 */            IOiO100Oil iOiO100Oil = (IOiO100Oil) getLastNonConfigurationInstance();
/* 17 */            if (iOiO100Oil != null) {
/* 21 */                this.I00ilI0I1 = iOiO100Oil.I00000oIO;
                    }
/* 23 */            Oool0l1iOIOl oool0l1iOIOl2 = this.I00ilI0I1;
/* 25 */            if (oool0l1iOIOl2 != null) {
/* 34 */                return oool0l1iOIOl2;
                    }
/* 29 */            Oool0l1iOIOl oool0l1iOIOl3 = new Oool0l1iOIOl();
/* 32 */            this.I00ilI0I1 = oool0l1iOIOl3;
/* 34 */            return oool0l1iOIOl3;
                }

                @Override
                public final I1I0i0Ilo1Oi I000O01llI0() {
/* 5 */             return (I1I0i0Ilo1Oi) this.I00iio.I00iiO;
                }

                @Override
                public final void I000OOo1O(IOo1llI iOo1llI) {
/* 3 */             this.I00l0I0l0lO1.add(iOo1llI);
                }

                @Override
                public final void I000OiO(IOo1llI iOo1llI) {
/* 3 */             this.I00l0I0l0lO1.remove(iOo1llI);
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             return this.I00iOIl;
                }

                public final void I000l1(OIOooIoo1Ii oIOooIoo1Ii) {
/* 1 */             IOoi01o iOoi01o = this.I00iiI;
/* 7 */             if (((IOiO1Ol) iOoi01o.I00000oOI) != null) {
/* 9 */                 oIOooIoo1Ii.I00000oIO();
                    }
/* 16 */            ((CopyOnWriteArraySet) iOoi01o.I00000oIO).add(oIOooIoo1Ii);
                }

                public final void I000lI() {
/* 12 */            getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
/* 26 */            getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
/* 40 */            getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
/* 54 */            getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
/* 68 */            getWindow().getDecorView().setTag(R.id.report_drawn, this);
/* 82 */            getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
                }

                public final void I000oI1ioi(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             int i = Oi011o.I00iOIl;
/* 6 */             Oi011OII.I00000oOI(this);
                }

                public final void I00100l0(Bundle bundle) {
/* 5 */             this.I00iOIl.I010l10O(O0oOi0I.I00iiO);
/* 8 */             super.onSaveInstanceState(bundle);
                }

                @Override
                public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             I000lI();
/* 14 */            this.I00ilO0.I00000oIO(getWindow().getDecorView());
/* 17 */            super.addContentView(view, layoutParams);
                }

                @Override
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 5 */             getWindow().getDecorView();
/* 8 */             WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 10 */            return super.dispatchKeyEvent(keyEvent);
                }

                @Override
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
/* 5 */             getWindow().getDecorView();
/* 8 */             WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 10 */            return super.dispatchKeyShortcutEvent(keyEvent);
                }

                @Override
                public void onActivityResult(int i, int i2, Intent intent) {
/* 7 */             if (this.I00ioIO.I00000oIO(i, i2, intent)) {
/* 98 */                return;
                    }
/* 9 */             super.onActivityResult(i, i2, intent);
                }

                @Override
                public final void onBackPressed() {
/* 9 */             ((Iii11o1) this.I00oI0i.getValue()).I00000oIO();
                }

                @Override
                public void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 6 */             Iterator it = this.I00l0I0l0lO1.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                ((IOo1llI) it.next()).accept(configuration);
                    }
                }

                @Override
                public void onCreate(Bundle bundle) {
/* 3 */             this.I00iio.I00oo1iO0ll(bundle);
/* 6 */             IOoi01o iOoi01o = this.I00iiI;
/* 8 */             iOoi01o.I00000oOI = this;
/* 14 */            Iterator it = ((CopyOnWriteArraySet) iOoi01o.I00000oIO).iterator();
/* 22 */            while (it.hasNext()) {
/* 30 */                ((OIOooIoo1Ii) it.next()).I00000oIO();
                    }
/* 34 */            I000oI1ioi(bundle);
/* 37 */            int i = Oi011o.I00iOIl;
/* 39 */            Oi011OII.I00000oOI(this);
/* 48 */            getPackageManager().hasSystemFeature("android.software.picture_in_picture");
                }

                @Override
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             if (i != 0) {
/* 37 */                return true;
                    }
/* 3 */             super.onCreatePanelMenu(i, menu);
/* 6 */             IOO000ilo iOO000ilo = this.I00iiO;
/* 8 */             getMenuInflater();
/* 15 */            Iterator it = ((CopyOnWriteArrayList) iOO000ilo.I00iiO).iterator();
/* 23 */            while (it.hasNext()) {
/* 33 */                ((Ill111iO) it.next()).I00000oIO.I000OiO();
                    }
/* 37 */            return true;
                }

                @Override
                public boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 6 */             if (super.onMenuItemSelected(i, menuItem)) {
/* 5 */                 return true;
                    }
/* 10 */            if (i == 0) {
/* 18 */                Iterator it = ((CopyOnWriteArrayList) this.I00iiO.I00iiO).iterator();
/* 26 */                while (it.hasNext()) {
/* 40 */                    if (((Ill111iO) it.next()).I00000oIO.I000oI1ioi()) {
/* 5 */                         return true;
                            }
                        }
                    }
/* 9 */             return false;
                }

                @Override
                public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
/* 2 */             this.I00o0l1o1o0 = true;
                    try {
/* 5 */                 super.onMultiWindowModeChanged(z, configuration);
/* 8 */                 this.I00o0l1o1o0 = false;
/* 12 */                Iterator it = this.I00ll1.iterator();
/* 20 */                while (it.hasNext()) {
/* 33 */                    ((IOo1llI) it.next()).accept(new OI0iI00(z));
                        }
                    } catch (Throwable th) {
/* 39 */                this.I00o0l1o1o0 = false;
/* 106 */               throw th;
                    }
                }

                @Override
                public void onNewIntent(Intent intent) {
/* 1 */             super.onNewIntent(intent);
/* 6 */             Iterator it = this.I00li1OI.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                ((IOo1llI) it.next()).accept(intent);
                    }
                }

                @Override
                public void onPanelClosed(int i, Menu menu) {
/* 7 */             Iterator it = ((CopyOnWriteArrayList) this.I00iiO.I00iiO).iterator();
/* 15 */            while (it.hasNext()) {
/* 25 */                ((Ill111iO) it.next()).I00000oIO.I00100l0();
                    }
/* 29 */            super.onPanelClosed(i, menu);
                }

                @Override
                public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
/* 2 */             this.I00o101lO = true;
                    try {
/* 5 */                 super.onPictureInPictureModeChanged(z, configuration);
/* 8 */                 this.I00o101lO = false;
/* 12 */                Iterator it = this.I00lli11.iterator();
/* 20 */                while (it.hasNext()) {
/* 33 */                    ((IOo1llI) it.next()).accept(new OO10OoIiIl(z));
                        }
                    } catch (Throwable th) {
/* 39 */                this.I00o101lO = false;
/* 106 */               throw th;
                    }
                }

                @Override
                public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
                    Io1Oioii1111 io1Oioii1111;
/* 1 */             super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
/* 8 */             int i = 14;
/* 10 */            if (Build.VERSION.SDK_INT >= 35) {
/* 14 */                pictureInPictureUiState.isStashed();
/* 1 */                 pictureInPictureUiState.isTransitioningToPip();
/* 20 */                io1Oioii1111 = new Io1Oioii1111(i);
                    } else {
/* 26 */                pictureInPictureUiState.isStashed();
/* 29 */                io1Oioii1111 = new Io1Oioii1111(i);
                    }
/* 34 */            Iterator it = this.I00lll10.iterator();
/* 42 */            while (it.hasNext()) {
/* 50 */                ((IOo1llI) it.next()).accept(io1Oioii1111);
                    }
                }

                @Override
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 1 */             if (i != 0) {
/* 34 */                return true;
                    }
/* 3 */             super.onPreparePanel(i, view, menu);
/* 12 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiO.I00iiO).iterator();
/* 20 */            while (it.hasNext()) {
/* 30 */                ((Ill111iO) it.next()).I00000oIO.I0010o();
                    }
/* 34 */            return true;
                }

                @Override
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 25 */            if (this.I00ioIO.I00000oIO(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
/* 98 */                return;
                    }
/* 27 */            super.onRequestPermissionsResult(i, strArr, iArr);
                }

                @Override
                public final Object onRetainNonConfigurationInstance() {
                    IOiO100Oil iOiO100Oil;
/* 1 */             Oool0l1iOIOl oool0l1iOIOl = this.I00ilI0I1;
/* 3 */             if (oool0l1iOIOl == null && (iOiO100Oil = (IOiO100Oil) getLastNonConfigurationInstance()) != null) {
/* 13 */                oool0l1iOIOl = iOiO100Oil.I00000oIO;
                    }
/* 15 */            if (oool0l1iOIOl == null) {
/* 17 */                return null;
                    }
/* 21 */            IOiO100Oil iOiO100Oil2 = new IOiO100Oil();
/* 24 */            iOiO100Oil2.I00000oIO = oool0l1iOIOl;
/* 55 */            return iOiO100Oil2;
                }

                @Override
                public void onSaveInstanceState(Bundle bundle) {
/* 1 */             O0oiiOll0O1 o0oiiOll0O1 = this.I00iOIl;
/* 3 */             if (o0oiiOll0O1 != null) {
/* 7 */                 o0oiiOll0O1.I010l10O(O0oOi0I.I00iiO);
                    }
/* 10 */            I00100l0(bundle);
/* 15 */            this.I00iio.I00ooIo0(bundle);
                }

                @Override
                public final void onTrimMemory(int i) {
/* 1 */             super.onTrimMemory(i);
/* 6 */             Iterator it = this.I00l0OO0IO.iterator();
/* 14 */            while (it.hasNext()) {
/* 26 */                ((IOo1llI) it.next()).accept(Integer.valueOf(i));
                    }
                }

                @Override
                public final void onUserLeaveHint() {
/* 1 */             super.onUserLeaveHint();
/* 6 */             Iterator it = this.I00o0iI0io1.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                ((Runnable) it.next()).run();
                    }
                }

                @Override
                public final void reportFullyDrawn() {
                    try {
/* 5 */                 if (Trace.isEnabled()) {
/* 9 */                     lOo0I0iOi11O.I00000oIO("reportFullyDrawn() for ComponentActivity");
                        }
/* 12 */                super.reportFullyDrawn();
/* 21 */                IllOIi01iOl illOIi01iOl = (IllOIi01iOl) this.I00io1l.getValue();
                        synchronized (illOIi01iOl.I00000oIO) {
                            try {
/* 27 */                        illOIi01iOl.I00000oOI = true;
/* 31 */                        Iterator it = illOIi01iOl.I0000Il00O.iterator();
/* 39 */                        while (it.hasNext()) {
/* 47 */                            ((IllOOo00lI) it.next()).invoke();
                                }
/* 55 */                        illOIi01iOl.I0000Il00O.clear();
                            } catch (Throwable th) {
/* 64 */                        throw th;
                            }
                        }
                    } finally {
/* 66 */                Trace.endSection();
                    }
                }

                @Override
                public void setContentView(int i) {
/* 1 */             I000lI();
/* 14 */            this.I00ilO0.I00000oIO(getWindow().getDecorView());
/* 17 */            super.setContentView(i);
                }

                @Override
/* 20 */        public void setContentView(View view) {
/* 21 */            I000lI();
/* 22 */            this.I00ilO0.I00000oIO(getWindow().getDecorView());
/* 23 */            super.setContentView(view);
                }

                @Override
/* 23 */        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 24 */            I000lI();
/* 25 */            this.I00ilO0.I00000oIO(getWindow().getDecorView());
/* 26 */            super.setContentView(view, layoutParams);
                }

                @Override
/* 41 */        public final void onMultiWindowModeChanged(boolean z) {
/* 42 */            if (this.I00o0l1o1o0) {
                        return;
                    }
/* 43 */            Iterator it = this.I00ll1.iterator();
                    while (it.hasNext()) {
/* 44 */                ((IOo1llI) it.next()).accept(new OI0iI00(z));
                    }
                }

                @Override
/* 41 */        public final void onPictureInPictureModeChanged(boolean z) {
/* 42 */            if (this.I00o101lO) {
                        return;
                    }
/* 43 */            Iterator it = this.I00lli11.iterator();
                    while (it.hasNext()) {
/* 44 */                ((IOo1llI) it.next()).accept(new OO10OoIiIl(z));
                    }
                }
            }
