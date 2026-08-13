            package p000;
            
            public final class OI10OiIlI extends Oi10IOIi implements IlliIl1l11O {
                public Io00llIoO1lO I00iiI;
                public OI10OiOo I00iiO;
                public long[] I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public long I00l0I0l0lO1;
                public int I00l0OO0IO;
                public Object I00li1OI;
                public final OI10OiOo I00ll1;
                public final Io00llIoO1lO I00lli11;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI10OiIlI(OI10OiOo oI10OiOo, Io00llIoO1lO io00llIoO1lO, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ll1 = oI10OiOo;
/* 3 */             this.I00lli11 = io00llIoO1lO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             OI10OiIlI oI10OiIlI = new OI10OiIlI(this.I00ll1, this.I00lli11, iOoil1iiIilo);
/* 10 */            oI10OiIlI.I00li1OI = obj;
/* 37 */            return oI10OiIlI;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OI10OiIlI) create((OilO111) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:22:0x00a1). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:19:0x0096). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OilO111 oilO111;
                    OI10OiOo oI10OiOo;
                    long[] jArr;
                    int length;
                    Io00llIoO1lO io00llIoO1lO;
                    int i;
                    long j;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i2 = this.I00l0OO0IO;
/* 11 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                oilO111 = (OilO111) this.I00li1OI;
/* 54 */                oI10OiOo = this.I00ll1;
/* 58 */                jArr = oI10OiOo.I00iiI.I00000oIO;
                        length = jArr.length - 2;
/* 63 */                if (length >= 0) {
/* 65 */                    io00llIoO1lO = this.I00lli11;
/* 67 */                    i = 0;
/* 68 */                    j = jArr[i];
/* 82 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            }
/* 162 */                   if (i != length) {
                            }
                        }
/* 167 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 13 */            if (i2 != 1) {
/* 42 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                return null;
                    }
/* 15 */            int i3 = this.I00ioIO;
/* 17 */            int i4 = this.I00io1l;
/* 19 */            long j2 = this.I00l0I0l0lO1;
/* 21 */            int i5 = this.I00ilO0;
/* 23 */            int i6 = this.I00ilI0I1;
/* 25 */            long[] jArr2 = this.I00iio;
/* 27 */            OI10OiOo oI10OiOo2 = this.I00iiO;
/* 29 */            Io00llIoO1lO io00llIoO1lO2 = this.I00iiI;
/* 33 */            OilO111 oilO1112 = (OilO111) this.I00li1OI;
/* 35 */            lIoii1l01l0i.I00000oOI(obj);
/* 151 */           j2 >>= 8;
/* 152 */           i3++;
/* 103 */           if (i3 < i4) {
/* 154 */               if (i4 == 8) {
/* 156 */                   length = i6;
/* 157 */                   jArr = jArr2;
/* 158 */                   oI10OiOo = oI10OiOo2;
/* 159 */                   oilO111 = oilO1112;
/* 160 */                   i = i5;
/* 161 */                   io00llIoO1lO = io00llIoO1lO2;
/* 162 */                   if (i != length) {
/* 164 */                       i++;
/* 68 */                        j = jArr[i];
/* 82 */                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 91 */                            oilO1112 = oilO111;
/* 92 */                            i3 = 0;
/* 95 */                            oI10OiOo2 = oI10OiOo;
/* 96 */                            jArr2 = jArr;
/* 89 */                            i4 = 8 - ((~(i - length)) >>> 31);
/* 98 */                            io00llIoO1lO2 = io00llIoO1lO;
/* 99 */                            i5 = i;
/* 100 */                           i6 = length;
/* 101 */                           j2 = j;
/* 103 */                           if (i3 < i4) {
/* 112 */                               if ((255 & j2) < 128) {
/* 116 */                                   int i7 = (i5 << 3) + i3;
/* 117 */                                   io00llIoO1lO2.I00iiI = i7;
/* 123 */                                   Object obj2 = oI10OiOo2.I00iiI.I00000oOI[i7];
/* 125 */                                   this.I00li1OI = oilO1112;
/* 127 */                                   this.I00iiI = io00llIoO1lO2;
/* 129 */                                   this.I00iiO = oI10OiOo2;
/* 131 */                                   this.I00iio = jArr2;
/* 133 */                                   this.I00ilI0I1 = i6;
/* 135 */                                   this.I00ilO0 = i5;
/* 137 */                                   this.I00l0I0l0lO1 = j2;
/* 139 */                                   this.I00io1l = i4;
/* 141 */                                   this.I00ioIO = i3;
/* 143 */                                   this.I00l0OO0IO = 1;
/* 145 */                                   oilO1112.I00000oOI(this, obj2);
/* 148 */                                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 150 */                                   return ii0111o;
                                        }
/* 151 */                               j2 >>= 8;
/* 152 */                               i3++;
/* 103 */                               if (i3 < i4) {
                                        }
                                    }
                                }
/* 162 */                       if (i != length) {
                                }
                            }
                        }
/* 167 */               return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
