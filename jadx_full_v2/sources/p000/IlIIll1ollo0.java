            package p000;
            
            public final class IlIIll1ollo0 extends I00io1l {
                public final IlIIio0l I00000oIO;
                public String I00000oOI;
                public final StringBuilder I0000Il00O;

                public IlIIll1ollo0(int i, int i2, char c) {
/* 6 */             IlIIio0l ilIIio0l = new IlIIio0l();
/* 9 */             this.I00000oIO = ilIIio0l;
/* 16 */            this.I0000Il00O = new StringBuilder();
/* 18 */            ilIIio0l.I000II = c;
/* 20 */            ilIIio0l.I000O01llI0 = i;
/* 22 */            ilIIio0l.I000OOo1O = i2;
                }

                @Override
                public final void I00000oIO(OlII0Io1 olII0Io1) {
/* 1 */             String str = this.I00000oOI;
/* 3 */             CharSequence charSequence = olII0Io1.I00000oIO;
/* 5 */             if (str == null) {
/* 11 */                this.I00000oOI = charSequence.toString();
/* 13 */                return;
                    }
/* 14 */            StringBuilder sb = this.I0000Il00O;
/* 16 */            sb.append(charSequence);
/* 21 */            sb.append('\n');
                }

                @Override
                public final void I0000oI00() {
/* 7 */             String strI00000oOI = Il0oolIl0.I00000oOI(this.I00000oOI.trim());
/* 11 */            IlIIio0l ilIIio0l = this.I00000oIO;
/* 13 */            ilIIio0l.I000OiO = strI00000oOI;
/* 21 */            ilIIio0l.I000iOII = this.I0000Il00O.toString();
                }

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
/* 1 */             int i = iiiliIioo0oi.I0001Ioi1lo;
/* 3 */             int i2 = iiiliIioo0oi.I0000Il00O;
/* 7 */             CharSequence charSequence = iiiliIioo0oi.I00000oIO.I00000oIO;
/* 9 */             int i3 = iiiliIioo0oi.I000O01llI0;
/* 12 */            IlIIio0l ilIIio0l = this.I00000oIO;
/* 14 */            if (i3 < 4 && i < charSequence.length()) {
/* 22 */                char cCharAt = charSequence.charAt(i);
/* 26 */                char c = ilIIio0l.I000II;
/* 28 */                if (cCharAt == c) {
/* 30 */                    int i4 = ilIIio0l.I000O01llI0;
/* 32 */                    int length = charSequence.length();
/* 36 */                    int i5 = i;
                            while (true) {
/* 37 */                        if (i5 >= length) {
                                    break;
                                }
/* 43 */                        if (charSequence.charAt(i5) != c) {
/* 45 */                            length = i5;
                                    break;
                                }
/* 47 */                        i5++;
                            }
/* 50 */                    int i6 = length - i;
/* 51 */                    if (i6 >= i4 && l1oOoi1ooIi.I0000O(charSequence, i + i6, charSequence.length()) == charSequence.length()) {
/* 73 */                        return new II0oOO1(-1, -1, true);
                            }
                        }
                    }
/* 79 */            int length2 = charSequence.length();
/* 83 */            for (int i7 = ilIIio0l.I000OOo1O; i7 > 0 && i2 < length2 && charSequence.charAt(i2) == ' '; i7--) {
/* 95 */                i2++;
                    }
/* 100 */           return II0oOO1.I00000oIO(i2);
                }
            }
