            package p000;
            
            public final class OI0lll1ooo extends O1OOO0IoIIi implements O0IloIo {
                public OO0o1ooIIi I00iio;
                public Object I00ilI0I1;

                @Override
                public final Object getValue() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final Object setValue(Object obj) {
/* 1 */             Object obj2 = this.I00ilI0I1;
/* 3 */             this.I00ilI0I1 = obj;
/* 5 */             OO0o1ooIIi oO0o1ooIIi = this.I00iio;
/* 7 */             Object obj3 = this.I00iiI;
/* 11 */            OO0o0oOIIii oO0o0oOIIii = (OO0o0oOIIii) oO0o1ooIIi.I00iiI;
/* 13 */            OO0lo1Ooo oO0lo1Ooo = oO0o0oOIIii.I00ilI0I1;
/* 19 */            if (!oO0lo1Ooo.containsKey(obj3)) {
/* 21 */                return obj2;
                    }
/* 22 */            boolean z = oO0o0oOIIii.I00iiO;
/* 24 */            if (!z) {
/* 65 */                oO0lo1Ooo.put(obj3, obj);
                    } else {
/* 26 */                if (!z) {
/* 60 */                    IoOOl0iOl1io.I00000oOI();
/* 63 */                    return null;
                        }
/* 34 */                OoIiOIo0i010 ooIiOIo0i010 = ((OoIiOIo0i010[]) oO0o0oOIIii.I00iio)[oO0o0oOIIii.I00iiI];
/* 40 */                Object obj4 = ooIiOIo0i010.I00iiI[ooIiOIo0i010.I00iio];
/* 42 */                oO0lo1Ooo.put(obj3, obj);
/* 56 */                oO0o0oOIIii.I000II(obj4 != null ? obj4.hashCode() : 0, oO0lo1Ooo.I00iiO, obj4, 0);
                    }
/* 70 */            oO0o0oOIIii.I00ioIO = oO0lo1Ooo.I00ilI0I1;
/* 77 */            return obj2;
                }
            }
