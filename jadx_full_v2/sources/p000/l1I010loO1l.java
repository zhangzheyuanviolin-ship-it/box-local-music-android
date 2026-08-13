            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Objects;
            
            public abstract class l1I010loO1l {
                public static l1I010loO1l I000O01llI0(il0olIi il0olii) {
/* 1 */             int i = il0olii.I00iOIl;
/* 3 */             int i2 = 1;
/* 4 */             if (i == 0) {
/* 170 */               String str = il0olii.I00iiI;
/* 172 */               Objects.requireNonNull(str);
/* 177 */               l11Ol11 l11ol11 = new l11Ol11(i2);
/* 180 */               l11ol11.I00000oOI = str;
/* 182 */               VarHandle.storeStoreFence();
/* 437 */               return l11ol11;
                    }
/* 6 */             if (i == 1) {
/* 157 */               boolean z = il0olii.I00iiO;
/* 161 */               l110I0O l110i0o = new l110I0O();
/* 164 */               l110i0o.I00000oIO = z;
/* 166 */               VarHandle.storeStoreFence();
/* 169 */               return l110i0o;
                    }
/* 9 */             if (i == 2) {
/* 144 */               int i3 = il0olii.I00iio;
/* 148 */               l11IOio0l0ll l11ioio0l0ll = new l11IOio0l0ll();
/* 151 */               l11ioio0l0ll.I00000oIO = i3;
/* 153 */               VarHandle.storeStoreFence();
/* 156 */               return l11ioio0l0ll;
                    }
/* 12 */            if (i == 3) {
/* 131 */               double d = il0olii.I00ilI0I1;
/* 135 */               l111io011O l111io011o = new l111io011O();
/* 138 */               l111io011o.I00000oIO = d;
/* 140 */               VarHandle.storeStoreFence();
/* 143 */               return l111io011o;
                    }
/* 15 */            if (i != 4) {
/* 18 */                if (i != 5) {
/* 54 */                    I000II.I000iOII(Oi010OO0.I00100l0(i, "Unsupported value kind: ", new StringBuilder(String.valueOf(i).length() + 24)));
/* 57 */                    return null;
                        }
/* 20 */                long j = il0olii.I00io1l;
/* 24 */                l11iollIiol1 l11iolliiol1 = new l11iollIiol1();
/* 27 */                l11iolliiol1.I00000oIO = j;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                return l11iolliiol1;
                    }
/* 59 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 63 */            ll0iOo11011i.I00000oOI(4, "initialCapacity");
/* 66 */            Object[] objArrCopyOf = new Object[4];
/* 68 */            lOI1lll1l10 loi1lll1l10 = il0olii.I00ilO0;
/* 70 */            int size = loi1lll1l10.size();
/* 74 */            int i4 = 0;
/* 75 */            int i5 = 0;
/* 76 */            int i6 = 0;
/* 77 */            while (i5 < size) {
/* 85 */                l1I010loO1l l1i010loo1lI000O01llI0 = I000O01llI0((il0olIi) loi1lll1l10.get(i5));
/* 89 */                int length = objArrCopyOf.length;
/* 90 */                int i7 = i6 + 1;
/* 92 */                int iI000OiO = IoilIilo.I000OiO(length, i7);
/* 96 */                if (iI000OiO > length) {
/* 99 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI000OiO);
                        }
/* 103 */               objArrCopyOf[i6] = l1i010loo1lI000O01llI0;
/* 105 */               i5++;
/* 107 */               i6 = i7;
                    }
/* 113 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(lOI1lll1l10.I000oI1ioi(i6, objArrCopyOf));
/* 117 */           Objects.requireNonNull(loi1lll1l10I000o00OoI0I);
/* 122 */           l11Ol11 l11ol112 = new l11Ol11(i4);
/* 125 */           l11ol112.I00000oOI = loi1lll1l10I000o00OoI0I;
/* 127 */           VarHandle.storeStoreFence();
/* 130 */           return l11ol112;
                }

                public boolean I00000oIO() {
/* 20 */            throw new UnsupportedOperationException(ll01i1llI.I00000oIO(I00000oOI()));
                }

                public abstract int I00000oOI();

                public double I0000Il00O() {
/* 20 */            throw new UnsupportedOperationException(ll01i1llI.I00000oIO(I00000oOI()));
                }

                public int I0000O() {
/* 20 */            throw new UnsupportedOperationException(ll01i1llI.I00000oIO(I00000oOI()));
                }

                public lOI1lll1l10 I0000oI00() {
/* 20 */            throw new UnsupportedOperationException(ll01i1llI.I00000oIO(I00000oOI()));
                }

                public long I0001Ioi1lo() {
/* 20 */            throw new UnsupportedOperationException(ll01i1llI.I00000oIO(I00000oOI()));
                }

                public String I000II() {
/* 20 */            throw new UnsupportedOperationException(ll01i1llI.I00000oIO(I00000oOI()));
                }
            }
