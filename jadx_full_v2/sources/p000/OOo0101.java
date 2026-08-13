            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OOo0101 implements I1IOO010 {
                public OI0l1iiooO I00iOIl;
                public OI0oiiIO0 I00iiI;
                public Object I00iiO;

                public final void I00000oIO(Ooi1loooOO1 ooi1loooOO1, OOoo1il oOoo1il) {
                    Exception e;
                    int i;
/* 1 */             OI0l1iiooO oI0l1iiooO = this.I00iOIl;
/* 3 */             int i2 = oI0l1iiooO.I00000oOI;
/* 5 */             OI0oiiIO0 oI0oiiIO0 = this.I00iiI;
/* 9 */             OI0oiiIO0 oI0oiiIO02 = new OI0oiiIO0();
/* 13 */            int i3 = 0;
/* 14 */            int i4 = 0;
/* 15 */            while (i3 < i2) {
/* 17 */                int i5 = i3 + 1;
                        try {
                            try {
                                switch (oI0l1iiooO.I0000Il00O(i3)) {
                                    case 0:
/* 184 */                               ooi1loooOO1.I000OOo1O();
/* 86 */                                i3 = i5;
                                    case 1:
/* 173 */                               int i6 = i4 + 1;
/* 179 */                               ooi1loooOO1.I0000O(oI0oiiIO0.I000II(i4));
/* 182 */                               i4 = i6;
/* 86 */                                i3 = i5;
                                    case 2:
/* 156 */                               int i7 = i3 + 2;
/* 162 */                               i3 += 3;
/* 168 */                               ooi1loooOO1.I000II(oI0l1iiooO.I0000Il00O(i5), oI0l1iiooO.I0000Il00O(i7));
                                    case 3:
/* 127 */                               int i8 = i3 + 2;
                                        try {
/* 133 */                                   i = i3 + 3;
                                        } catch (Exception e2) {
/* 153 */                                   e = e2;
/* 154 */                                   i3 = i8;
                                        }
                                        try {
/* 139 */                                   i3 += 4;
/* 145 */                                   ooi1loooOO1.I0001Ioi1lo(oI0l1iiooO.I0000Il00O(i5), oI0l1iiooO.I0000Il00O(i8), oI0l1iiooO.I0000Il00O(i));
                                        } catch (Exception e3) {
/* 150 */                                   e = e3;
/* 151 */                                   i3 = i;
/* 211 */                                   IOl0IOiI0 iOl0IOiI0 = new IOl0IOiI0(e);
/* 214 */                                   iOl0IOiI0.I00iOIl = oI0oiiIO0;
/* 216 */                                   iOl0IOiI0.I00iiI = oI0oiiIO02;
/* 218 */                                   iOl0IOiI0.I00iiO = oI0l1iiooO;
/* 220 */                                   iOl0IOiI0.I00iio = i3 - 1;
/* 222 */                                   VarHandle.storeStoreFence();
/* 225 */                                   throw iOl0IOiI0;
                                        }
                                    case 4:
/* 123 */                               ooi1loooOO1.I00000oIO();
/* 86 */                                i3 = i5;
                                    case 5:
/* 106 */                               i3 += 2;
/* 112 */                               int i9 = i4 + 1;
/* 118 */                               ooi1loooOO1.I0000Il00O(oI0l1iiooO.I0000Il00O(i5), oI0oiiIO0.I000II(i4));
/* 121 */                               i4 = i9;
                                    case 6:
/* 88 */                                i3 += 2;
                                        try {
/* 90 */                                    oI0l1iiooO.I0000Il00O(i5);
/* 93 */                                    int i10 = i4 + 1;
/* 101 */                                   i4 = i10;
                                        } catch (Exception e4) {
/* 103 */                                   e = e4;
/* 211 */                                   IOl0IOiI0 iOl0IOiI02 = new IOl0IOiI0(e);
/* 214 */                                   iOl0IOiI02.I00iOIl = oI0oiiIO0;
/* 216 */                                   iOl0IOiI02.I00iiI = oI0oiiIO02;
/* 218 */                                   iOl0IOiI02.I00iiO = oI0l1iiooO;
/* 220 */                                   iOl0IOiI02.I00iio = i3 - 1;
/* 222 */                                   VarHandle.storeStoreFence();
/* 225 */                                   throw iOl0IOiI02;
                                        }
                                    case 7:
/* 65 */                                int i11 = i4 + 1;
/* 67 */                                Object objI000II = oI0oiiIO0.I000II(i4);
/* 72 */                                OoOOI1100oI0.I0000Il00O(2, objI000II);
/* 77 */                                i4 += 2;
/* 83 */                                ooi1loooOO1.I000lI((IlliIl1l11O) objI000II, oI0oiiIO0.I000II(i11));
/* 86 */                                i3 = i5;
                                    case 8:
/* 27 */                                Object obj = ooi1loooOO1.I00iiO;
/* 31 */                                if (obj instanceof IOl01lO1) {
/* 34 */                                    IOl01lO1 iOl01lO1 = (IOl01lO1) obj;
/* 44 */                                    if (((OI110O0) oOoo1il.I0000oI00).I000iOII(iOl01lO1)) {
/* 46 */                                        iOl01lO1.I0000Il00O();
                                            }
                                        }
/* 58 */                                oI0oiiIO02.I00000oOI(obj);
/* 61 */                                ooi1loooOO1.I0000oI00();
/* 86 */                                i3 = i5;
                                    default:
/* 86 */                                i3 = i5;
                                }
                            } catch (Throwable th) {
/* 226 */                       ooi1loooOO1.I000iOII();
/* 229 */                       throw th;
                            }
                        } catch (Exception e5) {
/* 56 */                    e = e5;
/* 50 */                    i3 = i5;
                        }
                    }
/* 190 */           if (i4 != oI0oiiIO0.I00000oOI) {
/* 195 */               IOl1II00.I00000oIO("Applier operation size mismatch");
                    }
/* 198 */           oI0oiiIO0.I0000oI00();
/* 201 */           oI0l1iiooO.I00000oOI = 0;
/* 203 */           ooi1loooOO1.I000iOII();
                }

                @Override
                public final void I0000Il00O(int i, Object obj) {
/* 1 */             OI0l1iiooO oI0l1iiooO = this.I00iOIl;
/* 4 */             oI0l1iiooO.I00000oIO(5);
/* 7 */             oI0l1iiooO.I00000oIO(i);
/* 12 */            this.I00iiI.I00000oOI(obj);
                }

                @Override
                public final void I0000O(Object obj) {
/* 4 */             this.I00iOIl.I00000oIO(1);
/* 9 */             this.I00iiI.I00000oOI(obj);
                }

                @Override
                public final void I0000oI00() {
/* 5 */             this.I00iOIl.I00000oIO(8);
                }

                @Override
                public final void I0001Ioi1lo(int i, int i2, int i3) {
/* 1 */             OI0l1iiooO oI0l1iiooO = this.I00iOIl;
/* 4 */             oI0l1iiooO.I00000oIO(3);
/* 7 */             oI0l1iiooO.I00000oIO(i);
/* 10 */            oI0l1iiooO.I00000oIO(i2);
/* 13 */            oI0l1iiooO.I00000oIO(i3);
                }

                @Override
                public final void I000II(int i, int i2) {
/* 1 */             OI0l1iiooO oI0l1iiooO = this.I00iOIl;
/* 4 */             oI0l1iiooO.I00000oIO(2);
/* 7 */             oI0l1iiooO.I00000oIO(i);
/* 10 */            oI0l1iiooO.I00000oIO(i2);
                }

                @Override
                public final void I000OOo1O() {
/* 4 */             this.I00iOIl.I00000oIO(0);
                }

                @Override
                public final void I000OiO(int i, Object obj) {
/* 1 */             OI0l1iiooO oI0l1iiooO = this.I00iOIl;
/* 4 */             oI0l1iiooO.I00000oIO(6);
/* 7 */             oI0l1iiooO.I00000oIO(i);
/* 12 */            this.I00iiI.I00000oOI(obj);
                }

                @Override
                public final Object I000l1() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final void I000lI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 4 */             this.I00iOIl.I00000oIO(7);
/* 7 */             OI0oiiIO0 oI0oiiIO0 = this.I00iiI;
/* 9 */             oI0oiiIO0.I00000oOI(illiIl1l11O);
/* 12 */            oI0oiiIO0.I00000oOI(obj);
                }
            }
