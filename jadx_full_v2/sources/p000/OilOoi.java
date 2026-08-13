            package p000;

            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public final class OilOoi implements OilOloI, IIi1ol1OO {
                public String I00000oIO;
                public lO1oIl1ii I00000oOI;
                public int I0000Il00O;
                public List I0000O;
                public HashSet I0000oI00;
                public String[] I0001Ioi1lo;
                public OilOloI[] I000II;
                public List[] I000O01llI0;
                public boolean[] I000OOo1O;
                public Map I000OiO;
                public OilOloI[] I000iOII;
                public OllO00oiil I000l1;

                @Override
                public final String I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final Set I00000oOI() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final int I0000O(String str) {
/* 7 */             Integer num = (Integer) this.I000OiO.get(str);
/* 9 */             if (num != null) {
/* 11 */                return num.intValue();
                    }
/* 16 */            return -3;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final String I0001Ioi1lo(int i) {
/* 3 */             return this.I0001Ioi1lo[i];
                }

                @Override
                public final List I000II(int i) {
/* 3 */             return this.I000O01llI0[i];
                }

                @Override
                public final OilOloI I000O01llI0(int i) {
/* 3 */             return this.I000II[i];
                }

                @Override
                public final boolean I000OOo1O(int i) {
/* 3 */             return this.I000OOo1O[i];
                }

                @Override
                public final lO1oIl1ii I000oI1ioi() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             OilOloI[] oilOloIArr = this.I000II;
/* 3 */             int i = this.I0000Il00O;
/* 5 */             if (this == obj) {
/* 98 */                return true;
                    }
/* 11 */            if (obj instanceof OilOoi) {
/* 17 */                OilOloI oilOloI = (OilOloI) obj;
/* 27 */                if (this.I00000oIO.equals(oilOloI.I00000oIO()) && Arrays.equals(this.I000iOII, ((OilOoi) obj).I000iOII) && i == oilOloI.I0000oI00()) {
/* 51 */                    for (int i2 = 0; i2 < i; i2++) {
/* 71 */                        if (O0000Ioio00.I0000O(oilOloIArr[i2].I00000oIO(), oilOloI.I000O01llI0(i2).I00000oIO()) && O0000Ioio00.I0000O(oilOloIArr[i2].I000oI1ioi(), oilOloI.I000O01llI0(i2).I000oI1ioi())) {
                                }
                            }
/* 98 */                    return true;
                        }
                    }
/* 10 */            return false;
                }

                @Override
                public final List getAnnotations() {
/* 1 */             return this.I0000O;
                }

                public final int hashCode() {
/* 9 */             return ((Number) this.I000l1.getValue()).intValue();
                }

                public final String toString() {
/* 1 */             return lI1O0i1l.I00000oOI(this);
                }
            }
