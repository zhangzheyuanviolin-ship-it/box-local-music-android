            package p000;
            
            public final class O1OIlOol0O0 implements O1l1liOO {
                public O1l1liOO[] I00000oIO;

                @Override
                public final OOlI0Ol I00000oIO(Class cls) {
/* 5 */             for (O1l1liOO o1l1liOO : this.I00000oIO) {
/* 13 */                if (o1l1liOO.I00000oOI(cls)) {
/* 15 */                    return o1l1liOO.I00000oIO(cls);
                        }
                    }
/* 33 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override
                public final boolean I00000oOI(Class cls) {
/* 6 */             for (O1l1liOO o1l1liOO : this.I00000oIO) {
/* 14 */                if (o1l1liOO.I00000oOI(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 4 */             return false;
                }
            }
