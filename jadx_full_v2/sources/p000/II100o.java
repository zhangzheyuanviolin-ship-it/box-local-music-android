            package p000;
            
            public final class II100o extends I00io1l {
                public II0oi10Io0I I00000oIO;

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
                    char cCharAt;
/* 1 */             int i = iiiliIioo0oi.I0001Ioi1lo;
/* 5 */             CharSequence charSequence = iiiliIioo0oi.I00000oIO.I00000oIO;
/* 10 */            if (iiiliIioo0oi.I000O01llI0 >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
/* 68 */                return null;
                    }
/* 30 */            int i2 = iiiliIioo0oi.I0000O + iiiliIioo0oi.I000O01llI0;
/* 31 */            int i3 = i2 + 1;
/* 35 */            CharSequence charSequence2 = iiiliIioo0oi.I00000oIO.I00000oIO;
/* 37 */            int i4 = i + 1;
/* 43 */            if (i4 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i4)) == '\t' || cCharAt == ' ')) {
/* 58 */                i3 = i2 + 2;
                    }
/* 64 */            return new II0oOO1(-1, i3, false);
                }
            }
