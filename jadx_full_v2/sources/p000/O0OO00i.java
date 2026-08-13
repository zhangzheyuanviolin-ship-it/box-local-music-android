            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O0OO00i {
                public static final O0OO00i I0000Il00O = new O0OO00i(null, null, 63);
                public final Function1 I00000oIO;
                public final Function1 I00000oOI;

                public O0OO00i(Function1 function1, Function1 function12, int i) {
/* 4 */             function1 = (i & 1) != 0 ? null : function1;
/* 9 */             function12 = (i & 32) != 0 ? null : function12;
/* 15 */            this.I00000oIO = function1;
/* 17 */            this.I00000oOI = function12;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0OO00i)) {
/* 25 */                return false;
                    }
/* 9 */             O0OO00i o0OO00i = (O0OO00i) obj;
                    return this.I00000oIO == o0OO00i.I00000oIO && this.I00000oOI == o0OO00i.I00000oOI;
                }

                public final int hashCode() {
/* 2 */             Function1 function1 = this.I00000oIO;
/* 15 */            int iHashCode = (function1 != null ? function1.hashCode() : 0) * 28629151;
/* 16 */            Function1 function12 = this.I00000oOI;
/* 24 */            return iHashCode + (function12 != null ? function12.hashCode() : 0);
                }
            }
