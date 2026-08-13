            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class l1o0O00iooo {
                public static final O1iOii1 I00000oIO(O0lilI1ioI o0lilI1ioI, int i, long j, OIoI1illIll1 oIoI1illIll1, long j2, II0O000iIl iI0O000iIl, O0iOOoiioO o0iOOoiioO, int i2, OI0l1oli1I oI0l1oli1I) {
/* 1 */             OIilII oIilII = OIilII.I00iOIl;
/* 3 */             Object objI00000oOI = oIoI1illIll1.I00000oOI(i);
/* 11 */            List list = (List) oI0l1oli1I.I00000oOI(i);
/* 14 */            if (list == null) {
/* 17 */                List listI00000oOI = o0lilI1ioI.I00000oOI(i);
/* 21 */                int size = listI00000oOI.size();
/* 27 */                ArrayList arrayList = new ArrayList(size);
/* 31 */                for (int i3 = 0; i3 < size; i3++) {
/* 43 */                    arrayList.add(((O1iIo0ll) listI00000oOI.get(i3)).I001lllioOl(j));
                        }
/* 49 */                oI0l1oli1I.I000OOo1O(i, arrayList);
/* 52 */                list = arrayList;
                    }
/* 55 */            O1iOii1 o1iOii1 = new O1iOii1();
/* 58 */            o1iOii1.I00000oIO = i;
/* 60 */            o1iOii1.I00000oOI = list;
/* 62 */            o1iOii1.I0000Il00O = j2;
/* 64 */            o1iOii1.I0000O = objI00000oOI;
/* 66 */            o1iOii1.I0000oI00 = iI0O000iIl;
/* 68 */            o1iOii1.I0001Ioi1lo = o0iOOoiioO;
/* 70 */            OIilII oIilII2 = OIilII.I00iOIl;
/* 72 */            o1iOii1.I000II = false;
/* 77 */            int size2 = list.size();
/* 81 */            int iMax = 0;
/* 82 */            for (int i4 = 0; i4 < size2; i4++) {
/* 88 */                OO1I0001000i oO1I0001000i = (OO1I0001000i) list.get(i4);
/* 99 */                iMax = Math.max(iMax, !o1iOii1.I000II ? oO1I0001000i.I00iiI : oO1I0001000i.I00iOIl);
                    }
/* 106 */           o1iOii1.I000O01llI0 = iMax;
/* 118 */           o1iOii1.I000OOo1O = new int[o1iOii1.I00000oOI.size() * 2];
/* 122 */           o1iOii1.I000iOII = Integer.MIN_VALUE;
/* 124 */           VarHandle.storeStoreFence();
/* 1821 */          return o1iOii1;
                }
            }
