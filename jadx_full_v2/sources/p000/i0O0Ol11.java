            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class i0O0Ol11 implements i0Ii0I1ll {
                public final int I00iOIl;
                public i0IOo0i0 I00iiI;
                public Oi00IilOloo0 I00iiO;
                public i0IOo0i0 I00iio;
                public i0IOo0i0 I00ilI0I1;
                public i0IOo0i0 I00ilO0;

                public i0O0Ol11(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I0000Il00O() {
                    switch (this.I00iOIl) {
                        case 0:
/* 73 */                    Object objI0000Il00O = this.I00iiI.I0000Il00O();
/* 85 */                    i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO(this.I00iiO));
/* 96 */                    i0IOo0i0 i0ioo0i02 = new i0IOo0i0(liIllOil01.I00000oIO(this.I00iio));
/* 101 */                   Object objI0000Il00O2 = this.I00ilI0I1.I0000Il00O();
/* 117 */                   i0OI1IOoili1 i0oi1iooili1 = (i0OI1IOoili1) this.I00ilO0.I0000Il00O();
/* 119 */                   i0O0I111OoII i0o0i111ooii = new i0O0I111OoII();
/* 126 */                   i0o0i111ooii.I00000oIO = new byte[8192];
/* 128 */                   i0o0i111ooii.I00000oOI = (i0Il00O1) objI0000Il00O;
/* 130 */                   i0o0i111ooii.I0000oI00 = i0ioo0i0;
/* 132 */                   i0o0i111ooii.I0001Ioi1lo = i0ioo0i02;
/* 134 */                   i0o0i111ooii.I0000Il00O = (i0O0oOiO11) objI0000Il00O2;
/* 136 */                   i0o0i111ooii.I0000O = i0oi1iooili1;
/* 138 */                   VarHandle.storeStoreFence();
/* 141 */                   return i0o0i111ooii;
                        default:
/* 8 */                     Object objI0000Il00O3 = this.I00iiI.I0000Il00O();
/* 20 */                    i0IOo0i0 i0ioo0i03 = new i0IOo0i0(liIllOil01.I00000oIO(this.I00iiO));
/* 25 */                    Object objI0000Il00O4 = this.I00iio.I0000Il00O();
/* 37 */                    i0IOo0i0 i0ioo0i04 = new i0IOo0i0(liIllOil01.I00000oIO(this.I00ilI0I1));
/* 52 */                    i0O0oOiO11 i0o0ooio11 = (i0O0oOiO11) this.I00ilO0.I0000Il00O();
/* 54 */                    i0OIOOi00 i0oiooi00 = new i0OIOOi00();
/* 57 */                    i0oiooi00.I00000oIO = (i0Il00O1) objI0000Il00O3;
/* 59 */                    i0oiooi00.I0000O = i0ioo0i03;
/* 61 */                    i0oiooi00.I00000oOI = (i0O1I1o) objI0000Il00O4;
/* 63 */                    i0oiooi00.I0000oI00 = i0ioo0i04;
/* 65 */                    i0oiooi00.I0000Il00O = i0o0ooio11;
/* 67 */                    VarHandle.storeStoreFence();
/* 70 */                    return i0oiooi00;
                    }
                }
            }
