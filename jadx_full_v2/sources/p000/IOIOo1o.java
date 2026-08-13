            package p000;
            
            public final class IOIOo1o {
                public final IOIOill I00000oIO;
                public final int I00000oOI;

                public IOIOo1o(IOIOill iOIOill, int i) {
/* 4 */             this.I00000oIO = iOIOill;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOIOo1o)) {
/* 28 */                return false;
                    }
/* 9 */             IOIOo1o iOIOo1o = (IOIOo1o) obj;
                    return this.I00000oIO.equals(iOIOo1o.I00000oIO) && this.I00000oOI == iOIOo1o.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
                    int i;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 7 */             int i2 = 0;
                    while (true) {
/* 8 */                 i = this.I00000oOI;
/* 10 */                if (i2 >= i) {
                            break;
                        }
/* 14 */                sb.append("kotlin/Array<");
/* 17 */                i2++;
                    }
/* 22 */            sb.append(this.I00000oIO);
/* 25 */            for (int i3 = 0; i3 < i; i3++) {
/* 29 */                sb.append(">");
                    }
/* 35 */            return sb.toString();
                }
            }
