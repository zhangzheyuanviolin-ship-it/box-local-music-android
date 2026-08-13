            package p000;

            import java.util.List;
            
            public final class Oil1Oil1i01l {
                public O1oIOiI11o0 I00000oIO;
                public List I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oil1Oil1i01l)) {
/* 32 */                return false;
                    }
/* 9 */             Oil1Oil1i01l oil1Oil1i01l = (Oil1Oil1i01l) obj;
                    return this.I00000oIO.equals(oil1Oil1i01l.I00000oIO) && this.I00000oOI.equals(oil1Oil1i01l.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "SendMessageTrigger(model=" + this.I00000oIO + ", messages=" + this.I00000oOI + ")";
                }
            }
