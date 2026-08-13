            package p000;
            
            public abstract class l1il101OlO {
                public static final O1ooOo I00000oIO(IiIill0O0li1 iiIill0O0li1, int i) {
/* 5 */             O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1).I00iOIl.I00ilO0;
/* 7 */             if (o1ooOo == null || (o1ooOo.I00iio & i) == 0) {
/* 32 */                return null;
                    }
/* 16 */            while (o1ooOo != null) {
/* 18 */                int i2 = o1ooOo.I00iiO;
/* 22 */                if ((i2 & 2) != 0) {
/* 32 */                    return null;
                        }
/* 26 */                if ((i2 & i) != 0) {
/* 28 */                    return o1ooOo;
                        }
/* 29 */                o1ooOo = o1ooOo.I00ilO0;
                    }
/* 32 */            return null;
                }
            }
