            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I11IIi implements Function1 {
                public final int I00iOIl;
                public O0i1lI0o1io I00iiI;

                public I11IIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 103 */                   O0i1lI0o1io o0i1lI0o1io = this.I00iiI;
/* 107 */                   O0i1lI0o1io o0i1lI0o1ioI0000O = ((OI0010oo1o) obj).I0000O();
/* 111 */                   Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 117 */                   return o0i1lI0o1ioI0000O.I000O01llI0(o0i1lI0o1io.I001IIilI0O());
                        default:
/* 6 */                     OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) obj;
/* 10 */                    OI0011 oi0011I000l1 = this.I00iiI.I000l1();
/* 14 */                    Ill0IO ill0IO = OlIlllOI1.I000l1;
/* 20 */                    O0o101l o0o101l = oi0011I000l1.I00i0ilIl0i(ill0IO).I00io1l;
/* 22 */                    if (o0o101l == null) {
/* 98 */                        O0i1lI0o1io.I00000oIO(11);
/* 102 */                       throw null;
                            }
/* 26 */                    IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = o0o101l.I0000oI00(oI1Iio0ii1, OIIl0iOOlo.I00iOIl);
/* 30 */                    if (iOIiO1lIl0lI0000oI00 == null) {
/* 95 */                        throw new AssertionError("Built-in class " + ill0IO.I00000oIO(oI1Iio0ii1) + " is not found");
                            }
/* 34 */                    if (iOIiO1lIl0lI0000oI00 instanceof OI000ilOol) {
/* 36 */                        return (OI000ilOol) iOIiO1lIl0lI0000oI00;
                            }
/* 66 */                    throw new AssertionError("Must be a class descriptor " + oI1Iio0ii1 + ", but was " + iOIiO1lIl0lI0000oI00);
                    }
                }
            }
