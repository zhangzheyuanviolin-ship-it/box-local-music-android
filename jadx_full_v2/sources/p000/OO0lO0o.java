            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            public final class OO0lO0o extends I01Ii0ll10O implements OO0oOlOi1 {
                public static final OO0lO0o I00iiO = new OO0lO0o(OoIi1O0.I0000O, 0);
                public final OoIi1O0 I00iOIl;
                public final int I00iiI;

                public OO0lO0o(OoIi1O0 ooIi1O0, int i) {
/* 4 */             this.I00iOIl = ooIi1O0;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final Set I00000oIO() {
/* 4 */             OO0oI10l oO0oI10l = new OO0oI10l(0);
/* 7 */             oO0oI10l.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 29 */            return oO0oI10l;
                }

                @Override
                public final Set I00000oOI() {
/* 4 */             OO0oI10l oO0oI10l = new OO0oI10l(1);
/* 7 */             oO0oI10l.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 29 */            return oO0oI10l;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Collection I0000O() {
/* 4 */             O1OlO1OoolI o1OlO1OoolI = new O1OlO1OoolI(1);
/* 7 */             o1OlO1OoolI.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 29 */            return o1OlO1OoolI;
                }

                @Override
                public final OO0lO0o I0000oI00(Object obj, Object obj2) {
/* 12 */            O1I1OO o1i1ooI000OOo1O = this.I00iOIl.I000OOo1O(obj, obj != null ? obj.hashCode() : 0, 0, obj2);
                    return o1i1ooI000OOo1O == null ? this : new OO0lO0o((OoIi1O0) o1i1ooI000OOo1O.I00iiO, this.I00iiI + o1i1ooI000OOo1O.I00iiI);
                }

                @Override
                public final OO0lO0o I0001Ioi1lo(Oi0IO1ii011 oi0IO1ii011) {
/* 1 */             int iHashCode = oi0IO1ii011.hashCode();
/* 5 */             OoIi1O0 ooIi1O0 = this.I00iOIl;
/* 8 */             OoIi1O0 ooIi1O0I000OiO = ooIi1O0.I000OiO(iHashCode, oi0IO1ii011, 0);
                    return ooIi1O0 == ooIi1O0I000OiO ? this : ooIi1O0I000OiO == null ? I00iiO : new OO0lO0o(ooIi1O0I000OiO, this.I00iiI - 1);
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 12 */            return this.I00iOIl.I00000oOI(obj, obj != null ? obj.hashCode() : 0, 0);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Map)) {
/* 21 */                return false;
                    }
/* 11 */            Map map = (Map) obj;
/* 19 */            if (this.I00iiI != map.size()) {
/* 21 */                return false;
                    }
/* 23 */            boolean z = map instanceof OO0oi0;
/* 25 */            OoIi1O0 ooIi1O0 = this.I00iOIl;
                    return z ? ooIi1O0.I0000O(((OO0oi0) obj).I00iiO.I00iOIl, I00ilI0I1.I00io1l) : map instanceof OO0lO0o ? ooIi1O0.I0000O(((OO0lO0o) obj).I00iOIl, I00ilI0I1.I00ioIO) : super.equals(obj);
                }

                @Override
                public final Object get(Object obj) {
/* 12 */            return this.I00iOIl.I0000oI00(obj, obj != null ? obj.hashCode() : 0, 0);
                }
            }
