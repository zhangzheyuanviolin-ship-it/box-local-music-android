            package p000;
            
/* 9 */     public final class IiIooooiilo {
                public final OOiilOlOOI I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public IiIooooiilo(OOiilOlOOI oOiilOlOOI, int i, int i2) {
/* 4 */             this.I00000oIO = oOiilOlOOI;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
                }

                public static IiIooooiilo I00000oIO(Class cls) {
/* 5 */             return new IiIooooiilo(1, 0, cls);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IiIooooiilo)) {
/* 31 */                return false;
                    }
/* 5 */             IiIooooiilo iiIooooiilo = (IiIooooiilo) obj;
                    return this.I00000oIO.equals(iiIooooiilo.I00000oIO) && this.I00000oOI == iiIooooiilo.I00000oOI && this.I0000Il00O == iiIooooiilo.I0000Il00O;
                }

                public final int hashCode() {
/* 18 */            return this.I0000Il00O ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003);
                }

                public final String toString() {
                    String str;
/* 5 */             StringBuilder sb = new StringBuilder("Dependency{anInterface=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", type=");
/* 18 */            int i = this.I00000oOI;
/* 33 */            sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
/* 38 */            sb.append(", injection=");
/* 41 */            int i2 = this.I0000Il00O;
/* 43 */            if (i2 == 0) {
/* 67 */                str = "direct";
                    } else if (i2 == 1) {
/* 64 */                str = "provider";
                    } else {
/* 48 */                if (i2 != 2) {
/* 59 */                    I000II.I000O01llI0(Oi010OO0.I000oI1ioi(i2, "Unsupported injection: "));
/* 62 */                    return null;
                        }
/* 50 */                str = "deferred";
                    }
/* 71 */            return IIl001iO0Io.I00100l0(sb, str, "}");
                }

/* 10 */        public IiIooooiilo(int i, int i2, Class cls) {
/* 11 */            this(OOiilOlOOI.I00000oIO(cls), i, i2);
                }
            }
