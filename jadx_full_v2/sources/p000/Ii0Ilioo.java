            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Ii0Ilioo implements Oi0O0llI {
                public static final Ii0II0loio Companion = new Ii0II0loio();
                public static final O0ioIllo0i1[] I000OiO;
                public int I00000oIO;
                public List I00000oOI;
                public O1oo01I1 I0000Il00O;
                public String I0000O;
                public Iol01oi1o I0000oI00;
                public Double I0001Ioi1lo;
                public List I000II;
                public O01ioO1o0i11 I000O01llI0;
                public O01ioO1o0i11 I000OOo1O;

                static {
/* 8 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 72 */            I000OiO = new O0ioIllo0i1[]{null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(8)), null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(9)), null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(10)), null, null};
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ii0Ilioo)) {
/* 7 */                 return false;
                    }
/* 11 */            Ii0Ilioo ii0Ilioo = (Ii0Ilioo) obj;
/* 17 */            if (this.I00000oIO != ii0Ilioo.I00000oIO || !O0000Ioio00.I0000O(this.I00000oOI, ii0Ilioo.I00000oOI) || !O0000Ioio00.I0000O(this.I0000Il00O, ii0Ilioo.I0000Il00O) || !O0000Ioio00.I0000O(this.I0000O, ii0Ilioo.I0000O) || this.I0000oI00 != ii0Ilioo.I0000oI00 || !O0000Ioio00.I0000O(this.I0001Ioi1lo, ii0Ilioo.I0001Ioi1lo) || !O0000Ioio00.I0000O(this.I000II, ii0Ilioo.I000II) || !O0000Ioio00.I0000O(this.I000O01llI0, ii0Ilioo.I000O01llI0)) {
/* 7 */                 return false;
                    }
/* 93 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000OOo1O;
/* 95 */            O01ioO1o0i11 o01ioO1o0i112 = ii0Ilioo.I000OOo1O;
/* 97 */            if (o01ioO1o0i11 == null) {
/* 103 */               zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 108 */               zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 12 */            int iI0000oI00 = IIl001iO0Io.I0000oI00(Integer.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
/* 16 */            O1oo01I1 o1oo01I1 = this.I0000Il00O;
/* 28 */            int iHashCode = (iI0000oI00 + (o1oo01I1 == null ? 0 : o1oo01I1.hashCode())) * 31;
/* 29 */            String str = this.I0000O;
/* 40 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 41 */            Iol01oi1o iol01oi1o = this.I0000oI00;
/* 52 */            int iHashCode3 = (iHashCode2 + (iol01oi1o == null ? 0 : iol01oi1o.hashCode())) * 31;
/* 53 */            Double d = this.I0001Ioi1lo;
/* 64 */            int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
/* 65 */            List list = this.I000II;
/* 76 */            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
/* 77 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000O01llI0;
/* 90 */            int iHashCode6 = (iHashCode5 + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode())) * 31;
/* 91 */            O01ioO1o0i11 o01ioO1o0i112 = this.I000OOo1O;
/* 102 */           return iHashCode6 + (o01ioO1o0i112 != null ? o01ioO1o0i112.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             List list = this.I00000oOI;
/* 5 */             O1oo01I1 o1oo01I1 = this.I0000Il00O;
/* 7 */             String str = this.I0000O;
/* 9 */             Iol01oi1o iol01oi1o = this.I0000oI00;
/* 11 */            Double d = this.I0001Ioi1lo;
/* 13 */            List list2 = this.I000II;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000O01llI0;
/* 17 */            O01ioO1o0i11 o01ioO1o0i112 = this.I000OOo1O;
/* 24 */            String strI00000oOI = o01ioO1o0i112 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i112);
/* 32 */            StringBuilder sb = new StringBuilder("CreateMessageRequestParams(maxTokens=");
/* 35 */            sb.append(i);
/* 40 */            sb.append(", messages=");
/* 43 */            sb.append(list);
/* 48 */            sb.append(", modelPreferences=");
/* 51 */            sb.append(o1oo01I1);
/* 56 */            sb.append(", systemPrompt=");
/* 59 */            sb.append(str);
/* 64 */            sb.append(", includeContext=");
/* 67 */            sb.append(iol01oi1o);
/* 72 */            sb.append(", temperature=");
/* 75 */            sb.append(d);
/* 80 */            sb.append(", stopSequences=");
/* 83 */            sb.append(list2);
/* 88 */            sb.append(", metadata=");
/* 91 */            sb.append(o01ioO1o0i11);
/* 96 */            sb.append(", meta=");
/* 101 */           return IIl001iO0Io.I00100l0(sb, strI00000oOI, ")");
                }
            }
