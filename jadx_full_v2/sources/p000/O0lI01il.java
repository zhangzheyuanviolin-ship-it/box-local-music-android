            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class O0lI01il implements IllOOo00lI {
                public final int I00iOIl;
                public O0lI0O1OOi1 I00iiI;

                public O0lI01il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0lI0O1OOi1 o0lI0O1OOi1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 126 */                   Object obj = o0lI0O1OOi1.I00ioIO.I00iOIl;
/* 132 */                   String str = o0lI0O1OOi1.I00ilI0I1.I00000oIO.I00000oIO;
/* 139 */                   return O1Oii0O0loo.I000OiO(new ArrayList());
                        case 1:
/* 107 */                   o0lI0O1OOi1.I00io1l.getClass();
/* 120 */                   return new ArrayList(IOOi1I.I0000O(Il01100l.I00iOIl, 10));
                        default:
/* 10 */                    HashMap map = new HashMap();
/* 13 */                    O1I0II11i o1I0II11i = o0lI0O1OOi1.I00l0I0l0lO1;
/* 18 */                    O0O00I1Ili o0O00I1Ili = O0lI0O1OOi1.I00lli11[0];
/* 38 */                    for (Map.Entry entry : ((Map) o1I0II11i.invoke()).entrySet()) {
/* 50 */                        String str2 = (String) entry.getKey();
/* 56 */                        OOoOI1lIOi oOoOI1lIOi = (OOoOI1lIOi) entry.getValue();
/* 58 */                        O0I0oiO1I o0I0oiO1II0000Il00O = O0I0oiO1I.I0000Il00O(str2);
/* 62 */                        O0i1llII o0i1llII = oOoOI1lIOi.I00000oOI;
/* 66 */                        O0i1lIiil o0i1lIiil = (O0i1lIiil) o0i1llII.I0000Il00O;
/* 68 */                        int iOrdinal = o0i1lIiil.ordinal();
/* 73 */                        if (iOrdinal == 2) {
/* 100 */                           map.put(o0I0oiO1II0000Il00O, o0I0oiO1II0000Il00O);
                                } else if (iOrdinal == 5) {
/* 81 */                            String str3 = (String) o0i1llII.I000O01llI0;
/* 85 */                            if (o0i1lIiil != O0i1lIiil.I00l0I0l0lO1) {
/* 88 */                                str3 = null;
                                    }
/* 89 */                            if (str3 != null) {
/* 96 */                                map.put(o0I0oiO1II0000Il00O, O0I0oiO1I.I0000Il00O(str3));
                                    }
                                }
                            }
/* 104 */                   return map;
                    }
                }
            }
