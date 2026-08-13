            package p000;
            
            public final class O01l0lO0li extends O01O10Ii {
                public final O100l1O0IiiO I00iOIl;

                public O01l0lO0li() {
/* 6 */             IliIiio1 iliIiio1 = O100l1O0IiiO.I00l0I0l0lO1;
/* 12 */            this.I00iOIl = new O100l1O0IiiO(false);
                }

                public final void I0000oI00(String str, O01O10Ii o01O10Ii) {
/* 1 */             if (o01O10Ii == null) {
/* 3 */                 o01O10Ii = O01iIOolI.I00iOIl;
                    }
/* 7 */             this.I00iOIl.put(str, o01O10Ii);
                }

                public final void I0001Ioi1lo(String str, String str2) {
                    O01O10Ii o01O10Ii;
/* 1 */             if (str2 == null) {
/* 3 */                 o01O10Ii = O01iIOolI.I00iOIl;
                    } else {
/* 8 */                 O01li1IO o01li1IO = new O01li1IO();
/* 11 */                o01li1IO.I00iOIl = str2;
/* 13 */                o01O10Ii = o01li1IO;
                    }
/* 14 */            I0000oI00(str, o01O10Ii);
                }

                public final O01O10Ii I000OOo1O(String str) {
/* 7 */             return (O01O10Ii) this.I00iOIl.get(str);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj != this) {
                        return (obj instanceof O01l0lO0li) && ((O01l0lO0li) obj).I00iOIl.equals(this.I00iOIl);
                    }
/* 22 */            return true;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
