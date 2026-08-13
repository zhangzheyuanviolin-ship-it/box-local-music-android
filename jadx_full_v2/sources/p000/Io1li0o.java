            package p000;

            import java.util.Objects;
            
            public final class Io1li0o extends I0OIoOl0l0I0 {
                public int I00000oIO;
                public int I00000oOI;
                public Io1lOlI I0000Il00O;
                public I0i0io0oOOi I0000O;

                public final int I00000oIO() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             Io1lOlI io1lOlI = this.I0000Il00O;
/* 7 */             if (io1lOlI == Io1lOlI.I0001Ioi1lo) {
/* 9 */                 return i;
                    }
/* 12 */            if (io1lOlI == Io1lOlI.I0000Il00O) {
/* 14 */                return i + 5;
                    }
/* 19 */            if (io1lOlI == Io1lOlI.I0000O) {
/* 21 */                return i + 5;
                    }
/* 26 */            if (io1lOlI == Io1lOlI.I0000oI00) {
/* 28 */                return i + 5;
                    }
/* 33 */            I000II.I001IO000("Unknown variant");
/* 36 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof Io1li0o)) {
/* 3 */                 return false;
                    }
/* 7 */             Io1li0o io1li0o = (Io1li0o) obj;
                    return io1li0o.I00000oIO == this.I00000oIO && io1li0o.I00000oIO() == I00000oIO() && io1li0o.I0000Il00O == this.I0000Il00O && io1li0o.I0000O == this.I0000O;
                }

                public final int hashCode() {
/* 21 */            return Objects.hash(Integer.valueOf(this.I00000oIO), Integer.valueOf(this.I00000oOI), this.I0000Il00O, this.I0000O);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
/* 10 */            sb.append(this.I0000Il00O);
/* 15 */            sb.append(", hashType: ");
/* 20 */            sb.append(this.I0000O);
/* 25 */            sb.append(", ");
/* 30 */            sb.append(this.I00000oOI);
/* 35 */            sb.append("-byte tags, and ");
/* 42 */            return IIl001iO0Io.I000lI(this.I00000oIO, "-byte key)", sb);
                }
            }
