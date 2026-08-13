            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.List;
            
            public final class IOOOi1 {
                public final int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public Object I0000oI00;

                public IOOOi1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static IOOOi1 I00000oIO(IOOOI0 ioooi0) {
/* 3 */             IOOOi1 iOOOi1 = (IOOOi1) ioooi0.I00000oOI;
/* 5 */             if (iOOOi1 != null) {
/* 7 */                 return iOOOi1;
                    }
/* 11 */            IOOOi1 iOOOi12 = new IOOOi1(2);
/* 15 */            iOOOi12.I0000O = 0;
/* 17 */            Charset charset = IoolIIolo1lI.I00000oIO;
/* 19 */            iOOOi12.I0000oI00 = ioooi0;
/* 21 */            ioooi0.I00000oOI = iOOOi12;
/* 23 */            VarHandle.storeStoreFence();
/* 29 */            return iOOOi12;
                }

                public static IOOOi1 I00000oOI(IOOOIO1O ioooio1o) {
/* 3 */             IOOOi1 iOOOi1 = (IOOOi1) ioooio1o.I0000Il00O;
/* 5 */             if (iOOOi1 != null) {
/* 7 */                 return iOOOi1;
                    }
/* 11 */            IOOOi1 iOOOi12 = new IOOOi1(1);
/* 15 */            iOOOi12.I0000O = 0;
/* 17 */            byte[] bArr = Iool1iioooil.I00000oIO;
/* 19 */            iOOOi12.I0000oI00 = ioooio1o;
/* 21 */            ioooio1o.I0000Il00O = iOOOi12;
/* 23 */            VarHandle.storeStoreFence();
/* 29 */            return iOOOi12;
                }

                public static void I00io1l(int i) throws O000oiiiOI0 {
/* 3 */             if ((i & 3) != 0) {
/* 29 */                throw O000oiiiOI0.I0001Ioi1lo();
                    }
                }

                public static void I00ioIO(int i) throws O0010I0o {
/* 3 */             if ((i & 3) != 0) {
/* 29 */                throw new O0010I0o("Failed to parse the message.");
                    }
                }

                public static void I00l0I0l0lO1(int i) throws O0011oo {
/* 3 */             if ((i & 3) != 0) {
/* 29 */                throw new O0011oo("Failed to parse the message.");
                    }
                }

                public static void I00l0OO0IO(int i) throws O000oiiiOI0 {
/* 3 */             if ((i & 7) != 0) {
/* 29 */                throw O000oiiiOI0.I0001Ioi1lo();
                    }
                }

                public static void I00li1OI(int i) throws O0010I0o {
/* 3 */             if ((i & 7) != 0) {
/* 29 */                throw new O0010I0o("Failed to parse the message.");
                    }
                }

                public static void I00ll1(int i) throws O0011oo {
/* 3 */             if ((i & 7) != 0) {
/* 29 */                throw new O0011oo("Failed to parse the message.");
                    }
                }

                public static final void I01II10(int i) throws ill0ll01OOOO {
/* 3 */             if ((i & 3) != 0) {
/* 29 */                throw ill0ll01OOOO.I0000oI00();
                    }
                }

                public static final void I01Ii0ll10O(int i) throws ill0ll01OOOO {
/* 3 */             if ((i & 7) != 0) {
/* 29 */                throw ill0ll01OOOO.I0000oI00();
                    }
                }

                public static final void I01IlIoOI(int i) throws iI00lI {
/* 3 */             if ((i & 3) == 0) {
/* 5 */                 return;
                    }
/* 8 */             iilo0lOo110.I000II("Failed to parse the message.");
                }

                public static final void I01Io000(int i) throws iI00lI {
/* 3 */             if ((i & 7) == 0) {
/* 5 */                 return;
                    }
/* 8 */             iilo0lOo110.I000II("Failed to parse the message.");
                }

                public static final void I01Io1(int i) throws ii0iI11ol {
/* 3 */             if ((i & 3) == 0) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001iOo1i0O("Failed to parse the message.");
                }

                public static IOOOi1 I01Io11IiiiO(IOOOIO1O ioooio1o) {
/* 3 */             IOOOi1 iOOOi1 = (IOOOi1) ioooio1o.I0000Il00O;
/* 5 */             if (iOOOi1 != null) {
/* 7 */                 return iOOOi1;
                    }
/* 11 */            IOOOi1 iOOOi12 = new IOOOi1(6);
/* 15 */            iOOOi12.I0000O = 0;
/* 17 */            iOOOi12.I0000oI00 = ioooio1o;
/* 19 */            ioooio1o.I0000Il00O = iOOOi12;
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return iOOOi12;
                }

                public static final void I01Io1ilOIIo(int i) throws ii0iI11ol {
/* 3 */             if ((i & 7) == 0) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001iOo1i0O("Failed to parse the message.");
                }

                public static IOOOi1 I01O1lIi(IOOOI0 ioooi0) {
/* 3 */             IOOOi1 iOOOi1 = (IOOOi1) ioooi0.I00000oOI;
/* 5 */             if (iOOOi1 != null) {
/* 7 */                 return iOOOi1;
                    }
/* 12 */            IOOOi1 iOOOi12 = new IOOOi1(8);
/* 16 */            iOOOi12.I0000O = 0;
/* 18 */            Charset charset = ililOO0.I00000oIO;
/* 20 */            iOOOi12.I0000oI00 = ioooi0;
/* 22 */            ioooi0.I00000oOI = iOOOi12;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            return iOOOi12;
                }

                public int I0000Il00O() {
/* 5 */             return this.I0000O - this.I0000Il00O;
                }

                public int I0000O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 68 */                    int iI00II0Ol1O0l = this.I0000O;
/* 70 */                    if (iI00II0Ol1O0l != 0) {
/* 72 */                        this.I00000oOI = iI00II0Ol1O0l;
/* 74 */                        this.I0000O = 0;
                            } else {
/* 81 */                        iI00II0Ol1O0l = ((IOOOI0) this.I0000oI00).I00II0Ol1O0l();
/* 85 */                        this.I00000oOI = iI00II0Ol1O0l;
                            }
/* 87 */                    if (iI00II0Ol1O0l == 0 || iI00II0Ol1O0l == this.I0000Il00O) {
/* 3 */                         return Integer.MAX_VALUE;
                            }
/* 94 */                    return iI00II0Ol1O0l >>> 3;
                        case 1:
/* 39 */                    int iI001IIilI0O = this.I0000O;
/* 41 */                    if (iI001IIilI0O != 0) {
/* 43 */                        this.I00000oOI = iI001IIilI0O;
/* 45 */                        this.I0000O = 0;
                            } else {
/* 52 */                        iI001IIilI0O = ((IOOOIO1O) this.I0000oI00).I001IIilI0O();
/* 56 */                        this.I00000oOI = iI001IIilI0O;
                            }
/* 58 */                    if (iI001IIilI0O == 0 || iI001IIilI0O == this.I0000Il00O) {
/* 3 */                         return Integer.MAX_VALUE;
                            }
/* 65 */                    return iI001IIilI0O >>> 3;
                        default:
/* 10 */                    int iI00II0Ol1O0l2 = this.I0000O;
/* 12 */                    if (iI00II0Ol1O0l2 != 0) {
/* 14 */                        this.I00000oOI = iI00II0Ol1O0l2;
/* 16 */                        this.I0000O = 0;
                            } else {
/* 23 */                        iI00II0Ol1O0l2 = ((IOOOI0) this.I0000oI00).I00II0Ol1O0l();
/* 27 */                        this.I00000oOI = iI00II0Ol1O0l2;
                            }
/* 29 */                    if (iI00II0Ol1O0l2 == 0 || iI00II0Ol1O0l2 == this.I0000Il00O) {
/* 3 */                         return Integer.MAX_VALUE;
                            }
/* 36 */                    return iI00II0Ol1O0l2 >>> 3;
                    }
                }

                public int I0000oI00(int i) {
/* 10 */            return ((OIii0IO) this.I0000oI00).I0000Il00O[this.I0000Il00O + i];
                }

                public Object I0001Ioi1lo(int i) {
/* 10 */            return ((OIii0IO) this.I0000oI00).I0000oI00[this.I0000O + i];
                }

                public void I000II(Object obj, OiOIiIO0 oiOIiIO0, Il1llO11O il1llO11O) {
/* 1 */             int i = this.I0000Il00O;
/* 11 */            this.I0000Il00O = ((this.I00000oOI >>> 3) << 3) | 4;
                    try {
/* 13 */                oiOIiIO0.I000O01llI0(obj, this, il1llO11O);
/* 20 */                if (this.I00000oOI == this.I0000Il00O) {
                        } else {
/* 29 */                    throw O000oiiiOI0.I0001Ioi1lo();
                        }
                    } finally {
/* 31 */                this.I0000Il00O = i;
                    }
                }

                public void I000O01llI0(Object obj, OiOIl0 oiOIl0, Il1llOool il1llOool) {
/* 1 */             int i = this.I0000Il00O;
/* 11 */            this.I0000Il00O = ((this.I00000oOI >>> 3) << 3) | 4;
                    try {
/* 13 */                oiOIl0.I000OOo1O(obj, this, il1llOool);
/* 20 */                if (this.I00000oOI == this.I0000Il00O) {
                        } else {
/* 32 */                    throw new O0010I0o("Failed to parse the message.");
                        }
                    } finally {
/* 34 */                this.I0000Il00O = i;
                    }
                }

                public void I000OOo1O(Object obj, OiOIlIo oiOIlIo, Il1llli0O1 il1llli0O1) {
/* 1 */             int i = this.I0000Il00O;
/* 11 */            this.I0000Il00O = ((this.I00000oOI >>> 3) << 3) | 4;
                    try {
/* 13 */                oiOIlIo.I0000oI00(obj, this, il1llli0O1);
/* 20 */                if (this.I00000oOI == this.I0000Il00O) {
                        } else {
/* 32 */                    throw new O0011oo("Failed to parse the message.");
                        }
                    } finally {
/* 34 */                this.I0000Il00O = i;
                    }
                }

                public void I000OiO(Object obj, OiOIiIO0 oiOIiIO0, Il1llO11O il1llO11O) throws O000oiiiOI0 {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 13 */            if (ioooi0.I00000oIO >= 100) {
/* 98 */                throw new O000oiiiOI0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
/* 15 */            int iI000lI = ioooi0.I000lI(iI00II0oii1o);
                    ioooi0.I00000oIO++;
/* 25 */            oiOIiIO0.I000O01llI0(obj, this, il1llO11O);
/* 29 */            ioooi0.I00000oOI(0);
                    ioooi0.I00000oIO--;
/* 38 */            ioooi0.I000iOII(iI000lI);
                }

                public void I000iOII(Object obj, OiOIl0 oiOIl0, Il1llOool il1llOool) throws O0010I0o {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             int iI001IO000 = ioooio1o.I001IO000();
/* 16 */            if (ioooio1o.I00000oIO + ioooio1o.I00000oOI >= 100) {
/* 98 */                throw new O0010I0o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 18 */            int iI0000oI00 = ioooio1o.I0000oI00(iI001IO000);
                    ioooio1o.I00000oIO++;
/* 28 */            oiOIl0.I000OOo1O(obj, this, il1llOool);
/* 32 */            ioooio1o.I00000oIO(0);
                    ioooio1o.I00000oIO--;
/* 41 */            ioooio1o.I0000O(iI0000oI00);
                }

                public void I000l1(Object obj, OiOIlIo oiOIlIo, Il1llli0O1 il1llli0O1) throws O0011oo {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 13 */            if (ioooi0.I00000oIO >= 100) {
/* 98 */                throw new O0011oo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 15 */            int iI000lI = ioooi0.I000lI(iI00II0oii1o);
                    ioooi0.I00000oIO++;
/* 25 */            oiOIlIo.I0000oI00(obj, this, il1llli0O1);
/* 29 */            ioooi0.I00000oOI(0);
                    ioooi0.I00000oIO--;
/* 38 */            ioooi0.I000iOII(iI000lI);
                }

                public void I000lI(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Boolean.valueOf(ioooio1o.I0001Ioi1lo()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Boolean.valueOf(ioooio1o.I0001Ioi1lo()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I000o00OoI0I(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Boolean.valueOf(ioooi0.I000o00OoI0I()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Boolean.valueOf(ioooi0.I000o00OoI0I()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I000oI1ioi(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof II11I0;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Boolean.valueOf(ioooi0.I000o00OoI0I()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Boolean.valueOf(ioooi0.I000o00OoI0I()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            II11I0 ii11i0 = (II11I0) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ii11i0.I0000O(ioooi0.I000o00OoI0I());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                ii11i0.I0000O(ioooi0.I000o00OoI0I());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public IIO1i00loOo I00100l0() throws O000illO, O000lI0, O000o1i {
/* 2 */             I00ilI0I1(2);
/* 9 */             return ((IOOOIO1O) this.I0000oI00).I000II();
                }

                public IIO1ooI I00100o1O0lo() throws O000illO, O000lI0, O000o1i {
/* 2 */             I00ilI0I1(2);
/* 9 */             return ((IOOOI0) this.I0000oI00).I00100l0();
                }

                public IIOI1Ii1I I0010I0i() throws O000illO, O000lI0, O000o1i {
/* 2 */             I00ilI0I1(2);
/* 9 */             return ((IOOOI0) this.I0000oI00).I000oI1ioi();
                }

                public void I0010o(Iool1IOO1o0i iool1IOO1o0i) throws O000lI0 {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 77 */                throw O0010I0o.I00000oOI();
                    }
/* 32 */            do {
/* 16 */                iool1IOO1o0i.add(I00100l0());
/* 23 */                if (ioooio1o.I0000Il00O()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 32 */            } while (iI001IIilI0O == this.I00000oOI);
/* 34 */            this.I0000O = iI001IIilI0O;
                }

                public void I00111O(Iool1O1Ol1i iool1O1Ol1i) throws O000o1i {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 77 */                throw O0011oo.I00000oOI();
                    }
/* 32 */            do {
/* 16 */                iool1O1Ol1i.add(I00100o1O0lo());
/* 23 */                if (ioooi0.I000O01llI0()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 32 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 34 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I001IIilI0O(List list) throws O000illO {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 77 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 32 */            do {
/* 16 */                list.add(I0010I0i());
/* 23 */                if (ioooi0.I000O01llI0()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 32 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 34 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I001IO000(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o {
                    int iI001IIilI0O;
                    int iI001IIilI0O2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = iool1IOO1o0i instanceof Iiilo1O111;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       iool1IOO1o0i.add(Double.valueOf(ioooio1o.I000O01llI0()));
/* 134 */                       if (ioooio1o.I0000Il00O()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iI001IIilI0O = ioooio1o.I001IIilI0O();
                                }
/* 143 */                   } while (iI001IIilI0O == this.I00000oOI);
/* 145 */                   this.I0000O = iI001IIilI0O;
/* 168 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw O0010I0o.I00000oOI();
                        }
/* 84 */                int iI001IO000 = ioooio1o.I001IO000();
/* 88 */                I00li1OI(iI001IO000);
/* 95 */                int iI00000oOI = ioooio1o.I00000oOI() + iI001IO000;
/* 111 */               do {
/* 104 */                   iool1IOO1o0i.add(Double.valueOf(ioooio1o.I000O01llI0()));
/* 111 */               } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 136 */               return;
                    }
/* 14 */            Iiilo1O111 iiilo1O111 = (Iiilo1O111) iool1IOO1o0i;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    iiilo1O111.I0000O(ioooio1o.I000O01llI0());
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iI001IIilI0O2 = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O2 == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI001IO0002 = ioooio1o.I001IO000();
/* 26 */            I00li1OI(iI001IO0002);
/* 33 */            int iI00000oOI2 = ioooio1o.I00000oOI() + iI001IO0002;
/* 45 */            do {
/* 38 */                iiilo1O111.I0000O(ioooio1o.I000O01llI0());
/* 45 */            } while (ioooio1o.I00000oOI() < iI00000oOI2);
                }

                public void I001i1O0Ol(Iool1O1Ol1i iool1O1Ol1i) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 74 */                do {
/* 58 */                    iool1O1Ol1i.add(Double.valueOf(ioooi0.I00100o1O0lo()));
/* 65 */                    if (ioooi0.I000O01llI0()) {
/* 67 */                        return;
                            } else {
/* 68 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 74 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 76 */                this.I0000O = iI00II0Ol1O0l;
/* 168 */               return;
                    }
/* 13 */            if (i != 2) {
/* 49 */                throw O0011oo.I00000oOI();
                    }
/* 15 */            int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 19 */            I00ll1(iI00II0oii1o);
/* 26 */            int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 42 */            do {
/* 35 */                iool1O1Ol1i.add(Double.valueOf(ioooi0.I00100o1O0lo()));
/* 42 */            } while (ioooi0.I000II() < iI000II);
                }

                public void I001i1lo1io(List list) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IiillIl0io;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       list.add(Double.valueOf(ioooi0.I00100o1O0lo()));
/* 134 */                       if (ioooi0.I000O01llI0()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 143 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 145 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 84 */                int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 88 */                I00l0OO0IO(iI00II0oii1o);
/* 95 */                int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 111 */               do {
/* 104 */                   list.add(Double.valueOf(ioooi0.I00100o1O0lo()));
/* 111 */               } while (ioooi0.I000II() < iI000II);
/* 136 */               return;
                    }
/* 14 */            IiillIl0io iiillIl0io = (IiillIl0io) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    iiillIl0io.I0000O(ioooi0.I00100o1O0lo());
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 22 */            int iI00II0oii1o2 = ioooi0.I00II0oii1o();
/* 26 */            I00l0OO0IO(iI00II0oii1o2);
/* 33 */            int iI000II2 = ioooi0.I000II() + iI00II0oii1o2;
/* 45 */            do {
/* 38 */                iiillIl0io.I0000O(ioooi0.I00100o1O0lo());
/* 45 */            } while (ioooi0.I000II() < iI000II2);
                }

                public void I001iOo1i0O(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000OOo1O()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000OOo1O()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I001l0I00(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Integer.valueOf(ioooi0.I0010I0i()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Integer.valueOf(ioooi0.I0010I0i()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I001lIiIIo1O(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IooIOOO0I;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(ioooi0.I0010I0i()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(ioooi0.I0010I0i()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    iooIOOO0I.I0000O(ioooi0.I0010I0i());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                iooIOOO0I.I0000O(ioooi0.I0010I0i());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public Object I001lllioOl(i011I10o1IlI i011i10o1ili, Class cls, Il1llOool il1llOool) throws O000illO, O0010I0o, O000o1i {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
                    switch (i011i10o1ili.ordinal()) {
                        case 0:
/* 212 */                   I00ilI0I1(1);
/* 219 */                   return Double.valueOf(ioooio1o.I000O01llI0());
                        case 1:
/* 200 */                   I00ilI0I1(5);
/* 207 */                   return Float.valueOf(ioooio1o.I000l1());
                        case 2:
/* 188 */                   I00ilI0I1(0);
/* 195 */                   return Long.valueOf(ioooio1o.I000o00OoI0I());
                        case 3:
/* 176 */                   I00ilI0I1(0);
/* 183 */                   return Long.valueOf(ioooio1o.I001i1O0Ol());
                        case 4:
/* 164 */                   I00ilI0I1(0);
/* 171 */                   return Integer.valueOf(ioooio1o.I000lI());
                        case 5:
/* 152 */                   I00ilI0I1(1);
/* 159 */                   return Long.valueOf(ioooio1o.I000iOII());
                        case 6:
/* 140 */                   I00ilI0I1(5);
/* 147 */                   return Integer.valueOf(ioooio1o.I000OiO());
                        case 7:
/* 128 */                   I00ilI0I1(0);
/* 135 */                   return Boolean.valueOf(ioooio1o.I0001Ioi1lo());
                        case 8:
/* 120 */                   I00ilI0I1(2);
/* 123 */                   return ioooio1o.I00111O();
                        case 9:
                        default:
/* 18 */                    I000II.I000iOII("unsupported field type.");
/* 21 */                    return null;
                        case 10:
/* 100 */                   I00ilI0I1(2);
/* 105 */                   OiOIl0 oiOIl0I00000oIO = OOi1o101lI.I0000Il00O.I00000oIO(cls);
/* 109 */                   Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0I00000oIO.I0000O();
/* 113 */                   I000iOII(io00Ol1o10OI0000O, oiOIl0I00000oIO, il1llOool);
/* 116 */                   oiOIl0I00000oIO.I00000oOI(io00Ol1o10OI0000O);
/* 119 */                   return io00Ol1o10OI0000O;
                        case 11:
/* 95 */                    return I00100l0();
                        case 12:
/* 83 */                    I00ilI0I1(0);
/* 90 */                    return Integer.valueOf(ioooio1o.I001IO000());
                        case 13:
/* 71 */                    I00ilI0I1(0);
/* 78 */                    return Integer.valueOf(ioooio1o.I000OOo1O());
                        case 14:
/* 59 */                    I00ilI0I1(5);
/* 66 */                    return Integer.valueOf(ioooio1o.I000oI1ioi());
                        case 15:
/* 47 */                    I00ilI0I1(1);
/* 54 */                    return Long.valueOf(ioooio1o.I00100l0());
                        case 16:
/* 35 */                    I00ilI0I1(0);
/* 42 */                    return Integer.valueOf(ioooio1o.I00100o1O0lo());
                        case 17:
/* 23 */                    I00ilI0I1(0);
/* 30 */                    return Long.valueOf(ioooio1o.I0010I0i());
                    }
                }

                public Object I001lloI(i011lOoO i011looo, Class cls, Il1llli0O1 il1llli0O1) throws O000illO, O000lI0, O0011oo {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
                    switch (i011looo.ordinal()) {
                        case 0:
/* 212 */                   I00ilI0I1(1);
/* 219 */                   return Double.valueOf(ioooi0.I00100o1O0lo());
                        case 1:
/* 200 */                   I00ilI0I1(5);
/* 207 */                   return Float.valueOf(ioooi0.I001IIilI0O());
                        case 2:
/* 188 */                   I00ilI0I1(0);
/* 195 */                   return Long.valueOf(ioooi0.I001i1O0Ol());
                        case 3:
/* 176 */                   I00ilI0I1(0);
/* 183 */                   return Long.valueOf(ioooi0.I00IO1());
                        case 4:
/* 164 */                   I00ilI0I1(0);
/* 171 */                   return Integer.valueOf(ioooi0.I001IO000());
                        case 5:
/* 152 */                   I00ilI0I1(1);
/* 159 */                   return Long.valueOf(ioooi0.I00111O());
                        case 6:
/* 140 */                   I00ilI0I1(5);
/* 147 */                   return Integer.valueOf(ioooi0.I0010o());
                        case 7:
/* 128 */                   I00ilI0I1(0);
/* 135 */                   return Boolean.valueOf(ioooi0.I000o00OoI0I());
                        case 8:
/* 120 */                   I00ilI0I1(2);
/* 123 */                   return ioooi0.I001lloI();
                        case 9:
                        default:
/* 18 */                    I000II.I000iOII("unsupported field type.");
/* 21 */                    return null;
                        case 10:
/* 100 */                   I00ilI0I1(2);
/* 105 */                   OiOIlIo oiOIlIoI00000oIO = OOi1oI.I0000Il00O.I00000oIO(cls);
/* 109 */                   Io00l0 io00l0I0000O = oiOIlIoI00000oIO.I0000O();
/* 113 */                   I000l1(io00l0I0000O, oiOIlIoI00000oIO, il1llli0O1);
/* 116 */                   oiOIlIoI00000oIO.I00000oOI(io00l0I0000O);
/* 119 */                   return io00l0I0000O;
                        case 11:
/* 95 */                    return I00100o1O0lo();
                        case 12:
/* 83 */                    I00ilI0I1(0);
/* 90 */                    return Integer.valueOf(ioooi0.I00II0oii1o());
                        case 13:
/* 71 */                    I00ilI0I1(0);
/* 78 */                    return Integer.valueOf(ioooi0.I0010I0i());
                        case 14:
/* 59 */                    I00ilI0I1(5);
/* 66 */                    return Integer.valueOf(ioooi0.I001i1lo1io());
                        case 15:
/* 47 */                    I00ilI0I1(1);
/* 54 */                    return Long.valueOf(ioooi0.I001iOo1i0O());
                        case 16:
/* 35 */                    I00ilI0I1(0);
/* 42 */                    return Integer.valueOf(ioooi0.I001l0I00());
                        case 17:
/* 23 */                    I00ilI0I1(0);
/* 30 */                    return Long.valueOf(ioooi0.I001lIiIIo1O());
                    }
                }

                public void I00II0Ol1O0l(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 49 */                int iI001IO000 = ioooio1o.I001IO000();
/* 53 */                I00ioIO(iI001IO000);
/* 60 */                int iI00000oOI = ioooio1o.I00000oOI() + iI001IO000;
/* 76 */                do {
/* 69 */                    iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000OiO()));
/* 76 */                } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 168 */               return;
                    }
/* 13 */            if (i != 5) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 39 */            do {
/* 23 */                iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000OiO()));
/* 30 */                if (ioooio1o.I0000Il00O()) {
/* 168 */                   return;
                        } else {
/* 33 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 39 */            } while (iI001IIilI0O == this.I00000oOI);
/* 41 */            this.I0000O = iI001IIilI0O;
                }

                public void I00II0oii1o(Iool1O1Ol1i iool1O1Ol1i) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 49 */                int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 53 */                I00l0I0l0lO1(iI00II0oii1o);
/* 60 */                int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 76 */                do {
/* 69 */                    iool1O1Ol1i.add(Integer.valueOf(ioooi0.I0010o()));
/* 76 */                } while (ioooi0.I000II() < iI000II);
/* 168 */               return;
                    }
/* 13 */            if (i != 5) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 39 */            do {
/* 23 */                iool1O1Ol1i.add(Integer.valueOf(ioooi0.I0010o()));
/* 30 */                if (ioooi0.I000O01llI0()) {
/* 168 */                   return;
                        } else {
/* 33 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 39 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 41 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I00IO1(List list) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IooIOOO0I;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 79 */                int i2 = i & 7;
/* 81 */                if (i2 == 2) {
/* 119 */                   int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 123 */                   I00io1l(iI00II0oii1o);
/* 130 */                   int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 146 */                   do {
/* 139 */                       list.add(Integer.valueOf(ioooi0.I0010o()));
/* 146 */                   } while (ioooi0.I000II() < iI000II);
/* 168 */                   return;
                        }
/* 83 */                if (i2 != 5) {
/* 118 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 109 */               do {
/* 93 */                    list.add(Integer.valueOf(ioooi0.I0010o()));
/* 100 */                   if (ioooi0.I000O01llI0()) {
/* 168 */                       return;
                            } else {
/* 103 */                       iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 109 */               } while (iI00II0Ol1O0l == this.I00000oOI);
/* 111 */               this.I0000O = iI00II0Ol1O0l;
/* 113 */               return;
                    }
/* 14 */            IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 2) {
/* 52 */                int iI00II0oii1o2 = ioooi0.I00II0oii1o();
/* 56 */                I00io1l(iI00II0oii1o2);
/* 63 */                int iI000II2 = ioooi0.I000II() + iI00II0oii1o2;
/* 76 */                do {
/* 69 */                    iooIOOO0I.I0000O(ioooi0.I0010o());
/* 76 */                } while (ioooi0.I000II() < iI000II2);
/* 168 */               return;
                    }
/* 20 */            if (i3 != 5) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 42 */            do {
/* 26 */                iooIOOO0I.I0000O(ioooi0.I0010o());
/* 33 */                if (ioooi0.I000O01llI0()) {
/* 168 */                   return;
                        } else {
/* 36 */                    iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                        }
/* 42 */            } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 44 */            this.I0000O = iI00II0Ol1O0l2;
                }

                public void I00IO1oi11O(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 74 */                do {
/* 58 */                    iool1IOO1o0i.add(Long.valueOf(ioooio1o.I000iOII()));
/* 65 */                    if (ioooio1o.I0000Il00O()) {
/* 67 */                        return;
                            } else {
/* 68 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 74 */                } while (iI001IIilI0O == this.I00000oOI);
/* 76 */                this.I0000O = iI001IIilI0O;
/* 168 */               return;
                    }
/* 13 */            if (i != 2) {
/* 49 */                throw O0010I0o.I00000oOI();
                    }
/* 15 */            int iI001IO000 = ioooio1o.I001IO000();
/* 19 */            I00li1OI(iI001IO000);
/* 26 */            int iI00000oOI = ioooio1o.I00000oOI() + iI001IO000;
/* 42 */            do {
/* 35 */                iool1IOO1o0i.add(Long.valueOf(ioooio1o.I000iOII()));
/* 42 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
                }

                public void I00IOO(Iool1O1Ol1i iool1O1Ol1i) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 74 */                do {
/* 58 */                    iool1O1Ol1i.add(Long.valueOf(ioooi0.I00111O()));
/* 65 */                    if (ioooi0.I000O01llI0()) {
/* 67 */                        return;
                            } else {
/* 68 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 74 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 76 */                this.I0000O = iI00II0Ol1O0l;
/* 168 */               return;
                    }
/* 13 */            if (i != 2) {
/* 49 */                throw O0011oo.I00000oOI();
                    }
/* 15 */            int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 19 */            I00ll1(iI00II0oii1o);
/* 26 */            int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 42 */            do {
/* 35 */                iool1O1Ol1i.add(Long.valueOf(ioooi0.I00111O()));
/* 42 */            } while (ioooi0.I000II() < iI000II);
                }

                public void I00IioO0OiOi(List list) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof O1IIlI01ol;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       list.add(Long.valueOf(ioooi0.I00111O()));
/* 134 */                       if (ioooi0.I000O01llI0()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 143 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 145 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 84 */                int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 88 */                I00l0OO0IO(iI00II0oii1o);
/* 95 */                int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 111 */               do {
/* 104 */                   list.add(Long.valueOf(ioooi0.I00111O()));
/* 111 */               } while (ioooi0.I000II() < iI000II);
/* 136 */               return;
                    }
/* 14 */            O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    o1IIlI01ol.I0000O(ioooi0.I00111O());
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 22 */            int iI00II0oii1o2 = ioooi0.I00II0oii1o();
/* 26 */            I00l0OO0IO(iI00II0oii1o2);
/* 33 */            int iI000II2 = ioooi0.I000II() + iI00II0oii1o2;
/* 45 */            do {
/* 38 */                o1IIlI01ol.I0000O(ioooi0.I00111O());
/* 45 */            } while (ioooi0.I000II() < iI000II2);
                }

                public void I00IlilI0i0i(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 49 */                int iI001IO000 = ioooio1o.I001IO000();
/* 53 */                I00ioIO(iI001IO000);
/* 60 */                int iI00000oOI = ioooio1o.I00000oOI() + iI001IO000;
/* 76 */                do {
/* 69 */                    iool1IOO1o0i.add(Float.valueOf(ioooio1o.I000l1()));
/* 76 */                } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 168 */               return;
                    }
/* 13 */            if (i != 5) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 39 */            do {
/* 23 */                iool1IOO1o0i.add(Float.valueOf(ioooio1o.I000l1()));
/* 30 */                if (ioooio1o.I0000Il00O()) {
/* 168 */                   return;
                        } else {
/* 33 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 39 */            } while (iI001IIilI0O == this.I00000oOI);
/* 41 */            this.I0000O = iI001IIilI0O;
                }

                public void I00Io1lO(Iool1O1Ol1i iool1O1Ol1i) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 49 */                int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 53 */                I00l0I0l0lO1(iI00II0oii1o);
/* 60 */                int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 76 */                do {
/* 69 */                    iool1O1Ol1i.add(Float.valueOf(ioooi0.I001IIilI0O()));
/* 76 */                } while (ioooi0.I000II() < iI000II);
/* 168 */               return;
                    }
/* 13 */            if (i != 5) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 39 */            do {
/* 23 */                iool1O1Ol1i.add(Float.valueOf(ioooi0.I001IIilI0O()));
/* 30 */                if (ioooi0.I000O01llI0()) {
/* 168 */                   return;
                        } else {
/* 33 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 39 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 41 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I00Io1o110i(List list) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IlOOIIIO0;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 79 */                int i2 = i & 7;
/* 81 */                if (i2 == 2) {
/* 119 */                   int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 123 */                   I00io1l(iI00II0oii1o);
/* 130 */                   int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 146 */                   do {
/* 139 */                       list.add(Float.valueOf(ioooi0.I001IIilI0O()));
/* 146 */                   } while (ioooi0.I000II() < iI000II);
/* 168 */                   return;
                        }
/* 83 */                if (i2 != 5) {
/* 118 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 109 */               do {
/* 93 */                    list.add(Float.valueOf(ioooi0.I001IIilI0O()));
/* 100 */                   if (ioooi0.I000O01llI0()) {
/* 168 */                       return;
                            } else {
/* 103 */                       iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 109 */               } while (iI00II0Ol1O0l == this.I00000oOI);
/* 111 */               this.I0000O = iI00II0Ol1O0l;
/* 113 */               return;
                    }
/* 14 */            IlOOIIIO0 ilOOIIIO0 = (IlOOIIIO0) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 2) {
/* 52 */                int iI00II0oii1o2 = ioooi0.I00II0oii1o();
/* 56 */                I00io1l(iI00II0oii1o2);
/* 63 */                int iI000II2 = ioooi0.I000II() + iI00II0oii1o2;
/* 76 */                do {
/* 69 */                    ilOOIIIO0.I0000O(ioooi0.I001IIilI0O());
/* 76 */                } while (ioooi0.I000II() < iI000II2);
/* 168 */               return;
                    }
/* 20 */            if (i3 != 5) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 42 */            do {
/* 26 */                ilOOIIIO0.I0000O(ioooi0.I001IIilI0O());
/* 33 */                if (ioooi0.I000O01llI0()) {
/* 168 */                   return;
                        } else {
/* 36 */                    iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                        }
/* 42 */            } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 44 */            this.I0000O = iI00II0Ol1O0l2;
                }

                public void I00IoIO0lI(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000lI()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000lI()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I00IoO0(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Integer.valueOf(ioooi0.I001IO000()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Integer.valueOf(ioooi0.I001IO000()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I00IoiI(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IooIOOO0I;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(ioooi0.I001IO000()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(ioooi0.I001IO000()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    iooIOOO0I.I0000O(ioooi0.I001IO000());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                iooIOOO0I.I0000O(ioooi0.I001IO000());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public void I00Iooi00oi(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Long.valueOf(ioooio1o.I000o00OoI0I()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Long.valueOf(ioooio1o.I000o00OoI0I()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I00O0i0ii(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Long.valueOf(ioooi0.I001i1O0Ol()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Long.valueOf(ioooi0.I001i1O0Ol()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I00O0o1oo(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof O1IIlI01ol;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Long.valueOf(ioooi0.I001i1O0Ol()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Long.valueOf(ioooi0.I001i1O0Ol()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    o1IIlI01ol.I0000O(ioooi0.I001i1O0Ol());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                o1IIlI01ol.I0000O(ioooi0.I001i1O0Ol());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public void I00O10llo(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 49 */                int iI001IO000 = ioooio1o.I001IO000();
/* 53 */                I00ioIO(iI001IO000);
/* 60 */                int iI00000oOI = ioooio1o.I00000oOI() + iI001IO000;
/* 76 */                do {
/* 69 */                    iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000oI1ioi()));
/* 76 */                } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 168 */               return;
                    }
/* 13 */            if (i != 5) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 39 */            do {
/* 23 */                iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I000oI1ioi()));
/* 30 */                if (ioooio1o.I0000Il00O()) {
/* 168 */                   return;
                        } else {
/* 33 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 39 */            } while (iI001IIilI0O == this.I00000oOI);
/* 41 */            this.I0000O = iI001IIilI0O;
                }

                public void I00OI1(Iool1O1Ol1i iool1O1Ol1i) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 49 */                int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 53 */                I00l0I0l0lO1(iI00II0oii1o);
/* 60 */                int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 76 */                do {
/* 69 */                    iool1O1Ol1i.add(Integer.valueOf(ioooi0.I001i1lo1io()));
/* 76 */                } while (ioooi0.I000II() < iI000II);
/* 168 */               return;
                    }
/* 13 */            if (i != 5) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 39 */            do {
/* 23 */                iool1O1Ol1i.add(Integer.valueOf(ioooi0.I001i1lo1io()));
/* 30 */                if (ioooi0.I000O01llI0()) {
/* 168 */                   return;
                        } else {
/* 33 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 39 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 41 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I00OIO1(List list) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IooIOOO0I;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 79 */                int i2 = i & 7;
/* 81 */                if (i2 == 2) {
/* 119 */                   int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 123 */                   I00io1l(iI00II0oii1o);
/* 130 */                   int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 146 */                   do {
/* 139 */                       list.add(Integer.valueOf(ioooi0.I001i1lo1io()));
/* 146 */                   } while (ioooi0.I000II() < iI000II);
/* 168 */                   return;
                        }
/* 83 */                if (i2 != 5) {
/* 118 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 109 */               do {
/* 93 */                    list.add(Integer.valueOf(ioooi0.I001i1lo1io()));
/* 100 */                   if (ioooi0.I000O01llI0()) {
/* 168 */                       return;
                            } else {
/* 103 */                       iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 109 */               } while (iI00II0Ol1O0l == this.I00000oOI);
/* 111 */               this.I0000O = iI00II0Ol1O0l;
/* 113 */               return;
                    }
/* 14 */            IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 2) {
/* 52 */                int iI00II0oii1o2 = ioooi0.I00II0oii1o();
/* 56 */                I00io1l(iI00II0oii1o2);
/* 63 */                int iI000II2 = ioooi0.I000II() + iI00II0oii1o2;
/* 76 */                do {
/* 69 */                    iooIOOO0I.I0000O(ioooi0.I001i1lo1io());
/* 76 */                } while (ioooi0.I000II() < iI000II2);
/* 168 */               return;
                    }
/* 20 */            if (i3 != 5) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 42 */            do {
/* 26 */                iooIOOO0I.I0000O(ioooi0.I001i1lo1io());
/* 33 */                if (ioooi0.I000O01llI0()) {
/* 168 */                   return;
                        } else {
/* 36 */                    iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                        }
/* 42 */            } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 44 */            this.I0000O = iI00II0Ol1O0l2;
                }

                public void I00OIl(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 74 */                do {
/* 58 */                    iool1IOO1o0i.add(Long.valueOf(ioooio1o.I00100l0()));
/* 65 */                    if (ioooio1o.I0000Il00O()) {
/* 67 */                        return;
                            } else {
/* 68 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 74 */                } while (iI001IIilI0O == this.I00000oOI);
/* 76 */                this.I0000O = iI001IIilI0O;
/* 168 */               return;
                    }
/* 13 */            if (i != 2) {
/* 49 */                throw O0010I0o.I00000oOI();
                    }
/* 15 */            int iI001IO000 = ioooio1o.I001IO000();
/* 19 */            I00li1OI(iI001IO000);
/* 26 */            int iI00000oOI = ioooio1o.I00000oOI() + iI001IO000;
/* 42 */            do {
/* 35 */                iool1IOO1o0i.add(Long.valueOf(ioooio1o.I00100l0()));
/* 42 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
                }

                public void I00OIo(Iool1O1Ol1i iool1O1Ol1i) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 74 */                do {
/* 58 */                    iool1O1Ol1i.add(Long.valueOf(ioooi0.I001iOo1i0O()));
/* 65 */                    if (ioooi0.I000O01llI0()) {
/* 67 */                        return;
                            } else {
/* 68 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 74 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 76 */                this.I0000O = iI00II0Ol1O0l;
/* 168 */               return;
                    }
/* 13 */            if (i != 2) {
/* 49 */                throw O0011oo.I00000oOI();
                    }
/* 15 */            int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 19 */            I00ll1(iI00II0oii1o);
/* 26 */            int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 42 */            do {
/* 35 */                iool1O1Ol1i.add(Long.valueOf(ioooi0.I001iOo1i0O()));
/* 42 */            } while (ioooi0.I000II() < iI000II);
                }

                public void I00OOll1(List list) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof O1IIlI01ol;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       list.add(Long.valueOf(ioooi0.I001iOo1i0O()));
/* 134 */                       if (ioooi0.I000O01llI0()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 143 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 145 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 84 */                int iI00II0oii1o = ioooi0.I00II0oii1o();
/* 88 */                I00l0OO0IO(iI00II0oii1o);
/* 95 */                int iI000II = ioooi0.I000II() + iI00II0oii1o;
/* 111 */               do {
/* 104 */                   list.add(Long.valueOf(ioooi0.I001iOo1i0O()));
/* 111 */               } while (ioooi0.I000II() < iI000II);
/* 136 */               return;
                    }
/* 14 */            O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    o1IIlI01ol.I0000O(ioooi0.I001iOo1i0O());
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 22 */            int iI00II0oii1o2 = ioooi0.I00II0oii1o();
/* 26 */            I00l0OO0IO(iI00II0oii1o2);
/* 33 */            int iI000II2 = ioooi0.I000II() + iI00II0oii1o2;
/* 45 */            do {
/* 38 */                o1IIlI01ol.I0000O(ioooi0.I001iOo1i0O());
/* 45 */            } while (ioooi0.I000II() < iI000II2);
                }

                public void I00OilO00Il(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I00100o1O0lo()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I00100o1O0lo()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I00Oio(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Integer.valueOf(ioooi0.I001l0I00()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Integer.valueOf(ioooi0.I001l0I00()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I00Ol00(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IooIOOO0I;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(ioooi0.I001l0I00()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(ioooi0.I001l0I00()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    iooIOOO0I.I0000O(ioooi0.I001l0I00());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                iooIOOO0I.I0000O(ioooi0.I001l0I00());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public void I00Ol10(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Long.valueOf(ioooio1o.I0010I0i()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Long.valueOf(ioooio1o.I0010I0i()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I00Ol1ll1(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Long.valueOf(ioooi0.I001lIiIIo1O()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Long.valueOf(ioooi0.I001lIiIIo1O()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I00OloOo(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof O1IIlI01ol;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Long.valueOf(ioooi0.I001lIiIIo1O()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Long.valueOf(ioooi0.I001lIiIIo1O()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    o1IIlI01ol.I0000O(ioooi0.I001lIiIIo1O());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                o1IIlI01ol.I0000O(ioooi0.I001lIiIIo1O());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public void I00i01iIIliI(Iool1IOO1o0i iool1IOO1o0i, boolean z) throws O000illO, O000lI0, O000o1i {
                    String strI0010o;
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 106 */               throw O0010I0o.I00000oOI();
                    }
/* 45 */            do {
/* 12 */                if (z) {
/* 14 */                    I00ilI0I1(2);
/* 17 */                    strI0010o = ioooio1o.I00111O();
                        } else {
/* 22 */                    I00ilI0I1(2);
/* 25 */                    strI0010o = ioooio1o.I0010o();
                        }
/* 29 */                iool1IOO1o0i.add(strI0010o);
/* 36 */                if (ioooio1o.I0000Il00O()) {
/* 38 */                    return;
                        } else {
/* 39 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 45 */            } while (iI001IIilI0O == this.I00000oOI);
/* 47 */            this.I0000O = iI001IIilI0O;
                }

                public void I00i0O(Iool1O1Ol1i iool1O1Ol1i, boolean z) throws O000illO, O000lI0, O000o1i {
                    String strI001lllioOl;
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 106 */               throw O0011oo.I00000oOI();
                    }
/* 45 */            do {
/* 12 */                if (z) {
/* 14 */                    I00ilI0I1(2);
/* 17 */                    strI001lllioOl = ioooi0.I001lloI();
                        } else {
/* 22 */                    I00ilI0I1(2);
/* 25 */                    strI001lllioOl = ioooi0.I001lllioOl();
                        }
/* 29 */                iool1O1Ol1i.add(strI001lllioOl);
/* 36 */                if (ioooi0.I000O01llI0()) {
/* 38 */                    return;
                        } else {
/* 39 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 45 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 47 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I00i0ilIl0i(List list, boolean z) throws O000illO, O000lI0, O000o1i {
                    String strI001lllioOl;
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 106 */               throw O000oiiiOI0.I0000Il00O();
                    }
/* 14 */            if ((list instanceof O0o1ioOoo00) && !z) {
/* 19 */                O0o1ioOoo00 o0o1ioOoo00 = (O0o1ioOoo00) list;
/* 41 */                do {
/* 25 */                    o0o1ioOoo00.I00IioO0OiOi(I0010I0i());
/* 32 */                    if (ioooi0.I000O01llI0()) {
/* 72 */                        return;
                            } else {
/* 35 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 41 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 43 */                this.I0000O = iI00II0Ol1O0l2;
/* 45 */                return;
                    }
/* 79 */            do {
/* 46 */                if (z) {
/* 48 */                    I00ilI0I1(2);
/* 51 */                    strI001lllioOl = ioooi0.I001lloI();
                        } else {
/* 56 */                    I00ilI0I1(2);
/* 59 */                    strI001lllioOl = ioooi0.I001lllioOl();
                        }
/* 63 */                list.add(strI001lllioOl);
/* 70 */                if (ioooi0.I000O01llI0()) {
/* 72 */                    return;
                        } else {
/* 73 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 79 */            } while (iI00II0Ol1O0l == this.I00000oOI);
/* 81 */            this.I0000O = iI00II0Ol1O0l;
                }

                public void I00i0oil(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I001IO000()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Integer.valueOf(ioooio1o.I001IO000()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I00iIO(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Integer.valueOf(ioooi0.I00II0oii1o()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Integer.valueOf(ioooi0.I00II0oii1o()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I00iIi0i1o(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof IooIOOO0I;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(ioooi0.I00II0oii1o()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(ioooi0.I00II0oii1o()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    iooIOOO0I.I0000O(ioooi0.I00II0oii1o());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                iooIOOO0I.I0000O(ioooi0.I00II0oii1o());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public void I00iOIl(Iool1IOO1o0i iool1IOO1o0i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI001IIilI0O;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1IOO1o0i.add(Long.valueOf(ioooio1o.I001i1O0Ol()));
/* 64 */                    if (ioooio1o.I0000Il00O()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI001IIilI0O = ioooio1o.I001IIilI0O();
                            }
/* 73 */                } while (iI001IIilI0O == this.I00000oOI);
/* 75 */                this.I0000O = iI001IIilI0O;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0010I0o.I00000oOI();
                    }
/* 22 */            int iI00000oOI = ioooio1o.I00000oOI() + ioooio1o.I001IO000();
/* 38 */            do {
/* 31 */                iool1IOO1o0i.add(Long.valueOf(ioooio1o.I001i1O0Ol()));
/* 38 */            } while (ioooio1o.I00000oOI() < iI00000oOI);
/* 40 */            I00iio(iI00000oOI);
                }

                public void I00iiI(Iool1O1Ol1i iool1O1Ol1i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 73 */                do {
/* 57 */                    iool1O1Ol1i.add(Long.valueOf(ioooi0.I00IO1()));
/* 64 */                    if (ioooi0.I000O01llI0()) {
/* 66 */                        return;
                            } else {
/* 67 */                        iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                            }
/* 73 */                } while (iI00II0Ol1O0l == this.I00000oOI);
/* 75 */                this.I0000O = iI00II0Ol1O0l;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 48 */                throw O0011oo.I00000oOI();
                    }
/* 22 */            int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 38 */            do {
/* 31 */                iool1O1Ol1i.add(Long.valueOf(ioooi0.I00IO1()));
/* 38 */            } while (ioooi0.I000II() < iI000II);
/* 40 */            I00iio(iI000II);
                }

                public void I00iiO(List list) throws O0010I0o, O000oiiiOI0, O0011oo {
                    int iI00II0Ol1O0l;
                    int iI00II0Ol1O0l2;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = list instanceof O1IIlI01ol;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Long.valueOf(ioooi0.I00IO1()));
/* 133 */                       if (ioooi0.I000O01llI0()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                                }
/* 142 */                   } while (iI00II0Ol1O0l == this.I00000oOI);
/* 144 */                   this.I0000O = iI00II0Ol1O0l;
/* 168 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw O000oiiiOI0.I0000Il00O();
                        }
/* 91 */                int iI000II = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 107 */               do {
/* 100 */                   list.add(Long.valueOf(ioooi0.I00IO1()));
/* 107 */               } while (ioooi0.I000II() < iI000II);
/* 109 */               I00iio(iI000II);
/* 112 */               return;
                    }
/* 13 */            O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    o1IIlI01ol.I0000O(ioooi0.I00IO1());
/* 63 */                    if (ioooi0.I000O01llI0()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iI00II0Ol1O0l2 = ioooi0.I00II0Ol1O0l();
                            }
/* 72 */                } while (iI00II0Ol1O0l2 == this.I00000oOI);
/* 74 */                this.I0000O = iI00II0Ol1O0l2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw O000oiiiOI0.I0000Il00O();
                    }
/* 29 */            int iI000II2 = ioooi0.I000II() + ioooi0.I00II0oii1o();
/* 41 */            do {
/* 34 */                o1IIlI01ol.I0000O(ioooi0.I00IO1());
/* 41 */            } while (ioooi0.I000II() < iI000II2);
/* 43 */            I00iio(iI000II2);
                }

                public void I00iio(int i) throws O0010I0o, O000oiiiOI0, O0011oo {
                    switch (this.I00000oIO) {
                        case 0:
/* 46 */                    if (((IOOOI0) this.I0000oI00).I000II() != i) {
/* 53 */                        throw O000oiiiOI0.I000II();
                            }
/* 48 */                    return;
                        case 1:
/* 30 */                    if (((IOOOIO1O) this.I0000oI00).I00000oOI() != i) {
/* 37 */                        throw O0010I0o.I0000oI00();
                            }
/* 32 */                    return;
                        default:
/* 14 */                    if (((IOOOI0) this.I0000oI00).I000II() != i) {
/* 21 */                        throw O0011oo.I0000oI00();
                            }
/* 16 */                    return;
                    }
                }

                public void I00ilI0I1(int i) throws O000illO, O000lI0, O000o1i {
                    switch (this.I00000oIO) {
                        case 0:
/* 34 */                    if ((this.I00000oOI & 7) != i) {
/* 41 */                        throw O000oiiiOI0.I0000Il00O();
                            }
/* 36 */                    return;
                        case 1:
/* 22 */                    if ((this.I00000oOI & 7) != i) {
/* 29 */                        throw O0010I0o.I00000oOI();
                            }
/* 24 */                    return;
                        default:
/* 10 */                    if ((this.I00000oOI & 7) != i) {
/* 17 */                        throw O0011oo.I00000oOI();
                            }
/* 12 */                    return;
                    }
                }

                public boolean I00ilO0() {
                    int i;
                    int i2;
                    switch (this.I00000oIO) {
                        case 1:
/* 31 */                    IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 37 */                    if (ioooio1o.I0000Il00O() || (i = this.I00000oOI) == this.I0000Il00O) {
/* 3 */                         return false;
                            }
/* 46 */                    return ioooio1o.I001i1lo1io(i);
                        default:
/* 9 */                     IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 15 */                    if (ioooi0.I000O01llI0() || (i2 = this.I00000oOI) == this.I0000Il00O) {
/* 3 */                         return false;
                            }
/* 24 */                    return ioooi0.I00IO1oi11O(i2);
                    }
                }

                public void I00lli11(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof iloiOllI) {
/* 82 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 14 */            if (i == 1) {
/* 77 */                do {
/* 62 */                    list.add(Long.valueOf(ioooi0.I00OloOo()));
/* 69 */                    if (ioooi0.I00IlilI0i0i()) {
/* 81 */                        return;
                            } else {
/* 71 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 77 */                } while (iI00Ol10 == this.I00000oOI);
/* 79 */                this.I0000O = iI00Ol10;
/* 81 */                return;
                    }
/* 17 */            if (i != 2) {
/* 53 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 19 */            int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 23 */            I01Ii0ll10O(iI00Ol1ll1);
/* 30 */            int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 46 */            do {
/* 39 */                list.add(Long.valueOf(ioooi0.I00OloOo()));
/* 46 */            } while (ioooi0.I00OIO1() < iI00OIO1);
                }

                public void I00lll10(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof iI0Il0IoIil;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00O0o1oo());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00O0o1oo());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Long.valueOf(ioooio1o.I00O0o1oo()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Long.valueOf(ioooio1o.I00O0o1oo()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I00o0iI0io1(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0i0iiOoIlo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0i0iiooilo.I0000O(ioooi0.I00OIo());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0i0iiooilo.I0000O(ioooi0.I00OIo());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Integer.valueOf(ioooi0.I00OIo()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Integer.valueOf(ioooi0.I00OIo()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I00o0l1o1o0(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilO0iO11OOO0) {
/* 82 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 14 */            if (i == 2) {
/* 52 */                int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 56 */                I01II10(iI00Ol1ll1);
/* 63 */                int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 79 */                do {
/* 72 */                    list.add(Float.valueOf(ioooi0.I00OI1()));
/* 79 */                } while (ioooi0.I00OIO1() < iI00OIO1);
/* 81 */                return;
                    }
/* 17 */            if (i != 5) {
/* 51 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 42 */            do {
/* 27 */                list.add(Float.valueOf(ioooi0.I00OI1()));
/* 34 */                if (ioooi0.I00IlilI0i0i()) {
/* 81 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 42 */            } while (iI00Ol10 == this.I00000oOI);
/* 44 */            this.I0000O = iI00Ol10;
                }

                public void I00o101lO(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof i1oiI1lIo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        i1oii1lio.I0001Ioi1lo(ioooio1o.I00O10llo());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    i1oii1lio.I0001Ioi1lo(ioooio1o.I00O10llo());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Integer.valueOf(ioooio1o.I00O10llo()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Integer.valueOf(ioooio1o.I00O10llo()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I00oI0i(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0i0iiOoIlo;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) ii0i1l11Var;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 == 2) {
/* 49 */                    int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 53 */                    I01Io1(iI00Ol1ll1);
/* 60 */                    int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 73 */                    do {
/* 66 */                        ii0i0iiooilo.I0000O(ioooi0.I00OOll1());
/* 73 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 168 */                   return;
                        }
/* 20 */                if (i2 != 5) {
/* 45 */                    OoOil11Ol1o.I001IO000();
/* 48 */                    return;
                        }
/* 42 */                do {
/* 26 */                    ii0i0iiooilo.I0000O(ioooi0.I00OOll1());
/* 33 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 36 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 42 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 76 */                int i3 = i & 7;
/* 78 */                if (i3 == 2) {
/* 115 */                   int iI00Ol1ll12 = ioooi0.I00Ol1ll1();
/* 119 */                   I01Io1(iI00Ol1ll12);
/* 126 */                   int iI00OIO12 = ioooi0.I00OIO1() + iI00Ol1ll12;
/* 142 */                   do {
/* 135 */                       ii0i1l11Var.add(Integer.valueOf(ioooi0.I00OOll1()));
/* 142 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 168 */                   return;
                        }
/* 80 */                if (i3 != 5) {
/* 111 */                   OoOil11Ol1o.I001IO000();
/* 114 */                   return;
                        }
/* 105 */               do {
/* 90 */                    ii0i1l11Var.add(Integer.valueOf(ioooi0.I00OOll1()));
/* 97 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 99 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 105 */               } while (iI00Ol10 == this.I00000oOI);
/* 107 */               iI00Ol102 = iI00Ol10;
                    }
/* 108 */           this.I0000O = iI00Ol102;
                }

                public void I00oII(List list, ioO0I1oi1lio ioo0i1oi1lio, ilI1iIO0oiIo ili1iio0oiio) throws ill0OI0oO1 {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int i = this.I00000oOI;
/* 10 */            if ((i & 7) != 3) {
/* 98 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 40 */            do {
/* 12 */                ilOl10 ilol10Zze = ioo0i1oi1lio.zze();
/* 16 */                I011iIOio(ilol10Zze, ioo0i1oi1lio, ili1iio0oiio);
/* 19 */                ioo0i1oi1lio.I00000oIO(ilol10Zze);
/* 22 */                list.add(ilol10Zze);
/* 29 */                if (ioooi0.I00IlilI0i0i() || this.I0000O != 0) {
/* 44 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 40 */            } while (iI00Ol10 == i);
/* 42 */            this.I0000O = iI00Ol10;
                }

                public void I00oIiI10(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof iI0Il0IoIil;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) ii00ili1oii;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 != 1) {
/* 20 */                    if (i2 != 2) {
/* 48 */                        OoOil11Ol1o.I00100l0();
/* 51 */                        return;
                            }
/* 22 */                    int iI00Ol00 = ioooio1o.I00Ol00();
/* 26 */                    I01Io000(iI00Ol00);
/* 33 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + iI00Ol00;
/* 45 */                    do {
/* 38 */                        ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00OI1());
/* 45 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 56 */                    ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00OI1());
/* 63 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 72 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 111 */                       OoOil11Ol1o.I00100l0();
/* 114 */                       return;
                            }
/* 81 */                    int iI00Ol002 = ioooio1o.I00Ol00();
/* 85 */                    I01Io000(iI00Ol002);
/* 92 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + iI00Ol002;
/* 108 */                   do {
/* 101 */                       ii00ili1oii.add(Long.valueOf(ioooio1o.I00OI1()));
/* 108 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 168 */                   return;
                        }
/* 138 */               do {
/* 123 */                   ii00ili1oii.add(Long.valueOf(ioooio1o.I00OI1()));
/* 130 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 132 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 138 */               } while (iI00Io1o110i == this.I00000oOI);
/* 140 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 141 */           this.I0000O = iI00Io1o110i2;
                }

                public void I00oO101o(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0l0Ol0i;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) ii0i1l11Var;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 != 1) {
/* 20 */                    if (i2 != 2) {
/* 48 */                        OoOil11Ol1o.I001IO000();
/* 51 */                        return;
                            }
/* 22 */                    int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 26 */                    I01Io1ilOIIo(iI00Ol1ll1);
/* 33 */                    int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 45 */                    do {
/* 38 */                        ii0l0ol0i.I0000O(ioooi0.I00OloOo());
/* 45 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 56 */                    ii0l0ol0i.I0000O(ioooi0.I00OloOo());
/* 63 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 72 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 111 */                       OoOil11Ol1o.I001IO000();
/* 114 */                       return;
                            }
/* 81 */                    int iI00Ol1ll12 = ioooi0.I00Ol1ll1();
/* 85 */                    I01Io1ilOIIo(iI00Ol1ll12);
/* 92 */                    int iI00OIO12 = ioooi0.I00OIO1() + iI00Ol1ll12;
/* 108 */                   do {
/* 101 */                       ii0i1l11Var.add(Long.valueOf(ioooi0.I00OloOo()));
/* 108 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 168 */                   return;
                        }
/* 138 */               do {
/* 123 */                   ii0i1l11Var.add(Long.valueOf(ioooi0.I00OloOo()));
/* 130 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 132 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 138 */               } while (iI00Ol10 == this.I00000oOI);
/* 140 */               iI00Ol102 = iI00Ol10;
                    }
/* 141 */           this.I0000O = iI00Ol102;
                }

                public void I00oOio10iI1(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilOllI1i00l) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Integer.valueOf(ioooi0.I00OilO00Il()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Integer.valueOf(ioooi0.I00OilO00Il()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I00ol1(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof i1oiI1lIo;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 == 2) {
/* 49 */                    int iI00Ol00 = ioooio1o.I00Ol00();
/* 53 */                    I01IlIoOI(iI00Ol00);
/* 60 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + iI00Ol00;
/* 73 */                    do {
/* 66 */                        i1oii1lio.I0001Ioi1lo(ioooio1o.I00OIO1());
/* 73 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 168 */                   return;
                        }
/* 20 */                if (i2 != 5) {
/* 45 */                    OoOil11Ol1o.I00100l0();
/* 48 */                    return;
                        }
/* 42 */                do {
/* 26 */                    i1oii1lio.I0001Ioi1lo(ioooio1o.I00OIO1());
/* 33 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 36 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 42 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 76 */                int i3 = i & 7;
/* 78 */                if (i3 == 2) {
/* 115 */                   int iI00Ol002 = ioooio1o.I00Ol00();
/* 119 */                   I01IlIoOI(iI00Ol002);
/* 126 */                   int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + iI00Ol002;
/* 142 */                   do {
/* 135 */                       ii00ili1oii.add(Integer.valueOf(ioooio1o.I00OIO1()));
/* 142 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 168 */                   return;
                        }
/* 80 */                if (i3 != 5) {
/* 111 */                   OoOil11Ol1o.I00100l0();
/* 114 */                   return;
                        }
/* 105 */               do {
/* 90 */                    ii00ili1oii.add(Integer.valueOf(ioooio1o.I00OIO1()));
/* 97 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 99 */                        iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 105 */               } while (iI00Io1o110i == this.I00000oOI);
/* 107 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 108 */           this.I0000O = iI00Io1o110i2;
                }

                public void I00olI(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0OII0ll;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                ii0OII0ll ii0oii0ll = (ii0OII0ll) ii0i1l11Var;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 == 2) {
/* 49 */                    int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 53 */                    I01Io1(iI00Ol1ll1);
/* 60 */                    int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 73 */                    do {
/* 66 */                        ii0oii0ll.I00000oOI(ioooi0.I00OI1());
/* 73 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 168 */                   return;
                        }
/* 20 */                if (i2 != 5) {
/* 45 */                    OoOil11Ol1o.I001IO000();
/* 48 */                    return;
                        }
/* 42 */                do {
/* 26 */                    ii0oii0ll.I00000oOI(ioooi0.I00OI1());
/* 33 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 36 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 42 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 76 */                int i3 = i & 7;
/* 78 */                if (i3 == 2) {
/* 115 */                   int iI00Ol1ll12 = ioooi0.I00Ol1ll1();
/* 119 */                   I01Io1(iI00Ol1ll12);
/* 126 */                   int iI00OIO12 = ioooi0.I00OIO1() + iI00Ol1ll12;
/* 142 */                   do {
/* 135 */                       ii0i1l11Var.add(Float.valueOf(ioooi0.I00OI1()));
/* 142 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 168 */                   return;
                        }
/* 80 */                if (i3 != 5) {
/* 111 */                   OoOil11Ol1o.I001IO000();
/* 114 */                   return;
                        }
/* 105 */               do {
/* 90 */                    ii0i1l11Var.add(Float.valueOf(ioooi0.I00OI1()));
/* 97 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 99 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 105 */               } while (iI00Ol10 == this.I00000oOI);
/* 107 */               iI00Ol102 = iI00Ol10;
                    }
/* 108 */           this.I0000O = iI00Ol102;
                }

                public void I00oli(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof iloiOllI) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Long.valueOf(ioooi0.I00i01iIIliI()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Long.valueOf(ioooi0.I00i01iIIliI()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I00oliIiO01i(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 71 */                do {
/* 56 */                    ii00ili1oii.add(Boolean.valueOf(ioooio1o.I00OIl()));
/* 63 */                    if (ioooio1o.I001lloI()) {
/* 77 */                        return;
                            } else {
/* 65 */                        iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i == this.I00000oOI);
/* 73 */                this.I0000O = iI00Io1o110i;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 44 */                OoOil11Ol1o.I00100l0();
/* 47 */                return;
                    }
/* 22 */            int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 38 */            do {
/* 31 */                ii00ili1oii.add(Boolean.valueOf(ioooio1o.I00OIl()));
/* 38 */            } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 40 */            I01IiOO(iI00II0Ol1O0l);
                }

                public void I00oo1iO0ll(ii0i1l11 ii0i1l11Var, ii0oioOi00i ii0oiooi00i, ii0II11oi0I ii0ii11oi0i) throws ii0iI0IiOo {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int i = this.I00000oOI;
/* 10 */            if ((i & 7) != 3) {
/* 45 */                OoOil11Ol1o.I001IO000();
/* 98 */                return;
                    }
/* 40 */            do {
/* 12 */                Object objZze = ii0oiooi00i.zze();
/* 16 */                I01Iio10lo(objZze, ii0oiooi00i, ii0ii11oi0i);
/* 19 */                ii0oiooi00i.I00000oIO(objZze);
/* 22 */                ii0i1l11Var.add(objZze);
/* 29 */                if (ioooi0.I00IlilI0i0i() || this.I0000O != 0) {
/* 44 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 40 */            } while (iI00Ol10 == i);
/* 42 */            this.I0000O = iI00Ol10;
                }

                public void I00ooIo0(List list, ioO0I1oi1lio ioo0i1oi1lio, ilI1iIO0oiIo ili1iio0oiio) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int i = this.I00000oOI;
/* 10 */            if ((i & 7) != 2) {
/* 98 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 40 */            do {
/* 12 */                ilOl10 ilol10Zze = ioo0i1oi1lio.zze();
/* 16 */                I011lO1liO1O(ilol10Zze, ioo0i1oi1lio, ili1iio0oiio);
/* 19 */                ioo0i1oi1lio.I00000oIO(ilol10Zze);
/* 22 */                list.add(ilol10Zze);
/* 29 */                if (ioooi0.I00IlilI0i0i() || this.I0000O != 0) {
/* 44 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 40 */            } while (iI00Ol10 == i);
/* 42 */            this.I0000O = iI00Ol10;
                }

                public void I00ooiO1I(iI00IlI1oII ii00ili1oii, boolean z) throws iI00ilIl1I {
                    String strI00OIo;
                    int iI00Io1o110i;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 50 */                OoOil11Ol1o.I00100l0();
/* 106 */               return;
                    }
/* 45 */            do {
/* 12 */                if (z) {
/* 14 */                    I011lIilI0lo(2);
/* 17 */                    strI00OIo = ioooio1o.I00OOll1();
                        } else {
/* 22 */                    I011lIilI0lo(2);
/* 25 */                    strI00OIo = ioooio1o.I00OIo();
                        }
/* 29 */                ii00ili1oii.add(strI00OIo);
/* 36 */                if (ioooio1o.I001lloI()) {
/* 38 */                    return;
                        } else {
/* 39 */                    iI00Io1o110i = ioooio1o.I00Io1o110i();
                        }
/* 45 */            } while (iI00Io1o110i == this.I00000oOI);
/* 47 */            this.I0000O = iI00Io1o110i;
                }

                public void I00oooO(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0i0iiOoIlo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0i0iiooilo.I0000O(ioooi0.I00OilO00Il());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0i0iiooilo.I0000O(ioooi0.I00OilO00Il());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Integer.valueOf(ioooi0.I00OilO00Il()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Integer.valueOf(ioooi0.I00OilO00Il()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I0100i(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilOllI1i00l) {
/* 82 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 14 */            if (i == 2) {
/* 52 */                int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 56 */                I01II10(iI00Ol1ll1);
/* 63 */                int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 79 */                do {
/* 72 */                    list.add(Integer.valueOf(ioooi0.I00Oio()));
/* 79 */                } while (ioooi0.I00OIO1() < iI00OIO1);
/* 81 */                return;
                    }
/* 17 */            if (i != 5) {
/* 51 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 42 */            do {
/* 27 */                list.add(Integer.valueOf(ioooi0.I00Oio()));
/* 34 */                if (ioooi0.I00IlilI0i0i()) {
/* 81 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 42 */            } while (iI00Ol10 == this.I00000oOI);
/* 44 */            this.I0000O = iI00Ol10;
                }

                public void I0100o111I(iI00IlI1oII ii00ili1oii, iI110OIoiOl ii110oioiol, i1o0l0i i1o0l0iVar) throws iI00lI {
                    int iI00Io1o110i;
/* 1 */             int i = this.I00000oOI;
/* 6 */             if ((i & 7) != 2) {
/* 45 */                OoOil11Ol1o.I00100l0();
/* 98 */                return;
                    }
/* 40 */            do {
/* 8 */                 i1oi01OllI i1oi01olliZza = ii110oioiol.zza();
/* 12 */                I011olOoO(i1oi01olliZza, ii110oioiol, i1o0l0iVar);
/* 15 */                ii110oioiol.I0000Il00O(i1oi01olliZza);
/* 18 */                ii00ili1oii.add(i1oi01olliZza);
/* 23 */                IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 29 */                if (ioooio1o.I001lloI() || this.I0000O != 0) {
/* 44 */                    return;
                        } else {
/* 36 */                    iI00Io1o110i = ioooio1o.I00Io1o110i();
                        }
/* 40 */            } while (iI00Io1o110i == i);
/* 42 */            this.I0000O = iI00Io1o110i;
                }

                public void I010101Oo1lO(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0l0Ol0i;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0l0ol0i.I0000O(ioooi0.I00i01iIIliI());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0l0ol0i.I0000O(ioooi0.I00i01iIIliI());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Long.valueOf(ioooi0.I00i01iIIliI()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Long.valueOf(ioooi0.I00i01iIIliI()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I010I0(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof iloiOllI) {
/* 82 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 14 */            if (i == 1) {
/* 77 */                do {
/* 62 */                    list.add(Long.valueOf(ioooi0.I00i0O()));
/* 69 */                    if (ioooi0.I00IlilI0i0i()) {
/* 81 */                        return;
                            } else {
/* 71 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 77 */                } while (iI00Ol10 == this.I00000oOI);
/* 79 */                this.I0000O = iI00Ol10;
/* 81 */                return;
                    }
/* 17 */            if (i != 2) {
/* 53 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 19 */            int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 23 */            I01Ii0ll10O(iI00Ol1ll1);
/* 30 */            int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 46 */            do {
/* 39 */                list.add(Long.valueOf(ioooi0.I00i0O()));
/* 46 */            } while (ioooi0.I00OIO1() < iI00OIO1);
                }

                public void I010II(iI00IlI1oII ii00ili1oii, iI110OIoiOl ii110oioiol, i1o0l0i i1o0l0iVar) throws iI00ilIl1I {
                    int iI00Io1o110i;
/* 1 */             int i = this.I00000oOI;
/* 6 */             if ((i & 7) != 3) {
/* 45 */                OoOil11Ol1o.I00100l0();
/* 98 */                return;
                    }
/* 40 */            do {
/* 8 */                 i1oi01OllI i1oi01olliZza = ii110oioiol.zza();
/* 12 */                I01IO0oio(i1oi01olliZza, ii110oioiol, i1o0l0iVar);
/* 15 */                ii110oioiol.I0000Il00O(i1oi01olliZza);
/* 18 */                ii00ili1oii.add(i1oi01olliZza);
/* 23 */                IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 29 */                if (ioooio1o.I001lloI() || this.I0000O != 0) {
/* 44 */                    return;
                        } else {
/* 36 */                    iI00Io1o110i = ioooio1o.I00Io1o110i();
                        }
/* 40 */            } while (iI00Io1o110i == i);
/* 42 */            this.I0000O = iI00Io1o110i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
                
                    r9.put(r4, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
                
                    r1.I00IioO0OiOi(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
                
                    return;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I010OIo1l(ii0l1oio1O ii0l1oio1o, OillOo0 oillOo0, ii0II11oi0I ii0ii11oi0i) {
/* 2 */             I01Io001O(2);
/* 7 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 13 */            int iI00OIl = ioooi0.I00OIl(ioooi0.I00Ol1ll1());
/* 17 */            Object objI01I0Iioooo0 = oillOo0.I00ilI0I1;
/* 19 */            Object objI01I0Iioooo02 = oillOo0.I00iiO;
                    while (true) {
                        try {
/* 21 */                    int iI01Iol = I01Iol();
/* 28 */                    if (iI01Iol == Integer.MAX_VALUE || ioooi0.I00IlilI0i0i()) {
                                break;
                            }
/* 40 */                    if (iI01Iol == 1) {
/* 79 */                        objI01I0Iioooo02 = I01I0Iioooo0((ii10iIl) oillOo0.I00iiI, null, null);
                            } else if (iI01Iol != 2) {
                                try {
/* 48 */                            if (!I01I01Oolii()) {
/* 56 */                                throw new ii0iI11ol("Unable to parse map entry.");
                                    }
                                } catch (ii0iI0IiOo unused) {
/* 88 */                            if (!I01I01Oolii()) {
/* 96 */                                throw new ii0iI11ol("Unable to parse map entry.");
                                    }
                                }
                            } else {
/* 69 */                        objI01I0Iioooo0 = I01I0Iioooo0((ii10iIl) oillOo0.I00iio, oillOo0.I00ilI0I1.getClass(), ii0ii11oi0i);
                            }
                        } catch (Throwable th) {
/* 104 */                   ioooi0.I00IioO0OiOi(iI00OIl);
/* 408 */                   throw th;
                        }
                    }
                }

                public void I010i10l(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilOllI1i00l) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Integer.valueOf(ioooi0.I00Ol00()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Integer.valueOf(ioooi0.I00Ol00()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I010iIIOlo(iI00IlI1oII ii00ili1oii) throws iI00ilIl1I {
                    int iI00Io1o110i;
/* 6 */             if ((this.I00000oOI & 7) != 2) {
/* 37 */                OoOil11Ol1o.I00100l0();
/* 77 */                return;
                    }
/* 32 */            do {
/* 12 */                ii00ili1oii.add(I01OIo());
/* 17 */                IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 23 */                if (ioooio1o.I001lloI()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iI00Io1o110i = ioooio1o.I00Io1o110i();
                        }
/* 32 */            } while (iI00Io1o110i == this.I00000oOI);
/* 34 */            this.I0000O = iI00Io1o110i;
                }

                public void I010ioo(ii0i1l11 ii0i1l11Var, ii0oioOi00i ii0oiooi00i, ii0II11oi0I ii0ii11oi0i) throws ii0iI11ol {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int i = this.I00000oOI;
/* 10 */            if ((i & 7) != 2) {
/* 45 */                OoOil11Ol1o.I001IO000();
/* 98 */                return;
                    }
/* 40 */            do {
/* 12 */                Object objZze = ii0oiooi00i.zze();
/* 16 */                I01Ilioliio(objZze, ii0oiooi00i, ii0ii11oi0i);
/* 19 */                ii0oiooi00i.I00000oIO(objZze);
/* 22 */                ii0i1l11Var.add(objZze);
/* 29 */                if (ioooi0.I00IlilI0i0i() || this.I0000O != 0) {
/* 44 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 40 */            } while (iI00Ol10 == i);
/* 42 */            this.I0000O = iI00Ol10;
                }

                public void I010l10O(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof iloiOllI) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Long.valueOf(ioooi0.I00i0ilIl0i()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Long.valueOf(ioooi0.I00i0ilIl0i()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I010l1O(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof i1oiI1lIo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        i1oii1lio.I0001Ioi1lo(ioooio1o.I00Ol00());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    i1oii1lio.I0001Ioi1lo(ioooio1o.I00Ol00());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Integer.valueOf(ioooio1o.I00Ol00()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Integer.valueOf(ioooio1o.I00Ol00()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I010l1ol111(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0i0iiOoIlo;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) ii0i1l11Var;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 == 2) {
/* 49 */                    int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 53 */                    I01Io1(iI00Ol1ll1);
/* 60 */                    int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 73 */                    do {
/* 66 */                        ii0i0iiooilo.I0000O(ioooi0.I00Oio());
/* 73 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 168 */                   return;
                        }
/* 20 */                if (i2 != 5) {
/* 45 */                    OoOil11Ol1o.I001IO000();
/* 48 */                    return;
                        }
/* 42 */                do {
/* 26 */                    ii0i0iiooilo.I0000O(ioooi0.I00Oio());
/* 33 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 36 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 42 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 76 */                int i3 = i & 7;
/* 78 */                if (i3 == 2) {
/* 115 */                   int iI00Ol1ll12 = ioooi0.I00Ol1ll1();
/* 119 */                   I01Io1(iI00Ol1ll12);
/* 126 */                   int iI00OIO12 = ioooi0.I00OIO1() + iI00Ol1ll12;
/* 142 */                   do {
/* 135 */                       ii0i1l11Var.add(Integer.valueOf(ioooi0.I00Oio()));
/* 142 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 168 */                   return;
                        }
/* 80 */                if (i3 != 5) {
/* 111 */                   OoOil11Ol1o.I001IO000();
/* 114 */                   return;
                        }
/* 105 */               do {
/* 90 */                    ii0i1l11Var.add(Integer.valueOf(ioooi0.I00Oio()));
/* 97 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 99 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 105 */               } while (iI00Ol10 == this.I00000oOI);
/* 107 */               iI00Ol102 = iI00Ol10;
                    }
/* 108 */           this.I0000O = iI00Ol102;
                }

                public void I010lI0oi(List list, boolean z) throws ill0OI0oO1 {
                    String strI00iOIl;
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 106 */               throw ill0ll01OOOO.I00000oIO();
                    }
/* 14 */            if ((list instanceof illlOI) && !z) {
/* 19 */                illlOI illloi = (illlOI) list;
/* 40 */                do {
/* 25 */                    illloi.I00OOll1(I01O1I1());
/* 32 */                    if (ioooi0.I00IlilI0i0i()) {
/* 69 */                        return;
                            } else {
/* 34 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 40 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 76 */                do {
/* 43 */                    if (z) {
/* 45 */                        I01I1Oo0oll(2);
/* 48 */                        strI00iOIl = ioooi0.I00iiI();
                            } else {
/* 53 */                        I01I1Oo0oll(2);
/* 56 */                        strI00iOIl = ioooi0.I00iOIl();
                            }
/* 60 */                    list.add(strI00iOIl);
/* 67 */                    if (ioooi0.I00IlilI0i0i()) {
/* 69 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                iI00Ol102 = iI00Ol10;
                    }
/* 79 */            this.I0000O = iI00Ol102;
                }

                public void I010o0o0oO(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof i1oiI1lIo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        i1oii1lio.I0001Ioi1lo(ioooio1o.I00Ol10());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    i1oii1lio.I0001Ioi1lo(ioooio1o.I00Ol10());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Integer.valueOf(ioooio1o.I00Ol10()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Integer.valueOf(ioooio1o.I00Ol10()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I010oio1OO0(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0l0Ol0i;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) ii0i1l11Var;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 != 1) {
/* 20 */                    if (i2 != 2) {
/* 48 */                        OoOil11Ol1o.I001IO000();
/* 51 */                        return;
                            }
/* 22 */                    int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 26 */                    I01Io1ilOIIo(iI00Ol1ll1);
/* 33 */                    int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 45 */                    do {
/* 38 */                        ii0l0ol0i.I0000O(ioooi0.I00i0O());
/* 45 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 56 */                    ii0l0ol0i.I0000O(ioooi0.I00i0O());
/* 63 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 72 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 111 */                       OoOil11Ol1o.I001IO000();
/* 114 */                       return;
                            }
/* 81 */                    int iI00Ol1ll12 = ioooi0.I00Ol1ll1();
/* 85 */                    I01Io1ilOIIo(iI00Ol1ll12);
/* 92 */                    int iI00OIO12 = ioooi0.I00OIO1() + iI00Ol1ll12;
/* 108 */                   do {
/* 101 */                       ii0i1l11Var.add(Long.valueOf(ioooi0.I00i0O()));
/* 108 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 168 */                   return;
                        }
/* 138 */               do {
/* 123 */                   ii0i1l11Var.add(Long.valueOf(ioooi0.I00i0O()));
/* 130 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 132 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 138 */               } while (iI00Ol10 == this.I00000oOI);
/* 140 */               iI00Ol102 = iI00Ol10;
                    }
/* 141 */           this.I0000O = iI00Ol102;
                }

                public void I01101IOlO(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilOllI1i00l) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Integer.valueOf(ioooi0.I00Ol1ll1()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Integer.valueOf(ioooi0.I00Ol1ll1()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I01101olii(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof i1oiI1lIo;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 == 2) {
/* 49 */                    int iI00Ol00 = ioooio1o.I00Ol00();
/* 53 */                    I01IlIoOI(iI00Ol00);
/* 60 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + iI00Ol00;
/* 73 */                    do {
/* 66 */                        i1oii1lio.I0001Ioi1lo(ioooio1o.I00Ol1ll1());
/* 73 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 168 */                   return;
                        }
/* 20 */                if (i2 != 5) {
/* 45 */                    OoOil11Ol1o.I00100l0();
/* 48 */                    return;
                        }
/* 42 */                do {
/* 26 */                    i1oii1lio.I0001Ioi1lo(ioooio1o.I00Ol1ll1());
/* 33 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 36 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 42 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 76 */                int i3 = i & 7;
/* 78 */                if (i3 == 2) {
/* 115 */                   int iI00Ol002 = ioooio1o.I00Ol00();
/* 119 */                   I01IlIoOI(iI00Ol002);
/* 126 */                   int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + iI00Ol002;
/* 142 */                   do {
/* 135 */                       ii00ili1oii.add(Integer.valueOf(ioooio1o.I00Ol1ll1()));
/* 142 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 168 */                   return;
                        }
/* 80 */                if (i3 != 5) {
/* 111 */                   OoOil11Ol1o.I00100l0();
/* 114 */                   return;
                        }
/* 105 */               do {
/* 90 */                    ii00ili1oii.add(Integer.valueOf(ioooio1o.I00Ol1ll1()));
/* 97 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 99 */                        iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 105 */               } while (iI00Io1o110i == this.I00000oOI);
/* 107 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 108 */           this.I0000O = iI00Io1o110i2;
                }

                public void I0110OiO(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0i0iiOoIlo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0i0iiooilo.I0000O(ioooi0.I00Ol00());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0i0iiooilo.I0000O(ioooi0.I00Ol00());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Integer.valueOf(ioooi0.I00Ol00()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Integer.valueOf(ioooi0.I00Ol00()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I0110o(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof iloiOllI) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Long.valueOf(ioooi0.I00i0oil()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Long.valueOf(ioooi0.I00i0oil()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I0111i(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof iI0Il0IoIil;
/* 7 */             int i = this.I00000oOI;
/* 11 */            if (z) {
/* 14 */                iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) ii00ili1oii;
/* 16 */                int i2 = i & 7;
/* 18 */                if (i2 != 1) {
/* 20 */                    if (i2 != 2) {
/* 48 */                        OoOil11Ol1o.I00100l0();
/* 51 */                        return;
                            }
/* 22 */                    int iI00Ol00 = ioooio1o.I00Ol00();
/* 26 */                    I01Io000(iI00Ol00);
/* 33 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + iI00Ol00;
/* 45 */                    do {
/* 38 */                        ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00OloOo());
/* 45 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 56 */                    ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00OloOo());
/* 63 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 72 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 111 */                       OoOil11Ol1o.I00100l0();
/* 114 */                       return;
                            }
/* 81 */                    int iI00Ol002 = ioooio1o.I00Ol00();
/* 85 */                    I01Io000(iI00Ol002);
/* 92 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + iI00Ol002;
/* 108 */                   do {
/* 101 */                       ii00ili1oii.add(Long.valueOf(ioooio1o.I00OloOo()));
/* 108 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 168 */                   return;
                        }
/* 138 */               do {
/* 123 */                   ii00ili1oii.add(Long.valueOf(ioooio1o.I00OloOo()));
/* 130 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 132 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 138 */               } while (iI00Io1o110i == this.I00000oOI);
/* 140 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 141 */           this.I0000O = iI00Io1o110i2;
                }

                public void I011IO1I11OI(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0l0Ol0i;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0l0ol0i.I0000O(ioooi0.I00i0ilIl0i());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0l0ol0i.I0000O(ioooi0.I00i0ilIl0i());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Long.valueOf(ioooi0.I00i0ilIl0i()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Long.valueOf(ioooi0.I00i0ilIl0i()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I011IOil(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof i1oiI1lIo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        i1oii1lio.I0001Ioi1lo(ioooio1o.I00i01iIIliI());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    i1oii1lio.I0001Ioi1lo(ioooio1o.I00i01iIIliI());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Integer.valueOf(ioooio1o.I00i01iIIliI()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Integer.valueOf(ioooio1o.I00i01iIIliI()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I011Ill(ii0i1l11 ii0i1l11Var, boolean z) throws ii0iI0IiOo {
                    String strI00iOIl;
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 50 */                OoOil11Ol1o.I001IO000();
/* 106 */               return;
                    }
/* 45 */            do {
/* 12 */                if (z) {
/* 14 */                    I01Io001O(2);
/* 17 */                    strI00iOIl = ioooi0.I00iiI();
                        } else {
/* 22 */                    I01Io001O(2);
/* 25 */                    strI00iOIl = ioooi0.I00iOIl();
                        }
/* 29 */                ii0i1l11Var.add(strI00iOIl);
/* 36 */                if (ioooi0.I00IlilI0i0i()) {
/* 38 */                    return;
                        } else {
/* 39 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 45 */            } while (iI00Ol10 == this.I00000oOI);
/* 47 */            this.I0000O = iI00Ol10;
                }

                public void I011Io0I1ioi(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof iI0Il0IoIil;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00i0O());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00i0O());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Long.valueOf(ioooio1o.I00i0O()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Long.valueOf(ioooio1o.I00i0O()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I011Ol0(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0i0iiOoIlo;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0i0iiooilo.I0000O(ioooi0.I00Ol1ll1());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0i0iiooilo.I0000O(ioooi0.I00Ol1ll1());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Integer.valueOf(ioooi0.I00Ol1ll1()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Integer.valueOf(ioooi0.I00Ol1ll1()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I011iIOio(Object obj, ioO0I1oi1lio ioo0i1oi1lio, ilI1iIO0oiIo ili1iio0oiio) {
/* 1 */             int i = this.I0000Il00O;
/* 11 */            this.I0000Il00O = ((this.I00000oOI >>> 3) << 3) | 4;
                    try {
/* 13 */                ioo0i1oi1lio.I0000oI00(obj, this, ili1iio0oiio);
/* 20 */                if (this.I00000oOI == this.I0000Il00O) {
                        } else {
/* 29 */                    throw ill0ll01OOOO.I0000oI00();
                        }
                    } finally {
/* 31 */                this.I0000Il00O = i;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
                
                    r12.put(r4, r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
                
                    r1.I001lIiIIo1O(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
                
                    return;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I011iO(iI0Ol0 ii0ol0, Oo1ol1ll oo1ol1ll, i1o0l0i i1o0l0iVar) {
                    int i;
                    int i2;
/* 2 */             I011lIilI0lo(2);
/* 7 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 13 */            int iI001l0I00 = ioooio1o.I001l0I00(ioooio1o.I00Ol00());
/* 17 */            Object obj = oo1ol1ll.I00iio;
/* 19 */            Object objI01IO1il = "";
/* 21 */            Object objI01IO1il2 = obj;
                    while (true) {
                        try {
/* 22 */                    int iI01IoO = I01IoO();
/* 29 */                    if (iI01IoO == Integer.MAX_VALUE || ioooio1o.I001lloI()) {
                                break;
                            }
/* 39 */                    boolean zI00IoO0 = false;
/* 42 */                    if (iI01IoO == 1) {
/* 96 */                        objI01IO1il = I01IO1il((iI1iii00l) oo1ol1ll.I00iiI, null, null);
                            } else if (iI01IoO != 2) {
                                try {
/* 65 */                            if (!((ioooio1o.I001lloI() || (i2 = this.I00000oOI) == this.I0000Il00O) ? false : ioooio1o.I00IoO0(i2))) {
/* 73 */                                throw new iI00lI("Unable to parse map entry.");
                                    }
                                } catch (iI00ilIl1I e) {
/* 105 */                           if (!ioooio1o.I001lloI() && (i = this.I00000oOI) != this.I0000Il00O) {
/* 114 */                               zI00IoO0 = ioooio1o.I00IoO0(i);
                                    }
/* 118 */                           if (!zI00IoO0) {
/* 126 */                               throw new iI00lI("Unable to parse map entry.", e);
                                    }
                                }
                            } else {
/* 86 */                        objI01IO1il2 = I01IO1il((iI1iii00l) oo1ol1ll.I00iiO, obj.getClass(), i1o0l0iVar);
                            }
                        } catch (Throwable th) {
/* 134 */                   ioooio1o.I001lIiIIo1O(iI001l0I00);
/* 408 */                   throw th;
                        }
                    }
                }

                public void I011iiii0i(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
                    int iI00Ol102;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             boolean z = ii0i1l11Var instanceof ii0l0Ol0i;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) ii0i1l11Var;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I001IO000();
/* 50 */                        return;
                            }
/* 29 */                    int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 41 */                    do {
/* 34 */                        ii0l0ol0i.I0000O(ioooi0.I00i0oil());
/* 41 */                    } while (ioooi0.I00OIO1() < iI00OIO1);
/* 43 */                    I01Ilo0i(iI00OIO1);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0l0ol0i.I0000O(ioooi0.I00i0oil());
/* 62 */                    if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Ol102 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol102 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I001IO000();
/* 113 */                       return;
                            }
/* 88 */                    int iI00OIO12 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 104 */                   do {
/* 97 */                        ii0i1l11Var.add(Long.valueOf(ioooi0.I00i0oil()));
/* 104 */                   } while (ioooi0.I00OIO1() < iI00OIO12);
/* 106 */                   I01Ilo0i(iI00OIO12);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii0i1l11Var.add(Long.valueOf(ioooi0.I00i0oil()));
/* 129 */                   if (ioooi0.I00IlilI0i0i()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 137 */               } while (iI00Ol10 == this.I00000oOI);
/* 139 */               iI00Ol102 = iI00Ol10;
                    }
/* 140 */           this.I0000O = iI00Ol102;
                }

                public void I011lIilI0lo(int i) {
/* 5 */             if ((this.I00000oOI & 7) == i) {
/* 7 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I00100l0();
                }

                public void I011lO1liO1O(Object obj, ioO0I1oi1lio ioo0i1oi1lio, ilI1iIO0oiIo ili1iio0oiio) throws ill0ll01OOOO {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 13 */            if (ioooi0.I00000oIO >= 100) {
/* 98 */                throw new ill0ll01OOOO("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
/* 15 */            int iI00OIl = ioooi0.I00OIl(iI00Ol1ll1);
                    ioooi0.I00000oIO++;
/* 25 */            ioo0i1oi1lio.I0000oI00(obj, this, ili1iio0oiio);
/* 29 */            ioooi0.I00iiO(0);
                    ioooi0.I00000oIO--;
/* 38 */            ioooi0.I00IioO0OiOi(iI00OIl);
                }

                public void I011lOIoo0l(int i) throws ill0ll01OOOO {
/* 9 */             if (((IOOOI0) this.I0000oI00).I00OIO1() != i) {
/* 29 */                throw ill0ll01OOOO.I0001Ioi1lo();
                    }
                }

                public void I011olOoO(Object obj, iI110OIoiOl ii110oioiol, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             int iI00Ol00 = ioooio1o.I00Ol00();
/* 16 */            if (ioooio1o.I00000oIO + ioooio1o.I00000oOI >= 100) {
/* 47 */                iilo0lOo110.I000II("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 98 */                return;
                    }
/* 18 */            int iI001l0I00 = ioooio1o.I001l0I00(iI00Ol00);
                    ioooio1o.I00000oIO++;
/* 28 */            ii110oioiol.I0001Ioi1lo(obj, this, i1o0l0iVar);
/* 32 */            ioooio1o.I00IoIO0lI(0);
                    ioooio1o.I00000oIO--;
/* 41 */            ioooio1o.I001lIiIIo1O(iI001l0I00);
                }

                public boolean I01I01Oolii() {
                    int i;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 9 */             if (ioooi0.I00IlilI0i0i() || (i = this.I00000oOI) == this.I0000Il00O) {
/* 23 */                return false;
                    }
/* 18 */            return ioooi0.I00Io1o110i(i);
                }

                public Object I01I0Iioooo0(ii10iIl ii10iil, Class cls, ii0II11oi0I ii0ii11oi0i) throws ii0iI11ol {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             ii10iIl ii10iil2 = ii10iIl.I00iiO;
                    switch (ii10iil.ordinal()) {
                        case 0:
/* 214 */                   I01Io001O(1);
/* 221 */                   return Double.valueOf(ioooi0.I00O0i0ii());
                        case 1:
/* 202 */                   I01Io001O(5);
/* 209 */                   return Float.valueOf(ioooi0.I00OI1());
                        case 2:
/* 190 */                   I01Io001O(0);
/* 197 */                   return Long.valueOf(ioooi0.I00i01iIIliI());
                        case 3:
/* 178 */                   I01Io001O(0);
/* 185 */                   return Long.valueOf(ioooi0.I00i0oil());
                        case 4:
/* 166 */                   I01Io001O(0);
/* 173 */                   return Integer.valueOf(ioooi0.I00OilO00Il());
                        case 5:
/* 154 */                   I01Io001O(1);
/* 161 */                   return Long.valueOf(ioooi0.I00OloOo());
                        case 6:
/* 142 */                   I01Io001O(5);
/* 149 */                   return Integer.valueOf(ioooi0.I00OOll1());
                        case 7:
/* 130 */                   I01Io001O(0);
/* 137 */                   return Boolean.valueOf(ioooi0.I00Io1lO());
                        case 8:
/* 122 */                   I01Io001O(2);
/* 125 */                   return ioooi0.I00iiI();
                        case 9:
                        default:
/* 20 */                    I000II.I000iOII("unsupported field type.");
/* 23 */                    return null;
                        case 10:
/* 102 */                   I01Io001O(2);
/* 107 */                   ii0oioOi00i ii0oiooi00iI00000oIO = ii0oIOiIl.I0000Il00O.I00000oIO(cls);
/* 111 */                   Object objZze = ii0oiooi00iI00000oIO.zze();
/* 115 */                   I01Ilioliio(objZze, ii0oiooi00iI00000oIO, ii0ii11oi0i);
/* 118 */                   ii0oiooi00iI00000oIO.I00000oIO(objZze);
/* 121 */                   return objZze;
                        case 11:
/* 97 */                    return I01O10iIoo1O();
                        case 12:
/* 85 */                    I01Io001O(0);
/* 92 */                    return Integer.valueOf(ioooi0.I00Ol1ll1());
                        case 13:
/* 73 */                    I01Io001O(0);
/* 80 */                    return Integer.valueOf(ioooi0.I00OIo());
                        case 14:
/* 61 */                    I01Io001O(5);
/* 68 */                    return Integer.valueOf(ioooi0.I00Oio());
                        case 15:
/* 49 */                    I01Io001O(1);
/* 56 */                    return Long.valueOf(ioooi0.I00i0O());
                        case 16:
/* 37 */                    I01Io001O(0);
/* 44 */                    return Integer.valueOf(ioooi0.I00Ol00());
                        case 17:
/* 25 */                    I01Io001O(0);
/* 32 */                    return Long.valueOf(ioooi0.I00i0ilIl0i());
                    }
                }

                public void I01I1Oo0oll(int i) throws ill0OI0oO1 {
/* 5 */             if ((this.I00000oOI & 7) != i) {
/* 29 */                throw ill0ll01OOOO.I00000oIO();
                    }
                }

                public void I01IO0oio(Object obj, iI110OIoiOl ii110oioiol, i1o0l0i i1o0l0iVar) {
/* 1 */             int i = this.I0000Il00O;
/* 11 */            this.I0000Il00O = ((this.I00000oOI >>> 3) << 3) | 4;
                    try {
/* 13 */                ii110oioiol.I0001Ioi1lo(obj, this, i1o0l0iVar);
/* 20 */                if (this.I00000oOI == this.I0000Il00O) {
                        } else {
/* 32 */                    throw new iI00lI("Failed to parse the message.");
                        }
                    } finally {
/* 34 */                this.I0000Il00O = i;
                    }
                }

                public Object I01IO1il(iI1iii00l ii1iii00l, Class cls, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             iI1iii00l ii1iii00l2 = iI1iii00l.I00iiO;
                    switch (ii1iii00l.ordinal()) {
                        case 0:
/* 214 */                   I011lIilI0lo(1);
/* 221 */                   return Double.valueOf(ioooio1o.I00IoiI());
                        case 1:
/* 202 */                   I011lIilI0lo(5);
/* 209 */                   return Float.valueOf(ioooio1o.I00Iooi00oi());
                        case 2:
/* 190 */                   I011lIilI0lo(0);
/* 197 */                   return Long.valueOf(ioooio1o.I00O0o1oo());
                        case 3:
/* 178 */                   I011lIilI0lo(0);
/* 185 */                   return Long.valueOf(ioooio1o.I00O0i0ii());
                        case 4:
/* 166 */                   I011lIilI0lo(0);
/* 173 */                   return Integer.valueOf(ioooio1o.I00O10llo());
                        case 5:
/* 154 */                   I011lIilI0lo(1);
/* 161 */                   return Long.valueOf(ioooio1o.I00OI1());
                        case 6:
/* 142 */                   I011lIilI0lo(5);
/* 149 */                   return Integer.valueOf(ioooio1o.I00OIO1());
                        case 7:
/* 130 */                   I011lIilI0lo(0);
/* 137 */                   return Boolean.valueOf(ioooio1o.I00OIl());
                        case 8:
/* 122 */                   I011lIilI0lo(2);
/* 125 */                   return ioooio1o.I00OOll1();
                        case 9:
                        default:
/* 20 */                    I000II.I000iOII("unsupported field type.");
/* 23 */                    return null;
                        case 10:
/* 102 */                   I011lIilI0lo(2);
/* 107 */                   iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(cls);
/* 111 */                   i1oi01OllI i1oi01olliZza = ii110oioiolI00000oIO.zza();
/* 115 */                   I011olOoO(i1oi01olliZza, ii110oioiolI00000oIO, i1o0l0iVar);
/* 118 */                   ii110oioiolI00000oIO.I0000Il00O(i1oi01olliZza);
/* 121 */                   return i1oi01olliZza;
                        case 11:
/* 97 */                    return I01OIo();
                        case 12:
/* 85 */                    I011lIilI0lo(0);
/* 92 */                    return Integer.valueOf(ioooio1o.I00Ol00());
                        case 13:
/* 73 */                    I011lIilI0lo(0);
/* 80 */                    return Integer.valueOf(ioooio1o.I00Ol10());
                        case 14:
/* 61 */                    I011lIilI0lo(5);
/* 68 */                    return Integer.valueOf(ioooio1o.I00Ol1ll1());
                        case 15:
/* 49 */                    I011lIilI0lo(1);
/* 56 */                    return Long.valueOf(ioooio1o.I00OloOo());
                        case 16:
/* 37 */                    I011lIilI0lo(0);
/* 44 */                    return Integer.valueOf(ioooio1o.I00i01iIIliI());
                        case 17:
/* 25 */                    I011lIilI0lo(0);
/* 32 */                    return Long.valueOf(ioooio1o.I00i0O());
                    }
                }

                public void I01IiOO(int i) throws iI00lI {
/* 9 */             if (((IOOOIO1O) this.I0000oI00).I00II0Ol1O0l() == i) {
/* 11 */                return;
                    }
/* 14 */            iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }

                public void I01Iio10lo(Object obj, ii0oioOi00i ii0oiooi00i, ii0II11oi0I ii0ii11oi0i) {
/* 1 */             int i = this.I0000Il00O;
/* 11 */            this.I0000Il00O = ((this.I00000oOI >>> 3) << 3) | 4;
                    try {
/* 13 */                ii0oiooi00i.I000O01llI0(obj, this, ii0ii11oi0i);
/* 20 */                if (this.I00000oOI == this.I0000Il00O) {
                        } else {
/* 32 */                    throw new ii0iI11ol("Failed to parse the message.");
                        }
                    } finally {
/* 34 */                this.I0000Il00O = i;
                    }
                }

                public void I01Ilioliio(Object obj, ii0oioOi00i ii0oiooi00i, ii0II11oi0I ii0ii11oi0i) throws ii0iI11ol {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 5 */             int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 13 */            if (ioooi0.I00000oIO >= 100) {
/* 44 */                OoOil11Ol1o.I001iOo1i0O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 98 */                return;
                    }
/* 15 */            int iI00OIl = ioooi0.I00OIl(iI00Ol1ll1);
                    ioooi0.I00000oIO++;
/* 25 */            ii0oiooi00i.I000O01llI0(obj, this, ii0ii11oi0i);
/* 29 */            ioooi0.I00iiO(0);
                    ioooi0.I00000oIO--;
/* 38 */            ioooi0.I00IioO0OiOi(iI00OIl);
                }

                public void I01Ilo0i(int i) throws ii0iI11ol {
/* 9 */             if (((IOOOI0) this.I0000oI00).I00OIO1() == i) {
/* 11 */                return;
                    }
/* 14 */            OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }

                public void I01Io001O(int i) {
/* 5 */             if ((this.I00000oOI & 7) == i) {
/* 7 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001IO000();
                }

                public int I01IoO() {
/* 1 */             int iI00Io1o110i = this.I0000O;
/* 3 */             if (iI00Io1o110i != 0) {
/* 5 */                 this.I00000oOI = iI00Io1o110i;
/* 8 */                 this.I0000O = 0;
                    } else {
/* 15 */                iI00Io1o110i = ((IOOOIO1O) this.I0000oI00).I00Io1o110i();
/* 19 */                this.I00000oOI = iI00Io1o110i;
                    }
/* 21 */            if (iI00Io1o110i == 0 || iI00Io1o110i == this.I0000Il00O) {
/* 31 */                return Integer.MAX_VALUE;
                    }
/* 28 */            return iI00Io1o110i >>> 3;
                }

                public int I01Iol() {
                    switch (this.I00000oIO) {
                        case 7:
/* 40 */                    int iI00Ol10 = this.I0000O;
/* 42 */                    if (iI00Ol10 != 0) {
/* 44 */                        this.I00000oOI = iI00Ol10;
/* 47 */                        this.I0000O = 0;
                            } else {
/* 54 */                        iI00Ol10 = ((IOOOI0) this.I0000oI00).I00Ol10();
/* 58 */                        this.I00000oOI = iI00Ol10;
                            }
/* 60 */                    if (iI00Ol10 == 0 || iI00Ol10 == this.I0000Il00O) {
/* 70 */                        return Integer.MAX_VALUE;
                            }
/* 67 */                    return iI00Ol10 >>> 3;
                        default:
/* 6 */                     int iI00Ol102 = this.I0000O;
/* 8 */                     if (iI00Ol102 != 0) {
/* 10 */                        this.I00000oOI = iI00Ol102;
/* 13 */                        this.I0000O = 0;
                            } else {
/* 20 */                        iI00Ol102 = ((IOOOI0) this.I0000oI00).I00Ol10();
/* 24 */                        this.I00000oOI = iI00Ol102;
                            }
/* 26 */                    if (iI00Ol102 == 0 || iI00Ol102 == this.I0000Il00O) {
/* 36 */                        return Integer.MAX_VALUE;
                            }
/* 33 */                    return iI00Ol102 >>> 3;
                    }
                }

                public ii01lO0l11ii I01O10iIoo1O() {
/* 2 */             I01Io001O(2);
/* 9 */             return ((IOOOI0) this.I0000oI00).I00iIO();
                }

                public iiooOi11li I01O1I1() throws ill0OI0oO1 {
/* 2 */             I01I1Oo0oll(2);
/* 9 */             return ((IOOOI0) this.I0000oI00).I00iIi0i1o();
                }

                public i1lIIl01O I01OIo() {
/* 2 */             I011lIilI0lo(2);
/* 9 */             return ((IOOOIO1O) this.I0000oI00).I00OilO00Il();
                }

                public void I01OO1I(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof iio0lI1) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Boolean.valueOf(ioooi0.I00Io1lO()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Boolean.valueOf(ioooi0.I00Io1lO()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I01OOIlI(List list) throws ill0OI0oO1 {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 77 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 32 */            do {
/* 16 */                list.add(I01O1I1());
/* 23 */                if (ioooi0.I00IlilI0i0i()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 32 */            } while (iI00Ol10 == this.I00000oOI);
/* 34 */            this.I0000O = iI00Ol10;
                }

                public void I01OOiI1o(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof il1o1o) {
/* 82 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 14 */            if (i == 1) {
/* 77 */                do {
/* 62 */                    list.add(Double.valueOf(ioooi0.I00O0i0ii()));
/* 69 */                    if (ioooi0.I00IlilI0i0i()) {
/* 81 */                        return;
                            } else {
/* 71 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 77 */                } while (iI00Ol10 == this.I00000oOI);
/* 79 */                this.I0000O = iI00Ol10;
/* 81 */                return;
                    }
/* 17 */            if (i != 2) {
/* 53 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 19 */            int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 23 */            I01Ii0ll10O(iI00Ol1ll1);
/* 30 */            int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 46 */            do {
/* 39 */                list.add(Double.valueOf(ioooi0.I00O0i0ii()));
/* 46 */            } while (ioooi0.I00OIO1() < iI00OIO1);
                }

                public void I01Oi01Ilol(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 72 */                do {
/* 57 */                    ii00ili1oii.add(Double.valueOf(ioooio1o.I00IoiI()));
/* 64 */                    if (ioooio1o.I001lloI()) {
/* 77 */                        return;
                            } else {
/* 66 */                        iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 72 */                } while (iI00Io1o110i == this.I00000oOI);
/* 74 */                this.I0000O = iI00Io1o110i;
/* 77 */                return;
                    }
/* 13 */            if (i != 2) {
/* 45 */                OoOil11Ol1o.I00100l0();
/* 48 */                return;
                    }
/* 15 */            int iI00Ol00 = ioooio1o.I00Ol00();
/* 19 */            I01Io000(iI00Ol00);
/* 26 */            int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + iI00Ol00;
/* 42 */            do {
/* 35 */                ii00ili1oii.add(Double.valueOf(ioooio1o.I00IoiI()));
/* 42 */            } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
                }

                public void I01OiO1OI(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 9 */             if (i == 0) {
/* 71 */                do {
/* 56 */                    ii0i1l11Var.add(Boolean.valueOf(ioooi0.I00Io1lO()));
/* 63 */                    if (ioooi0.I00IlilI0i0i()) {
/* 77 */                        return;
                            } else {
/* 65 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 71 */                } while (iI00Ol10 == this.I00000oOI);
/* 73 */                this.I0000O = iI00Ol10;
/* 77 */                return;
                    }
/* 12 */            if (i != 2) {
/* 44 */                OoOil11Ol1o.I001IO000();
/* 47 */                return;
                    }
/* 22 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 38 */            do {
/* 31 */                ii0i1l11Var.add(Boolean.valueOf(ioooi0.I00Io1lO()));
/* 38 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 40 */            I01Ilo0i(iI00OIO1);
                }

                public void I01Ol1o0(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilOllI1i00l) {
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 13 */            if (i == 0) {
/* 76 */                do {
/* 61 */                    list.add(Integer.valueOf(ioooi0.I00OIo()));
/* 68 */                    if (ioooi0.I00IlilI0i0i()) {
/* 80 */                        return;
                            } else {
/* 70 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 76 */                } while (iI00Ol10 == this.I00000oOI);
/* 78 */                this.I0000O = iI00Ol10;
/* 80 */                return;
                    }
/* 16 */            if (i != 2) {
/* 52 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + ioooi0.I00Ol1ll1();
/* 42 */            do {
/* 35 */                list.add(Integer.valueOf(ioooi0.I00OIo()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
/* 44 */            I011lOIoo0l(iI00OIO1);
                }

                public void I01OlIoIl(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 2) {
/* 47 */                int iI00Ol00 = ioooio1o.I00Ol00();
/* 51 */                I01IlIoOI(iI00Ol00);
/* 58 */                int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + iI00Ol00;
/* 74 */                do {
/* 67 */                    ii00ili1oii.add(Float.valueOf(ioooio1o.I00Iooi00oi()));
/* 74 */                } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 77 */                return;
                    }
/* 13 */            if (i != 5) {
/* 43 */                OoOil11Ol1o.I00100l0();
/* 46 */                return;
                    }
/* 38 */            do {
/* 23 */                ii00ili1oii.add(Float.valueOf(ioooio1o.I00Iooi00oi()));
/* 30 */                if (ioooio1o.I001lloI()) {
/* 77 */                    return;
                        } else {
/* 32 */                    iI00Io1o110i = ioooio1o.I00Io1o110i();
                        }
/* 38 */            } while (iI00Io1o110i == this.I00000oOI);
/* 40 */            this.I0000O = iI00Io1o110i;
                }

                public void I01OlOoii0(ii0i1l11 ii0i1l11Var) throws ii0iI0IiOo {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 10 */            if ((this.I00000oOI & 7) != 2) {
/* 37 */                OoOil11Ol1o.I001IO000();
/* 77 */                return;
                    }
/* 32 */            do {
/* 16 */                ii0i1l11Var.add(I01O10iIoo1O());
/* 23 */                if (ioooi0.I00IlilI0i0i()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 32 */            } while (iI00Ol10 == this.I00000oOI);
/* 34 */            this.I0000O = iI00Ol10;
                }

                public void I01Olioli(List list) throws ill0ll01OOOO {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             if (list instanceof ilOllI1i00l) {
/* 82 */                OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 11 */            int i = this.I00000oOI & 7;
/* 14 */            if (i == 2) {
/* 52 */                int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 56 */                I01II10(iI00Ol1ll1);
/* 63 */                int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 79 */                do {
/* 72 */                    list.add(Integer.valueOf(ioooi0.I00OOll1()));
/* 79 */                } while (ioooi0.I00OIO1() < iI00OIO1);
/* 81 */                return;
                    }
/* 17 */            if (i != 5) {
/* 51 */                throw ill0ll01OOOO.I00000oIO();
                    }
/* 42 */            do {
/* 27 */                list.add(Integer.valueOf(ioooi0.I00OOll1()));
/* 34 */                if (ioooi0.I00IlilI0i0i()) {
/* 81 */                    return;
                        } else {
/* 36 */                    iI00Ol10 = ioooi0.I00Ol10();
                        }
/* 42 */            } while (iI00Ol10 == this.I00000oOI);
/* 44 */            this.I0000O = iI00Ol10;
                }

                public void I01OoIoio00O(iI00IlI1oII ii00ili1oii) throws iI00lI {
                    int iI00Io1o110i;
                    int iI00Io1o110i2;
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) this.I0000oI00;
/* 5 */             boolean z = ii00ili1oii instanceof iI0Il0IoIil;
/* 7 */             int i = this.I00000oOI;
/* 10 */            if (z) {
/* 13 */                iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) ii00ili1oii;
/* 15 */                int i2 = i & 7;
/* 17 */                if (i2 != 0) {
/* 19 */                    if (i2 != 2) {
/* 47 */                        OoOil11Ol1o.I00100l0();
/* 50 */                        return;
                            }
/* 29 */                    int iI00II0Ol1O0l = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 41 */                    do {
/* 34 */                        ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00O0i0ii());
/* 41 */                    } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l);
/* 43 */                    I01IiOO(iI00II0Ol1O0l);
/* 46 */                    return;
                        }
/* 71 */                do {
/* 55 */                    ii0il0ioiil.I0001Ioi1lo(ioooio1o.I00O0i0ii());
/* 62 */                    if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iI00Io1o110i2 = ioooio1o.I00Io1o110i();
                            }
/* 71 */                } while (iI00Io1o110i2 == this.I00000oOI);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 110 */                       OoOil11Ol1o.I00100l0();
/* 113 */                       return;
                            }
/* 88 */                    int iI00II0Ol1O0l2 = ioooio1o.I00II0Ol1O0l() + ioooio1o.I00Ol00();
/* 104 */                   do {
/* 97 */                        ii00ili1oii.add(Long.valueOf(ioooio1o.I00O0i0ii()));
/* 104 */                   } while (ioooio1o.I00II0Ol1O0l() < iI00II0Ol1O0l2);
/* 106 */                   I01IiOO(iI00II0Ol1O0l2);
/* 109 */                   return;
                        }
/* 137 */               do {
/* 122 */                   ii00ili1oii.add(Long.valueOf(ioooio1o.I00O0i0ii()));
/* 129 */                   if (ioooio1o.I001lloI()) {
/* 168 */                       return;
                            } else {
/* 131 */                       iI00Io1o110i = ioooio1o.I00Io1o110i();
                            }
/* 137 */               } while (iI00Io1o110i == this.I00000oOI);
/* 139 */               iI00Io1o110i2 = iI00Io1o110i;
                    }
/* 140 */           this.I0000O = iI00Io1o110i2;
                }

                public void I01OoOi(ii0i1l11 ii0i1l11Var) throws ii0iI11ol {
                    int iI00Ol10;
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) this.I0000oI00;
/* 7 */             int i = this.I00000oOI & 7;
/* 10 */            if (i == 1) {
/* 72 */                do {
/* 57 */                    ii0i1l11Var.add(Double.valueOf(ioooi0.I00O0i0ii()));
/* 64 */                    if (ioooi0.I00IlilI0i0i()) {
/* 77 */                        return;
                            } else {
/* 66 */                        iI00Ol10 = ioooi0.I00Ol10();
                            }
/* 72 */                } while (iI00Ol10 == this.I00000oOI);
/* 74 */                this.I0000O = iI00Ol10;
/* 77 */                return;
                    }
/* 13 */            if (i != 2) {
/* 45 */                OoOil11Ol1o.I001IO000();
/* 48 */                return;
                    }
/* 15 */            int iI00Ol1ll1 = ioooi0.I00Ol1ll1();
/* 19 */            I01Io1ilOIIo(iI00Ol1ll1);
/* 26 */            int iI00OIO1 = ioooi0.I00OIO1() + iI00Ol1ll1;
/* 42 */            do {
/* 35 */                ii0i1l11Var.add(Double.valueOf(ioooi0.I00O0i0ii()));
/* 42 */            } while (ioooi0.I00OIO1() < iI00OIO1);
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 3:
/* 40 */                    return "";
                        case 4:
/* 35 */                    return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.I00000oOI), Integer.valueOf(this.I0000Il00O), Integer.valueOf(this.I0000O));
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
