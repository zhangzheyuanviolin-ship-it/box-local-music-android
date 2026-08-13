            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.TreeMap;
            
/* 18 */    public final class Oi1oO0O0 implements OlilI1O, Olil1OioO {
                public static final TreeMap I00ioIO = new TreeMap();
                public volatile String I00iOIl;
                public long[] I00iiI;
                public double[] I00iiO;
                public String[] I00iio;
                public byte[][] I00ilI0I1;
                public int[] I00ilO0;
                public int I00io1l;

                public final OlOO1i11110 I00000oIO() {
/* 3 */             String strI00OOll1 = I00OOll1();
/* 11 */            OIoO1Ol oIoO1Ol = new OIoO1Ol(19);
/* 14 */            oIoO1Ol.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 21 */            OlOO1i11110 olOO1i11110 = new OlOO1i11110(25);
/* 24 */            olOO1i11110.I00iiI = strI00OOll1;
/* 30 */            OIoO1Ol oIoO1Ol2 = new OIoO1Ol(18);
/* 33 */            oIoO1Ol2.I00iiI = oIoO1Ol;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            olOO1i11110.I00iiO = oIoO1Ol2;
/* 40 */            VarHandle.storeStoreFence();
/* 55 */            return olOO1i11110;
                }

                @Override
                public final void I000OOo1O(int i, double d) {
/* 4 */             this.I00ilO0[i] = 3;
/* 8 */             this.I00iiO[i] = d;
                }

                @Override
                public final void I000OiO(int i, long j) {
/* 4 */             this.I00ilO0[i] = 2;
/* 8 */             this.I00iiI[i] = j;
                }

                @Override
                public final void I000iOII(int i, byte[] bArr) {
/* 4 */             this.I00ilO0[i] = 5;
/* 8 */             this.I00ilI0I1[i] = bArr;
                }

                @Override
                public final void I000o00OoI0I(int i) {
/* 4 */             this.I00ilO0[i] = 1;
                }

                @Override
                public final void I001i1O0Ol(int i, String str) {
/* 4 */             this.I00ilO0[i] = 4;
/* 8 */             this.I00iio[i] = str;
                }

                @Override
                public final int I00IOO() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final String I00OOll1() {
/* 1 */             String str = this.I00iOIl;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 8 */             I000II.I001IO000("Required value was null.");
/* 11 */            return null;
                }

                @Override
                public final void I00iOIl(Olil1OioO olil1OioO) {
/* 1 */             int i = this.I00io1l;
/* 4 */             if (1 > i) {
/* 168 */               return;
                    }
/* 6 */             int i2 = 1;
                    while (true) {
/* 9 */                 int i3 = this.I00ilO0[i2];
/* 11 */                if (i3 == 1) {
/* 72 */                    olil1OioO.I000o00OoI0I(i2);
                        } else if (i3 == 2) {
/* 68 */                    olil1OioO.I000OiO(i2, this.I00iiI[i2]);
                        } else if (i3 == 3) {
/* 60 */                    olil1OioO.I000OOo1O(i2, this.I00iiO[i2]);
                        } else if (i3 == 4) {
/* 44 */                    String str = this.I00iio[i2];
/* 46 */                    if (str == null) {
/* 52 */                        I000II.I000iOII("Required value was null.");
/* 55 */                        return;
                            }
/* 48 */                    olil1OioO.I001i1O0Ol(i2, str);
                        } else if (i3 == 5) {
/* 30 */                    byte[] bArr = this.I00ilI0I1[i2];
/* 32 */                    if (bArr == null) {
/* 38 */                        I000II.I000iOII("Required value was null.");
/* 41 */                        return;
                            }
/* 34 */                    olil1OioO.I000iOII(i2, bArr);
                        }
/* 75 */                if (i2 == i) {
/* 168 */                   return;
                        } else {
/* 77 */                    i2++;
                        }
                    }
                }

                @Override
/* 19 */        public final void close() {
                }
            }
