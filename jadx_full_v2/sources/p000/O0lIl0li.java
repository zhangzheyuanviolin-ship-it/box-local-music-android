            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class O0lIl0li {
                public final O0iIl1 I00000oIO;
                public final List I00000oOI;
                public final ArrayList I0000Il00O;
                public final List I0000O;

                public O0lIl0li(O0iIl1 o0iIl1, List list, ArrayList arrayList, List list2) {
/* 4 */             this.I00000oIO = o0iIl1;
/* 6 */             this.I00000oOI = list;
/* 8 */             this.I0000Il00O = arrayList;
/* 10 */            this.I0000O = list2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0lIl0li)) {
/* 54 */                return false;
                    }
/* 9 */             O0lIl0li o0lIl0li = (O0lIl0li) obj;
                    return this.I00000oIO.equals(o0lIl0li.I00000oIO) && this.I00000oOI.equals(o0lIl0li.I00000oOI) && this.I0000Il00O.equals(o0lIl0li.I0000Il00O) && this.I0000O.equals(o0lIl0li.I0000O);
                }

                public final int hashCode() {
/* 36 */            return this.I0000O.hashCode() + Oi010OO0.I000OOo1O((this.I0000Il00O.hashCode() + IIl001iO0Io.I0000oI00(this.I00000oIO.hashCode() * 961, 31, this.I00000oOI)) * 31, 31, false);
                }

                public final String toString() {
/* 48 */            return "MethodSignatureData(returnType=" + this.I00000oIO + ", receiverType=null, valueParameters=" + this.I00000oOI + ", typeParameters=" + this.I0000Il00O + ", hasStableParameterNames=false, errors=" + this.I0000O + ')';
                }
            }
