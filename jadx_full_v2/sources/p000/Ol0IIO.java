            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class Ol0IIO {
                public String I00000oIO;
                public ArrayList I00000oOI;
                public OIoi0IIoi I0000Il00O;

                public final void I00000oIO(String str, O00olOO0... o00olOO0Arr) {
                    OoOIo1ioI0 ooOIo1ioI0;
/* 1 */             ArrayList arrayList = this.I00000oOI;
/* 4 */             if (o00olOO0Arr.length == 0) {
/* 6 */                 ooOIo1ioI0 = null;
                    } else {
/* 13 */                I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(6);
/* 16 */                i0OIOO00l0O.I00iiI = o00olOO0Arr;
/* 18 */                VarHandle.storeStoreFence();
/* 21 */                I1IollOi01 i1IollOi01 = new I1IollOi01(i0OIOO00l0O);
/* 30 */                int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(i1IollOi01, 10));
/* 36 */                if (iI00000oIO < 16) {
/* 38 */                    iI00000oIO = 16;
                        }
/* 41 */                LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 44 */                Iterator it = i1IollOi01.iterator();
                        while (true) {
/* 49 */                    Iio0IIOo iio0IIOo = (Iio0IIOo) it;
/* 57 */                    if (!iio0IIOo.I00iiI.hasNext()) {
                                break;
                            }
/* 63 */                    Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 75 */                    linkedHashMap.put(Integer.valueOf(iol0oIiIOI.I00000oIO), (O00olOO0) iol0oIiIOI.I00000oOI);
                        }
/* 81 */                ooOIo1ioI0 = new OoOIo1ioI0(linkedHashMap);
                    }
/* 89 */            arrayList.add(new OIoi0IIoi(str, ooOIo1ioI0));
                }

                public final void I00000oOI(String str, O00olOO0... o00olOO0Arr) {
/* 6 */             I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(6);
/* 9 */             i0OIOO00l0O.I00iiI = o00olOO0Arr;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I1IollOi01 i1IollOi01 = new I1IollOi01(i0OIOO00l0O);
/* 23 */            int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(i1IollOi01, 10));
/* 29 */            if (iI00000oIO < 16) {
/* 31 */                iI00000oIO = 16;
                    }
/* 34 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 37 */            Iterator it = i1IollOi01.iterator();
                    while (true) {
/* 42 */                Iio0IIOo iio0IIOo = (Iio0IIOo) it;
/* 50 */                if (!iio0IIOo.I00iiI.hasNext()) {
/* 82 */                    this.I0000Il00O = new OIoi0IIoi(str, new OoOIo1ioI0(linkedHashMap));
/* 89 */                    return;
                        } else {
/* 56 */                    Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 68 */                    linkedHashMap.put(Integer.valueOf(iol0oIiIOI.I00000oIO), (O00olOO0) iol0oIiIOI.I00000oOI);
                        }
                    }
                }
            }
