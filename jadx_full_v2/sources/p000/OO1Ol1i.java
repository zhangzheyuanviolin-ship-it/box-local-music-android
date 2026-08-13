            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public class OO1Ol1i implements OilOloI, IIi1ol1OO {
                public final String I00000oIO;
                public final Io00l010I I00000oOI;
                public final int I0000Il00O;
                public int I0000O = -1;
                public final String[] I0000oI00;
                public final List[] I0001Ioi1lo;
                public final boolean[] I000II;
                public Map I000O01llI0;
                public final O0ioIllo0i1 I000OOo1O;
                public final O0ioIllo0i1 I000OiO;
                public final O0ioIllo0i1 I000iOII;

                public OO1Ol1i(String str, Io00l010I io00l010I, int i) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = io00l010I;
/* 8 */             this.I0000Il00O = i;
/* 13 */            String[] strArr = new String[i];
/* 15 */            int i2 = 0;
/* 17 */            for (int i3 = 0; i3 < i; i3++) {
/* 21 */                strArr[i3] = "[UNINITIALIZED]";
                    }
/* 26 */            this.I0000oI00 = strArr;
/* 28 */            int i4 = this.I0000Il00O;
/* 32 */            this.I0001Ioi1lo = new List[i4];
/* 36 */            this.I000II = new boolean[i4];
/* 40 */            this.I000O01llI0 = Il011I1OiO0I.I00iOIl;
/* 42 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 46 */            OO1OiOI oO1OiOI = new OO1OiOI(i2);
/* 49 */            oO1OiOI.I00iiI = this;
/* 51 */            VarHandle.storeStoreFence();
/* 58 */            this.I000OOo1O = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oO1OiOI);
/* 63 */            OO1OiOI oO1OiOI2 = new OO1OiOI(1);
/* 66 */            oO1OiOI2.I00iiI = this;
/* 68 */            VarHandle.storeStoreFence();
/* 75 */            this.I000OiO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oO1OiOI2);
/* 80 */            OO1OiOI oO1OiOI3 = new OO1OiOI(2);
/* 83 */            oO1OiOI3.I00iiI = this;
/* 85 */            VarHandle.storeStoreFence();
/* 92 */            this.I000iOII = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oO1OiOI3);
                }

                @Override
                public final String I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final Set I00000oOI() {
/* 3 */             return this.I000O01llI0.keySet();
                }

                @Override
                public final int I0000O(String str) {
/* 7 */             Integer num = (Integer) this.I000O01llI0.get(str);
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
/* 3 */             return this.I0000oI00[i];
                }

                @Override
                public final List I000II(int i) {
/* 3 */             List list = this.I0001Ioi1lo[i];
                    return list == null ? Il01100l.I00iOIl : list;
                }

                @Override
                public OilOloI I000O01llI0(int i) {
/* 11 */            return ((O0O01001OOII[]) this.I000OOo1O.getValue())[i].I0000O();
                }

                @Override
                public final boolean I000OOo1O(int i) {
/* 3 */             return this.I000II[i];
                }

                public final void I000OiO(String str, boolean z) {
/* 3 */             int i = this.I0000O + 1;
/* 5 */             this.I0000O = i;
/* 7 */             String[] strArr = this.I0000oI00;
/* 9 */             strArr[i] = str;
/* 13 */            this.I000II[i] = z;
/* 18 */            this.I0001Ioi1lo[i] = null;
/* 24 */            if (i == this.I0000Il00O - 1) {
/* 28 */                HashMap map = new HashMap();
/* 31 */                int length = strArr.length;
/* 33 */                for (int i2 = 0; i2 < length; i2++) {
/* 41 */                    map.put(strArr[i2], Integer.valueOf(i2));
                        }
/* 47 */                this.I000O01llI0 = map;
                    }
                }

                @Override
                public lO1oIl1ii I000oI1ioi() {
/* 1 */             return Oli00oo0l.I00000oOI;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 113 */               return true;
                    }
/* 8 */             if (obj instanceof OO1Ol1i) {
/* 12 */                OilOloI oilOloI = (OilOloI) obj;
/* 24 */                if (this.I00000oIO.equals(oilOloI.I00000oIO()) && Arrays.equals((OilOloI[]) this.I000OiO.getValue(), (OilOloI[]) ((OO1Ol1i) obj).I000OiO.getValue())) {
/* 52 */                    int iI0000oI00 = oilOloI.I0000oI00();
/* 56 */                    int i = this.I0000Il00O;
/* 58 */                    if (i == iI0000oI00) {
/* 62 */                        for (int i2 = 0; i2 < i; i2++) {
/* 84 */                            if (O0000Ioio00.I0000O(I000O01llI0(i2).I00000oIO(), oilOloI.I000O01llI0(i2).I00000oIO()) && O0000Ioio00.I0000O(I000O01llI0(i2).I000oI1ioi(), oilOloI.I000O01llI0(i2).I000oI1ioi())) {
                                    }
                                }
/* 113 */                       return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public final List getAnnotations() {
/* 1 */             return Il01100l.I00iOIl;
                }

                public int hashCode() {
/* 9 */             return ((Number) this.I000iOII.getValue()).intValue();
                }

                public String toString() {
/* 1 */             return lI1O0i1l.I00000oOI(this);
                }
            }
