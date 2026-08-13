            package p000;

            import java.io.IOException;
            
            public final class IIIoO10O {
                public IIIoloiiI1 I00000oIO;
                public IIOIIi10OOl I00000oOI;
                public IIOIlI01 I0000Il00O;
                public long I0000O;
                public OlI1iil1l0 I0000oI00;
                public int[] I0001Ioi1lo;
                public III1oo00i1li I000II;
                public long I000O01llI0;
                public int I000OOo1O;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
                
                    if (r14 == r3) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0091 -> B:19:0x0041). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    IIIo011i0I iIIo011i0I;
/* 1 */             IIOIlI01 iIOIlI01 = this.I0000Il00O;
/* 3 */             OlI1iil1l0 olI1iil1l0 = this.I0000oI00;
/* 7 */             if (iOoilo instanceof IIIo011i0I) {
/* 10 */                iIIo011i0I = (IIIo011i0I) iOoilo;
/* 12 */                int i = iIIo011i0I.I00iiO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    iIIo011i0I.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    iIIo011i0I = new IIIo011i0I(this, iOoilo);
                        }
                    }
/* 29 */            Object objI0001Ioi1lo = iIIo011i0I.I00iOIl;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = iIIo011i0I.I00iiO;
/* 35 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 40 */            if (i2 != 0) {
/* 42 */                if (i2 == 1) {
/* 59 */                    lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 91 */                    if (((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 103 */                       long jI00000oIO = lOO1Ill.I00000oIO(olI1iil1l0, this.I00000oOI.I00000oIO(0), 0L, 6);
/* 111 */                       if (jI00000oIO == -1) {
/* 118 */                           I00000oOI(((III1oo00i1li) olI1iil1l0).I00iiO);
/* 138 */                           this.I000O01llI0 = ((III1oo00i1li) olI1iil1l0).I00100l0(((IIIloOl0I1I) iIOIlI01).I000OiO()) + this.I000O01llI0;
/* 140 */                           iIIo011i0I.I00iiO = 2;
/* 146 */                           if (iOii0lOiO1.I00000oIO(iIOIlI01, iIIo011i0I) != ii0111o) {
/* 70 */                                if (!olI1iil1l0.I00II0Ol1O0l()) {
/* 72 */                                    IIIoloiiI1 iIIoloiiI1 = this.I00000oIO;
/* 74 */                                    iIIo011i0I.I00iiO = 1;
/* 76 */                                    IIIolloil iIIolloil = IIIoloiiI1.I00000oIO;
/* 78 */                                    objI0001Ioi1lo = iIIoloiiI1.I0001Ioi1lo(1, iIIo011i0I);
                                        }
                                    }
                                } else {
/* 149 */                           I00000oOI(jI00000oIO);
/* 166 */                           this.I000O01llI0 = olI1iil1l0.I00II0oii1o(((IIIloOl0I1I) iIOIlI01).I000OiO(), jI00000oIO) + this.I000O01llI0;
/* 168 */                           iIIo011i0I.I00iiO = 3;
/* 174 */                           if (iOii0lOiO1.I00000oIO(iIOIlI01, iIIo011i0I) == ii0111o) {
                                    }
                                }
/* 176 */                       return ii0111o;
                            }
/* 186 */                   return ooiIlOl1iI;
                        }
/* 44 */                if (i2 != 2) {
/* 46 */                    if (i2 == 3) {
/* 48 */                        lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 51 */                        return ooiIlOl1iI;
                            }
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 57 */                    return null;
                        }
                    }
/* 63 */            lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 70 */            if (!olI1iil1l0.I00II0Ol1O0l()) {
                    }
/* 176 */           return ii0111o;
                }

                public final void I00000oOI(long j) throws IOException {
/* 3 */             long j2 = this.I000O01llI0 + j;
/* 4 */             long j3 = this.I0000O;
/* 8 */             if (j2 <= j3) {
/* 10 */                return;
                    }
/* 17 */            StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j3, "Limit of ", " bytes exceeded while searching for \"");
/* 40 */            sbI001iOo1i0O.append(OlOolloIIOl0.I000iOII(new String(this.I00000oOI.I00iOIl, IO1IOI.I00000oIO), "\n", "\\n"));
/* 45 */            sbI001iOo1i0O.append('\"');
/* 186 */           throw new IOException(sbI001iOo1i0O.toString());
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                
                    if (r1 == r7) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
                
                    if (r1 == r7) goto L46;
                 */
                /* JADX WARN: Path cross not found for [B:29:0x006f, B:49:0x00e2], limit reached: 54 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[PHI: r12
                  0x0067: PHI (r12v2 int) = (r12v1 int), (r12v8 int) binds: [B:18:0x004b, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:27:0x0067). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:22:0x005b). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IOoilo iOoilo) throws Throwable {
                    IIIo0o iIIo0o;
                    int i;
                    long j;
/* 5 */             IIOIlI01 iIOIlI01 = this.I0000Il00O;
/* 7 */             III1oo00i1li iII1oo00i1li = this.I000II;
/* 9 */             OlI1iil1l0 olI1iil1l0 = this.I0000oI00;
/* 11 */            IIOIIi10OOl iIOIIi10OOl = this.I00000oOI;
/* 15 */            if (iOoilo instanceof IIIo0o) {
/* 18 */                iIIo0o = (IIIo0o) iOoilo;
/* 20 */                int i2 = iIIo0o.I00iiO;
/* 26 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 29 */                    iIIo0o.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 34 */                    iIIo0o = new IIIo0o(this, iOoilo);
                        }
                    }
/* 37 */            Object objI0001Ioi1lo = iIIo0o.I00iOIl;
/* 39 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 41 */            int i3 = iIIo0o.I00iiO;
/* 44 */            int i4 = 1;
/* 45 */            if (i3 == 0) {
/* 69 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 76 */                if (olI1iil1l0.I00II0Ol1O0l()) {
                        }
/* 218 */               return ii0111o;
                    }
/* 47 */            if (i3 != 1) {
/* 49 */                if (i3 != 2) {
/* 60 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 63 */                    return null;
                        }
/* 51 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 54 */                j = 1;
                        this.I000O01llI0 += j;
/* 224 */               return Boolean.FALSE;
                    }
/* 65 */            lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 98 */            if (!((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 101 */               return Boolean.FALSE;
                    }
/* 104 */           byte b = olI1iil1l0.readByte();
/* 108 */           int i5 = this.I000OOo1O;
/* 110 */           if (i5 > 0 || b == iIOIIi10OOl.I00000oIO(i5)) {
/* 227 */               i = i4;
/* 229 */               j = 1;
                    } else {
/* 118 */               int i6 = this.I000OOo1O;
                        while (true) {
/* 120 */                   int i7 = this.I000OOo1O;
/* 122 */                   if (i7 <= 0 || b == iIOIIi10OOl.I00000oIO(i7)) {
                                break;
                            }
/* 137 */                   this.I000OOo1O = this.I0001Ioi1lo[this.I000OOo1O - i4];
                        }
/* 142 */               long j2 = i6 - this.I000OOo1O;
/* 144 */               I00000oOI(j2);
/* 147 */               j = 1;
/* 152 */               IIIloOl0I1I iIIloOl0I1I = (IIIloOl0I1I) iIOIlI01;
/* 154 */               i = i4;
/* 165 */               this.I000O01llI0 = iII1oo00i1li.I00II0oii1o(iIIloOl0I1I.I000OiO(), j2) + this.I000O01llI0;
/* 167 */               int i8 = this.I000OOo1O;
/* 169 */               if (i8 == 0 && b != iIOIIi10OOl.I00000oIO(i8)) {
/* 178 */                   iIIo0o.I00iiO = 2;
/* 180 */                   IOiII1I iOiII1I = IIOIli1iili.I00000oIO;
/* 182 */                   III1oo00i1li iII1oo00i1liI000OiO = iIIloOl0I1I.I000OiO();
/* 186 */                   Oii1O1l oii1O1lI001i1lo1io = iII1oo00i1liI000OiO.I001i1lo1io();
/* 190 */                   byte[] bArr = oii1O1lI001i1lo1io.I00000oIO;
/* 192 */                   int i9 = oii1O1lI001i1lo1io.I0000Il00O;
/* 196 */                   oii1O1lI001i1lo1io.I0000Il00O = i9 + 1;
/* 198 */                   bArr[i9] = b;
                            iII1oo00i1liI000OiO.I00iiO++;
/* 205 */                   Object objI00000oIO = iOii0lOiO1.I00000oIO(iIIloOl0I1I, iIIo0o);
/* 211 */                   if (objI00000oIO != Ii0111o.I00iOIl) {
/* 214 */                       objI00000oIO = OoiIlOl1iI.I00000oIO;
                            }
                        }
                    }
/* 233 */           int i10 = this.I000OOo1O + 1;
/* 235 */           this.I000OOo1O = i10;
/* 240 */           if (i10 != iIOIIi10OOl.I00iOIl.length) {
/* 242 */               return Boolean.TRUE;
                    }
/* 246 */           Oii1O1l oii1O1lI001i1lo1io2 = iII1oo00i1li.I001i1lo1io();
/* 250 */           byte[] bArr2 = oii1O1lI001i1lo1io2.I00000oIO;
/* 252 */           int i11 = oii1O1lI001i1lo1io2.I0000Il00O;
/* 256 */           oii1O1lI001i1lo1io2.I0000Il00O = i11 + 1;
/* 258 */           bArr2[i11] = b;
                    iII1oo00i1li.I00iiO += j;
/* 265 */           i4 = i;
/* 76 */            if (olI1iil1l0.I00II0Ol1O0l()) {
/* 104 */               byte b2 = olI1iil1l0.readByte();
/* 108 */               int i52 = this.I000OOo1O;
/* 110 */               if (i52 > 0) {
                        }
/* 227 */               i = i4;
/* 229 */               j = 1;
/* 233 */               int i102 = this.I000OOo1O + 1;
/* 235 */               this.I000OOo1O = i102;
/* 240 */               if (i102 != iIOIIi10OOl.I00iOIl.length) {
                        }
                    } else {
/* 78 */                IIIoloiiI1 iIIoloiiI1 = this.I00000oIO;
/* 80 */                iIIo0o.I00iiO = i4;
/* 82 */                IIIolloil iIIolloil = IIIoloiiI1.I00000oIO;
/* 84 */                objI0001Ioi1lo = iIIoloiiI1.I0001Ioi1lo(i4, iIIo0o);
                    }
/* 218 */           return ii0111o;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
                
                    if (r0.I00000oOI(r1) == r2) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
                
                    if (r12 != r2) goto L43;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[PHI: r11
                  0x00c6: PHI (r11v2 boolean) = (r11v3 boolean), (r11v6 boolean) binds: [B:27:0x0071, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d9 -> B:43:0x00dc). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(boolean z, IOoilo iOoilo) throws Throwable {
                    IIIo1o000O1 iIIo1o000O1;
/* 1 */             IIOIlI01 iIOIlI01 = this.I0000Il00O;
/* 5 */             if (iOoilo instanceof IIIo1o000O1) {
/* 8 */                 iIIo1o000O1 = (IIIo1o000O1) iOoilo;
/* 10 */                int i = iIIo1o000O1.I00iio;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    iIIo1o000O1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iIIo1o000O1 = new IIIo1o000O1(this, iOoilo);
                        }
                    }
/* 27 */            Object objI0000Il00O = iIIo1o000O1.I00iiI;
/* 29 */            Object obj = Ii0111o.I00iOIl;
/* 31 */            int i2 = iIIo1o000O1.I00iio;
/* 37 */            if (i2 == 0) {
/* 78 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 83 */                this.I000O01llI0 = 0L;
/* 91 */                if (!this.I0000oI00.I00II0Ol1O0l()) {
                        }
/* 220 */               return obj;
                    }
/* 39 */            if (i2 == 1) {
/* 72 */                z = iIIo1o000O1.I00iOIl;
/* 74 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 114 */               if (!((Boolean) objI0000Il00O).booleanValue()) {
                        }
/* 220 */               return obj;
                    }
/* 41 */            if (i2 != 2) {
/* 43 */                if (i2 != 3) {
/* 45 */                    if (i2 == 4) {
/* 47 */                        lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 151 */                       return new Long(this.I000O01llI0);
                            }
/* 53 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 56 */                    return null;
                        }
/* 58 */                z = iIIo1o000O1.I00iOIl;
/* 60 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 227 */               if (((Boolean) objI0000Il00O).booleanValue()) {
/* 233 */                   return new Long(this.I000O01llI0);
                        }
/* 91 */                if (!this.I0000oI00.I00II0Ol1O0l()) {
/* 93 */                    IIIoloiiI1 iIIoloiiI1 = this.I00000oIO;
/* 95 */                    iIIo1o000O1.I00iOIl = z;
/* 97 */                    iIIo1o000O1.I00iio = 1;
/* 99 */                    IIIolloil iIIolloil = IIIoloiiI1.I00000oIO;
/* 101 */                   objI0000Il00O = iIIoloiiI1.I0001Ioi1lo(1, iIIo1o000O1);
/* 105 */                   if (objI0000Il00O != obj) {
/* 114 */                       if (!((Boolean) objI0000Il00O).booleanValue()) {
/* 199 */                           iIIo1o000O1.I00iOIl = z;
/* 201 */                           iIIo1o000O1.I00iio = 2;
/* 207 */                           if (I00000oIO(iIIo1o000O1) != obj) {
/* 210 */                               iIIo1o000O1.I00iOIl = z;
/* 212 */                               iIIo1o000O1.I00iio = 3;
/* 214 */                               objI0000Il00O = I0000Il00O(iIIo1o000O1);
                                    }
                                } else {
/* 117 */                           if (!z) {
/* 198 */                               throw new IOException("Expected \"" + OlOolloIIOl0.I000iOII(new String(this.I00000oOI.I00iOIl, IO1IOI.I00000oIO), "\n", "\\n") + "\" but encountered end of input");
                                    }
/* 123 */                           IIIloOl0I1I iIIloOl0I1I = (IIIloOl0I1I) iIOIlI01;
/* 134 */                           this.I000O01llI0 = this.I000II.I00100l0(iIIloOl0I1I.I000OiO()) + this.I000O01llI0;
/* 136 */                           iIIo1o000O1.I00iOIl = z;
/* 138 */                           iIIo1o000O1.I00iio = 4;
                                }
                            }
                        }
/* 220 */               return obj;
                    }
/* 65 */            z = iIIo1o000O1.I00iOIl;
/* 67 */            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 210 */           iIIo1o000O1.I00iOIl = z;
/* 212 */           iIIo1o000O1.I00iio = 3;
/* 214 */           objI0000Il00O = I0000Il00O(iIIo1o000O1);
                }
            }
