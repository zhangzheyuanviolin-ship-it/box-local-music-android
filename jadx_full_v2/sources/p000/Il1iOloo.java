            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class Il1iOloo implements IllOOo00lI {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public Il1iOloo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 70 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 74 */                    String str = (String) this.I00iio;
/* 78 */                    Function1 function1 = (Function1) this.I00ilI0I1;
/* 80 */                    boolean z = this.I00iiI;
/* 84 */                    Il1Oio0I il1Oio0I = new Il1Oio0I();
/* 87 */                    il1Oio0I.I00000oIO = str;
/* 89 */                    VarHandle.storeStoreFence();
/* 92 */                    oI10i0Il.setValue(il1Oio0I);
/* 101 */                   function1.invoke(Boolean.valueOf(!z));
/* 104 */                   return ooiIlOl1iI;
                        case 1:
/* 33 */                    boolean z2 = this.I00iiI;
/* 37 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 41 */                    O1OIi1 o1OIi1 = (O1OIi1) this.I00ilI0I1;
/* 45 */                    OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 48 */                    if (z2) {
/* 50 */                        illOOo00lI.invoke();
/* 53 */                        l1O0o1.I0000Il00O(oI10i0Il2, false);
                            } else {
/* 61 */                        o1OIi1.I00000oIO(lI0ilOIoll.I00000oIO());
/* 64 */                        l1O0o1.I0000Il00O(oI10i0Il2, false);
                            }
/* 67 */                    return ooiIlOl1iI;
                        default:
/* 29 */                    return new Ol010000lo00((Set) this.I00iiO, (IllOOo00lI) this.I00iio, Ol010l0o0O.I00iOIl, (Function1) this.I00ilI0I1, this.I00iiI);
                    }
                }
            }
