            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class IiOlooi {
                public static final O0O00I1Ili[] I000OiO;
                public LinkedHashMap I00000oIO;
                public LinkedHashMap I00000oOI;
                public LinkedHashMap I0000Il00O;
                public O1I00llOi I0000O;
                public O1I00llOi I0000oI00;
                public I1ooIoloo0 I0001Ioi1lo;
                public O1I0II11i I000II;
                public O1I0II11i I000O01llI0;
                public IiOo0lO1 I000OOo1O;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(IiOlooi.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 35 */            I000OiO = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(IiOlooi.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, oOoOl1001II)};
                }

                public static LinkedHashMap I00000oIO(LinkedHashMap linkedHashMap) throws IOException {
/* 11 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 28 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 36 */                Object key = entry.getKey();
/* 42 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 49 */                Iterable<I01Ilioliio> iterable = (Iterable) entry.getValue();
/* 59 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 70 */                for (I01Ilioliio i01Ilioliio : iterable) {
/* 78 */                    int iI0000Il00O = i01Ilioliio.I0000Il00O();
/* 86 */                    int iI000OOo1O = I1I1OO00o1o.I000OOo1O(iI0000Il00O) + iI0000Il00O;
/* 89 */                    if (iI000OOo1O > 4096) {
/* 91 */                        iI000OOo1O = 4096;
                            }
/* 92 */                    I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(byteArrayOutputStream, iI000OOo1O);
/* 96 */                    i1I1OO00o1oI00111O.I00Io1lO(iI0000Il00O);
/* 99 */                    i01Ilioliio.I0001Ioi1lo(i1I1OO00o1oI00111O);
/* 102 */                   i1I1OO00o1oI00111O.I001iOo1i0O();
/* 107 */                   arrayList.add(OoiIlOl1iI.I00000oIO);
                        }
/* 115 */               linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
                    }
/* 186 */           return linkedHashMap2;
                }
            }
