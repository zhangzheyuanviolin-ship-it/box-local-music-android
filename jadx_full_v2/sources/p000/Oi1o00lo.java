            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi1o00lo {
                public int I00000oIO;

                public static final Oi1o00lo I00000oIO(int i) {
/* 3 */             Oi1o00lo oi1o00lo = new Oi1o00lo();
/* 6 */             oi1o00lo.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oi1o00lo;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oi1o00lo) && this.I00000oIO == ((Oi1o00lo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
                    return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
                }
            }
