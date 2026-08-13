            package p000;

            import android.content.Context;
            import android.preference.PreferenceManager;
            import android.view.MenuItem;
            import android.view.View;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.Toolbar;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.CopyOnWriteArrayList;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public final class Oi00IilOloo0 implements O1ilOII, IOoO01o, OloIIOIilol, OIi0011o, Illli0oiOOi, I1IOO1OOo, i0Ii0I1ll {
                public static final Object I00iiI = new Object();
                public Object I00iOIl;

                public Oi00IilOloo0(IOiOol0 iOiOol0) {
/* 6 */             Context context = (Context) iOiOol0.I00iiI;
/* 10 */            String str = (String) iOiOol0.I00iiO;
/* 14 */            String str2 = (String) iOiOol0.I00iio;
/* 16 */            if (str == null) {
/* 49 */                I000II.I000iOII("keysetName cannot be null");
/* 186 */               throw null;
                    }
/* 18 */            Context applicationContext = context.getApplicationContext();
/* 22 */            if (str2 == null) {
/* 28 */                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                    } else {
/* 37 */                applicationContext.getSharedPreferences(str2, 0).edit();
                    }
/* 44 */            this.I00iOIl = (IIloOI) iOiOol0.I00ioIO;
                }

                @Override
                public Object I0000Il00O() {
/* 3 */             i0IOo0i0 i0ioo0i0 = (i0IOo0i0) this.I00iOIl;
/* 5 */             if (i0ioo0i0 != null) {
/* 7 */                 return i0ioo0i0.I0000Il00O();
                    }
/* 12 */            IOOlIIilOl0.I000iOII();
/* 15 */            return null;
                }

                @Override
                public boolean I0000O(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
/* 5 */             I0I1lIio i0I1lIio = ((ActionMenuView) this.I00iOIl).I00oliIiO01i;
/* 7 */             if (i0I1lIio == null) {
/* 47 */                return false;
                    }
/* 21 */            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((IIOOoll) i0I1lIio).I00iiI).I010101Oo1lO.I00iiO).iterator();
/* 29 */            while (it.hasNext()) {
/* 43 */                if (((Ill111iO) it.next()).I00000oIO.I000oI1ioi()) {
/* 45 */                    return true;
                        }
                    }
/* 47 */            return false;
                }

                public void I0010o(Object obj) {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00iOIl;
/* 5 */             if (obj != null) {
/* 7 */                 arrayList.add(obj);
                    } else {
/* 13 */                IOOlIIilOl0.I000II("Set contributions cannot be null");
                    }
                }

                public void I00111O(CancellationException cancellationException) {
/* 3 */             OI110O0 oi110o0 = (OI110O0) this.I00iOIl;
/* 5 */             int i = oi110o0.I00iiO;
/* 7 */             IIoOo1iIio1l[] iIoOo1iIio1lArr = new IIoOo1iIio1l[i];
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 21 */                iIoOo1iIio1lArr[i2] = ((IOoO0I1OIoi) oi110o0.I00iOIl[i2]).I00000oOI;
                    }
/* 26 */            for (int i3 = 0; i3 < i; i3++) {
/* 30 */                iIoOo1iIio1lArr[i3].I0000O(cancellationException);
                    }
/* 38 */            if (oi110o0.I00iiO == 0) {
/* 40 */                return;
                    }
/* 43 */            Ioll0IliO1l.I0000Il00O("uncancelled requests present");
                }

                @Override
                public Object I001IIilI0O(OiOiliiO oiOiliiO, Float f, Float f2, Function1 function1, Ol1iIIOoO ol1iIIOoO) {
/* 1 */             float fFloatValue = f.floatValue();
/* 5 */             float fFloatValue2 = f2.floatValue();
/* 34 */            Object objI0000Il00O = lOIo00oi1i.I0000Il00O(oiOiliiO, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, iOO0I0.I00000oIO(0.0f, fFloatValue2, 28), (I110IiI0o1Il) this.I00iOIl, function1, ol1iIIOoO);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : (I1101l) objI0000Il00O;
                }

                public OOll1l0ll I001IO000() {
                    Iii1oi1l1II iii1oi1l1III000II;
/* 3 */             I1ii1l10IO i1ii1l10IO = (I1ii1l10IO) this.I00iOIl;
/* 7 */             IiiI0l01O iiiI0l01O = (IiiI0l01O) i1ii1l10IO.I0000O;
                    synchronized (iiiI0l01O) {
/* 11 */                i1ii1l10IO.I00000oOI(true);
/* 20 */                iii1oi1l1III000II = iiiI0l01O.I000II(((Iii1lol) i1ii1l10IO.I00000oOI).I00000oIO);
                    }
/* 25 */            if (iii1oi1l1III000II != null) {
/* 29 */                return new OOll1l0ll(iii1oi1l1III000II);
                    }
/* 33 */            return null;
                }

                public OlII11110Iol I001i1O0Ol() {
/* 3 */             I00io1l i00io1l = (I00io1l) this.I00iOIl;
/* 7 */             if (!(i00io1l instanceof OIoiiI)) {
/* 28 */                return new OlII11110Iol();
                    }
/* 13 */            ArrayList arrayList = ((OIoiiI) i00io1l).I00000oOI.I00000oOI;
/* 17 */            OlII11110Iol olII11110Iol = new OlII11110Iol();
/* 22 */            olII11110Iol.I00iOIl.addAll(arrayList);
/* 25 */            return olII11110Iol;
                }

                public void I001i1lo1io() {
/* 3 */             OI110O0 oi110o0 = (OI110O0) this.I00iOIl;
/* 8 */             IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, oi110o0.I00iiO);
/* 12 */            int i = iooO11lI000O01llI0.I00iOIl;
/* 14 */            int i2 = iooO11lI000O01llI0.I00iiI;
/* 16 */            if (i <= i2) {
                        while (true) {
/* 28 */                    ((IOoO0I1OIoi) oi110o0.I00iOIl[i]).I00000oOI.resumeWith(OoiIlOl1iI.I00000oIO);
/* 31 */                    if (i == i2) {
                                break;
                            } else {
/* 33 */                        i++;
                            }
                        }
                    }
/* 36 */            oi110o0.I000II();
                }

                @Override
                public void I00IlilI0i0i(O1illlIiilIl o1illlIiilIl) {
/* 5 */             O1OIll00i o1OIll00i = ((ActionMenuView) this.I00iOIl).I00oO101o;
/* 7 */             if (o1OIll00i != null) {
/* 9 */                 o1OIll00i.I00IlilI0i0i(o1illlIiilIl);
                    }
                }

                @Override
                public Illlil build() {
/* 3 */             return (Il0oi000) this.I00iOIl;
                }

                @Override
                public void onFailure(Exception exc) {
/* 9 */             ((IIoOoIol0Io0) this.I00iOIl).resumeWith(lIoii1l01l0i.I00000oIO(exc));
                }

                @Override
/* 28 */        public Illli0oiOOi I0001Ioi1lo() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public Illli0oiOOi I000II() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public Illli0oiOOi I000O01llI0() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public Illli0oiOOi I000OiO() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public Illli0oiOOi I000lI() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public Illli0oiOOi I000oI1ioi() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public Illli0oiOOi I0010I0i() {
/* 29 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I00000oIO(List list) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I00000oOI(int i) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I0000oI00(O0ioOi0Oo1ii o0ioOi0Oo1ii) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I000OOo1O(IiOiOloo0 iiOiOloo0) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I000iOII(O1oIIloii0 o1oIIloii0) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I000l1(I11IlOOO i11IlOOO) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I000o00OoI0I(O0iIl1 o0iIl1) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I00100l0(Ii1Ool1 ii1Ool1) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public Illli0oiOOi I00100o1O0lo(OI1Iio0ii1 oI1Iio0ii1) {
/* 49 */            return this;
                }

/* 53 */        public Oi00IilOloo0(I1ii1l10IO i1ii1l10IO) {
                    this.I00iOIl = i1ii1l10IO;
                }

/* 54 */        public Oi00IilOloo0(View view) {
/* 57 */            OlOO1i11110 olOO1i11110 = new OlOO1i11110(27);
/* 58 */            olOO1i11110.I00iiI = view;
/* 59 */            olOO1i11110.I00iiO = view;
/* 60 */            VarHandle.storeStoreFence();
                    this.I00iOIl = olOO1i11110;
                }

/* 60 */        public Oi00IilOloo0() {
                    this.I00iOIl = null;
                }

/* 61 */        public Oi00IilOloo0(IoO10oI0o ioO10oI0o, int i, Ii1olII1lO1 ii1olII1lO1, Throwable th) {
/* 63 */            this.I00iOIl = ii1olII1lO1;
                }
            }
