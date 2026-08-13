            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class lO0oII {
                public static final List I00000oIO(OiIIl0O1l0l oiIIl0O1l0l) {
/* 3 */             int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0l, "id");
/* 9 */             int iI00000oIO2 = lO01oI1Io1.I00000oIO(oiIIl0O1l0l, "seq");
/* 15 */            int iI00000oIO3 = lO01oI1Io1.I00000oIO(oiIIl0O1l0l, "from");
/* 21 */            int iI00000oIO4 = lO01oI1Io1.I00000oIO(oiIIl0O1l0l, "to");
/* 25 */            O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 33 */            while (oiIIl0O1l0l.I00ol1()) {
/* 41 */                int i = (int) oiIIl0O1l0l.getLong(iI00000oIO);
/* 46 */                int i2 = (int) oiIIl0O1l0l.getLong(iI00000oIO2);
/* 47 */                String strI00i0O = oiIIl0O1l0l.I00i0O(iI00000oIO3);
/* 51 */                String strI00i0O2 = oiIIl0O1l0l.I00i0O(iI00000oIO4);
/* 55 */                Ililil0o1 ililil0o1 = new Ililil0o1();
/* 58 */                ililil0o1.I00iOIl = i;
/* 60 */                ililil0o1.I00iiI = i2;
/* 62 */                ililil0o1.I00iiO = strI00i0O;
/* 64 */                ililil0o1.I00iio = strI00i0O2;
/* 66 */                VarHandle.storeStoreFence();
/* 69 */                o101lO1I0000oI00.add(ililil0o1);
                    }
/* 77 */            return IOOi0Ool1i.I00Ol10(IOOi1I.I0000Il00O(o101lO1I0000oI00));
                }

                public static final Olo001i0l1 I00000oOI(Olil0III olil0III, String str, boolean z) {
/* 20 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("PRAGMA index_xinfo(`" + str + "`)");
                    try {
/* 26 */                int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "seqno");
/* 32 */                int iI00000oIO2 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "cid");
/* 38 */                int iI00000oIO3 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "name");
/* 44 */                int iI00000oIO4 = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "desc");
/* 50 */                if (iI00000oIO != -1 && iI00000oIO2 != -1 && iI00000oIO3 != -1 && iI00000oIO4 != -1) {
/* 62 */                    LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 67 */                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 74 */                    while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 81 */                        if (((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO2)) >= 0) {
/* 88 */                            int i = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO);
/* 89 */                            String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO3);
/* 109 */                           String str2 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO4) > 0 ? "DESC" : "ASC";
/* 115 */                           linkedHashMap.put(Integer.valueOf(i), strI00i0O);
/* 122 */                           linkedHashMap2.put(Integer.valueOf(i), str2);
                                }
                            }
/* 138 */                   List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(linkedHashMap.entrySet(), new OiOIlO1OII0(0));
/* 152 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00Ol1ll1, 10));
/* 155 */                   Iterator it = listI00Ol1ll1.iterator();
/* 163 */                   while (it.hasNext()) {
/* 177 */                       arrayList.add((String) ((Map.Entry) it.next()).getValue());
                            }
/* 181 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList);
/* 197 */                   List listI00Ol1ll12 = IOOi0Ool1i.I00Ol1ll1(linkedHashMap2.entrySet(), new OiOIlO1OII0(1));
/* 209 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00Ol1ll12, 10));
/* 212 */                   Iterator it2 = listI00Ol1ll12.iterator();
/* 220 */                   while (it2.hasNext()) {
/* 234 */                       arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                            }
/* 244 */                   Olo001i0l1 olo001i0l1 = new Olo001i0l1(str, z, listI00iIi0i1o, IOOi0Ool1i.I00iIi0i1o(arrayList2));
/* 247 */                   iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 250 */                   return olo001i0l1;
                        }
/* 251 */               iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 49 */                return null;
                    } finally {
                    }
                }
            }
