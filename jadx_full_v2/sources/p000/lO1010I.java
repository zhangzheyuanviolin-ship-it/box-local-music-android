            package p000;
            
            public abstract class lO1010I {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(OiOl01il10lO oiOl01il10lO, float f, I110IiI0o1Il i110IiI0o1Il, IOoilo iOoilo) {
                    OiOi1oiOO oiOi1oiOO;
                    OOo0lO oOo0lO;
/* 3 */             if (iOoilo instanceof OiOi1oiOO) {
/* 6 */                 oiOi1oiOO = (OiOi1oiOO) iOoilo;
/* 8 */                 int i = oiOi1oiOO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiOi1oiOO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiOi1oiOO = new OiOi1oiOO(iOoilo);
                        }
                    }
/* 25 */            Object obj = oiOi1oiOO.I00iiI;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiOi1oiOO.I00iiO;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                OOo0lO oOo0lO2 = new OOo0lO();
/* 59 */                IlliIl1l11O oiOiI0IIlo = new OiOiI0IIlo(f, i110IiI0o1Il, oOo0lO2, null);
/* 62 */                oiOi1oiOO.I00iOIl = oOo0lO2;
/* 64 */                oiOi1oiOO.I00iiO = 1;
/* 72 */                if (oiOl01il10lO.I0000Il00O(OI110lo.I00iOIl, oiOiI0IIlo, oiOi1oiOO) == obj2) {
/* 74 */                    return obj2;
                        }
/* 75 */                oOo0lO = oOo0lO2;
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                oOo0lO = oiOi1oiOO.I00iOIl;
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 80 */            return new Float(oOo0lO.I00iOIl);
                }
            }
