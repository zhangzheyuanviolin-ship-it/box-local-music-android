            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            public class OO0lili extends I01Ii0ll10O implements Map, O0IlIoi {
                public static final OO0lili I00iiO = new OO0lili(OoIiIlIo.I0000oI00, 0);
                public final OoIiIlIo I00iOIl;
                public final int I00iiI;

                public OO0lili(OoIiIlIo ooIiIlIo, int i) {
/* 4 */             this.I00iOIl = ooIiIlIo;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final Set I00000oIO() {
/* 4 */             OO0oII00 oO0oII00 = new OO0oII00(0);
/* 7 */             oO0oII00.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 20 */            return oO0oII00;
                }

                @Override
                public final Set I00000oOI() {
/* 4 */             OO0oII00 oO0oII00 = new OO0oII00(1);
/* 7 */             oO0oII00.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 20 */            return oO0oII00;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Collection I0000O() {
/* 4 */             O1OlO1OoolI o1OlO1OoolI = new O1OlO1OoolI(2);
/* 7 */             o1OlO1OoolI.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 20 */            return o1OlO1OoolI;
                }

                public OO0lo1Ooo I000II() {
/* 3 */             return new OO0lo1Ooo(this);
                }

                public OO0lo1Ooo I000O01llI0() {
/* 1 */             return I000II();
                }

                public final OO0lili I000OOo1O(Object obj, O100ll1iO0il o100ll1iO0il) {
/* 12 */            O1I1OO o1i1ooI001IIilI0O = this.I00iOIl.I001IIilI0O(obj, obj != null ? obj.hashCode() : 0, 0, o100ll1iO0il);
                    return o1i1ooI001IIilI0O == null ? this : new OO0lili((OoIiIlIo) o1i1ooI001IIilI0O.I00iiO, this.I00iiI + o1i1ooI001IIilI0O.I00iiI);
                }

                @Override
                public boolean containsKey(Object obj) {
/* 12 */            return this.I00iOIl.I0000O(obj, obj != null ? obj.hashCode() : 0, 0);
                }

                @Override
                public Object get(Object obj) {
/* 12 */            return this.I00iOIl.I000II(obj, obj != null ? obj.hashCode() : 0, 0);
                }
            }
