            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.os.Looper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ListAdapter;
            import android.widget.ListView;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Modifier;
            import java.util.concurrent.ThreadPoolExecutor;
            
            public final class liii0ioI extends Ill0l1 {
                public ListView I0110OiO;
                public li0iI0O0I0l I0110o;
                public OoIOol I0111i;
                public String I011IO1I11OI;
                public iii1IIii I011IOil;
                public Context I011Ill;

                @Override
                public final void I001IO000(Context context) {
/* 1 */             super.I001IO000(context);
/* 4 */             this.I011Ill = context;
/* 10 */            this.I011IOil = iii1IIii.I00000oIO(context);
                }

                @Override
                public final void I001i1O0Ol(Bundle bundle) {
                    Bundle bundle2;
/* 1 */             super.I001i1O0Ol(bundle);
/* 4 */             if (bundle == null && (bundle2 = this.I00ilO0) != null) {
/* 16 */                this.I011IO1I11OI = bundle2.getString("license_activity_package_name");
                    }
/* 18 */            String packageName = this.I011IO1I11OI;
/* 20 */            if (packageName == null) {
/* 24 */                packageName = this.I011Ill.getPackageName();
/* 28 */                this.I011IO1I11OI = packageName;
                    }
/* 36 */            this.I0111i = iii1IIii.I0000O(this.I011Ill, packageName);
                }

                @Override
                public final View I001i1lo1io(LayoutInflater layoutInflater, ViewGroup viewGroup) {
/* 1 */             OoIOol ooIOol = this.I0111i;
/* 20 */            return layoutInflater.inflate(((Resources) ooIOol.I00iiI).getIdentifier("license_menu_fragment", "layout", (String) ooIOol.I00iiO), viewGroup, false);
                }

                @Override
                public final void I001iOo1i0O() {
/* 2 */             this.I00ooiO1I = true;
/* 4 */             Ill0oOi0 ill0oOi0I0001Ioi1lo = I0001Ioi1lo();
/* 8 */             if (ill0oOi0I0001Ioi1lo != null) {
/* 16 */                O11ll1Ii0 o11ll1Ii0 = (O11ll1Ii0) I1I0i0Ilo1Oi.I00Iooi00oi(ill0oOi0I0001Ioi1lo).I00iiO;
/* 18 */                boolean z = o11ll1Ii0.I0000Il00O;
/* 20 */                OlIIioolI olIIioolI = o11ll1Ii0.I00000oOI;
/* 22 */                if (z) {
/* 85 */                    I000II.I001IO000("Called while creating a loader");
/* 110 */                   return;
                        }
/* 32 */                if (Looper.getMainLooper() != Looper.myLooper()) {
/* 79 */                    I000II.I001IO000("destroyLoader must be called on the main thread");
/* 82 */                    return;
                        }
/* 34 */                olIIioolI.getClass();
/* 44 */                O11lIllO o11lIllO = (O11lIllO) iO10Oii01l.I00000oIO(olIIioolI, 54321);
/* 46 */                if (o11lIllO != null) {
/* 48 */                    o11lIllO.I000l1();
/* 51 */                    olIIioolI.getClass();
/* 58 */                    int iI00000oIO = iIIl1I0OIlO0.I00000oIO(olIIioolI.I00iio, 54321, olIIioolI.I00iiI);
/* 62 */                    if (iI00000oIO >= 0) {
/* 64 */                        Object[] objArr = olIIioolI.I00iiO;
/* 66 */                        Object obj = objArr[iI00000oIO];
/* 68 */                        Object obj2 = iO10Oii01l.I00000oIO;
/* 70 */                        if (obj != obj2) {
/* 72 */                            objArr[iI00000oIO] = obj2;
/* 74 */                            olIIioolI.I00iOIl = true;
                                }
                            }
                        }
                    }
                }

                @Override
                public final void I00IO1(View view) {
/* 1 */             Ill0oOi0 ill0oOi0I0001Ioi1lo = I0001Ioi1lo();
/* 5 */             lII0I0I000I.I000II(ill0oOi0I0001Ioi1lo);
/* 8 */             I1I0i0Ilo1Oi i1I0i0Ilo1OiI00Iooi00oi = I1I0i0Ilo1Oi.I00Iooi00oi(ill0oOi0I0001Ioi1lo);
/* 14 */            O0oiOi o0oiOi = (O0oiOi) i1I0i0Ilo1OiI00Iooi00oi.I00iiI;
/* 18 */            O11ll1Ii0 o11ll1Ii0 = (O11ll1Ii0) i1I0i0Ilo1OiI00Iooi00oi.I00iiO;
/* 20 */            boolean z = o11ll1Ii0.I0000Il00O;
/* 22 */            OlIIioolI olIIioolI = o11ll1Ii0.I00000oOI;
/* 24 */            if (z) {
/* 205 */               I000II.I001IO000("Called while creating a loader");
/* 437 */               return;
                    }
/* 34 */            if (Looper.getMainLooper() != Looper.myLooper()) {
/* 199 */               I000II.I001IO000("initLoader must be called on the main thread");
/* 202 */               return;
                    }
/* 36 */            olIIioolI.getClass();
/* 46 */            O11lIllO o11lIllO = (O11lIllO) iO10Oii01l.I00000oIO(olIIioolI, 54321);
/* 48 */            if (o11lIllO == null) {
                        try {
/* 54 */                    o11ll1Ii0.I0000Il00O = true;
/* 56 */                    lO0Ol0 lo0ol0I00IoIO0lI = I00IoIO0lI();
/* 66 */                    if (lO0Ol0.class.isMemberClass() && !Modifier.isStatic(lO0Ol0.class.getModifiers())) {
/* 96 */                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + lo0ol0I00IoIO0lI);
                            }
/* 101 */                   O11lIllO o11lIllO2 = new O11lIllO();
/* 104 */                   o11lIllO2.I000l1 = 54321;
/* 106 */                   o11lIllO2.I000lI = lo0ol0I00IoIO0lI;
/* 110 */                   if (lo0ol0I00IoIO0lI.I00000oOI != null) {
/* 135 */                       throw new IllegalStateException("There is already a listener registered");
                            }
/* 112 */                   lo0ol0I00IoIO0lI.I00000oOI = o11lIllO2;
/* 114 */                   lo0ol0I00IoIO0lI.I00000oIO = 54321;
/* 116 */                   VarHandle.storeStoreFence();
/* 119 */                   olIIioolI.I0000Il00O(54321, o11lIllO2);
/* 122 */                   o11ll1Ii0.I0000Il00O = false;
/* 124 */                   o11lIllO2.I000o00OoI0I(o0oiOi, this);
                        } catch (Throwable th) {
/* 136 */                   o11ll1Ii0.I0000Il00O = false;
/* 138 */                   throw th;
                        }
                    } else {
/* 139 */               o11lIllO.I000o00OoI0I(o0oiOi, this);
                    }
/* 142 */           OoIOol ooIOol = this.I0111i;
/* 166 */           this.I0110OiO = (ListView) view.findViewById(((Resources) ooIOol.I00iiI).getIdentifier("license_list", "id", (String) ooIOol.I00iiO));
/* 170 */           li0iI0O0I0l li0ii0o0i0l = new li0iI0O0I0l(this, ill0oOi0I0001Ioi1lo);
/* 173 */           this.I0110o = li0ii0o0i0l;
/* 177 */           this.I0110OiO.setAdapter((ListAdapter) li0ii0o0i0l);
/* 180 */           ListView listView = this.I0110OiO;
/* 185 */           I1I11i1oI11 i1I11i1oI11 = new I1I11i1oI11(2);
/* 188 */           i1I11i1oI11.I00iiI = this;
/* 190 */           VarHandle.storeStoreFence();
/* 193 */           listView.setOnItemClickListener(i1I11i1oI11);
                }

                public final lO0Ol0 I00IoIO0lI() {
/* 3 */             Context context = this.I011Ill;
/* 5 */             iii1IIii iii1iiii = this.I011IOil;
/* 7 */             Context applicationContext = context.getApplicationContext();
/* 11 */            ThreadPoolExecutor threadPoolExecutor = I1OoI1.I00ioIO;
/* 13 */            lO0Ol0 lo0ol0 = new lO0Ol0();
/* 17 */            lo0ol0.I0000O = false;
/* 19 */            lo0ol0.I0000oI00 = false;
/* 22 */            lo0ol0.I0001Ioi1lo = true;
/* 24 */            lo0ol0.I000II = false;
/* 30 */            lo0ol0.I0000Il00O = applicationContext.getApplicationContext();
/* 32 */            lo0ol0.I000O01llI0 = threadPoolExecutor;
/* 34 */            lo0ol0.I000l1 = iii1iiii;
/* 36 */            VarHandle.storeStoreFence();
/* 55 */            return lo0ol0;
                }
            }
