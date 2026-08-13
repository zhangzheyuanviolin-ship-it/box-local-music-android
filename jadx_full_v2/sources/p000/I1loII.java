            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I1loII implements Function1 {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;

                public I1loII(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             int i2 = 0;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 203 */                   IOioOOiI0l00 iOioOOiI0l00 = (IOioOOiI0l00) this.I00iiO;
/* 205 */                   boolean z = this.I00iiI;
/* 213 */                   ((I1lo101oIi1) iOioOOiI0l00.I00000oIO).I0000oI00(z);
/* 220 */                   ((I1lo0oO1O) iOioOOiI0l00.I00000oOI).I000II(z);
/* 225 */                   I1loIlo0O0i i1loIlo0O0i = new I1loIlo0O0i(0);
/* 228 */                   i1loIlo0O0i.I00000oOI = iOioOOiI0l00;
/* 230 */                   VarHandle.storeStoreFence();
                            break;
                        case 1:
                            break;
                        case 2:
/* 156 */                   boolean z2 = this.I00iiI;
/* 160 */                   View view = (View) this.I00iiO;
/* 164 */                   if (z2) {
/* 166 */                       view.setKeepScreenOn(true);
                            }
/* 171 */                   II1l10Ool1 iI1l10Ool1 = new II1l10Ool1(1);
/* 174 */                   iI1l10Ool1.I00000oOI = view;
/* 176 */                   VarHandle.storeStoreFence();
                            break;
                        case 3:
/* 136 */                   IOl0OoOIliI1 iOl0OoOIliI1 = (IOl0OoOIliI1) this.I00iiO;
/* 142 */                   iOl0OoOIliI1.I001l0I00(this.I00iiI);
/* 147 */                   I1loIlo0O0i i1loIlo0O0i2 = new I1loIlo0O0i(1);
/* 150 */                   i1loIlo0O0i2.I00000oOI = iOl0OoOIliI1;
/* 152 */                   VarHandle.storeStoreFence();
                            break;
                        case 4:
/* 62 */                    boolean z3 = this.I00iiI;
/* 66 */                    Ol111o0 ol111o0 = (Ol111o0) this.I00iiO;
/* 68 */                    Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 70 */                    if (!z3) {
/* 72 */                        O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 76 */                        oil0O0I.I00000oOI(Oil0I1O.I000OiO, ooiIlOl1iI);
                            }
/* 94 */                    String strValueOf = String.valueOf(O1OooO0IlOo.I000II(ol111o0.I0000O.I000II() * 100.0f) / 100.0f);
/* 98 */                    O0O00I1Ili[] o0O00I1IliArr2 = Oil0Io.I00000oIO;
/* 100 */                   Oil0IoooOio oil0IoooOio = Oil0I1O.I00000oOI;
/* 104 */                   O0O00I1Ili o0O00I1Ili = Oil0Io.I00000oIO[0];
/* 106 */                   oil0IoooOio.getClass();
/* 109 */                   oil0O0I.I00000oOI(oil0IoooOio, strValueOf);
/* 114 */                   Ol10i1Oooo ol10i1Oooo = new Ol10i1Oooo(i2);
/* 117 */                   ol10i1Oooo.I00iiI = ol111o0;
/* 119 */                   VarHandle.storeStoreFence();
/* 130 */                   oil0O0I.I00000oOI(Oiioi1IoIIli.I000OOo1O, new I01lOOlO0o(null, ol10i1Oooo));
                            break;
                        case 5:
/* 29 */                    IooOl0ol01 iooOl0ol01 = (IooOl0ol01) this.I00iiO;
/* 31 */                    boolean z4 = this.I00iiI;
/* 33 */                    Iill00 iill00 = (Iill00) obj;
/* 40 */                    float f = (int) (iooOl0ol01.I00000oIO >> 32);
/* 45 */                    iill00.I00000oIO(Oll1lO.I00iiO, 0.0f);
/* 48 */                    if (z4) {
/* 52 */                        iill00.I00000oIO(Oll1lO.I00iOIl, f);
                            }
/* 58 */                    iill00.I00000oIO(Oll1lO.I00iiI, -f);
                            break;
                        default:
/* 10 */                    boolean z5 = this.I00iiI;
/* 14 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 16 */                    Boolean bool = (Boolean) obj;
/* 18 */                    bool.booleanValue();
/* 21 */                    if (z5) {
/* 23 */                        oI10i0Il.setValue(bool);
                                break;
                            }
                            break;
                    }
/* 26 */            return ooiIlOl1iI;
                }
            }
