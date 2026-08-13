            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            public final class OO0oi0 extends I01Ii0ll10O implements OO0oOlOi1 {
                public static final OO0oi0 I00iio;
                public final Object I00iOIl;
                public final Object I00iiI;
                public final OO0lO0o I00iiO;

                static {
/* 3 */             iolOOiI iolooii = iolOOiI.I00iiO;
/* 10 */            I00iio = new OO0oi0(iolooii, iolooii, OO0lO0o.I00iiO);
                }

                public OO0oi0(Object obj, Object obj2, OO0lO0o oO0lO0o) {
/* 4 */             this.I00iOIl = obj;
/* 6 */             this.I00iiI = obj2;
/* 8 */             this.I00iiO = oO0lO0o;
                }

                @Override
                public final Set I00000oIO() {
/* 4 */             OO0oi11 oO0oi11 = new OO0oi11(0);
/* 7 */             oO0oi11.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 29 */            return oO0oi11;
                }

                @Override
                public final Set I00000oOI() {
/* 4 */             OO0oi11 oO0oi11 = new OO0oi11(1);
/* 7 */             oO0oi11.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 29 */            return oO0oi11;
                }

                @Override
                public final int I0000Il00O() {
/* 3 */             return this.I00iiO.I0000Il00O();
                }

                @Override
                public final Collection I0000O() {
/* 4 */             O1OlO1OoolI o1OlO1OoolI = new O1OlO1OoolI(3);
/* 7 */             o1OlO1OoolI.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 29 */            return o1OlO1OoolI;
                }

                @Override
                public final OO0oOlOi1 I0000oI00(Object obj, IlliIlI illiIlI) {
/* 1 */             iolOOiI iolooii = iolOOiI.I00iiO;
/* 3 */             boolean zIsEmpty = isEmpty();
/* 7 */             OO0lO0o oO0lO0o = this.I00iiO;
/* 9 */             if (zIsEmpty) {
/* 22 */                return new OO0oi0(obj, obj, oO0lO0o.I0000oI00(obj, new O100lilo1Ill(illiIlI, iolooii, iolooii)));
                    }
/* 30 */            O100lilo1Ill o100lilo1Ill = (O100lilo1Ill) oO0lO0o.get(obj);
/* 32 */            Object obj2 = this.I00iiI;
/* 34 */            Object obj3 = this.I00iOIl;
/* 36 */            if (o100lilo1Ill != null) {
                        return o100lilo1Ill.I00000oIO == illiIlI ? this : new OO0oi0(obj3, obj2, oO0lO0o.I0000oI00(obj, new O100lilo1Ill(illiIlI, o100lilo1Ill.I00000oOI, o100lilo1Ill.I0000Il00O)));
                    }
/* 66 */            O100lilo1Ill o100lilo1Ill2 = (O100lilo1Ill) oO0lO0o.get(obj2);
/* 92 */            return new OO0oi0(obj3, obj, oO0lO0o.I0000oI00(obj2, new O100lilo1Ill(o100lilo1Ill2.I00000oIO, o100lilo1Ill2.I00000oOI, obj)).I0000oI00(obj, new O100lilo1Ill(illiIlI, obj2, iolooii)));
                }

                @Override
                public final OO0oOlOi1 I0001Ioi1lo(Oi0IO1ii011 oi0IO1ii011) {
/* 1 */             OO0lO0o oO0lO0o = this.I00iiO;
/* 7 */             O100lilo1Ill o100lilo1Ill = (O100lilo1Ill) oO0lO0o.get(oi0IO1ii011);
/* 9 */             if (o100lilo1Ill == null) {
/* 11 */                return this;
                    }
/* 12 */            Object obj = o100lilo1Ill.I00000oOI;
/* 14 */            Object obj2 = o100lilo1Ill.I0000Il00O;
/* 16 */            OO0lO0o oO0lO0oI000O01llI0 = oO0lO0o.I0001Ioi1lo(oi0IO1ii011);
/* 20 */            iolOOiI iolooii = iolOOiI.I00iiO;
/* 22 */            if (obj != iolooii) {
/* 28 */                O100lilo1Ill o100lilo1Ill2 = (O100lilo1Ill) oO0lO0oI000O01llI0.get(obj);
/* 39 */                oO0lO0oI000O01llI0 = oO0lO0oI000O01llI0.I0000oI00(obj, new O100lilo1Ill(o100lilo1Ill2.I00000oIO, o100lilo1Ill2.I00000oOI, obj2));
                    }
/* 43 */            if (obj2 != iolooii) {
/* 49 */                O100lilo1Ill o100lilo1Ill3 = (O100lilo1Ill) oO0lO0oI000O01llI0.get(obj2);
/* 60 */                oO0lO0oI000O01llI0 = oO0lO0oI000O01llI0.I0000oI00(obj2, new O100lilo1Ill(o100lilo1Ill3.I00000oIO, obj, o100lilo1Ill3.I0000Il00O));
                    }
/* 69 */            Object obj3 = obj != iolooii ? this.I00iOIl : obj2;
/* 70 */            if (obj2 != iolooii) {
/* 72 */                obj = this.I00iiI;
                    }
/* 76 */            return new OO0oi0(obj3, obj, oO0lO0oI000O01llI0);
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 3 */             return this.I00iiO.containsKey(obj);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             OO0lO0o oO0lO0o = this.I00iiO;
/* 3 */             OoIi1O0 ooIi1O0 = oO0lO0o.I00iOIl;
/* 5 */             if (obj == this) {
/* 7 */                 return true;
                    }
/* 11 */            if (!(obj instanceof Map)) {
/* 27 */                return false;
                    }
/* 19 */            Map map = (Map) obj;
/* 25 */            if (oO0lO0o.I0000Il00O() != map.size()) {
/* 27 */                return false;
                    }
                    return map instanceof OO0oi0 ? ooIi1O0.I0000O(((OO0oi0) obj).I00iiO.I00iOIl, I00ilI0I1.I00l0I0l0lO1) : map instanceof OO0lO0o ? ooIi1O0.I0000O(((OO0lO0o) obj).I00iOIl, I00ilI0I1.I00l0OO0IO) : super.equals(obj);
                }

                @Override
                public final Object get(Object obj) {
/* 7 */             O100lilo1Ill o100lilo1Ill = (O100lilo1Ill) this.I00iiO.get(obj);
/* 9 */             if (o100lilo1Ill != null) {
/* 11 */                return o100lilo1Ill.I00000oIO;
                    }
/* 14 */            return null;
                }
            }
