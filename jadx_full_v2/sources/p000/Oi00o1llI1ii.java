            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class Oi00o1llI1ii implements Function1 {
                public final int I00iOIl;
                public I1Oi1Oi0O I00iiI;

                @Override
                public final Object invoke(Object obj) {
                    I1Oi1Oi0O i1Oi1Oi0O;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             I1Oi1Oi0O i1Oi1Oi0O2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 112 */                   OiI1O11OO oiI1O11OO = (OiI1O11OO) obj;
/* 124 */                   I1Oi1Oi0O i1Oi1Oi0O3 = (I1Oi1Oi0O) OilO1oiooiII.I000II(lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O2, OOo1l011.I00ioIO));
/* 126 */                   if (i1Oi1Oi0O3 != null && (i1Oi1Oi0O = (I1Oi1Oi0O) OilO1oiooiII.I000II(lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O3, OOo1l011.I00l0I0l0lO1))) != null) {
/* 148 */                       Iterator it = lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O, OOo1l011.I00l0OO0IO).iterator();
                                while (true) {
/* 153 */                           IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 159 */                           if (!ilIloII10O.hasNext()) {
                                        break;
                                    } else {
/* 165 */                               I1Oi1Oi0O i1Oi1Oi0O4 = (I1Oi1Oi0O) ilIloII10O.next();
/* 169 */                               I1oiiilOo i1oiiilOo = new I1oiiilOo(1);
/* 172 */                               i1oiiilOo.I00iiI = i1Oi1Oi0O4;
/* 174 */                               VarHandle.storeStoreFence();
/* 185 */                               oiI1O11OO.I00000oIO(new IOii1l(-1584786501, i1oiiilOo, true));
                                    }
                                }
                            }
                            break;
                        default:
/* 11 */                    Olloi1o olloi1o = (Olloi1o) obj;
/* 23 */                    I1Oi1Oi0O i1Oi1Oi0O5 = (I1Oi1Oi0O) OilO1oiooiII.I000II(lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O2, OOo1l011.I00li1OI));
/* 25 */                    if (i1Oi1Oi0O5 != null) {
/* 33 */                        Iterator it2 = lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O5, OOo1l011.I00ll1).iterator();
                                while (true) {
/* 38 */                            IlIloII10O ilIloII10O2 = (IlIloII10O) it2;
/* 44 */                            if (!ilIloII10O2.hasNext()) {
                                        break;
                                    } else {
/* 50 */                                I1Oi1Oi0O i1Oi1Oi0O6 = (I1Oi1Oi0O) ilIloII10O2.next();
/* 52 */                                ArrayList arrayList = olloi1o.I00000oIO;
/* 56 */                                OiI1O11OO oiI1O11OO2 = new OiI1O11OO();
/* 65 */                                Iterator it3 = lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O6, OOo1l011.I00lli11).iterator();
                                        while (true) {
/* 70 */                                    IlIloII10O ilIloII10O3 = (IlIloII10O) it3;
/* 76 */                                    if (ilIloII10O3.hasNext()) {
/* 82 */                                        I1Oi1Oi0O i1Oi1Oi0O7 = (I1Oi1Oi0O) ilIloII10O3.next();
/* 87 */                                        I1oiiilOo i1oiiilOo2 = new I1oiiilOo(2);
/* 90 */                                        i1oiiilOo2.I00iiI = i1Oi1Oi0O7;
/* 92 */                                        VarHandle.storeStoreFence();
/* 103 */                                       oiI1O11OO2.I00000oIO(new IOii1l(-314008657, i1oiiilOo2, true));
                                            }
                                        }
/* 107 */                               arrayList.add(oiI1O11OO2);
                                    }
                                }
                            }
                            break;
                    }
/* 111 */           return ooiIlOl1iI;
                }
            }
