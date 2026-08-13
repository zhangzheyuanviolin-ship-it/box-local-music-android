            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IioolI0lo0il {
                public int I00000oIO;

                public static final IioolI0lo0il I00000oIO(int i) {
/* 3 */             IioolI0lo0il iioolI0lo0il = new IioolI0lo0il();
/* 6 */             iioolI0lo0il.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iioolI0lo0il;
                }

                public static String I00000oOI(int i) {
                    return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : IIlIOloOOO.I00100l0("Invalid(value=", i, ")");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IioolI0lo0il) && this.I00000oIO == ((IioolI0lo0il) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }
