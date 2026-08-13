            package p000;

            import java.util.List;
            import java.util.Map;
            
            public final class OoOOoo11 {
                public static final OoOOoo11 I0000O = new OoOOoo11(Il01100l.I00iOIl, Il011I1OiO0I.I00iOIl, null);
                public final List I00000oIO;
                public final Map I00000oOI;
                public final OoOOoo11 I0000Il00O;

                public OoOOoo11(List list, Map map, OoOOoo11 ooOOoo11) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = map;
/* 8 */             this.I0000Il00O = ooOOoo11;
                }

                public final O0O0OIOO I00000oIO(int i) {
/* 11 */            O0O0OIOO o0o0oioo = (O0O0OIOO) this.I00000oOI.get(Integer.valueOf(i));
/* 13 */            if (o0o0oioo != null) {
/* 49 */                return o0o0oioo;
                    }
/* 15 */            OoOOoo11 ooOOoo11 = this.I0000Il00O;
/* 17 */            if (ooOOoo11 != null) {
/* 19 */                return ooOOoo11.I00000oIO(i);
                    }
/* 24 */            return null;
                }
            }
