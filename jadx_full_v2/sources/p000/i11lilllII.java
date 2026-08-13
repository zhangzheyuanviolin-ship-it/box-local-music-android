            package p000;
            
            public final class i11lilllII {
                public final i1111ll I00000oIO;
                public final String I00000oOI;
                public final Object[] I0000Il00O;
                public final int I0000O;

                public i11lilllII(i1111ll i1111llVar, String str, Object[] objArr) {
/* 4 */             this.I00000oIO = i1111llVar;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = objArr;
/* 11 */            char cCharAt = str.charAt(0);
/* 18 */            if (cCharAt < 55296) {
/* 20 */                this.I0000O = cCharAt;
/* 22 */                return;
                    }
/* 23 */            int i = cCharAt & 8191;
/* 25 */            int i2 = 1;
/* 26 */            int i3 = 13;
                    while (true) {
/* 28 */                int i4 = i2 + 1;
/* 30 */                char cCharAt2 = str.charAt(i2);
/* 34 */                if (cCharAt2 < 55296) {
/* 47 */                    this.I0000O = i | (cCharAt2 << i3);
/* 98 */                    return;
                        } else {
/* 39 */                    i |= (cCharAt2 & 8191) << i3;
/* 40 */                    i3 += 13;
/* 42 */                    i2 = i4;
                        }
                    }
                }

                public final int I00000oIO() {
/* 1 */             int i = this.I0000O;
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 return 1;
                    }
                    return (i & 4) == 4 ? 3 : 2;
                }
            }
