            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0IoIi0Iol implements IllOOo00lI {
                public final int I00iOIl;
                public O0Iol0OO1O I00iiI;

                public O0IoIi0Iol(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0Iol0OO1O o0Iol0OO1O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 17 */                    O0IoOilol1 o0IoOilol1 = new O0IoOilol1(o0Iol0OO1O);
/* 22 */                    int i2 = 1;
/* 23 */                    O0IoIi0Iol o0IoIi0Iol = new O0IoIi0Iol(i2);
/* 26 */                    o0IoIi0Iol.I00iiI = o0Iol0OO1O;
/* 28 */                    VarHandle.storeStoreFence();
/* 36 */                    o0IoOilol1.I0000Il00O = lIlo0Oi0oOI.I00000oIO(null, o0IoIi0Iol);
/* 42 */                    I01iiIii10O i01iiIii10O = new I01iiIii10O(28);
/* 45 */                    i01iiIii10O.I00iiI = o0IoOilol1;
/* 47 */                    VarHandle.storeStoreFence();
/* 54 */                    o0IoOilol1.I0000O = lIlo0Oi0oOI.I00000oIO(null, i01iiIii10O);
/* 56 */                    O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 61 */                    O0IoIioI o0IoIioI = new O0IoIioI(0);
/* 64 */                    o0IoIioI.I00iiI = o0IoOilol1;
/* 66 */                    o0IoIioI.I00iiO = o0Iol0OO1O;
/* 68 */                    VarHandle.storeStoreFence();
/* 75 */                    o0IoOilol1.I0000oI00 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o0IoIioI);
/* 79 */                    O0IoIioI o0IoIioI2 = new O0IoIioI(i2);
/* 82 */                    o0IoIioI2.I00iiI = o0IoOilol1;
/* 84 */                    o0IoIioI2.I00iiO = o0Iol0OO1O;
/* 86 */                    VarHandle.storeStoreFence();
/* 89 */                    lIlo0Oi0oOI.I00000oIO(null, o0IoIioI2);
/* 92 */                    VarHandle.storeStoreFence();
/* 95 */                    return o0IoOilol1;
                        default:
/* 10 */                    return lIll1Iio01.I00000oIO(o0Iol0OO1O.I00iiI);
                    }
                }
            }
