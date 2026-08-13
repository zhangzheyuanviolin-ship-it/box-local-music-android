            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lOli1ioiOl {
                /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Oo0ioO I00000oIO(IloI0lOlll1 iloI0lOlll1) {
                    Object obj;
/* 7 */             IliO0o11i01 iliO0o11i01 = (IliO0o11i01) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000iOII);
/* 15 */            IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 23 */            O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 49 */            boolean zI000II = iloI0lOlll1.I000II(iliO0o11i01) | iloI0lOlll1.I000II(iiIooOOOI) | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal()) | iloI0lOlll1.I0000oI00(8);
/* 50 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 54 */            if (!zI000II) {
                        obj = objI00O0i0ii;
/* 58 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 62 */                    Oo0ioO oo0ioO = new Oo0ioO();
/* 65 */                    oo0ioO.I00000oIO = iliO0o11i01;
/* 67 */                    oo0ioO.I00000oOI = iiIooOOOI;
/* 69 */                    oo0ioO.I0000Il00O = o0iOOoiioO;
/* 76 */                    IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(29, false);
/* 84 */                    ioIlOo1o0IIl.I00iiI = new O1Il00(8);
/* 86 */                    VarHandle.storeStoreFence();
/* 89 */                    oo0ioO.I0000O = ioIlOo1o0IIl;
/* 91 */                    VarHandle.storeStoreFence();
/* 94 */                    iloI0lOlll1.I00iio(oo0ioO);
                            obj = oo0ioO;
                        }
                    }
/* 97 */            return (Oo0ioO) obj;
                }
            }
