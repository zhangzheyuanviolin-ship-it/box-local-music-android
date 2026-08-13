            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class Ii00IiIOOoi0 extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii00IiIOOoi0(int i, Object obj, Object obj2) {
/* 8 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Object obj2 = this.I00iiI;
/* 7 */             Object obj3 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 180 */                   Throwable th = (Throwable) obj;
/* 182 */                   IIiOOI iIiOOI = (IIiOOI) obj2;
/* 184 */                   if (th == null) {
/* 204 */                       iIiOOI.I00000oOI(((IiIOIO1I) obj3).I00II0Ol1O0l());
                            } else if (th instanceof CancellationException) {
/* 190 */                       iIiOOI.I0000Il00O();
                            } else {
/* 194 */                       iIiOOI.I0000O(th);
                            }
/* 207 */                   return ooiIlOl1iI;
                        case 1:
/* 25 */                    IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 27 */                    IilloIOOO0i iilloIOOO0i2 = (IilloIOOO0i) obj2;
/* 33 */                    IiIooOOOI iiIooOOOII001IIilI0O = iilloIOOO0i.I00iiI().I001IIilI0O();
/* 41 */                    O0iOOoiioO o0iOOoiioOI001i1O0Ol = iilloIOOO0i.I00iiI().I001i1O0Ol();
/* 49 */                    IIolOo iIolOoI0010o = iilloIOOO0i.I00iiI().I0010o();
/* 57 */                    long jI001iOo1i0O = iilloIOOO0i.I00iiI().I001iOo1i0O();
/* 67 */                    Io10IOI io10IOI = (Io10IOI) iilloIOOO0i.I00iiI().I00iiO;
/* 69 */                    Function1 function1 = (Function1) obj3;
/* 75 */                    IiIooOOOI iiIooOOOII001IIilI0O2 = iilloIOOO0i2.I00iiI().I001IIilI0O();
/* 83 */                    O0iOOoiioO o0iOOoiioOI001i1O0Ol2 = iilloIOOO0i2.I00iiI().I001i1O0Ol();
/* 91 */                    IIolOo iIolOoI0010o2 = iilloIOOO0i2.I00iiI().I0010o();
/* 99 */                    long jI001iOo1i0O2 = iilloIOOO0i2.I00iiI().I001iOo1i0O();
/* 109 */                   Io10IOI io10IOI2 = (Io10IOI) iilloIOOO0i2.I00iiI().I00iiO;
/* 111 */                   IOO000ilo iOO000iloI00iiI = iilloIOOO0i2.I00iiI();
/* 115 */                   iOO000iloI00iiI.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 118 */                   iOO000iloI00iiI.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 121 */                   iOO000iloI00iiI.I00IOO(iIolOoI0010o);
/* 124 */                   iOO000iloI00iiI.I00Io1lO(jI001iOo1i0O);
/* 127 */                   iOO000iloI00iiI.I00iiO = io10IOI;
/* 129 */                   iIolOoI0010o.I000II();
                            try {
/* 132 */                       function1.invoke(iilloIOOO0i2);
/* 156 */                       return ooiIlOl1iI;
                            } finally {
/* 158 */                       iIolOoI0010o.I00100l0();
/* 161 */                       IOO000ilo iOO000iloI00iiI2 = iilloIOOO0i2.I00iiI();
/* 165 */                       iOO000iloI00iiI2.I00IioO0OiOi(iiIooOOOII001IIilI0O2);
/* 168 */                       iOO000iloI00iiI2.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol2);
/* 171 */                       iOO000iloI00iiI2.I00IOO(iIolOoI0010o2);
/* 174 */                       iOO000iloI00iiI2.I00Io1lO(jI001iOo1i0O2);
/* 177 */                       iOO000iloI00iiI2.I00iiO = io10IOI2;
                            }
                        default:
/* 21 */                    ((OO11o0IO) obj).I000O01llI0((OO1I0001000i) obj2, 0, 0, ((i0I0IiO0I1) obj3).I00o0iI0io1);
/* 24 */                    return ooiIlOl1iI;
                    }
                }
            }
