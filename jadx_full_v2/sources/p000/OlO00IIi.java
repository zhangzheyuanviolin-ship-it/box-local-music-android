            package p000;
            
            public final class OlO00IIi {
                public long I00000oIO;

                public final boolean equals(Object obj) {
                    return (obj instanceof OlO00IIi) && this.I00000oIO == ((OlO00IIi) obj).I00000oIO;
                }

                public final int hashCode() {
/* 18 */            return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 4 */             O101lO1 o101lO1 = new O101lO1(2);
/* 7 */             long j = this.I00000oIO;
/* 13 */            if (j > 0) {
/* 34 */                o101lO1.add("stopTimeout=" + j + "ms");
                    }
/* 60 */            return IlIi0I0.I000oI1ioi(new StringBuilder("SharingStarted.WhileSubscribed("), IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I0000Il00O(o101lO1), null, null, null, null, 63), ')');
                }
            }
