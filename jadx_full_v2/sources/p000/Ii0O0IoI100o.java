            package p000;
            
            @Oili0O
            public final class Ii0O0IoI100o implements Oi0OO01oi {
                public static final Ii0O01o Companion = new Ii0O01o();
                public static final O0ioIllo0i1[] I0001Ioi1lo = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new IOlIlo1(11)), null, null, null, null};
                public Oi1lo0illIO I00000oIO;
                public O1iOol1 I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public O01ioO1o0i11 I0000oI00;

                /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ii0O0IoI100o)) {
/* 7 */                 return false;
                    }
/* 11 */            Ii0O0IoI100o ii0O0IoI100o = (Ii0O0IoI100o) obj;
/* 17 */            if (this.I00000oIO != ii0O0IoI100o.I00000oIO || !O0000Ioio00.I0000O(this.I00000oOI, ii0O0IoI100o.I00000oOI) || !O0000Ioio00.I0000O(this.I0000Il00O, ii0O0IoI100o.I0000Il00O)) {
/* 7 */                 return false;
                    }
/* 42 */            String str = this.I0000O;
/* 44 */            String str2 = ii0O0IoI100o.I0000O;
/* 46 */            if (str == null) {
/* 52 */                zEquals = str2 == null;
                    } else if (str2 != null) {
/* 57 */                zEquals = str.equals(str2);
                    }
                    return zEquals && O0000Ioio00.I0000O(this.I0000oI00, ii0O0IoI100o.I0000oI00);
                }

                public final int hashCode() {
/* 20 */            int iI000O01llI0 = Oi010OO0.I000O01llI0((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O);
/* 24 */            String str = this.I0000O;
/* 36 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 37 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000oI00;
/* 48 */            return iHashCode + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             Oi1lo0illIO oi1lo0illIO = this.I00000oIO;
/* 3 */             O1iOol1 o1iOol1 = this.I00000oOI;
/* 5 */             String str = this.I0000Il00O;
/* 7 */             String str2 = this.I0000O;
/* 18 */            String strI000lI = str2 == null ? "null" : IlIi0I0.I000lI("StopReason(value=", str2, ")");
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000oI00;
/* 28 */            StringBuilder sb = new StringBuilder("CreateMessageResult(role=");
/* 31 */            sb.append(oi1lo0illIO);
/* 36 */            sb.append(", content=");
/* 39 */            sb.append(o1iOol1);
/* 44 */            sb.append(", model=");
/* 51 */            IIl001iO0Io.I001lIiIIo1O(sb, str, ", stopReason=", strI000lI, ", meta=");
/* 54 */            sb.append(o01ioO1o0i11);
/* 57 */            sb.append(")");
/* 60 */            return sb.toString();
                }
            }
