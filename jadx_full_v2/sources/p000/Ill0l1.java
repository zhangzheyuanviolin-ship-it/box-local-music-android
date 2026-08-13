            package p000;

            import android.app.Application;
            import android.content.ComponentCallbacks;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.Intent;
            import android.content.res.Configuration;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.ContextMenu;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.Objects;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 27 */    public abstract class Ill0l1 implements ComponentCallbacks, View.OnCreateContextMenuListener, O0oiOi, Oool1Ii0I, Io1IOII0lo, OiIoOoIi01 {
                public static final Object I01101olii = new Object();
                public Bundle I00iiI;
                public SparseArray I00iiO;
                public Bundle I00iio;
                public Bundle I00ilO0;
                public Ill0l1 I00io1l;
                public int I00l0I0l0lO1;
                public boolean I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public int I00o101lO;
                public Ill1OlOOl I00oI0i;
                public Ill0lo1oI0I I00oII;
                public Ill0l1 I00oO101o;
                public int I00oOio10iI1;
                public int I00ol1;
                public String I00olI;
                public boolean I00oli;
                public boolean I00oliIiO01i;
                public boolean I00oo1iO0ll;
                public boolean I00ooiO1I;
                public ViewGroup I00oooO;
                public View I0100i;
                public boolean I0100o111I;
                public Ill0iooiIo I010I0;
                public boolean I010II;
                public LayoutInflater I010OIo1l;
                public boolean I010i10l;
                public String I010iIIOlo;
                public O0oiiOll0O1 I010l10O;
                public IllI1Ilo1l1 I010l1O;
                public OiIol0o I010lI0oi;
                public IIlio101Io I010o0o0oO;
                public final ArrayList I010oio1OO0;
                public final Ill0ilI0o1ol I01101IOlO;
                public int I00iOIl = -1;
                public String I00ilI0I1 = UUID.randomUUID().toString();
                public String I00ioIO = null;
                public Boolean I00l0OO0IO = null;
                public Ill1OlOOl I00oIiI10 = new Ill1OlOOl();
                public final boolean I00ooIo0 = true;
                public boolean I010101Oo1lO = true;
                public O0oOi0I I010ioo = O0oOi0I.I00ilI0I1;
                public final OI0lOii0I I010l1ol111 = new OI0lOii0I();

                public Ill0l1() {
/* 47 */            new AtomicInteger();
/* 55 */            this.I010oio1OO0 = new ArrayList();
/* 59 */            Ill0ilI0o1ol ill0ilI0o1ol = new Ill0ilI0o1ol();
/* 62 */            ill0ilI0o1ol.I00000oIO = this;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            this.I01101IOlO = ill0ilI0o1ol;
/* 69 */            I000oI1ioi();
                }

                public ilioOIIoIi10 I00000oIO() {
/* 3 */             Ill0iliOoOl1 ill0iliOoOl1 = new Ill0iliOoOl1();
/* 6 */             ill0iliOoOl1.I00iOIl = this;
/* 8 */             VarHandle.storeStoreFence();
/* 20 */            return ill0iliOoOl1;
                }

                public final Ill0iooiIo I0000Il00O() {
/* 1 */             Ill0iooiIo ill0iooiIo = this.I010I0;
/* 3 */             if (ill0iooiIo != null) {
/* 55 */                return ill0iooiIo;
                    }
/* 7 */             Ill0iooiIo ill0iooiIo2 = new Ill0iooiIo();
/* 10 */            Object obj = I01101olii;
/* 12 */            ill0iooiIo2.I000II = obj;
/* 14 */            ill0iooiIo2.I000O01llI0 = obj;
/* 16 */            ill0iooiIo2.I000OOo1O = obj;
/* 20 */            ill0iooiIo2.I000OiO = 1.0f;
/* 23 */            ill0iooiIo2.I000iOII = null;
/* 25 */            this.I010I0 = ill0iooiIo2;
/* 55 */            return ill0iooiIo2;
                }

                @Override
                public final Oool0IIIO0o I0000O() {
/* 3 */             Application application = null;
/* 4 */             if (this.I00oI0i == null) {
/* 69 */                I000II.I001IO000("Can't access ViewModels from detached fragment");
/* 3 */                 return null;
                    }
/* 6 */             OiIol0o oiIol0o = this.I010lI0oi;
/* 8 */             if (oiIol0o != null) {
/* 66 */                return oiIol0o;
                    }
/* 14 */            Context applicationContext = I00IioO0OiOi().getApplicationContext();
                    while (true) {
/* 20 */                if (!(applicationContext instanceof ContextWrapper)) {
                            break;
                        }
/* 24 */                if (applicationContext instanceof Application) {
/* 27 */                    application = (Application) applicationContext;
                            break;
                        }
/* 32 */                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
/* 37 */            if (application == null && Ill1OlOOl.I00IOO(3)) {
/* 54 */                Objects.toString(I00IioO0OiOi().getApplicationContext());
                    }
/* 61 */            OiIol0o oiIol0o2 = new OiIol0o(application, this, this.I00ilO0);
/* 64 */            this.I010lI0oi = oiIol0o2;
/* 66 */            return oiIol0o2;
                }

                @Override
                public final OI0l1OOllOo I0000oI00() {
                    Application application;
/* 5 */             Context applicationContext = I00IioO0OiOi().getApplicationContext();
                    while (true) {
/* 11 */                if (!(applicationContext instanceof ContextWrapper)) {
/* 27 */                    application = null;
                            break;
                        }
/* 15 */                if (applicationContext instanceof Application) {
/* 17 */                    application = (Application) applicationContext;
                            break;
                        }
/* 22 */                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
/* 28 */            if (application == null && Ill1OlOOl.I00IOO(3)) {
/* 45 */                Objects.toString(I00IioO0OiOi().getApplicationContext());
                    }
/* 51 */            OI0l1OOllOo oI0l1OOllOo = new OI0l1OOllOo(0);
/* 54 */            if (application != null) {
/* 58 */                oI0l1OOllOo.I00000oOI(Oool01i.I0000O, application);
                    }
/* 63 */            oI0l1OOllOo.I00000oOI(OiIoII10il0.I00000oIO, this);
/* 68 */            oI0l1OOllOo.I00000oOI(OiIoII10il0.I00000oOI, this);
/* 71 */            Bundle bundle = this.I00ilO0;
/* 73 */            if (bundle != null) {
/* 77 */                oI0l1OOllOo.I00000oOI(OiIoII10il0.I0000Il00O, bundle);
                    }
/* 110 */           return oI0l1OOllOo;
                }

                public final Ill0oOi0 I0001Ioi1lo() {
/* 1 */             Ill0lo1oI0I ill0lo1oI0I = this.I00oII;
/* 3 */             if (ill0lo1oI0I == null) {
/* 5 */                 return null;
                    }
/* 7 */             return ill0lo1oI0I.I00iOIl;
                }

                @Override
                public final Oool0l1iOIOl I000II() {
/* 4 */             if (this.I00oI0i == null) {
/* 50 */                I000II.I001IO000("Can't access ViewModels from detached fragment");
/* 3 */                 return null;
                    }
/* 6 */             int iI000l1 = I000l1();
/* 10 */            O0oOi0I o0oOi0I = O0oOi0I.I00iOIl;
/* 13 */            if (iI000l1 == 1) {
/* 44 */                I000II.I001IO000("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
/* 3 */                 return null;
                    }
/* 19 */            HashMap map = this.I00oI0i.I00Io1o110i.I0000O;
/* 27 */            Oool0l1iOIOl oool0l1iOIOl = (Oool0l1iOIOl) map.get(this.I00ilI0I1);
/* 29 */            if (oool0l1iOIOl != null) {
/* 41 */                return oool0l1iOIOl;
                    }
/* 33 */            Oool0l1iOIOl oool0l1iOIOl2 = new Oool0l1iOIOl();
/* 38 */            map.put(this.I00ilI0I1, oool0l1iOIOl2);
/* 41 */            return oool0l1iOIOl2;
                }

                @Override
                public final I1I0i0Ilo1Oi I000O01llI0() {
/* 5 */             return (I1I0i0Ilo1Oi) this.I010o0o0oO.I00iiO;
                }

                public final Ill1OlOOl I000OOo1O() {
/* 3 */             if (this.I00oII != null) {
/* 5 */                 return this.I00oIiI10;
                    }
/* 12 */            IioIoO10iOiI.I000O01llI0(this, "Fragment ", " has not been attached yet.");
/* 15 */            return null;
                }

                public final Context I000OiO() {
/* 1 */             Ill0lo1oI0I ill0lo1oI0I = this.I00oII;
/* 3 */             if (ill0lo1oI0I == null) {
/* 5 */                 return null;
                    }
/* 7 */             return ill0lo1oI0I.I00iiI;
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             return this.I010l10O;
                }

                public final int I000l1() {
/* 1 */             O0oOi0I o0oOi0I = this.I010ioo;
                    return (o0oOi0I == O0oOi0I.I00iiI || this.I00oO101o == null) ? o0oOi0I.ordinal() : Math.min(o0oOi0I.ordinal(), this.I00oO101o.I000l1());
                }

                public final Ill1OlOOl I000lI() {
/* 1 */             Ill1OlOOl ill1OlOOl = this.I00oI0i;
/* 3 */             if (ill1OlOOl != null) {
/* 5 */                 return ill1OlOOl;
                    }
/* 10 */            IioIoO10iOiI.I000O01llI0(this, "Fragment ", " not associated with a fragment manager.");
/* 13 */            return null;
                }

                public final String I000o00OoI0I(int i) {
/* 9 */             return I00IioO0OiOi().getResources().getString(i);
                }

                public final void I000oI1ioi() {
/* 7 */             this.I010l10O = new O0oiiOll0O1(this, true);
/* 15 */            OIOo1iiI oIOo1iiI = new OIOo1iiI(21);
/* 18 */            oIOo1iiI.I00iiI = this;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            II1oo0l11IOI iI1oo0l11IOI = new II1oo0l11IOI();
/* 26 */            iI1oo0l11IOI.I0000O = this;
/* 28 */            iI1oo0l11IOI.I0000oI00 = oIOo1iiI;
/* 37 */            iI1oo0l11IOI.I0001Ioi1lo = new lolOiIoiillI(15);
/* 44 */            iI1oo0l11IOI.I000II = new LinkedHashMap();
/* 46 */            iI1oo0l11IOI.I0000Il00O = true;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            IIlio101Io iIlio101Io = new IIlio101Io(24);
/* 58 */            iIlio101Io.I00iiI = iI1oo0l11IOI;
/* 64 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(25);
/* 67 */            i1I0i0Ilo1Oi.I00iiI = iI1oo0l11IOI;
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            iIlio101Io.I00iiO = i1I0i0Ilo1Oi;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            this.I010o0o0oO = iIlio101Io;
/* 80 */            this.I010lI0oi = null;
/* 82 */            ArrayList arrayList = this.I010oio1OO0;
/* 84 */            Ill0ilI0o1ol ill0ilI0o1ol = this.I01101IOlO;
/* 90 */            if (arrayList.contains(ill0ilI0o1ol)) {
/* 110 */               return;
                    }
/* 94 */            if (this.I00iOIl >= 0) {
/* 96 */                ill0ilI0o1ol.I00000oIO();
                    } else {
/* 100 */               arrayList.add(ill0ilI0o1ol);
                    }
                }

                public final void I00100l0() {
/* 1 */             I000oI1ioi();
/* 6 */             this.I010iIIOlo = this.I00ilI0I1;
/* 16 */            this.I00ilI0I1 = UUID.randomUUID().toString();
/* 19 */            this.I00li1OI = false;
/* 21 */            this.I00ll1 = false;
/* 23 */            this.I00lli11 = false;
/* 25 */            this.I00lll10 = false;
/* 27 */            this.I00o0iI0io1 = false;
/* 29 */            this.I00o101lO = 0;
/* 32 */            this.I00oI0i = null;
/* 39 */            this.I00oIiI10 = new Ill1OlOOl();
/* 41 */            this.I00oII = null;
/* 43 */            this.I00oOio10iI1 = 0;
/* 45 */            this.I00ol1 = 0;
/* 47 */            this.I00olI = null;
/* 49 */            this.I00oli = false;
/* 51 */            this.I00oliIiO01i = false;
                }

                public final boolean I00100o1O0lo() {
                    return this.I00oII != null && this.I00li1OI;
                }

                public final boolean I0010I0i() {
/* 3 */             if (this.I00oli) {
/* 27 */                return true;
                    }
/* 5 */             Ill1OlOOl ill1OlOOl = this.I00oI0i;
/* 8 */             if (ill1OlOOl != null) {
/* 10 */                Ill0l1 ill0l1 = this.I00oO101o;
/* 12 */                ill1OlOOl.getClass();
/* 23 */                if (ill0l1 == null ? false : ill0l1.I0010I0i()) {
/* 27 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                public final boolean I0010o() {
                    return this.I00o101lO > 0;
                }

                public void I00111O() {
/* 2 */             this.I00ooiO1I = true;
                }

                public void I001IIilI0O(int i, int i2, Intent intent) {
/* 6 */             if (Ill1OlOOl.I00IOO(2)) {
/* 8 */                 toString();
/* 11 */                Objects.toString(intent);
                    }
                }

                public void I001IO000(Context context) {
/* 2 */             this.I00ooiO1I = true;
/* 4 */             Ill0lo1oI0I ill0lo1oI0I = this.I00oII;
/* 12 */            if ((ill0lo1oI0I == null ? null : ill0lo1oI0I.I00iOIl) != null) {
/* 14 */                this.I00ooiO1I = true;
                    }
                }

                public void I001i1O0Ol(Bundle bundle) {
                    Parcelable parcelable;
/* 2 */             this.I00ooiO1I = true;
/* 5 */             if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
/* 17 */                this.I00oIiI10.I00OIO1(parcelable);
/* 20 */                Ill1OlOOl ill1OlOOl = this.I00oIiI10;
/* 22 */                ill1OlOOl.I00II0oii1o = false;
/* 24 */                ill1OlOOl.I00IO1 = false;
/* 28 */                ill1OlOOl.I00Io1o110i.I000II = false;
/* 30 */                ill1OlOOl.I00111O(1);
                    }
/* 33 */            Ill1OlOOl ill1OlOOl2 = this.I00oIiI10;
/* 37 */            if (ill1OlOOl2.I0010o >= 1) {
/* 39 */                return;
                    }
/* 40 */            ill1OlOOl2.I00II0oii1o = false;
/* 42 */            ill1OlOOl2.I00IO1 = false;
/* 46 */            ill1OlOOl2.I00Io1o110i.I000II = false;
/* 48 */            ill1OlOOl2.I00111O(1);
                }

                public View I001i1lo1io(LayoutInflater layoutInflater, ViewGroup viewGroup) {
/* 1 */             return null;
                }

                public void I001iOo1i0O() {
/* 2 */             this.I00ooiO1I = true;
                }

                public void I001l0I00() {
/* 2 */             this.I00ooiO1I = true;
                }

                public void I001lIiIIo1O() {
/* 2 */             this.I00ooiO1I = true;
                }

                public LayoutInflater I001lllioOl(Bundle bundle) {
/* 1 */             Ill0lo1oI0I ill0lo1oI0I = this.I00oII;
/* 3 */             if (ill0lo1oI0I == null) {
/* 25 */                I000II.I001IO000("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
/* 28 */                return null;
                    }
/* 5 */             Ill0oOi0 ill0oOi0 = ill0lo1oI0I.I00ilI0I1;
/* 11 */            LayoutInflater layoutInflaterCloneInContext = ill0oOi0.getLayoutInflater().cloneInContext(ill0oOi0);
/* 19 */            layoutInflaterCloneInContext.setFactory2(this.I00oIiI10.I0001Ioi1lo);
/* 22 */            return layoutInflaterCloneInContext;
                }

                public void I00II0Ol1O0l() {
/* 2 */             this.I00ooiO1I = true;
                }

                public void I00II0oii1o() {
/* 2 */             this.I00ooiO1I = true;
                }

                public void I00IO1oi11O(Bundle bundle) {
/* 2 */             this.I00ooiO1I = true;
                }

                public void I00IOO(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 3 */             this.I00oIiI10.I00IoiI();
/* 7 */             this.I00o0l1o1o0 = true;
/* 11 */            Oool0l1iOIOl oool0l1iOIOlI000II = I000II();
/* 15 */            IllI1Ilo1l1 illI1Ilo1l1 = new IllI1Ilo1l1();
/* 19 */            illI1Ilo1l1.I00iio = null;
/* 21 */            illI1Ilo1l1.I00ilI0I1 = null;
/* 23 */            illI1Ilo1l1.I00iOIl = this;
/* 25 */            illI1Ilo1l1.I00iiI = oool0l1iOIOlI000II;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            this.I010l1O = illI1Ilo1l1;
/* 32 */            View viewI001i1lo1io = I001i1lo1io(layoutInflater, viewGroup);
/* 36 */            this.I0100i = viewI001i1lo1io;
/* 38 */            IllI1Ilo1l1 illI1Ilo1l12 = this.I010l1O;
/* 40 */            if (viewI001i1lo1io == null) {
/* 85 */                if (illI1Ilo1l12.I00iio == null) {
/* 87 */                    this.I010l1O = null;
/* 89 */                    return;
                        } else {
/* 92 */                    I000II.I001IO000("Called getViewLifecycleOwner() but onCreateView() returned null");
/* 98 */                    return;
                        }
                    }
/* 42 */            illI1Ilo1l12.I0000Il00O();
/* 52 */            this.I0100i.setTag(R.id.view_tree_lifecycle_owner, this.I010l1O);
/* 62 */            this.I0100i.setTag(R.id.view_tree_view_model_store_owner, this.I010l1O);
/* 72 */            this.I0100i.setTag(R.id.view_tree_saved_state_registry_owner, this.I010l1O);
/* 79 */            this.I010l1ol111.I000iOII(this.I010l1O);
                }

                public final Context I00IioO0OiOi() {
/* 1 */             Context contextI000OiO = I000OiO();
/* 5 */             if (contextI000OiO != null) {
/* 7 */                 return contextI000OiO;
                    }
/* 12 */            IioIoO10iOiI.I000O01llI0(this, "Fragment ", " not attached to a context.");
/* 15 */            return null;
                }

                public final View I00IlilI0i0i() {
/* 1 */             View view = this.I0100i;
/* 3 */             if (view != null) {
/* 5 */                 return view;
                    }
/* 10 */            IioIoO10iOiI.I000O01llI0(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView().");
/* 13 */            return null;
                }

                public final void I00Io1lO(int i, int i2, int i3, int i4) {
/* 3 */             if (this.I010I0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
/* 13 */                return;
                    }
/* 18 */            I0000Il00O().I00000oOI = i;
/* 24 */            I0000Il00O().I0000Il00O = i2;
/* 30 */            I0000Il00O().I0000O = i3;
/* 36 */            I0000Il00O().I0000oI00 = i4;
                }

                public final void I00Io1o110i(Bundle bundle) {
/* 1 */             Ill1OlOOl ill1OlOOl = this.I00oI0i;
/* 3 */             if (ill1OlOOl != null) {
/* 13 */                if (ill1OlOOl == null ? false : ill1OlOOl.I00IoIO0lI()) {
/* 18 */                    I000II.I001IO000("Fragment already added and state has been saved");
/* 21 */                    return;
                        }
                    }
/* 22 */            this.I00ilO0 = bundle;
                }

                public final boolean equals(Object obj) {
                    return this == obj;
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 2 */             this.I00ooiO1I = true;
                }

                @Override
                public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
/* 1 */             Ill0oOi0 ill0oOi0I0001Ioi1lo = I0001Ioi1lo();
/* 5 */             if (ill0oOi0I0001Ioi1lo != null) {
/* 7 */                 ill0oOi0I0001Ioi1lo.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                    } else {
/* 15 */                IioIoO10iOiI.I000O01llI0(this, "Fragment ", " not attached to an activity.");
                    }
                }

                @Override
                public final void onLowMemory() {
/* 2 */             this.I00ooiO1I = true;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(Barcode.FORMAT_ITF);
/* 16 */            sb.append(getClass().getSimpleName());
/* 21 */            sb.append("{");
/* 32 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 37 */            sb.append("} (");
/* 42 */            sb.append(this.I00ilI0I1);
/* 47 */            if (this.I00oOio10iI1 != 0) {
/* 51 */                sb.append(" id=0x");
/* 60 */                sb.append(Integer.toHexString(this.I00oOio10iI1));
                    }
/* 65 */            if (this.I00olI != null) {
/* 69 */                sb.append(" tag=");
/* 74 */                sb.append(this.I00olI);
                    }
/* 79 */            sb.append(")");
/* 82 */            return sb.toString();
                }

/* 28 */        public void I001lloI(Bundle bundle) {
                }

/* 28 */        public void I00IO1(View view) {
                }
            }
