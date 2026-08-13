            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class OlIIOI0o {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public static OlIIOI0o I00000oIO(int i, int i2, int i3) {
/* 3 */             OlIIOI0o olIIOI0o = new OlIIOI0o();
/* 6 */             olIIOI0o.I00000oIO = i;
/* 8 */             olIIOI0o.I00000oOI = i2;
/* 10 */            olIIOI0o.I0000Il00O = i3;
/* 12 */            VarHandle.storeStoreFence();
/* 98 */            return olIIOI0o;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && OlIIOI0o.class == obj.getClass()) {
/* 17 */                OlIIOI0o olIIOI0o = (OlIIOI0o) obj;
/* 23 */                if (this.I00000oIO == olIIOI0o.I00000oIO && this.I00000oOI == olIIOI0o.I00000oOI && this.I0000Il00O == olIIOI0o.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 23 */            return Objects.hash(Integer.valueOf(this.I00000oIO), Integer.valueOf(this.I00000oOI), Integer.valueOf(this.I0000Il00O));
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SourceSpan{line=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", column=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", length=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, "}", sb);
                }
            }
