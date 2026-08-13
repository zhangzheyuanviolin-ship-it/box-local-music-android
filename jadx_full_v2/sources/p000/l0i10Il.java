            package p000;
            
            public final class l0i10Il {
                public lOI1lll1l10 I00000oIO;
                public iiOi1illIO1o I00000oOI;
                public l0I0O000II I0000Il00O;
                public lOI1lll1l10 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof l0i10Il) {
/* 10 */                l0i10Il l0i10il = (l0i10Il) obj;
/* 20 */                if (this.I00000oIO.equals(l0i10il.I00000oIO)) {
/* 22 */                    iiOi1illIO1o iioi1illio1o = this.I00000oOI;
/* 24 */                    iiOi1illIO1o iioi1illio1o2 = l0i10il.I00000oOI;
/* 26 */                    if (iioi1illio1o != null ? iioi1illio1o == iioi1illio1o2 : iioi1illio1o2 == null) {
/* 34 */                        l0I0O000II l0i0o000ii = this.I0000Il00O;
/* 36 */                        l0I0O000II l0i0o000ii2 = l0i10il.I0000Il00O;
/* 38 */                        if (l0i0o000ii != null ? l0i0o000ii.equals(l0i0o000ii2) : l0i0o000ii2 == null) {
/* 49 */                            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 51 */                            lOI1lll1l10 loi1lll1l102 = l0i10il.I0000O;
/* 53 */                            if (loi1lll1l10 != null ? loi1lll1l10.equals(loi1lll1l102) : loi1lll1l102 == null) {
/* 1 */                                 return true;
                                    }
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            iiOi1illIO1o iioi1illio1o = this.I00000oOI;
/* 24 */            int iHashCode2 = ((iHashCode * 1000003) ^ (iioi1illio1o == null ? 0 : iioi1illio1o.hashCode())) * 1000003;
/* 25 */            l0I0O000II l0i0o000ii = this.I0000Il00O;
/* 36 */            int iHashCode3 = (iHashCode2 ^ (l0i0o000ii == null ? 0 : l0i0o000ii.hashCode())) * 1000003;
/* 37 */            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 46 */            return iHashCode3 ^ (loi1lll1l10 != null ? loi1lll1l10.hashCode() : 0);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 11 */            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 13 */            l0I0O000II l0i0o000ii = this.I0000Il00O;
/* 17 */            String strValueOf = String.valueOf(this.I00000oOI);
/* 21 */            String strValueOf2 = String.valueOf(l0i0o000ii);
/* 25 */            String strValueOf3 = String.valueOf(loi1lll1l10);
/* 29 */            int length2 = strValueOf.length();
/* 54 */            StringBuilder sb = new StringBuilder(length + 46 + length2 + 23 + strValueOf2.length() + 17 + strValueOf3.length() + 1);
/* 61 */            IIl001iO0Io.I001lIiIIo1O(sb, "LlmResult{results=", string, ", inferenceEventTraceResult=", strValueOf);
/* 68 */            IIl001iO0Io.I001lIiIIo1O(sb, ", legionResultMetadata=", strValueOf2, ", thoughtProcess=", strValueOf3);
/* 73 */            sb.append("}");
/* 76 */            return sb.toString();
                }
            }
