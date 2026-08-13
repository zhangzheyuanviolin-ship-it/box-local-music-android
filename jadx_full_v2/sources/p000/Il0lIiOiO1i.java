            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Il0lIiOiO1i extends OO1Ol1i {
                public final Oili0Il I000l1;
                public final OllO00oiil I000lI;

                public Il0lIiOiO1i(String str, int i) {
/* 2 */             super(str, null, i);
/* 7 */             this.I000l1 = Oili0Il.I00000oOI;
/* 12 */            Il0lI1oIiI il0lI1oIiI = new Il0lI1oIiI(0);
/* 15 */            il0lI1oIiI.I00iiI = i;
/* 17 */            il0lI1oIiI.I00iiO = str;
/* 19 */            il0lI1oIiI.I00iio = this;
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            this.I000lI = new OllO00oiil(il0lI1oIiI);
                }

                @Override
                public final OilOloI I000O01llI0(int i) {
/* 9 */             return ((OilOloI[]) this.I000lI.getValue())[i];
                }

                @Override
                public final lO1oIl1ii I000oI1ioi() {
/* 1 */             return this.I000l1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof OilOloI)) {
/* 50 */                return false;
                    }
/* 12 */            OilOloI oilOloI = (OilOloI) obj;
                    return oilOloI.I000oI1ioi() == Oili0Il.I00000oOI && this.I00000oIO.equals(oilOloI.I00000oIO()) && O0000Ioio00.I0000O(iO0IO0O.I00000oIO(this), iO0IO0O.I00000oIO(oilOloI));
                }

                @Override
                public final int hashCode() {
/* 3 */             int iHashCode = this.I00000oIO.hashCode();
/* 10 */            I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(2);
/* 13 */            i01I0Iioooo0.I00iiO = this;
/* 17 */            i01I0Iioooo0.I00iiI = this.I0000Il00O;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            int iHashCode2 = 1;
/* 27 */            while (i01I0Iioooo0.hasNext()) {
/* 33 */                int i = iHashCode2 * 31;
/* 35 */                String str = (String) i01I0Iioooo0.next();
/* 45 */                iHashCode2 = i + (str != null ? str.hashCode() : 0);
                    }
/* 49 */            return (iHashCode * 31) + iHashCode2;
                }

                @Override
                public final String toString() {
/* 4 */             I1IollOi01 i1IollOi01 = new I1IollOi01(3);
/* 7 */             i1IollOi01.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 27 */            return IOOi0Ool1i.I00IlilI0i0i(i1IollOi01, ", ", this.I00000oIO.concat("("), ")", null, 56);
                }
            }
