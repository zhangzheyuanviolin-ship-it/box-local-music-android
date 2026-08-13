            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoOoooo1ol extends OOIOil00IIo {
                public static final OoOoooo1ol I0000Il00O = new OoOoooo1ol(Ooi00Oilii.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 5 */             return ((OoOoo0oO0) obj).I00iOIl.length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             OoOoooo11oI ooOoooo11oI = (OoOoooo11oI) obj;
/* 9 */             byte bI001l0I00 = iOl1ii1loO.I0000Il00O(this.I00000oOI, i).I001l0I00();
/* 7 */             ooOoooo11oI.I00000oOI(ooOoooo11oI.I0000O() + 1);
/* 16 */            byte[] bArr = ooOoooo11oI.I00000oIO;
/* 18 */            int i2 = ooOoooo11oI.I00000oOI;
/* 22 */            ooOoooo11oI.I00000oOI = i2 + 1;
/* 24 */            bArr[i2] = bI001l0I00;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 3 */             byte[] bArr = ((OoOoo0oO0) obj).I00iOIl;
/* 7 */             OoOoooo11oI ooOoooo11oI = new OoOoooo11oI();
/* 10 */            ooOoooo11oI.I00000oIO = bArr;
/* 13 */            ooOoooo11oI.I00000oOI = bArr.length;
/* 17 */            ooOoooo11oI.I00000oOI(10);
/* 49 */            return ooOoooo11oI;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 6 */             OoOoo0oO0 ooOoo0oO0 = new OoOoo0oO0();
/* 9 */             ooOoo0oO0.I00iOIl = new byte[0];
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return ooOoo0oO0;
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 3 */             byte[] bArr = ((OoOoo0oO0) obj).I00iOIl;
/* 6 */             for (int i2 = 0; i2 < i; i2++) {
/* 16 */                iOl1l0o0i1I0.I001lllioOl(this.I00000oOI, i2).I000OOo1O(bArr[i2]);
                    }
                }
            }
