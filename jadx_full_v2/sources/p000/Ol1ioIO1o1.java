            package p000;
            
            public final class Ol1ioIO1o1 extends Oi10IOIi implements IlliIl1l11O {
                public long[] I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public Object I00ilO0;
                public final Ol1l0OoOo I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol1ioIO1o1(Ol1l0OoOo ol1l0OoOo, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00io1l = ol1l0OoOo;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             Ol1ioIO1o1 ol1ioIO1o1 = new Ol1ioIO1o1(this.I00io1l, iOoil1iiIilo);
/* 8 */             ol1ioIO1o1.I00ilO0 = obj;
/* 37 */            return ol1ioIO1o1;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Ol1ioIO1o1) create((OilO111) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:26:0x0099). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OilO111 oilO111;
                    long[] jArr;
                    int length;
                    int i;
                    OilO111 oilO1112;
                    int i2;
                    OilO111 oilO1113;
                    int i3;
/* 3 */             Ol1l0OoOo ol1l0OoOo = this.I00io1l;
/* 5 */             long j = ol1l0OoOo.I00iOIl;
/* 7 */             long j2 = ol1l0OoOo.I00iiO;
/* 9 */             long j3 = ol1l0OoOo.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            int i4 = this.I00ilI0I1;
/* 27 */            if (i4 == 0) {
/* 78 */                lIoii1l01l0i.I00000oOI(obj);
/* 84 */                oilO111 = (OilO111) this.I00ilO0;
/* 86 */                jArr = ol1l0OoOo.I00iio;
/* 88 */                if (jArr != null) {
/* 90 */                    length = jArr.length;
/* 91 */                    i = 0;
                        }
/* 118 */               if (j3 != 0) {
/* 120 */                   oilO1112 = oilO111;
/* 121 */                   i2 = 0;
/* 123 */                   if (i2 >= 64) {
                            }
                        }
/* 159 */               if (j != 0) {
                        }
/* 201 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 29 */            if (i4 == 1) {
/* 63 */                length = this.I00iio;
/* 65 */                int i5 = this.I00iiO;
/* 67 */                jArr = this.I00iiI;
/* 71 */                oilO111 = (OilO111) this.I00ilO0;
/* 73 */                lIoii1l01l0i.I00000oOI(obj);
/* 76 */                i = i5 + 1;
                    } else {
/* 31 */                if (i4 != 2) {
/* 33 */                    if (i4 != 3) {
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                        return null;
                            }
/* 35 */                    i3 = this.I00iiO;
/* 39 */                    oilO1113 = (OilO111) this.I00ilO0;
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 199 */                   i3++;
/* 164 */                   if (i3 < 64) {
/* 171 */                       if (((1 << i3) & j) != 0) {
/* 180 */                           Long l = new Long(j2 + i3 + 64);
/* 183 */                           this.I00ilO0 = oilO1113;
/* 185 */                           this.I00iiI = null;
/* 187 */                           this.I00iiO = i3;
/* 190 */                           this.I00ilI0I1 = 3;
/* 192 */                           oilO1113.I00000oOI(this, l);
/* 195 */                           Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 197 */                           return ii0111o;
                                }
/* 199 */                       i3++;
/* 164 */                       if (i3 < 64) {
                                }
                            }
/* 201 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 53 */                i2 = this.I00iiO;
/* 57 */                oilO1112 = (OilO111) this.I00ilO0;
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 154 */               i2++;
/* 123 */               if (i2 >= 64) {
/* 156 */                   oilO111 = oilO1112;
/* 159 */                   if (j != 0) {
/* 161 */                       oilO1113 = oilO111;
/* 162 */                       i3 = 0;
/* 164 */                       if (i3 < 64) {
                                }
                            }
/* 201 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 131 */               if ((j3 & (1 << i2)) != 0) {
/* 137 */                   Long l2 = new Long(j2 + i2);
/* 140 */                   this.I00ilO0 = oilO1112;
/* 142 */                   this.I00iiI = null;
/* 144 */                   this.I00iiO = i2;
/* 146 */                   this.I00ilI0I1 = 2;
/* 148 */                   oilO1112.I00000oOI(this, l2);
/* 151 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 153 */                   return ii0111o;
                        }
/* 154 */               i2++;
/* 123 */               if (i2 >= 64) {
                        }
                    }
/* 93 */            if (i < length) {
/* 99 */                Long l3 = new Long(jArr[i]);
/* 102 */               this.I00ilO0 = oilO111;
/* 104 */               this.I00iiI = jArr;
/* 106 */               this.I00iiO = i;
/* 108 */               this.I00iio = length;
/* 110 */               this.I00ilI0I1 = 1;
/* 112 */               oilO111.I00000oOI(this, l3);
/* 115 */               return ii0111o;
                    }
/* 118 */           if (j3 != 0) {
                    }
/* 159 */           if (j != 0) {
                    }
/* 201 */           return OoiIlOl1iI.I00000oIO;
                }
            }
