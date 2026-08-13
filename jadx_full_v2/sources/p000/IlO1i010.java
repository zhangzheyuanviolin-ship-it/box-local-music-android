            package p000;
            
            public final class IlO1i010 extends IlO1i1lOIi {
                public Iooili11110O[] I0000O;

                @Override
                public final Object I0000oI00(int i) {
/* 6 */             int i2 = (1 << this.I0000Il00O) - 1;
/* 7 */             int i3 = this.I00000oOI;
/* 11 */            int i4 = (i & (i2 << i3)) >> i3;
/* 16 */            for (Iooili11110O iooili11110O : this.I0000O) {
/* 24 */                if (iooili11110O.I00000oIO() == i4) {
/* 26 */                    return iooili11110O;
                        }
                    }
/* 30 */            return null;
                }
            }
