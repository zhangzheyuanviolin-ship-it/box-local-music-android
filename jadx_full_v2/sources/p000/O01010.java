            package p000;
            
            public final class O01010 extends I0I1liIO0ii {
                public static final O01010 I00ilO0;
                public static final O01010 I00io1l;
                public static final O01010 I00ioIO;
                public static final O01010 I00l0I0l0lO1;
                public static final O01010 I00l0OO0IO;
                public static final O01010 I00li1OI;
                public static final O01010 I00ll1;
                public static final O01010 I00lli11;
                public static final O01010 I00lll10;
                public static final O01010 I00o0iI0io1;
                public final int I00iio;
                public static final O01010 I00ilI0I1 = new O01010(false, "package", 0);
                public static final O01010 I00o0l1o1o0 = new O01010(false, "unknown", 11);

                static {
/* 14 */            boolean z = true;
/* 21 */            I00ilO0 = new O01010(z, "protected_and_package", 1);
/* 31 */            I00io1l = new O01010(z, "protected_static", 2);
/* 35 */            boolean z2 = false;
/* 42 */            I00ioIO = new O01010(z2, "inherited", 3);
/* 52 */            I00l0I0l0lO1 = new O01010(z2, "internal", 4);
/* 62 */            I00l0OO0IO = new O01010(z2, "invisible_fake", 5);
/* 72 */            I00li1OI = new O01010(z2, "local", 6);
/* 82 */            I00ll1 = new O01010(z2, "private", 7);
/* 93 */            I00lli11 = new O01010(z2, "private_to_this", 8);
/* 97 */            boolean z3 = true;
/* 105 */           I00lll10 = new O01010(z3, "protected", 9);
/* 116 */           I00o0iI0io1 = new O01010(z3, "public", 10);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O01010(boolean z, String str, int i) {
/* 3 */             super(str, z);
/* 1 */             this.I00iio = i;
                }

                @Override
                public Integer I00000oIO(I0I1liIO0ii i0I1liIO0ii) {
/* 1 */             int i = this.I00iio;
/* 6 */             O01010 o01010 = I00lli11;
/* 8 */             O01010 o010102 = I00ll1;
                    switch (i) {
                        case 0:
/* 48 */                    if (this == i0I1liIO0ii) {
/* 50 */                        return 0;
                            }
/* 55 */                    O1OOII o1ooii = OoooIi1i0i.I00000oIO;
                            return (i0I1liIO0ii == o010102 || i0I1liIO0ii == o01010) ? 1 : -1;
                        case 1:
/* 18 */                    if (this == i0I1liIO0ii) {
/* 43 */                        return 0;
                            }
/* 22 */                    if (i0I1liIO0ii == I00l0I0l0lO1) {
/* 24 */                        return null;
                            }
/* 26 */                    O1OOII o1ooii2 = OoooIi1i0i.I00000oIO;
                            return (i0I1liIO0ii == o010102 || i0I1liIO0ii == o01010) ? 1 : -1;
                        default:
/* 13 */                    return super.I00000oIO(i0I1liIO0ii);
                    }
                }

                @Override
                public String I0000oI00() {
                    switch (this.I00iio) {
                        case 0:
/* 20 */                    return "public/*package*/";
                        case 1:
/* 17 */                    return "protected/*protected and package*/";
                        case 2:
/* 14 */                    return "protected/*protected static*/";
                        case 8:
/* 11 */                    return "private/*private to this*/";
                        default:
/* 6 */                     return super.I0000oI00();
                    }
                }

                @Override
                public I0I1liIO0ii I000l1() {
/* 1 */             int i = this.I00iio;
/* 3 */             O01010 o01010 = I00lll10;
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
/* 9 */                     return o01010;
                        default:
/* 8 */                     return this;
                    }
                }
            }
