            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l0oloiiool0l {
                /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OlO1oOlIl01 I00000oIO(boolean z, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    Object obj;
/* 7 */             III0liIO iII0liIO = (III0liIO) iloI0lOlll1.I000iOII(III0o1oi.I00000oIO);
/* 15 */            O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 94 */            boolean zI0000oI00 = ((((i & 896) ^ 384) > 256 && iloI0lOlll1.I000II(illOOo00lI)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && iloI0lOlll1.I000O01llI0(false)) || (i & 6) == 4) | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal()) | iloI0lOlll1.I000II(iII0liIO) | ((((i & 112) ^ 48) > 32 && iloI0lOlll1.I000O01llI0(z)) || (i & 48) == 32);
/* 96 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 100 */           if (!zI0000oI00) {
                        obj = objI00O0i0ii;
/* 104 */               if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 108 */                   OlO1oOlIl01 olO1oOlIl01 = new OlO1oOlIl01();
/* 111 */                   olO1oOlIl01.I00000oOI = illOOo00lI;
/* 113 */                   olO1oOlIl01.I0000Il00O = o0iOOoiioO;
/* 115 */                   olO1oOlIl01.I0000O = z;
/* 117 */                   olO1oOlIl01.I0000oI00 = iII0liIO;
/* 119 */                   VarHandle.storeStoreFence();
/* 122 */                   iloI0lOlll1.I00iio(olO1oOlIl01);
                            obj = olO1oOlIl01;
                        }
                    }
/* 125 */           return (OlO1oOlIl01) obj;
                }
            }
