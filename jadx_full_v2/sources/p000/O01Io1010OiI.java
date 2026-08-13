            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O01Io1010OiI extends iO1oioi {
                public final I11l01l I00000oIO;
                public final i1i0olI I00000oOI;

                public O01Io1010OiI(I11l01l i11l01l, O011OoiO1 o011OoiO1) {
/* 4 */             this.I00000oIO = i11l01l;
/* 8 */             this.I00000oOI = o011OoiO1.I00000oOI;
                }

                @Override
                public final i1i0olI I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final int I000II(OilOloI oilOloI) {
/* 49 */            throw new IllegalStateException("unsupported");
                }

                @Override
                public final int I000lI() {
/* 1 */             I11l01l i11l01l = this.I00000oIO;
/* 3 */             String strI0010o = i11l01l.I0010o();
                    try {
/* 8 */                 Ooi01Oi0II ooi01Oi0III00000oIO = lOooIO1I1I.I00000oIO(strI0010o);
/* 12 */                if (ooi01Oi0III00000oIO != null) {
/* 14 */                    return ooi01Oi0III00000oIO.I00iOIl;
                        }
/* 17 */                OlOolloIIOl0.I000OOo1O(strI0010o);
/* 20 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 31 */                I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Failed to parse type 'UInt' for input '", strI0010o), 0, null, 6);
/* 113 */               throw null;
                    }
                }

                @Override
                public final long I001IIilI0O() {
/* 1 */             I11l01l i11l01l = this.I00000oIO;
/* 3 */             String strI0010o = i11l01l.I0010o();
                    try {
/* 8 */                 Ooi0i1 ooi0i1I00000oOI = lOooIO1I1I.I00000oOI(strI0010o);
/* 12 */                if (ooi0i1I00000oOI != null) {
/* 14 */                    return ooi0i1I00000oOI.I00iOIl;
                        }
/* 17 */                OlOolloIIOl0.I000OOo1O(strI0010o);
/* 20 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 31 */                I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Failed to parse type 'ULong' for input '", strI0010o), 0, null, 6);
/* 113 */               throw null;
                    }
                }

                @Override
                public final byte I001l0I00() {
                    OoOoil0I ooOoil0I;
/* 1 */             I11l01l i11l01l = this.I00000oIO;
/* 3 */             String strI0010o = i11l01l.I0010o();
                    try {
/* 8 */                 Ooi01Oi0II ooi01Oi0III00000oIO = lOooIO1I1I.I00000oIO(strI0010o);
/* 12 */                if (ooi01Oi0III00000oIO != null) {
/* 14 */                    int i = ooi01Oi0III00000oIO.I00iOIl;
/* 22 */                    if (Integer.compareUnsigned(i, 255) > 0) {
/* 37 */                        ooOoil0I = null;
                            } else {
/* 28 */                        ooOoil0I = new OoOoil0I();
/* 31 */                        ooOoil0I.I00iOIl = (byte) i;
/* 33 */                        VarHandle.storeStoreFence();
                            }
                        } else {
/* 37 */                    ooOoil0I = null;
                        }
/* 38 */                if (ooOoil0I != null) {
/* 40 */                    return ooOoil0I.I00iOIl;
                        }
/* 43 */                OlOolloIIOl0.I000OOo1O(strI0010o);
/* 46 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 57 */                I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Failed to parse type 'UByte' for input '", strI0010o), 0, null, 6);
/* 113 */               throw null;
                    }
                }

                @Override
                public final short I001lllioOl() {
                    Ooi1IIOloiii ooi1IIOloiii;
/* 1 */             I11l01l i11l01l = this.I00000oIO;
/* 3 */             String strI0010o = i11l01l.I0010o();
                    try {
/* 8 */                 Ooi01Oi0II ooi01Oi0III00000oIO = lOooIO1I1I.I00000oIO(strI0010o);
/* 12 */                if (ooi01Oi0III00000oIO != null) {
/* 14 */                    int i = ooi01Oi0III00000oIO.I00iOIl;
/* 23 */                    if (Integer.compareUnsigned(i, 65535) > 0) {
/* 38 */                        ooi1IIOloiii = null;
                            } else {
/* 29 */                        ooi1IIOloiii = new Ooi1IIOloiii();
/* 32 */                        ooi1IIOloiii.I00iOIl = (short) i;
/* 34 */                        VarHandle.storeStoreFence();
                            }
                        } else {
/* 38 */                    ooi1IIOloiii = null;
                        }
/* 39 */                if (ooi1IIOloiii != null) {
/* 41 */                    return ooi1IIOloiii.I00iOIl;
                        }
/* 44 */                OlOolloIIOl0.I000OOo1O(strI0010o);
/* 47 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 58 */                I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Failed to parse type 'UShort' for input '", strI0010o), 0, null, 6);
/* 113 */               throw null;
                    }
                }
            }
