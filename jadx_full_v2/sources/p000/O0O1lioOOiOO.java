            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0O1lioOOiOO;", "LO1oooooIio;", "LO0O1loIl;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class O0O1lioOOiOO extends O1oooooIio {
                public final Function1 I00000oIO;
                public final Function1 I00000oOI;

                public O0O1lioOOiOO(Function1 function1, Function1 function12) {
/* 4 */             this.I00000oIO = function1;
/* 6 */             this.I00000oOI = function12;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             O0O1loIl o0O1loIl = new O0O1loIl();
/* 8 */             o0O1loIl.I00o0iI0io1 = this.I00000oIO;
/* 12 */            o0O1loIl.I00o0l1o1o0 = this.I00000oOI;
/* 20 */            return o0O1loIl;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             O0O1loIl o0O1loIl = (O0O1loIl) o1ooOo;
/* 5 */             o0O1loIl.I00o0iI0io1 = this.I00000oIO;
/* 9 */             o0O1loIl.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0O1lioOOiOO)) {
/* 7 */                 return false;
                    }
/* 11 */            O0O1lioOOiOO o0O1lioOOiOO = (O0O1lioOOiOO) obj;
                    return this.I00000oIO == o0O1lioOOiOO.I00000oIO && this.I00000oOI == o0O1lioOOiOO.I00000oOI;
                }

                public final int hashCode() {
/* 2 */             Function1 function1 = this.I00000oIO;
/* 12 */            int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
/* 14 */            Function1 function12 = this.I00000oOI;
/* 22 */            return iHashCode + (function12 != null ? function12.hashCode() : 0);
                }
            }
