            package p000;
            
            public final class OlOl0Il0IO1i implements CharSequence {
                public final int I00iOIl;
                public char[] I00iiI;
                public String I00iiO;

                @Override
                public final char charAt(int i) {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI[i];
                }

                @Override
                public final int length() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.length;
                }

                @Override
                public final CharSequence subSequence(int i, int i2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    return new String(this.I00iiI, i, i2 - i);
                        default:
/* 11 */                    return new String(this.I00iiI, i, i2 - i);
                    }
                }

                @Override
                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    String str = this.I00iiO;
/* 22 */                    if (str != null) {
/* 33 */                        return str;
                            }
/* 28 */                    String str2 = new String(this.I00iiI);
/* 31 */                    this.I00iiO = str2;
/* 33 */                    return str2;
                        default:
/* 6 */                     String str3 = this.I00iiO;
/* 8 */                     if (str3 != null) {
/* 19 */                        return str3;
                            }
/* 14 */                    String str4 = new String(this.I00iiI);
/* 17 */                    this.I00iiO = str4;
/* 19 */                    return str4;
                    }
                }
            }
