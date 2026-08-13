            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public abstract class iioIlooliI {
                public static final o01l1ioOo0 I00000oIO(o01l1ioOo0 o01l1iooo0, Ii1Ool1 ii1Ool1, O00oiIoi o00oiIoi, int i, O0ioIllo0i1 o0ioIllo0i1) {
                    OoOOol ooOOol;
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 5 */             if (o00oiIoi != null) {
/* 10 */                I0oiil10Ili i0oiil10Ili = new I0oiil10Ili(4);
/* 13 */                i0oiil10Ili.I00iiO = o01l1iooo0;
/* 15 */                i0oiil10Ili.I00iio = ii1Ool1;
/* 17 */                i0oiil10Ili.I00iiI = i;
/* 19 */                ArrayList typeParameters = o00oiIoi.getTypeParameters();
/* 25 */                LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 28 */                Iterator it = typeParameters.iterator();
/* 32 */                int i2 = 0;
/* 37 */                while (it.hasNext()) {
/* 49 */                    linkedHashMap.put(it.next(), Integer.valueOf(i2));
/* 39 */                    i2++;
                        }
/* 54 */                i0oiil10Ili.I00ilI0I1 = linkedHashMap;
/* 66 */                O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) ((o01l1ioOo0) i0oiil10Ili.I00iiO).I00iOIl).I00000oIO;
/* 72 */                I00iiI i00iiI = new I00iiI(23);
/* 75 */                i00iiI.I00iiI = i0oiil10Ili;
/* 77 */                VarHandle.storeStoreFence();
/* 84 */                i0oiil10Ili.I00ilO0 = o1I0OloI.I0000Il00O(i00iiI);
/* 86 */                VarHandle.storeStoreFence();
                        ooOOol = i0oiil10Ili;
                    } else {
/* 93 */                ooOOol = (OoOOol) o01l1iooo0.I00iiI;
                    }
/* 97 */            return new o01l1ioOo0(i0l1OOl1l10, ooOOol, o0ioIllo0i1);
                }

                public static o01l1ioOo0 I00000oOI(o01l1ioOo0 o01l1iooo0, IOIOooI1110l iOIOooI1110l, OOo1oliI oOo1oliI, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 oOo1oliI = null;
                    }
/* 6 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 12 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(8);
/* 15 */            i01illiil1Oo.I00iiO = o01l1iooo0;
/* 17 */            i01illiil1Oo.I00iiI = iOIOooI1110l;
/* 19 */            VarHandle.storeStoreFence();
/* 27 */            return I00000oIO(o01l1iooo0, iOIOooI1110l, oOo1oliI, 0, l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01illiil1Oo));
                }

                public static final o01l1ioOo0 I0000Il00O(o01l1ioOo0 o01l1iooo0, I11IlOOO i11IlOOO) {
/* 5 */             if (i11IlOOO.isEmpty()) {
/* 7 */                 return o01l1iooo0;
                    }
/* 12 */            I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 16 */            OoOOol ooOOol = (OoOOol) o01l1iooo0.I00iiI;
/* 18 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 24 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(9);
/* 27 */            i01illiil1Oo.I00iiO = o01l1iooo0;
/* 29 */            i01illiil1Oo.I00iiI = i11IlOOO;
/* 31 */            VarHandle.storeStoreFence();
/* 38 */            return new o01l1ioOo0(i0l1OOl1l10, ooOOol, l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01illiil1Oo));
                }
            }
