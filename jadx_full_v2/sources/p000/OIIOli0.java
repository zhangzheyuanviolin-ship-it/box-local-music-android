            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            
/* 30 */    public final class OIIOli0 implements IO0OIooI {
                public final OoOi1Ol I00iOIl;
                public IllOOo00lI I00iiI;
                public final OIIOli0 I00iiO;
                public final OoOOiO I00iio;
                public final O0ioIllo0i1 I00ilI0I1;

                public OIIOli0(OoOi1Ol ooOi1Ol, IllOOo00lI illOOo00lI, OIIOli0 oIIOli0, OoOOiO ooOOiO) {
/* 4 */             this.I00iOIl = ooOi1Ol;
/* 6 */             this.I00iiI = illOOo00lI;
/* 8 */             this.I00iiO = oIIOli0;
/* 10 */            this.I00iio = ooOOiO;
/* 12 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 17 */            O0l1iloO o0l1iloO = new O0l1iloO(4);
/* 20 */            o0l1iloO.I00iiI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            this.I00ilI0I1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o0l1iloO);
                }

                @Override
                public final O0i1lI0o1io I0000O() {
/* 7 */             return lOoliOIOlIO0.I0000O(this.I00iOIl.I00000oOI());
                }

                @Override
                public final Collection I0000oI00() {
/* 7 */             Collection collection = (List) this.I00ilI0I1.getValue();
/* 9 */             if (collection == null) {
/* 11 */                collection = Il01100l.I00iOIl;
                    }
/* 13 */            return collection;
                }

                @Override
                public final List I000II() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final IOIiO1lIl0l I00100o1O0lo() {
/* 1 */             return null;
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return false;
                }

                @Override
                public final OoOi1Ol I001IO000() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!OIIOli0.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 24 */            OIIOli0 oIIOli0 = (OIIOli0) obj;
/* 26 */            OIIOli0 oIIOli02 = this.I00iiO;
/* 28 */            if (oIIOli02 != null) {
/* 31 */                this = oIIOli02;
                    }
/* 32 */            OIIOli0 oIIOli03 = oIIOli0.I00iiO;
/* 34 */            if (oIIOli03 != null) {
/* 37 */                obj = oIIOli03;
                    }
                    return this == obj;
                }

                public final int hashCode() {
/* 1 */             OIIOli0 oIIOli0 = this.I00iiO;
                    return oIIOli0 != null ? oIIOli0.hashCode() : super.hashCode();
                }

                public final String toString() {
/* 18 */            return "CapturedType(" + this.I00iOIl + ')';
                }

/* 31 */        public OIIOli0(OoOi1Ol ooOi1Ol, IiOl01 iiOl01, OoOOiO ooOOiO, int i) {
/* 32 */            this(ooOi1Ol, (i & 2) != 0 ? null : iiOl01, (OIIOli0) null, (i & 8) != 0 ? null : ooOOiO);
                }
            }
