            package p000;

            import java.io.OutputStream;
            
            public abstract class liIOi0oii {
                /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:26:0x007b). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006b -> B:25:0x0073). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(IIIoloiiI1 iIIoloiiI1, OutputStream outputStream, long j, IOoilo iOoilo) throws Throwable {
                    i01lOII i01loii;
                    i01lOII i01loii2;
                    long j2;
                    long j3;
                    IIIoloiiI1 iIIoloiiI12;
                    OutputStream outputStream2;
/* 7 */             if (iOoilo instanceof i01lOII) {
/* 10 */                i01loii = (i01lOII) iOoilo;
/* 12 */                int i = i01loii.I00ilO0;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    i01loii.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    i01loii = new i01lOII(iOoilo);
                        }
                    }
/* 29 */            Object obj = i01loii.I00ilI0I1;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = i01loii.I00ilO0;
/* 35 */            Object obj2 = null;
/* 36 */            long j4 = 0;
/* 38 */            int i3 = 1;
/* 39 */            if (i2 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(obj);
/* 66 */                if (j < 0) {
/* 241 */                   I000II.I0010I0i(IlIi0I0.I000iOII(j, "Limit shouldn't be negative: "));
/* 35 */                    return null;
                        }
/* 68 */                i01loii2 = i01loii;
/* 69 */                j2 = 0;
/* 70 */                j3 = j;
/* 71 */                iIIoloiiI12 = iIIoloiiI1;
/* 73 */                outputStream2 = outputStream;
/* 79 */                if (iIIoloiiI12.I000O01llI0()) {
                        }
                    } else {
/* 41 */                if (i2 != 1) {
/* 57 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 43 */                long j5 = i01loii.I00iio;
/* 45 */                long j6 = i01loii.I00iiO;
/* 47 */                OutputStream outputStream3 = i01loii.I00iiI;
/* 49 */                IIIoloiiI1 iIIoloiiI13 = i01loii.I00iOIl;
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 116 */               OutputStream outputStream4 = outputStream3;
/* 118 */               i01loii2 = i01loii;
/* 119 */               j3 = j6;
/* 120 */               j2 = j5;
/* 121 */               outputStream2 = outputStream4;
/* 123 */               iIIoloiiI12 = iIIoloiiI13;
/* 124 */               III1oo00i1li iII1oo00i1liI000II = iIIoloiiI12.I000II();
/* 128 */               iII1oo00i1liI000II.getClass();
/* 133 */               j2 += iII1oo00i1liI000II.I00iiO;
/* 134 */               III1oo00i1li iII1oo00i1liI000II2 = iIIoloiiI12.I000II();
/* 138 */               iII1oo00i1liI000II2.getClass();
/* 141 */               long j7 = iII1oo00i1liI000II2.I00iiO;
/* 143 */               iO1i0iI.I00000oOI(j7, j7);
/* 148 */               while (j7 > j4) {
/* 154 */                   if (iII1oo00i1liI000II2.I00II0Ol1O0l()) {
/* 215 */                       Object obj3 = obj2;
/* 219 */                       I000II.I000iOII("Buffer is empty");
/* 222 */                       return obj3;
                            }
/* 156 */                   Oii1O1l oii1O1l = iII1oo00i1liI000II2.I00iOIl;
/* 158 */                   Object obj4 = obj2;
/* 160 */                   byte[] bArr = oii1O1l.I00000oIO;
/* 162 */                   int i4 = oii1O1l.I00000oOI;
/* 167 */                   long j8 = j2;
/* 174 */                   int iMin = (int) Math.min(j7, oii1O1l.I0000Il00O - i4);
/* 175 */                   outputStream2.write(bArr, i4, iMin);
/* 178 */                   if (iMin != 0) {
/* 180 */                       if (iMin < 0) {
/* 201 */                           I000II.I001IO000("Returned negative read bytes count");
/* 204 */                           return obj4;
                                }
/* 186 */                       if (iMin > oii1O1l.I00000oIO()) {
/* 195 */                           I000II.I001IO000("Returned too many bytes");
/* 198 */                           return obj4;
                                }
/* 189 */                       iII1oo00i1liI000II2.skip(iMin);
                            }
/* 206 */                   j7 -= iMin;
/* 207 */                   j2 = j8;
/* 209 */                   obj2 = obj4;
/* 211 */                   j4 = 0;
/* 213 */                   i3 = 1;
                        }
/* 79 */                if (iIIoloiiI12.I000O01llI0()) {
/* 229 */                   return new Long(j2);
                        }
/* 89 */                if (iIIoloiiI12.I000II().I00II0Ol1O0l()) {
/* 91 */                    i01loii2.I00iOIl = iIIoloiiI12;
/* 93 */                    i01loii2.I00iiI = outputStream2;
/* 95 */                    i01loii2.I00iiO = j3;
/* 97 */                    i01loii2.I00iio = j2;
/* 99 */                    i01loii2.I00ilO0 = i3;
/* 105 */                   if (iIIoloiiI12.I0001Ioi1lo(i3, i01loii2) == ii0111o) {
/* 107 */                       return ii0111o;
                            }
/* 108 */                   iIIoloiiI13 = iIIoloiiI12;
/* 109 */                   i01lOII i01loii3 = i01loii2;
/* 111 */                   outputStream3 = outputStream2;
/* 112 */                   j5 = j2;
/* 113 */                   j6 = j3;
/* 114 */                   i01loii = i01loii3;
/* 116 */                   OutputStream outputStream42 = outputStream3;
/* 118 */                   i01loii2 = i01loii;
/* 119 */                   j3 = j6;
/* 120 */                   j2 = j5;
/* 121 */                   outputStream2 = outputStream42;
/* 123 */                   iIIoloiiI12 = iIIoloiiI13;
                        }
/* 124 */               III1oo00i1li iII1oo00i1liI000II3 = iIIoloiiI12.I000II();
/* 128 */               iII1oo00i1liI000II3.getClass();
/* 133 */               j2 += iII1oo00i1liI000II3.I00iiO;
/* 134 */               III1oo00i1li iII1oo00i1liI000II22 = iIIoloiiI12.I000II();
/* 138 */               iII1oo00i1liI000II22.getClass();
/* 141 */               long j72 = iII1oo00i1liI000II22.I00iiO;
/* 143 */               iO1i0iI.I00000oOI(j72, j72);
/* 148 */               while (j72 > j4) {
                        }
/* 79 */                if (iIIoloiiI12.I000O01llI0()) {
                        }
                    }
                }
            }
