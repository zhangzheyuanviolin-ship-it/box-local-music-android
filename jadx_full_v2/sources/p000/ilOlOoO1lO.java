            package p000;
            
            public abstract class ilOlOoO1lO {
                public static IlOil1ii I00000oIO(IlOil1ii ilOil1ii, int i) {
/* 1 */             IIII0i iIII0i = IIII0i.I00iOIl;
/* 5 */             if (i < 0 && i != -2 && i != -1) {
/* 19 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
/* 3 */                 return null;
                    }
/* 23 */            if (i == -1) {
/* 25 */                iIII0i = IIII0i.I00iiI;
/* 27 */                i = 0;
                    }
/* 28 */            int i2 = i;
/* 29 */            IIII0i iIII0i2 = iIII0i;
                    return ilOil1ii instanceof Illo1I00lOl ? Illo1I00lOl.I0000Il00O((Illo1I00lOl) ilOil1ii, null, i2, iIII0i2, 1) : new IO10O0lOI0oI(ilOil1ii, null, i2, iIII0i2, 2);
                }

                public static final IlOil1ii I00000oOI(IlOil1ii ilOil1ii, Ii00l101O ii00l101O) {
/* 8 */             if (ii00l101O.I00lli11(Iioi0lilII.I00iio) == null) {
                        return ii00l101O.equals(Il00o11.I00iOIl) ? ilOil1ii : ilOil1ii instanceof Illo1I00lOl ? Illo1I00lOl.I0000Il00O((Illo1I00lOl) ilOil1ii, ii00l101O, 0, null, 6) : new IO10O0lOI0oI(ilOil1ii, ii00l101O, 0, null, 12);
                    }
/* 47 */            OIiilo1Ool0o.I000O01llI0("Flow context cannot contain job in it. Had ", ii00l101O);
/* 7 */             return null;
                }
            }
