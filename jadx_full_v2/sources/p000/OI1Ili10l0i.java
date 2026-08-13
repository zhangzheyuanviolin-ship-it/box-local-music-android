            package p000;

            import java.io.IOException;
            import java.util.LinkedList;
            import java.util.List;
            
            public final class OI1Ili10l0i implements OI1IlOlol {
                public OOOoiIli I00000oIO;
                public OOOoOl1 I00000oOI;

                @Override
                public final String I00000oIO(int i) throws IOException {
/* 1 */             OoIlOii ooIlOiiI0000Il00O = I0000Il00O(i);
/* 7 */             List list = (List) ooIlOiiI0000Il00O.I00iOIl;
/* 23 */            String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i((List) ooIlOiiI0000Il00O.I00iiI, ".", null, null, null, 62);
/* 31 */            if (list.isEmpty()) {
/* 33 */                return strI00IlilI0i0i;
                    }
/* 61 */            return IOOi0Ool1i.I00IlilI0i0i(list, "/", null, null, null, 62) + '/' + strI00IlilI0i0i;
                }

                @Override
                public final boolean I00000oOI(int i) {
/* 9 */             return ((Boolean) I0000Il00O(i).I00iiO).booleanValue();
                }

                public final OoIlOii I0000Il00O(int i) {
/* 3 */             LinkedList linkedList = new LinkedList();
/* 8 */             LinkedList linkedList2 = new LinkedList();
/* 11 */            boolean z = false;
/* 13 */            while (i != -1) {
/* 23 */                OOOoOiil01 oOOoOiil01 = (OOOoOiil01) this.I00000oOI.I00iiI.get(i);
/* 35 */                String str = (String) this.I00000oIO.I00iiI.get(oOOoOiil01.I00iio);
/* 39 */                int iOrdinal = oOOoOiil01.I00ilI0I1.ordinal();
/* 43 */                if (iOrdinal == 0) {
/* 65 */                    linkedList2.addFirst(str);
                        } else if (iOrdinal == 1) {
/* 61 */                    linkedList.addFirst(str);
                        } else {
/* 49 */                    if (iOrdinal != 2) {
/* 56 */                        I000II.I00000oIO();
/* 59 */                        return null;
                            }
/* 51 */                    linkedList2.addFirst(str);
/* 54 */                    z = true;
                        }
/* 68 */                i = oOOoOiil01.I00iiO;
                    }
/* 77 */            return new OoIlOii(linkedList, linkedList2, Boolean.valueOf(z));
                }

                @Override
                public final String getString(int i) {
/* 9 */             return (String) this.I00000oIO.I00iiI.get(i);
                }
            }
