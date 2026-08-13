            package p000;

            import java.text.CharacterIterator;
            
            public final class IO11o1i0olIO implements CharacterIterator {
                public final CharSequence I00iOIl;
                public final int I00iiI;
                public int I00iiO = 0;

                public IO11o1i0olIO(int i, CharSequence charSequence) {
/* 4 */             this.I00iOIl = charSequence;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final Object clone() {
                    try {
/* 1 */                 return super.clone();
                    } catch (CloneNotSupportedException unused) {
/* 20 */                throw new InternalError();
                    }
                }

                @Override
                public final char current() {
/* 1 */             int i = this.I00iiO;
/* 5 */             if (i == this.I00iiI) {
/* 7 */                 return (char) 65535;
                    }
/* 13 */            return this.I00iOIl.charAt(i);
                }

                @Override
                public final char first() {
/* 2 */             this.I00iiO = 0;
/* 4 */             return current();
                }

                @Override
                public final int getBeginIndex() {
/* 1 */             return 0;
                }

                @Override
                public final int getEndIndex() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final int getIndex() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final char last() {
/* 1 */             int i = this.I00iiI;
/* 3 */             if (i == 0) {
/* 5 */                 this.I00iiO = i;
/* 7 */                 return (char) 65535;
                    }
                    int i2 = i - 1;
/* 13 */            this.I00iiO = i2;
/* 17 */            return this.I00iOIl.charAt(i2);
                }

                @Override
                public final char next() {
/* 3 */             int i = this.I00iiO + 1;
/* 5 */             this.I00iiO = i;
/* 7 */             int i2 = this.I00iiI;
/* 9 */             if (i < i2) {
/* 19 */                return this.I00iOIl.charAt(i);
                    }
/* 11 */            this.I00iiO = i2;
/* 13 */            return (char) 65535;
                }

                @Override
                public final char previous() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i <= 0) {
/* 5 */                 return (char) 65535;
                    }
                    int i2 = i - 1;
/* 11 */            this.I00iiO = i2;
/* 15 */            return this.I00iOIl.charAt(i2);
                }

                @Override
                public final char setIndex(int i) {
/* 3 */             if (i > this.I00iiI || i < 0) {
/* 16 */                I000II.I000iOII("invalid position");
/* 19 */                return (char) 0;
                    }
/* 7 */             this.I00iiO = i;
/* 9 */             return current();
                }
            }
