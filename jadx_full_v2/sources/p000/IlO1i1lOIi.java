            package p000;

            import java.lang.invoke.VarHandle;
            
/* 19 */    public abstract class IlO1i1lOIi {
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public IlO1i1lOIi(int i, int i2, int i3) {
/* 17 */            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
/* 2 */             this.I00000oIO = 1;
                }

                public static IlO1i010 I00000oIO(IlO1i1lOIi ilO1i1lOIi, Iooili11110O[] iooili11110OArr) {
/* 5 */             int i = ilO1i1lOIi.I00000oOI + ilO1i1lOIi.I0000Il00O;
/* 9 */             if (iooili11110OArr == null) {
/* 52 */                I000II.I000iOII("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
/* 8 */                 return null;
                    }
/* 12 */            int i2 = 1;
/* 13 */            int length = iooili11110OArr.length - 1;
/* 14 */            if (length != 0) {
/* 19 */                for (int i3 = 31; i3 >= 0; i3--) {
/* 24 */                    if (((1 << i3) & length) != 0) {
/* 26 */                        i2 = 1 + i3;
                            }
                        }
/* 46 */                IoOOl0iOl1io.I0010I0i("Empty enum: ", iooili11110OArr.getClass());
/* 8 */                 return null;
                    }
/* 27 */            byte b = 0;
/* 28 */            IlO1i010 ilO1i010 = new IlO1i010(i, i2, b, b);
/* 31 */            ilO1i010.I0000O = iooili11110OArr;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            return ilO1i010;
                }

                public static IlO1Oo0Ol I00000oOI(IlO1i1lOIi ilO1i1lOIi) {
/* 9 */             byte b = 0;
/* 10 */            return new IlO1Oo0Ol(ilO1i1lOIi.I00000oOI + ilO1i1lOIi.I0000Il00O, 1, b, b);
                }

                public static IlO1Oo0Ol I0000Il00O() {
/* 7 */             return new IlO1Oo0Ol(0, 1, 0, (byte) 0);
                }

                public abstract void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio);

                public abstract Object I0000oI00(int i);

                public Ilo1iIi1OI01 I0001Ioi1lo(IOOOi1 iOOOi1) {
/* 1 */             return null;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 21 */                    String strI000oI1ioi = OOoOl0i.I00000oIO.I00000oOI(getClass()).I000oI1ioi();
                            return strI000oI1ioi == null ? "" : strI000oI1ioi;
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 20 */        public IlO1i1lOIi(int i, int i2, int i3, byte b) {
/* 21 */            this.I00000oIO = i3;
                    this.I00000oOI = i;
                    this.I0000Il00O = i2;
                }
            }
